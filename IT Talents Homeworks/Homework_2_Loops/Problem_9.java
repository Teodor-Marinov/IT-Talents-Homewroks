import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// ������ 9: �� �� �������� 2 ����� �� ������������ � � �.
		// �� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
		// �������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
		// ������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
		// ������������) ����� ��-������ �� 200, �� �� �������� �����������.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		int sum = 0;
		if (numA <= numB) {

			for (int j = numA; j <= numB; j++) {
				if ((j * j) % 3 == 0) {
					System.out.print("skip " + j*j + ", ");
				} else {
					System.out.print(j * j + ", ");
					sum = sum + (j * j);
				}
				if (sum > 200) {
					break;
				}

			}
		} else {
			for (int j = numB; j <= numA; j++) {
				if ((j * j) % 3 == 0) {
					System.out.print("skip " + j*j + ", ");
				} else {
					System.out.print(j * j + ", ");
					sum = sum + (j * j);
				}
				if (sum > 200) {
					break;
				}

			}
		}

	}

}
