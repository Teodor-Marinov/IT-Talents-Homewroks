import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		// ������ 1:
		// �� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
		// �� 40 ������ � ����� �����.
		// ���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
		// � ����� �����.
		// ������: Abcd Efgh
		// �����: ABCD abcd EFGH efgh

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = sc.nextLine();
		System.out.println("Enter Second string");
		String string2 = sc.nextLine();
		if ((string1.length() < 40) && (string2.length() < 40)) {
			String str1Upper = string1.toUpperCase();
			String str1Lower = string1.toLowerCase();
			String str2Upper = string2.toUpperCase();
			String str2Lower = string2.toLowerCase();
			System.out.println(str1Lower);
			System.out.println(str1Upper);
			System.out.println(str2Lower);
			System.out.println(str2Upper);
		} else {
			System.out.println("Invalid length of strings");
		}
	}

}
