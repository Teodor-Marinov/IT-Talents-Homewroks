import java.util.Scanner;

public class Problemm_18 {

	public static void main(String[] args) {
		// ������ 18:
		// �� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
		// ��������� [1..9].
		// ���������� �� ������� ��������� �� ���������.
		// ������������ �������� �� ����������� � ���������� �� 2-��
		// �����.
		// ������: 2 2
		// �����:
		// 1*1= 1;
		// 1*2= 2;
		// 2*1= 2;
		// 2*2= 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A(1 to 9)");
		short numA = sc.nextShort();
		System.out.println("Enter number B(1 to 9)");
		short numB = sc.nextShort();

		for (int i = 1; i <= numA; i++) {
			for (int j = 1; j <= numB; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
			}
		}

	}

}
