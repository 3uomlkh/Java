package jump2java;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] autoNum = new int[6];
		int[] lottoNum = new int[6];
		String yn;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로또 기계를 돌리시겠습니까?(y/n)");
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

		}	System.out.print("[로또결과] 이채원님, 오늘은 ");
			if(count==6) {
				System.out.print("1등입니다!, ");
			}else if(count==5) {
				System.out.print("2등입니다!, ");
			}else if(count==4) {
				System.out.print("3등입니다!, ");
			}else System.out.print("꽝입니다, ");
			
			System.out.print("뽑으신 번호 :");
			for(int i = 0; i < autoNum.length; i++) {
				System.out.print(" " + autoNum[i]);
			}
			
		}else if(yn.equals("n")){
			System.out.println("다음에 만나요.");
			return;
		}sc.close();
	}
		
		
	
}