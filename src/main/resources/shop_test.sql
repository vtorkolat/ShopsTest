CREATE DATABASE shop_test;

CREATE TABLE shops (
  id INT NOT NULL AUTO_INCREMENT,
  shop_title VARCHAR(50),
  PRIMARY KEY (id)
)ENGINE = InnoDB,
  DEFAULT CHARACTER SET  = utf8,
  COLLATE = utf8_general_ci;

CREATE TABLE category (
  id INT NOT NULL AUTO_INCREMENT,
  category_title VARCHAR(50),
  shops_id INT,
  PRIMARY KEY (id)
)ENGINE = InnoDB,
  DEFAULT CHARACTER SET  = utf8,
  COLLATE = utf8_general_ci;


CREATE TABLE goods (
  id INT NOT NULL AUTO_INCREMENT,
  goods_title VARCHAR(50),
  price INT,
  status VARCHAR(50),
  category_id INT,
  PRIMARY KEY (id)
)ENGINE = InnoDB,
DEFAULT CHARACTER SET  = utf8,
COLLATE = utf8_general_ci;


ALTER TABLE goods
ADD CONSTRAINT fk_GoodsCateg
FOREIGN KEY (category_id)
REFERENCES category(id);

ALTER TABLE category
ADD CONSTRAINT fk_CategShop
FOREIGN KEY (shops_id)
REFERENCES shops(id);