import java.util.Scanner;

public class Problemm_15 {

	public static void main(String[] args) {
		// ������ 15:
		// �� �� ������� ��������, ����� ������� � ��������� ����� ������
		// �����.
		// ���� �����: �������� ������� ����� 3 �������� �����, �����
		// ��������� �������� ������� ������������ ���� ����.
		// ������: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
		// �����: 5.1; 6.34; 7.13

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length > 2");
		int numN = sc.nextInt();
		if (numN < 3) {
			System.out.println("������� ������ �� � � ������� �� ������� 3 ��������!");
		} else {
			double sum = 0;
			double arr[] = new double[numN];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter element " + i);
				arr[i] = sc.nextDouble();

			}
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 1; j < arr.length; j++) {
					if (Math.abs(arr[j]) > Math.abs(arr[j - 1])) {
						arr[j - 1] = arr[j - 1] + arr[j];
						arr[j] = arr[j - 1] - arr[j];
						arr[j - 1] = arr[j - 1] - arr[j];
					}

				}
			}
			System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
		}
	}

}
