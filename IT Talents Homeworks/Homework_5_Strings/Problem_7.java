import java.util.Scanner;

public class Problem_7 {

	public static void main(String[] args) {
//		������ 7:
//			�� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
//			��������.
//			���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
//			����� � ���-������� ����.
//			������: asd fg hjkl
//			�����: 3 ����, ���-������� � � 4 �������.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter � word sequence");
		String string1 = sc.nextLine();
		
		String[] words = string1.split(" ");
		int max=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>max){
				max = words[i].length();
			}
			
		}
		System.out.println(words.length+" ����, ���-������� � � "+max+" �������.");
	}

}
