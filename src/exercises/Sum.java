package exercises;

public class Sum {
    public static Integer getSum(int[] array) {
        int sum = 0;

        for (int i: array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
