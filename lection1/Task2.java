class Task2 {

    void main(String[] args) {

        for (int num = 100; num <= 990; num += 10) {
            int sum = 0;

            for (int delitel = 1; delitel <= num; delitel++) {
                if (num % delitel == 0 && delitel % 2 != 0) {
                    sum += delitel;
                }
            }

            if (sum % 10 == 0) {
                System.out.println(num);
            }
        }
    }
}