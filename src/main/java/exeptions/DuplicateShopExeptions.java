package exeptions;

public class DuplicateShopExeptions extends Throwable {
    public DuplicateShopExeptions() {
    }

    public DuplicateShopExeptions(String message) {
        super(message);
    }

    public DuplicateShopExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateShopExeptions(Throwable cause) {
        super(cause);
    }
}
