import java.util.Scanner;

public class Problemm_15 {

	public static void main(String[] args) {
		// ������ 15:
		// �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		// [0..24].
		// ���������� �� ������ ������������� ��������� ��������� ���������
		// ���.
		// ��������� ��:
		// [18..4] - ����� �����;
		// [4..9] - ����� ����;
		// [9..18] - ����� ���
		// ������: 10
		// �����: ����� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day hour(0 to 24)");
		int hour = sc.nextInt();
		if ((hour > 24) || (hour < 0)) {
			System.out.println("not a valid value");
		} else {
			if (((hour > 4) && (hour <= 9))) {
				System.out.println("����� ����!");

			} else {
				if (((hour > 9) && (hour <= 18))) {
					System.out.println("����� ���!");
				} else {
					System.out.println("����� �����!");
				}
			}
		}
	}

}