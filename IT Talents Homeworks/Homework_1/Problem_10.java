import java.util.Scanner;

public class Problem_10 {

	public static void main(String[] args) {
		// ������ 10:
		// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
		// 3 ����� � �� �������� ������������.
		// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
		// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
		// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
		// ������ �����: ���������� ����� �� ��������� [10..9999].
		// ������: 107
		// �����: 21 ���� �� 2 �����,
		// 21 ���� �� 3 �����
		// ������������ ���� �� 2 �����

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required volume(10 - 9999litres");
		int totalVol = sc.nextInt();
		int turnsNum = totalVol / 5;
		int leftVol = totalVol % 5;
		if (leftVol == 0) {
			System.out.println((turnsNum) + "�� 2 �����");
			System.out.println((turnsNum) + "�� 3 �����");
		} else {
			if (leftVol == 1) {
				System.out.println((turnsNum - 1) + "�� 2 �����");
				System.out.println((turnsNum+1) + "�� 3 �����");
			}
			if (leftVol == 2) {
				System.out.println((turnsNum + 1) + "�� 2 �����");
				System.out.println((turnsNum) + "�� 3 �����");
			}
			if (leftVol == 3) {
				System.out.println((turnsNum) + "�� 2 �����");
				System.out.println((turnsNum+1) + "�� 3 �����");
			}
			if (leftVol == 4) {
				System.out.println((turnsNum + 2) + "�� 2 �����");
				System.out.println((turnsNum) + "�� 3 �����");
			}
		}

	}

}
