import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		// ������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
		// ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		int count = 0;
		int i = 3;

		while (count < numA) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
				count++;
			}
			i++;
		}
	}
}
