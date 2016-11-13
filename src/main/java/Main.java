
public class Main {
    public static void main(String[] args) {
        testSquareShouldReturnZeroPassed();
        testSquareShoudWork();

    }

    public static void testSquareShouldReturnZeroPassed() {
        System.out.println("testSquareShouldReturnZeroPassed");
        System.out.println(Calculations.square(0) == 0);
    }
    public static void testSquareShoudWork () {
        System.out.println("testSquareShoudWork");
        System.out.println(Calculations.square(1) == 1);
        System.out.println(Calculations.square(2) == 2);
    }
}
