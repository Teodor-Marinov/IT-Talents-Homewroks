import java.util.Scanner;

public class Problemm_11 {

	public static void main(String[] args) {

		// ������ 11:
		// �� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
		// � ��������� �����
		// ���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
		// ������: -23, -55, 17, 75, 56, 105, 134
		// �����: 75,105 - 2 �����

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[7];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 5 == 0) && (arr[i] > 5)) {
				System.out.print
				(arr[i] + ", ");
				count++;
			}
		}System.out.println(" - "+count+" �����");

	}

}
