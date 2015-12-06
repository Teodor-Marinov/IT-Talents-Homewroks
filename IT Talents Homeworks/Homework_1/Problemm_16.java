import java.util.Scanner;

public class Problemm_16 {

	public static void main(String[] args) {
		// ������ 16:
		// �������� � ���������� ���������� ����� �� ���� abc.
		// ������ �� �� ������� ����:
		// ��� a = b = c - �����: ������� �� �����;
		// ��� a>b>c - �����: ������� �� ��� �������� ���;
		// ��� a<b<c ������� �� � �������� ���;
		// � �����: ������� �� ����������, �� ����������� ������.
		// �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
		// ������� �� ������� � �������.
		// ������: 345
		// �����: �������� ���.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number");
		int num = sc.nextInt();
		if ((num >= 100) && (num <= 999)) {
			int thirdDig = num % 10;
			int secondDig = (num / 10) % 10;
			int firstDig = (num / 100) % 10;
			if ((firstDig > secondDig) && (secondDig > thirdDig)) {
				System.out.println("�������� ���");
			} else {
				if ((firstDig == secondDig) && (secondDig == thirdDig)) {
					System.out.println("������� �� �����");
				} else {
					if ((firstDig < secondDig) && (secondDig < thirdDig)) {
						System.out.println("�������� ���");

					} else {
						System.out.println("������� �� ����������");
					}
				}
			}

		} else {
			System.out.println("The entered number is not in the specified range.");
		}

	}
}
