
public class Problem_4 {

	public static void main(String[] args) {
		// ������ 4:
		// ����� ������������� �������� ��������� �� �������� � ��������
		// ����� - ���������� �����.
		// �� �� ������� ��������, ���� ����� �� �������� ����������� ��
		// ���������� � �������� ����� ���� ���������� �� �� +90 �������.
		// ������:
		// 1,2,3,4
		// 5,6,7,8
		// 9,10,11,12
		// 13,14,15,16
		// �����
		// 13,9,5,1
		// 14,10,6,2
		// 15,11,7,3
		// 16,12,8,4

		int arr[][] = { { 12, 54, 2, -23, 45 }, { 75, 4, 42, 45, 0 }, { 12, -123, 987, 234, 34 },
				{ 12, -34, 12, -23, 45 }, { 34, 54, -213, 9, -1 }, { 12, 65, 56, 45, -352 }, };

		int newArr[][] = new int[arr[0].length][arr.length];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {

				newArr[j][arr[0].length - i] = arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[0].length; j++) {

				System.out.print(newArr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
