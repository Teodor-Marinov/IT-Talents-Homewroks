import java.util.Scanner;

public class Problemm_23 {

	public static void main(String[] args) {
//		������ 23:
//			�� �� ������� ��������, ����� ���� ����� while �������
//			��������� �� ���������, �� ��� ����������.
//			�.�. ��� � �������� 4*5 �� �� ������� 5*4.
//			
//			1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
//			2-�� �e�: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
//			...
//			9-�� ���: 9*9;
		
		Scanner sc = new Scanner(System.in);
		
		int row = 1;
		while(row<=9){
			for(int i=1; i<=9; i++){
				if(row<=i){
					System.out.print(row+"*"+i+"; ");
				}
			}
			row++;
			System.out.println();
		}
		
		
	}

}
