import java.util.Scanner;

public class Problemm_13 {

	public static void main(String[] args) {

//		������ 13:
//			�� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
//			���� ����� � ������� ������ �������.
//			����������, ���� �����, �� ��������� �������������� ������ �����
//			�� ���������� ���������� ����� � 2-���� ������ �������.
//			������: 99
//			�����: 1100011
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int index=0;
		while (num>0) {
			arr[index]=num%2;
			num=num/2;
			index++;
		}
		
		for (int i = index-1; i >= 0; i--) {
			System.out.print(arr[i]);
		
		}
	}

}
