import java.util.Scanner;

public class Problemm_14 {

	public static void main(String[] args) {
		// ������ 14:
		// �� �� ������� �����, ����� ������ �� �������� ����� N � �����
		// ���������� �� N! (N ���������).

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int numFact = nFact(num);
		System.out.println(numFact);

	}

	static int nFact(int n) {
		if (n <= 1) {
			return 1;
		} else {

			return nFact(n - 1) * n;
		}
	}

}
