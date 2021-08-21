import java.util.Arrays;

public class FindMissingIntInArray {
    public static int findMissingInt(int[] A) {

        Arrays.sort(A);
        int min = 1;
        int cap = A.length;

        for (int j : A) {
            if (j == min) {
                min++;
            } else if (j > min)
                break;
        }
        return min;

    }
}
