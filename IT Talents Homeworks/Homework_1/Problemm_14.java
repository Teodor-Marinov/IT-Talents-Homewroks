import java.util.Scanner;

public class Problemm_14 {

	public static void main(String[] args) {
		// ������ 14:
		// �� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
		// �� ���������� ����� ������� ������� ���� �� �������� � ������� ���
		// �������� ����.
		// ���������� ����� � ���������.
		// �������� �� ��� ������ ����� �� ��������� [1..8].
		// ������: 2 2 3 2
		// �����: ��������� �� � �������� ����

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates for the first chessboard field");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		if (!(((x1 > 0) && (x1 < 9)) && ((y1 > 0) && (y1 < 9)))) {
			System.out.println("not a valid value");
		} else {
			System.out.println("Enter coordinates for the second chessboard field");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if (!(((x2 > 0) && (x2 < 9)) && ((y2 > 0) && (y2 < 9)))) {
				System.out.println("not a valid value");
			} else {
				if (((x1 + y1) % 2) == ((x2 + y2) % 2)) {
					System.out.println("�������� �� � ������� ����");
				} else {
					System.out.println("�������� �� � �������� ����");
				}
			}
		}
	}
}
