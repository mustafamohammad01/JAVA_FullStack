package LongestIncreasingSubsequence;
import java.util.Scanner;
class LongestIncreasingSubsequence {
    private static int LongestSubsequence(int[] a, int i) {
        if (i == 0) {
            return 1;
        }

        int ending= 1;

        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                ending = Math.max(ending,
                		LongestSubsequence(a, j) + 1);
            }
        }

        return ending;
    }

    private static int findLength(int[] a, int n) {
        int lis = 1;

        for (int i = 0; i < n; i++) {
            lis = Math.max(lis, LongestSubsequence(a, i));
        }

        return lis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        System.out.printf("Length of longest increasing subsequence = %d%n",
                findLength(a, n - 1));
    }
}
