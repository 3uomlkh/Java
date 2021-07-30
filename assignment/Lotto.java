package jump2java;
import java.util.Scanner;

public class Lotto {
	public static int[] lottoMachine = new int[6];
	public static int[] lottoUser = new int[6];
	public static int count;
	public static String Name = new String();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		count = 0;
		
		// 이름 입력받기
		inputName();
		
		// 기계가 뽑은 로또번호
		makeLottoNum();
		
		// 사람이 뽑은 로또번호
		makeUserNum();
		
		// 기계와 사람이 뽑은 번호 맞춰보기
		makeCount();
		
		// 6개 - 1등, 5개 - 2등, 4개 - 3등, 나머지 꽝
		informrRanking();

	}

	public static void informrRanking() {
		System.out.print("[로또결과] " + Name + " 님, 오늘은 ");
		if(count == 6) {
			System.out.print("1등입니다!, ");
		}else if(count == 5) {
			System.out.print("2등입니다!, ");
		}else if(count == 4) {
			System.out.print("3등입니다!, ");
		}else System.out.print("꽝입니다. ");
		
		System.out.print("뽑으신 번호 [");
		for(int i = 0; i < 6; i++) {
			System.out.print(" " + lottoUser[i]);
		}
		System.out.print(" ]");
	}

	public static void inputName() {
		System.out.println("이름을 입력해주세요. ");
		Name = sc.next();
	}

	public static void makeCount() {
		for(int i = 0; i < 6; i++) {
			int lottoUserNum = lottoUser[i];
			int lottoMachineNum = lottoMachine[i];
			if(lottoUserNum == lottoMachineNum) {
				count += 1;
			}
		}
	}

	public static void makeUserNum() {
		for(int i = 0; i < 6; i++) {
			lottoUser[i] = (int)(Math.random() * 45 + 1);
		}
	}

	public static void makeLottoNum() {
		for(int i = 0; i < 6; i++) {
			lottoMachine[i] = (int)(Math.random() * 45 + 1);
		}
	}

}
