
public class Problem_8 {

	public static void main(String[] args) {
		// Задача 8:
		// Напишете програма, която намира и извежда най-дългата редица от
		// еднакви поредни елементи в даден масив.
		// „

		int[] arr = { 1, 1, 1, 1,1,1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 8, 8, 8, 8,8,8,8, 9,20,12,12,12 };
		int count=1;
		int countTemp=1;
		int value=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]){
				countTemp=countTemp+1;
				if(countTemp>count){
					count=countTemp;
					value=arr[i];
				}
			}else{
				countTemp=1;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(value+", ");
		}

	}

}
