import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		// �� �� ������� ��������, ���� ����� �� ������������ �� ��������
		// �������������� ��� ���� � ������� 10-20 �����.
		// ���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
		// ��-�������, ����� � ������ �� ����������.
		// ������: uchilishe uchenik
		// �����: 9 uchenishe

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String string1 = sc.nextLine();
		System.out.println("Enter second word");
		String string2 = sc.nextLine();
		if ((string1.length() <= 20) && (string2.length() <= 20) && (string1.length() >= 10)
				&& (string2.length() >= 10)) {
			String str1Beginning = string1.substring(0, 5);
			String str1End = string1.substring(5, string1.length());
			String str2Beginning = string2.substring(0, 5);
			String str2End = string2.substring(5, string2.length());
			String str1New = str2Beginning + str1End;
			String str2New = str1Beginning + str2End;

			if (str1New.length() >= str2New.length()) {
				System.out.println("��������� �� ��-������� ������ � " + str1New.length() + " �������: " + str1New);
			} else {
				System.out.println("��������� �� ��-������� ������ � " + str2New.length() + " �������: " + str2New);
			}
			System.out.println("����� ���� ������� ��: " + str1New + "; " + str2New);

		} else {
			System.out.println("Invalid length of strings");
		}
	}

}
