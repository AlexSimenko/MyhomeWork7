public class ArrayDataException extends Exception{
    public ArrayDataException(String message) {
        super(message);
        System.out.println("\n"+"Неправильні данні комірки");
    }
}
