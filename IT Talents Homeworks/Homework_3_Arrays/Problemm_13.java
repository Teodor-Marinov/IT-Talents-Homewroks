import java.util.Scanner;

public class Problemm_13 {

	public static void main(String[] args) {

//		Задача 13:
//			Да се състави програма, чрез която се въвежда число и се представя
//			като число в двоична бройна система.
//			Програмата, чрез масив, да изчислява последователно всички цифри
//			на въведеното естествено число в 2-ична бройна система.
//			Пример: 99
//			Изход: 1100011
		
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
