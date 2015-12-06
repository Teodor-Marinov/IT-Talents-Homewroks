import java.util.Scanner;

public class Problemm_19 {

	public static void main(String[] args) {
		// ������ 19: �� �� ������� ��������, ���� ����� �� ��������
		// ���������� ����� �� ��������� [10..99] �� ������� ��������
		// �����, ��� �������� �� �������� ����������:
		// 1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
		// 2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
		// ����������� ���������� ������ �� �� ������ �������� 1.
		// ������: 11
		// �����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (10 to 99)");
		int numA = sc.nextInt();
		if ((numA >= 10) && (numA <= 99)) {
			while (numA > 1) {
				if (numA % 2 == 0) {
					numA = numA / 2;
					System.out.print(numA + ", ");
				} else {
					numA = 3 * numA + 1;
					System.out.print(numA + ", ");
				}

			}
		}else{
			System.out.println("Not a vlid value");
		}

	}

}
