package Problem_1;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {

		// ������ 1:
		// �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
		// ������������ A � B (���� �� �� � ������� ������� � double).
		// ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A  � B.
		// �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter Number B:");
		double numB = sc.nextDouble();
		System.out.println("Enter Number C:");
		double numC = sc.nextDouble();
		if (((numC > numA) && (numC < numB)) || ((numC > numB) && (numC < numA))) {
			System.out.println("Number C is in the range between " + numA +" & "+numB);
		} else {
			System.out.println("Number C is not in the range between " + numA +" & "+numB);
		}
	}

}
