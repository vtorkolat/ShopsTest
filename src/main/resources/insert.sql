INSERT INTO shop_test.shops (id, shop_title) VALUES (1, 'Billa');
INSERT INTO shop_test.shops (id, shop_title) VALUES (2, 'Auchan');

INSERT INTO shop_test.category (id, category_title,shops_id) VALUES (1, 'wear', 1);
INSERT INTO shop_test.category (id, category_title,shops_id) VALUES (2, 'drinks', 1);
INSERT INTO shop_test.category (id, category_title,shops_id) VALUES (3, 'alcohol', 2);
INSERT INTO shop_test.category (id, category_title,shops_id) VALUES (4, 'food', 2);

INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (1,'shirt',1000,'Available', 1);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (2,'hat',500,'Available', 1);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (3,'coat',750,'Available', 1);

INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (4,'pepsi',20,'Available', 2);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (5,'cola',12,'Available', 2);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (6,'juice',33,'Available', 2);

INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (7,'vodka',55,'Available', 3);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (8,'beer',15,'Available', 3);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (9,'vine',140,'Available', 3);

INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (10,'cheese',85,'Available', 4);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (11,'fish',67,'Available', 4);
INSERT INTO shop_test.goods (id, goods_title,price,status, category_id) VALUES (12,'meat',160,'Available', 4);

