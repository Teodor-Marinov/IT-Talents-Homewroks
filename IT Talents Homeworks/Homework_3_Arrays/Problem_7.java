import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
		// ������ 7:
		// �������� ��������, ����� ����� ���� ����� � ����� ������� ���
		// ����� ��� ����� ������ �� ������� �����: ���������� �� �����
		// ������� �� ������ ����� �� � ����� �� ����� �� ���������� �
		// ���������� ������� �� ���������� ������� �� ������ �����. �������
		// � ���������� ������� �� ������ ����� ������ �� �� ������� ����� ��
		// ������� � ���������� �� ������� �� ������ �����.
		// �� �� ������ ��������� �����.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();

		int arr[] = new int[numN];
		int newArr[] = new int[numN];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();

		}
		newArr[0] = arr[0];
		newArr[numN - 1] = arr[numN - 1];
		for (int i = 1; i < newArr.length - 1; i++) {
			newArr[i] = arr[i - 1] + arr[i + 1];
		}
		System.out.println("������� �����:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");

		}
		System.out.println();
		System.out.println("��� �����:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i] + ", ");

		}
	}
}