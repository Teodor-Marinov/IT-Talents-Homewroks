import java.util.Scanner;

public class Problem_9 {

	public static void main(String[] args) {
		// ������ 9:
		// �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
		// ���������� ����� a,b.
		// ���������� �� ������ � ��������� ���� ���������� ����� ��
		// �������������� �� ����� ����� � �����, ����� � ������ �����.
		// ������ �����: a,b - ���������� ����� �� ��������� [10..99].
		// ������: 15, 25
		// �����: 375, 5 �������

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		if (((numA >= 10) && (numA <= 99)) && ((numB >= 10) && (numB <= 99))) {
			int lastDigit = (numA * numB) % 10;
			if (lastDigit % 2 == 0) {
				System.out.println(numA * numB + ", Even last digit: " + lastDigit);
			} else {
				System.out.println(numA * numB + ", Odd last digit: " + lastDigit);
			}
		} else {
			System.out.println("An enetered number is not within the specified range");
		}
	}

}
