
public class Pattern43 {
	public static void main(String[] args) {

		int n = 7;
		int st = 1;
		int sp = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= sp; s++) {
				System.out.print(" ");
			}
			int count = 1;

			for (int j = 1; j <= st; j++) {
				if (count == 1 || count == st) {
					System.out.print("*");
					count++;
				} else {
					System.out.print(" ");
					count++;
				}

			}
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				st = st - 2;
				sp++;
			}
			System.out.println();
		}
	}
}
