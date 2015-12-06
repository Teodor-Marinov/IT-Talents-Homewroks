
public class Problem_5 {

	public static void main(String[] args) {

		// Задача 5:
		// Да се състави програма, при която предварително са въведени
		// естествени числа в двумерен масив 4*4 елемента.
		// Програмата да извежда резултат от проверката какво е съотношението
		// на най-голямата сума по редове спрямо най-голямата сума по колони.
		// Пример:
		// 1,2,3,4
		// 5,6,7,8
		// 9,10,11,12
		// 13,14,15,16
		// Изход:
		//
		// най-голяма сума по редове 58
		// най-голяма сума по колони 40
		// Максималната сума по редове е > от максималната сума по колони

		int arr[][] = { { 12, 0, 2, -23 }, { 75, -51, 42, 0 }, { 12, 987, 234, 34 }, { 1234, 7, 12, -23 } };

		int sumMaxRow = Integer.MIN_VALUE;
		int sumMaxCol = Integer.MIN_VALUE;
		int sumRow = 0;
		int sumCol = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sumRow = sumRow + arr[i][j];

			}
			if (sumRow > sumMaxRow) {
				sumMaxRow = sumRow;
			}
			sumRow = 0;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sumCol = sumCol + arr[j][i];

			}
			if (sumCol > sumMaxCol) {
				sumMaxCol = sumCol;
			}
			sumCol = 0;

		}

		System.out.println("Най-голяма сума по редове: " + sumMaxRow);
		System.out.println("Най-голяма сума по колони: " + sumMaxCol);
		if (sumMaxCol > sumMaxRow) {
			System.out.println("Максималната сумa по редове < Максималната сума по колони.");

		} else {
			if (sumMaxCol < sumMaxRow) {
				System.out.println("Максималната сумa по редове > Максималната сума по колони.");
			} else {
				System.out.println("Максималната сумa по редове = Максималната сума по колони.");
			}
		}
	}
}