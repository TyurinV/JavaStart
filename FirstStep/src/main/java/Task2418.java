import java.util.Arrays;

public class Task2418 {
    public static void main(String[] args) {
        int[] a2 = {0, 2, 2};
        int[] a1 = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1 == null) {
            return a2;
        }
        if (a2 == null) {
            return a1;
        }
        int[] result = new int[a1.length + a2.length];
        int aFirst = 0, aSecond = 0;
        for (int i = 0; i < result.length; i++) {
            if (aFirst > a1.length - 1) {
                result[i] = a2[aSecond];
                aSecond++;
            } else if (aSecond > a2.length - 1) {
                result[i] = a1[aFirst];
                aFirst++;
            } else if (a1[aFirst] < a2[aSecond]) {
                result[i] = a1[aFirst];
                aFirst++;
            } else {
                result[i] = a2[aSecond];
                aSecond++;
            }
        }
        return result;
    }
}




