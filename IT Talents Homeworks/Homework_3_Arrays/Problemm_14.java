import java.util.Iterator;

public class Problemm_14 {

	public static void main(String[] args) {

		// ������ 14:
		// ����� ������������� ������� ��������� �����, �������� ������
		// �����.
		// �� �� ������� ��������, ���� ����� �� ������� ���� �������� ��
		// ������ ��� ��������� �� ��������� [-2.99..2.99] � �� ���������� � ���
		// �����. ������ ����� �� �� ������� �� ������.
		// ������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
		// �����: 0.2; 0.99; 1.4; 1.2
		int count = 0;
		int index = 0;
		double[] arr = { 1, 2, 3, 4, 5, 6, 7, 2.34, 1.9, -2, 1.567 };
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= -2.99) && (arr[i] <= 2.99)) {
				count++;
			}
		}
		double[] newArr = new double[count];
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= -2.99) && (arr[i] <= 2.99)) {
				newArr[index] = arr[i];
				index++;

			}
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
	}

}
