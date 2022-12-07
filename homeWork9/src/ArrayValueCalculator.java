public class ArrayValueCalculator {

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) {
            System.out.println("Неверный размер переданного массива!");
            throw new ArraySizeException();
        }

        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                try {
                    sumArray += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    System.out.println("Элемент не является цифрой! " +
                            "Массив: " + j +
                            " Ячейка: " + i);
                    throw new ArrayDataException();
                }
            }
        }

        return sumArray;
    }
}
