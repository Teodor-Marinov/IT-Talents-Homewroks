import java.util.Scanner;

public class Problemm_21 {

	public static void main(String[] args) {
		// ������ 21:
		// ������ � �������� ����� �����.
		// ��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
		// ���, ���.
		// ��������� �� ���� �� ������� �: ������, ����, ����, ����.
		// �� �� ������� ��������, ���� ����� �� ������� N - ����� ��
		// ��������� [1..51] � �� �������� ��������� ����� ����� �
		// ���������� ��-������ ����� �� �������.
		// ������: 47.
		// �����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
		// ����

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number");
		int card = sc.nextInt();

		for (int i = card; i <= 52; i++) {
			if (i % 4 != 0) {
				switch (i / 4) {
				case 0:
					System.out.print("������");
					break;
				case 1:
					System.out.print("������");
					break;

				case 2:
					System.out.print("��������");
					break;

				case 3:
					System.out.print("������");
					break;

				case 4:
					System.out.print("�������");
					break;

				case 5:
					System.out.print("�������");
					break;
				case 6:
					System.out.print("������");
					break;
				case 7:
					System.out.print("�������");
					break;
				case 8:
					System.out.print("�������");
					break;
				case 9:
					System.out.print("����");
					break;
				case 10:
					System.out.print("����");
					break;
				case 11:
					System.out.print("���");
					break;
				case 12:
					System.out.print("���");
				}
			} else {
				switch (i / 4) {
				case 13:
					System.out.print("���");
					break;
				case 2:
					System.out.print("������");
					break;

				case 3:
					System.out.print("��������");
					break;

				case 4:
					System.out.print("������");
					break;

				case 5:
					System.out.print("�������");
					break;

				case 6:
					System.out.print("�������");
					break;
				case 7:
					System.out.print("������");
					break;
				case 8:
					System.out.print("�������");
					break;
				case 9:
					System.out.print("�������");
					break;
				case 10:
					System.out.print("����");
					break;
				case 11:
					System.out.print("����");
					break;
				case 12:
					System.out.print("���");
					break;
				case 1:
					System.out.print("������");
				}

			}

			switch (i % 4) {
			case 0:
				System.out.print(" ����; ");
				break;
			case 1:
				System.out.print(" ������; ");
				break;
			case 2:
				System.out.print(" ����; ");
				break;
			case 3:
				System.out.print(" ����; ");

			}

		}
	}
}
