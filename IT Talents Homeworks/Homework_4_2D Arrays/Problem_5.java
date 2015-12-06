
public class Problem_5 {

	public static void main(String[] args) {

		// ������ 5:
		// �� �� ������� ��������, ��� ����� ������������� �� ��������
		// ���������� ����� � �������� ����� 4*4 ��������.
		// ���������� �� ������� �������� �� ���������� ����� � �������������
		// �� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
		// ������:
		// 1,2,3,4
		// 5,6,7,8
		// 9,10,11,12
		// 13,14,15,16
		// �����:
		//
		// ���-������ ���� �� ������ 58
		// ���-������ ���� �� ������ 40
		// ������������ ���� �� ������ � > �� ������������ ���� �� ������

		int arr[][] = { { 12, 0, 2, -23 }, { 75, -51, 42, 0 }, { 12, 987, 234, 34 }, { 1234, 7, 12, -23 } };

		int sumMaxRow = Integer.MIN_VALUE;
		int sumMaxCol = Integer.MIN_VALUE;
		int sumRow = 0;
		int sumCol = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sumRow = sumRow + arr[i][j];

			}
			if (sumRow > sumMaxRow) {
				sumMaxRow = sumRow;
			}
			sumRow = 0;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sumCol = sumCol + arr[j][i];

			}
			if (sumCol > sumMaxCol) {
				sumMaxCol = sumCol;
			}
			sumCol = 0;

		}

		System.out.println("���-������ ���� �� ������: " + sumMaxRow);
		System.out.println("���-������ ���� �� ������: " + sumMaxCol);
		if (sumMaxCol > sumMaxRow) {
			System.out.println("������������ ���a �� ������ < ������������ ���� �� ������.");

		} else {
			if (sumMaxCol < sumMaxRow) {
				System.out.println("������������ ���a �� ������ > ������������ ���� �� ������.");
			} else {
				System.out.println("������������ ���a �� ������ = ������������ ���� �� ������.");
			}
		}
	}
}