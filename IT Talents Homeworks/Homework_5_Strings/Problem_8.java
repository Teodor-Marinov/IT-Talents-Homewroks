import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {
//		Задача 8:
//			Да се състави програма, чрез която се въвежда ред от символи
//			(стринг, низ).
//			Програмата да изведе на екрана дали въведения стринг е палиндром,
//			т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
//			Вход: капак
//			Изход: да.
//			Вход: тенджера
//			Изход: не.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter а string");
		String string1 = sc.nextLine();
		boolean isPalindrom=true;
		for (int i = 0; i <= string1.length()/2; i++) {
			if(string1.charAt(i)!=string1.charAt(string1.length()-1-i)){
				isPalindrom=false;
				break;
			}
		}
		if(isPalindrom){
			System.out.println("Entered string IS a palindrom.");
		}else{
			System.out.println("Entered string is NOT a palindrom.");
		}
	}

}
