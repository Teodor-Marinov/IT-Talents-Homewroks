import java.util.Scanner;

public class Problemm_13 {

	public static void main(String[] args) {
		// ������ 13:
		// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
		// ���������� ����������� t � ������ ������.
		// �������������� ��������� ��:
		// ��� -20 ������ �������;
		// ����� 0 � -20 - �������;
		// ����� 15 � 0 - ������;
		// ����� 25 � 15 - �����;
		// ��� 25 � ������.
		// ������ �����: ���� ����� �� ��������� [-100..100].
		// ������: 12
		// �����: ������

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature value(-100 to 100C)");
		int temp = sc.nextInt();
		if ((temp > 100) || (temp < -100)) {
			System.out.println("not a valid value");
		} else {
			if (temp <= -20) {
				System.out.println("������ �������");

			}
			if (((temp > -20) && (temp <= 0))) {
				System.out.println("�������");

			}
			if (((temp > 0) && (temp <= 15))) {
				System.out.println("������");

			}
			if (((temp > 15) && (temp <= 25))) {
				System.out.println("�����");

			}

			if (temp > 25) {
				System.out.println("������");

			}
		}
	}

}
