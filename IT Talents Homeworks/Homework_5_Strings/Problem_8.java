import java.util.Scanner;

public class Problem_8 {

	public static void main(String[] args) {
//		������ 8:
//			�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
//			(������, ���).
//			���������� �� ������ �� ������ ���� ��������� ������ � ���������,
//			�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
//			����: �����
//			�����: ��.
//			����: ��������
//			�����: ��.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter � string");
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
