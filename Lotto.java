package jump2java;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] autoNum = new int[6];
		int[] lottoNum = new int[6];
		String yn;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ζ� ��踦 �����ðڽ��ϱ�?(y/n)");
		yn = sc.next();
		
		for(int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int)(Math.random()*45+1);
		}
		
		if(yn.equals("y")) {
			for(int i = 0; i < autoNum.length; i++) {
				autoNum[i] = (int)(Math.random()*45+1);	
				for(int k = 0; k <6; k++) {
					for(int j = 0; j <6; j++) {
						if(lottoNum[k] == autoNum[j]) {
							count++;
							}
						}
					}

		}	System.out.print("[�ζǰ��] ��ä����, ������ ");
			if(count==6) {
				System.out.print("1���Դϴ�!, ");
			}else if(count==5) {
				System.out.print("2���Դϴ�!, ");
			}else if(count==4) {
				System.out.print("3���Դϴ�!, ");
			}else System.out.print("���Դϴ�, ");
			
			System.out.print("������ ��ȣ :");
			for(int i = 0; i < autoNum.length; i++) {
				System.out.print(" " + autoNum[i]);
			}
			
		}else if(yn.equals("n")){
			System.out.println("������ ������.");
			return;
		}sc.close();
	}
		
		
	
}