public class Main {
    public static void main(String[] args) {

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        // для прикладу перевірка масиву на неправильне чи правильне введення значення
        String[][] myArray = {{"G", "i", "t", "i"}, {"s", "m", "y", "p"}, {"a", "i", "n", "a"}, {"g", "a", "i", "n"}};
        String[][] myArray1 = {{"1", "2", "3", "5", "4"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] myArray2 = {{"1", "2", "3", "5",}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] myArray3 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println("Підсумок: " + arrayValueCalculator.doCalc(myArray));
        } catch (ArraySizeException | ArrayDataException e) {

            System.out.println(e.getMessage());

        }
        try {
            System.out.println("Підсумок: " + arrayValueCalculator.doCalc(myArray1));
        } catch (ArraySizeException | ArrayDataException e) {

            System.out.println(e.getMessage());

        }
        try {
            System.out.println("Підсумок: " + arrayValueCalculator.doCalc(myArray2));
        } catch (ArraySizeException | ArrayDataException e) {

            System.out.println(e.getMessage());

        }
        try {
            System.out.println("Підсумок: " + arrayValueCalculator.doCalc(myArray3));
        } catch (ArraySizeException | ArrayDataException e) {

            System.out.println(e.getMessage());

        }
    }

}