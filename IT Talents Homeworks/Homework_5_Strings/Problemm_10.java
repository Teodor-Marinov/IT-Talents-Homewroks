import java.util.Scanner;

public class Problemm_10 {

	public static void main(String[] args) {
		// ������ 10:
		//
		// �� �� ������� ��������, ����� �� ����� ��� ����� ����,
		// ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
		// �� ASCII ��������� � ���������� ������� 5 � � �������
		// ������������� ������.
		// ������ :
		// ����: Hello
		// �����: Mjqqt

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter � string");
		String string1 = sc.nextLine();

		for (int i = 0; i < string1.length(); i++) {
			char current = string1.charAt(i);

			current += 5;
			System.out.print(current);

		}

	}

}
