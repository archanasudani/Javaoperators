package loveProgramming;

public class NumberOperations {
    static int i = 125;
    static int j = 24;

    public static void main(String[] args) {

        System.out.printf("Test Data:");
        System.out.printf("\nInput first number: "+ i);
        System.out.printf("\nInput second number: " + j);
        System.out.printf("\nExpected Output:");
        System.out.printf("\n125 + 24 = " + (i+j));
        System.out.printf("\n125 - 24 = " + (i-j));
        System.out.printf("\n125 x 24 = " + (i*j));
        System.out.printf("\n125 / 24 = " + (i/j));
        System.out.printf("\n125 mod 24 = " + (i % j));
    }
}
