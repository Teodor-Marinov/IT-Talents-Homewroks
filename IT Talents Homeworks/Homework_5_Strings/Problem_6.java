import java.util.Arrays;
import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		// ������ 6:
		// �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
		// ����.
		// ���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
		// ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
		// ������: ����� ����� ������
		// �����: ����� ����� ������

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String string1 = sc.nextLine();
		string1 = string1.toLowerCase();
		String[] words = string1.split(" ");
		for (int i = 0; i < words.length; i++) {
			String first = words[i].substring(0, 1);
			first = first.toUpperCase();
			String end = words[i].substring(1, words[i].length());
			words[i] = first + end;
			System.out.print(words[i] + " ");
		}

	}

}
