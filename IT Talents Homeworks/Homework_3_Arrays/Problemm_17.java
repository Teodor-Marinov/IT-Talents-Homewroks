import java.util.Scanner;

public class Problemm_17 {

	public static void main(String[] args) {
		// ������ 17:
		// ���� ������ �� ���������� ����� �� �������� �������������� ������,
		// ��� �� ���������� � �� ���������� ���������:
		// N1 < N2 > N3 < N4 > N5 <..
		// ��������� ��������, ����� ��������� ���� �������� � ���������
		// ����� ������ �� ����� ���������� ������� ����������.
		// ������: 1 3 2 4 3 7
		// �����: ��������� ������������ �� �������������� ������ ������

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int numN = sc.nextInt();
		boolean flag = true;
		int arr[] = new int[numN];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();

		}
		for (int i = 1; i < arr.length-1; i+=2) {
			if (!((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1]))) {
				flag = false;
				break;

			}
		}

		if (flag == true) {
			System.out.println("�������� E �������������� ������.");

		} else {
			System.out.println("�������� �� � �������������� ������.");
		}
	}
}
