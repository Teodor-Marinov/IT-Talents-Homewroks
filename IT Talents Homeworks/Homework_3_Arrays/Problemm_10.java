import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Problemm_10 {

	public static void main(String[] args) {


//		������ 10:
//			�� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
//			��������� �����.
//			���������� �� ������ �������, ����� � ���-������ �� ��������
//			�������� �� ���������� �����.
//			������: 1,2,3,4,5,6,7
//			�����: ������ �������� 4, ���-������ �������� 4
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avrg=0;
		
		double min=Integer.MAX_VALUE;
		int closest=0;

		int arr[] = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		avrg=(double)sum/7;
		for (int i = 0; i < arr.length; i++) {
		
			double abs=((avrg-arr[i])<0)?-(avrg-arr[i]):(avrg-arr[i]);
			if(abs<min){
				min=abs;
				closest =arr[i];
			
			}
		}
		System.out.println("������ ��������: "+avrg);
		System.out.print("���-������ ��������: "+closest);

	}

}
