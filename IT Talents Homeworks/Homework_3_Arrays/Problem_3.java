import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
//		Задача 3:
//			Да се въведе число, след което да се създаде масив с 10
//			елемента по следния начин:
//			Първите 2 елемента на масива са въведеното число.
//			Всеки следващ елемент на масива е равен на сбора от
//			предишните 2 елемента в масива.
//			След това изведете масива .
		
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
