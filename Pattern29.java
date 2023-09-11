
public class Pattern29 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			int sum = 0;
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
				if (j < i) {
					System.out.print("+");
				}
				sum = sum + j;
			}
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			System.out.print("=" + sum);
			System.out.println();
		}
	}
}
