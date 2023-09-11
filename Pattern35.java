public class Pattern35 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			int k = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(k);
				if (j < i) {
					k--;
				} else {
					k++;
				}
			}
			System.out.println();
		}
	}
}
