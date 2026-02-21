import java.util.Scanner;

class Task1 {

    void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое трехзначное число: ");
        int num = in.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        if (num > 500) {
            num = units * 100 + tens * 10 + hundreds;
        } else {
            num = hundreds * 100 + units * 10 + tens;
        }
        System.out.println(num);
        in.close();
    }
}