import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {
		// ������ 8:
		// �� �� ������� ��������, ����� ���� �� ��������� 4-������o
		// ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
		// �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
		// � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
		// 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
		// ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
		// ������: 3332 �����: ��-����� (32<33)
		// ������: 1144 �����: ����� (14=14)
		// ������: 9875 �����: ��-������ (95>87)

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit Number");
		int num = sc.nextInt();
		if ((num >= 1000) && (num <= 9999)) {
			int fourthDig = num % 10;
			int thirdDig = (num / 10) % 10;
			int secondDig = (num / 100) % 10;
			int firstDig = (num / 1000) % 10;
			int newNum1 = firstDig * 10 + fourthDig;
			int newNum2 = secondDig * 10 + thirdDig;
	
			if (newNum1 == newNum2) {
				System.out.println("The new numbers are equal(" + newNum1 + " = " + newNum2 + ")");
			} else {
				if (newNum1 < newNum2) {
					System.out.println("Lesser(" + newNum1 + " < " + newNum2 + ")");
				} else {
					System.out.println("Higher(" + newNum1 + " > " + newNum2 + ")");
				}
			}
		} else {
			System.out.println("The entered number is not in the specified range.");
		}

	}

}
