import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		// ������ 3:
		// �� �� ������� ��������, ���� ����� �� �������� �������������� ���
		// ������ �� ������� ��� ���������.
		// ���������� �� ������� ��������� �� ��������� �� ����������� �� ��
		// �������.
		// ������: ���������, ���������
		// �����:
		// ����� ���� �� � ����� �������.
		// ������� �� �������:
		// 8 �-�
		// 9 �-�

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string(no spaces)");
		String string1 = sc.nextLine();
		for (int i = 0; i <= string1.length() - 1; i++) {
			if (string1.charAt(i) == ' ') {
				System.out.println("The string should not include \"space\"");
			}
		}
		System.out.println("Enter second string(no spaces)");
		String string2 = sc.nextLine();
		for (int i = 0; i <= string2.length() - 1; i++) {
			if (string2.charAt(i) == ' ') {
				System.out.println("The string should not include \"space\"");
			}
		}
		if (string1.equals(string2)) {
			System.out.println("Entered strings are equal");
		} else {
			if (string1.length() == string2.length()) {
				System.out.println("Entered strings are of equal length. Different positions:");

				for (int i = 0; i < string1.length(); i++) {
					if (string1.charAt(i) != string2.charAt(i)) {
						System.out.println(i + ": " + string1.charAt(i) + " <---> " + string2.charAt(i));
					}
				}
			} else {
				if (string1.length() < string2.length()) {
					System.out.println("Second string is of higher length. Different positions:");
					for (int i = 0; i < string1.length(); i++) {
						if (string1.charAt(i) != string2.charAt(i)) {
							System.out.println(i + ": " + string1.charAt(i) + " <---> " + string2.charAt(i));
						}
					}
				} else {
					System.out.println("First string is of higher length. Different positions:");
					for (int i = 0; i < string2.length(); i++) {
						if (string1.charAt(i) != string2.charAt(i)) {
							System.out.println(i + ": " + string1.charAt(i) + " <---> " + string2.charAt(i));
						}
					}
				}
			}
		}

	}

}
