import java.util.Scanner;

public class Problem_5 {

	public static void main(String[] args) {
		// ������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
		// ������� �� ������ ������ ����� �� ��-������� �� ��-��������.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();

		if (numA <= numB) {
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = numB; i <= numA; i++) {
				System.out.println(i);
			}

		}
	}
}
