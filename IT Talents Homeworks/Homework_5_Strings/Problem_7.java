import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
//		Задача 7:
//			Да се състави програма, която чете набор от думи разделени с
//			интервал.
//			Като резултат да се извеждат броя на въведените думи, както и броя
//			знаци в най-дългата дума.
//			Пример: asd fg hjkl
//			Изход: 3 думи, най-дългата е с 4 символа.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter а word sequence");
		String string1 = sc.nextLine();
		
		String[] words = string1.split(" ");
		int max=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>max){
				max = words[i].length();
			}
			
		}
		System.out.println(words.length+" думи, най-дългата е с "+max+" символа.");
	}

}
