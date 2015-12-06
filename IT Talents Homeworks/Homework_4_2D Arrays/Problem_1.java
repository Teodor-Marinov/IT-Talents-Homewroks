import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {

		// ������ 1:
		// ����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
		// �������� �������������.
		// �� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
		// � ���-������� � ���-�������� ��������.
		// ������:
		// 48,72,13,14,15
		// 21,22,53,24,75
		// 31,57,33,34,35
		// 41,95,43,44,45
		// 59,52,53,54,55
		// 61,69,63,64,65
		// �����:
		// ���-����� 13;
		// ���-������ 95

		int arr[][] = { { 12, 54, 2, -23, 45 }, { 75, 4, 42, 45, 0 }, { 12,  -123, 987, 234, 34 },
				{ 12, -34, 12, -23, 45 }, { 34, 54,  -213, 9, -1 }, {  12, 65, 56, 45, -352 }, };

		int min = arr[0][0];
		int max = arr[0][0];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}

				if (arr[i][j] > max) {
					max = arr[i][j];
				}

			}

		}
		System.out.println("���-����� �����: "+min);
		System.out.println("���-������ �����: "+max);

	}
}
