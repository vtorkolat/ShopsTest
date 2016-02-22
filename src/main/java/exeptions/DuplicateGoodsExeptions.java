package exeptions;

public class DuplicateGoodsExeptions extends Throwable {
    public DuplicateGoodsExeptions() {
    }

    public DuplicateGoodsExeptions(String message) {
        super(message);
    }

    public DuplicateGoodsExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateGoodsExeptions (Throwable cause) {
        super(cause);
    }
}
