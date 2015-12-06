import java.util.Scanner;

public class Problemm_24 {

	public static void main(String[] args) {
//		Задача 24:
//			Едно число X е палиндром, aко се чете еднакво отпред назад и
//			отзад напред.
//			Да се състави програма, която проверява дали въведено число е
//			палиндром.
//			Входни данни: N - естествено число от интервала [10 .. 30000].
//			Пример: 17571
//			Изход: числото е палиндром
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (10 to 30000)");
		int numN = sc.nextInt();
		int initialNum=numN;
		int newNum=0;
		while(numN>0){
			int digit=numN%10;
			numN=numN/10;
			newNum=newNum*10+digit;
		}
		System.out.println(newNum);
		if(newNum==initialNum){
			System.out.println("The entered number IS palindrom");
		}else{
			System.out.println("The entered number is NOT palindrom");
		}
	}

}
