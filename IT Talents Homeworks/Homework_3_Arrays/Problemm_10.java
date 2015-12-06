import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Problemm_10 {

	public static void main(String[] args) {


//		Задача 10:
//			Да се състави програма, чрез която се въвеждат 7 цели числа в
//			едномерен масив.
//			Програмата да изведе числото, което е най-близко до средната
//			стойност на въведените числа.
//			Пример: 1,2,3,4,5,6,7
//			Изход: средна стойност 4, най-близка стойност 4
		
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
		System.out.println("Средна стойност: "+avrg);
		System.out.print("Най-близка стойност: "+closest);

	}

}
