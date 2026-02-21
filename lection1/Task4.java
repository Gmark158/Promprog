import java.util.ArrayList;
import java.util.Arrays;

class Task4 {
    static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {4, 5, 6, 7, 8, 9};

        int[][] result = findDifferences(firstArray, secondArray);

        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
        System.out.println("Элементы первого, которых нет во втором: " + Arrays.toString(result[0]));
        System.out.println("Элементы второго, которых нет в первом: " + Arrays.toString(result[1]));
    }

    public static int[][] findDifferences(int[] arr1, int[] arr2) {
        ArrayList<Integer> diff1 = new ArrayList<>();
        ArrayList<Integer> diff2 = new ArrayList<>();

        for (int num : arr1) {
            if (!isInArray(num, arr2)) {
                if (!diff1.contains(num)) {
                    diff1.add(num);
                }
            }
        }

        for (int num : arr2) {
            if (!isInArray(num, arr1)) {
                if (!diff2.contains(num)) {
                    diff2.add(num);
                }
            }
        }

        int[] res1 = new int[diff1.size()];
        for (int i = 0; i < diff1.size(); i++) {
            res1[i] = diff1.get(i);
        }

        int[] res2 = new int[diff2.size()];
        for (int i = 0; i < diff2.size(); i++) {
            res2[i] = diff2.get(i);
        }

        return new int[][]{res1, res2};
    }

    public static boolean isInArray(int number, int[] array) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}