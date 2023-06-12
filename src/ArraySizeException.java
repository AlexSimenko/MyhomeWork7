public class ArraySizeException extends Exception{
    public ArraySizeException(String message) {
        super(message);
        System.out.println("\n"+"Розмір масиву не співпадає з необхідним");
    }
}
