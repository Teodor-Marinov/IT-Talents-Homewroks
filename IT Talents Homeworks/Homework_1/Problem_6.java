import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
//		Задача 6:
//			Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
//			им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
//			а3 да има старата стойност на а1.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int numA = sc.nextInt();
		System.out.println("Enter Number B:");
		int numB = sc.nextInt();
		System.out.println("Enter Number C:");
		int numC = sc.nextInt();
		int aux = numA;
		numA = numB;
		numB = numC;
		numC = aux;
		System.out.println(numA +" "+numB+" "+ numC);
		
		
	}

}
