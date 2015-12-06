import java.util.Scanner;

public class Problemm_22 {

	public static void main(String[] args) {
		// ������ 22:
		// �� �� ������� ��������, ����� ������� ������� 10 ���-�����
		// �����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
		// �������� ���������� �����.
		// ������� �� ��������, ������ � ������ ������� �����.
		// ������ �����: ����� �� ��������� [1..999]
		// ������: 1
		// �����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
		// ����������� ����� while.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (1 to 999)");
		int numA = sc.nextInt();
		int count = 1;
		
		if ((numA >= 1)  &&(numA <= 999)) {
			numA++;
			
			while (count <= 10) {

				if ((numA % 2 == 0) || (numA % 3 == 0) || (numA % 5 == 0)) {
					System.out.print(count + ":" + numA + "; ");
					count++;
				}
				numA++;
			}

		} else{
			System.out.println("Not a vlid value");
		}
	}

}
