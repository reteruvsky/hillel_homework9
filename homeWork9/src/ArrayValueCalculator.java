public class ArrayValueCalculator {

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 && array[i].length != 4) {
                throw new ArraySizeException("Wrong size of passed array!");
            }
        }

        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                try {
                    sumArray += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException("This element is not number! " +
                            "Array: " + j +
                            " Cell: " + i);
                }
            }
        }

        return sumArray;
    }
}
