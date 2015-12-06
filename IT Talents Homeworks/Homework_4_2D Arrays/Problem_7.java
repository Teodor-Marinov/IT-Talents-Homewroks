
public class Problem_7 {

	public static void main(String[] args) {
		// ����� ������������� �������� ��������� �� ���������� �����,
		// �������� � ��������� ������� � ������� 6 ���� � 6 ������.
		// �� �� ������� �������� , ���� ����� �� ������ ������ �� ������
		// ��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
		// ���������� �� ������� ����������� ���� �� ����� ������� ��� ��
		// ����������� �������, ����� � ������ ���� �� ���� ��������.
		// �� �� �������� ���� ���� �����.
		// ������:
		//
		// 11,12,13,14,15,16,
		// 21,22,23,24,25,26,
		// 31,32,33,34,35,36,
		// 41,42,43,44,45,46,
		// 51,52,53,54,55,56,
		// 61,62,63,64,65,66
		// �����:
		// 11, ,13, ,15, , ���� �� ���������� �� ����: 39
		// 22, ,24, ,26, ���� �� ���������� �� ����: 72
		// 31, ,33, ,35, , ���� �� ���������� �� ����: 99
		// 42, ,44, ,46, ���� �� ���������� �� ����: 132
		// 51, ,53, ,55, , ���� �� ���������� �� ����: 159
		// 62, ,64, ,66 ���� �� ���������� �� ����: 192
		// ���� �� ����������: 693
		// �

		int arr[][] = { { 12, 54, 2, -23, 45, 45 }, { 75, 4, 42, 45, 0, 45 }, { 12, -123, 987, 234, 34, 23 },
				{ 12, -34, 12, -23, 45, 35 }, { 34, 54, -213, 9, -1, 32 }, { 12, 65, 56, 45, -352, 3 } };

		int totalSum = 0;
		int sumRow = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				if ((i + j) % 2 == 0) {

					System.out.print(arr[i][j] + ", ");
					sumRow = sumRow + arr[i][j];
				}
			}
			System.out.println("sum = " + sumRow);
			totalSum = totalSum + sumRow;
			sumRow = 0;
		}
		System.out.println("���� �� ����������: " + totalSum);
	}
}
