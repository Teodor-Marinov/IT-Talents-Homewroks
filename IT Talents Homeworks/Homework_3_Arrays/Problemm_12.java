
public class Problemm_12 {

	public static void main(String[] args) {

		// ������ 12:
		// �� �� ������� ��������, ���� ����� �� ������������� �������� 7
		// ����� � ��������� ����� �� �������� ������� �� �������� � �������:
		// - 0 � 1 ���� ����� ����������;
		// - 2 � 3 ���� ��������;
		// - 4 � 5 ���� ���������.
		// ������: 1,2,3,4,5,6,7
		// �����: 2,1,4,3,6,5,7

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int count = 1;
		int temp = 0;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		
		arr[4]=arr[4]*arr[5];
		arr[5]=arr[4]/arr[5];
		arr[4]=arr[4]/arr[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}

	}

}
