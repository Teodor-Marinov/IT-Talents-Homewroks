import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
//		������ 3:
//			�� �� ������ �����, ���� ����� �� �� ������� ����� � 10
//			�������� �� ������� �����:
//			������� 2 �������� �� ������ �� ���������� �����.
//			����� ������� ������� �� ������ � ����� �� ����� ��
//			���������� 2 �������� � ������.
//			���� ���� �������� ������ .
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int numN = sc.nextInt();

		int arr[] = new int[10];
		
		arr[0]=numN;
		arr[1]=numN;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");		
		}
	}

}
