public class Task2 {
    public static void printDigits(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            printDigits(number / 10);
            System.out.print(" " + (number % 10));
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("\nЦифры числа " + number + " через пробел:");
        printDigits(number);
        System.out.println();
    }
}