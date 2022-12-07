public class Main {

    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] twoDimArray = {{"5", "7", "3", "17"}, {"7", "0", "1", "12"}, {"8", "1", "2", "3"}, {"4", "8", "1", "4"}};

        System.out.println(ArrayValueCalculator.doCalc(twoDimArray));
    }

}
