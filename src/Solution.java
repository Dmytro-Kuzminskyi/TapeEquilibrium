public class Solution {

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
        if (A.length < 2) return 0;
        int a = A[0];
        int other = 0;
        int minValue = 0;
        for (int i = 1; i < A.length; i++) {
            other += A[i];
        }
        int sum = Math.abs(a-other);
        if (A.length == 2) return sum;
        minValue = sum;
        for (int i = 2; i < A.length; i++) {
            a += A[i - 1];
            other -= A[i - 1];
            sum = Math.abs(a-other);
            minValue = sum < minValue ? sum : minValue;
        }
        return minValue;
    }
}
