
public class Pattern33 {
	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print(k % 2);
				k++;
			}
			System.out.println();

		}
	}
}
