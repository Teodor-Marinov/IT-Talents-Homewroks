import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// ������ 5:
		// �������� ��������, ����� ������� ����� � 10 �������� �
		// ������������ ����� �� ���������� ��� ��������, ����� �� ������� ��
		// ��������, ������� �� 3.
		// �� �� ������� ���������� �� ������.

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i * 3;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");

		}
	}

}
