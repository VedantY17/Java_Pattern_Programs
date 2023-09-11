
public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}
}
