import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		// ������ 7:
		// �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
		// ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
		// ��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
		// ������� �����:
		// - ��� ��� �����, ���� �� �������
		// - ��� ���� ����, �� �� ���� ���������
		// - ��� ����� � �� ���� ����� � �� ��� ���
		// - ��� ��� �����, �� ����� �� ���� � ��������
		// - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
		// ���������� ������� �������� ���� ��������� � ���������.

		Scanner sc = new Scanner(System.in);
//		������� ����������
//		System.out.println("Enter day hour:");
//		int hour = sc.nextInt();
		
		System.out.println("Enter money amount:");
		double amount = sc.nextDouble();
		System.out.println("Am I sick");
		boolean isSick = sc.nextBoolean();
		if (isSick == true) {
			if (amount > 0) {
				System.out.println("�� �� ���� ���������");
			} else {
				System.out.println("�� ���� ����� � �� ��� ���");
			}
		} else {
			if (amount > 10) {
				System.out.println("�� ����� �� ���� � ��������");
			} else {
				System.out.println("�� ����� �� ����");
			}
		}
	}

}
