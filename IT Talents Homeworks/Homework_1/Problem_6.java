import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
//		������ 6:
//			�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
//			�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
//			�3 �� ��� ������� �������� �� �1.
		
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
