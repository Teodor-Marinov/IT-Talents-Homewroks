
public class Problemm_18 {

	public static void main(String[] args) {
		// Задача 18:
		// Дадени са два едномерни масива с естествени числа.
		// Да се състави програма, която сравнява всички числа с еднакви
		// индекси от двата масива и записва в трети масив, по-голямото от
		// двете числа.
		// Да се изведе съдържанието и на трите масива
		// Пример:
		// 18,19,32,1,3, 4, 5, 6, 7, 8
		// 1, 2, 3,4,5,16,17,18,27,11
		// Изход:
		// 18,19,32 ,4,5,16,17,18,27,11

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 3, 2, 1, 7, 2, 4, 1 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println();
		int[] newArr = new int[arr1.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = (arr1[i] > arr2[i]) ? arr1[i] : arr2[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
	}

}
