import java.util.Scanner;

public class Problemm_24 {

	public static void main(String[] args) {
//		������ 24:
//			���� ����� X � ���������, a�� �� ���� ������� ������ ����� �
//			����� ������.
//			�� �� ������� ��������, ����� ��������� ���� �������� ����� �
//			���������.
//			������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
//			������: 17571
//			�����: ������� � ���������
		
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
