
public class Problemm_20 {

	public static void main(String[] args) {
		// ������ 20:
		// �� �� ������� ��������, ���� ����� �� ������� ������� ��
		// �����. ������ �� ���������� �� ���������� ��� ��� ����� ��
		// ����� �� 45.
		// ������:
		// 1 2 3 4 5 6 7 8 9 0
		// 2 3 4 5 6 7 8 9 0 1
		// 3 4 5 6 7 8 9 0 1 2
		// 4 5 6 7 8 9 0 1 2 3
		// 5 6 7 8 9 0 1 2 3 4
		// 6 7 8 9 0 1 2 3 4 5
		// 7 8 9 0 1 2 3 4 5 6
		// 8 9 0 1 2 3 4 5 6 7
		// 9 0 1 2 3 4 5 6 7 8
		// 0 1 2 3 4 5 6 7 8 9

		for (int i = 0; i <= 9; i++) {
			for (int j = i+1; j <=9 ; j++) {
				System.out.print(j+" ");
			
			}
			for(int j = 0; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
