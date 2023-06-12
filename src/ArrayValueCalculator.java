public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        int sumLength = array.length + array[0].length;
        int mulLength = array.length * array[0].length;
        if (sumLength != 8 && mulLength != 16) {

            throw new ArraySizeException("Цей масив повинен бути розміром 4x4");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {

                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Нечислове значення у комірці [" + i + "] [" + j + "]: " + array[i][j]);


                }
            }
        }
        System.out.println("\n" + "Масив пройшов перевірку");
        return sum;
    }
}