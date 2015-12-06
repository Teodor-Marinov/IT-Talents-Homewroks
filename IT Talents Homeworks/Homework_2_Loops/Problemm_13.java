import java.util.Scanner;

public class Problemm_13 {

	public static void main(String[] args) {
		// ������ 13: �� �� ������� ��������, ����� ������� ������
		// ���������� ���������� �����, ����� ���� ���� �� ������� �����
		// �� ������ �����.
		// ������ : sum, ������ 2>=sum<=27.
		// ������: 26
		// �����: 899, 989, 998.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum(2 to 27)");
		int sum = sc.nextInt();
		if ((sum <= 27) && (sum >= 2)) {
			for (int i = 100; i < 999; i++) {

				int thirdDig = i % 10;
				int secondDig = (i / 10) % 10;
				int firstDig = (i / 100) % 10;
				if (firstDig + secondDig + thirdDig == sum) {
					System.out.print(i + ", ");
				}
			}

		} else{
			System.out.println("Invalid value for sum(2 to 27)");
		}
	}

}
