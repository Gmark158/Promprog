import java.util.Scanner;

class Task3 {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count_human = 0;
        int totalWeight = 0;
        String reason = "";

        while (true) {
            System.out.print("Введите вес очередного человека: ");
            int weight = sc.nextInt();

            if (count_human + 1 > 6) {
                reason = "превышение количества людей";
                break;
            }
            if (totalWeight + weight > 450) {
                reason = "превышение веса";
                break;
            }
            count_human++;
            totalWeight += weight;
        }

        System.out.println("Количество людей: " + count_human);
        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Причина: " + reason);
    }
}