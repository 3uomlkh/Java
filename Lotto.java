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
		
		// �̸� �Է¹ޱ�
		inputName();
		
		// ��谡 ���� �ζǹ�ȣ
		makeLottoNum();
		
		// ����� ���� �ζǹ�ȣ
		makeUserNum();
		
		// ���� ����� ���� ��ȣ ���纸��
		makeCount();
		
		// 6�� - 1��, 5�� - 2��, 4�� - 3��, ������ ��
		informrRanking();

	}

	public static void informrRanking() {
		System.out.print("[�ζǰ��] " + Name + " ��, ������ ");
		if(count == 6) {
			System.out.print("1���Դϴ�!, ");
		}else if(count == 5) {
			System.out.print("2���Դϴ�!, ");
		}else if(count == 4) {
			System.out.print("3���Դϴ�!, ");
		}else System.out.print("���Դϴ�. ");
		
		System.out.print("������ ��ȣ [");
		for(int i = 0; i < 6; i++) {
			System.out.print(" " + lottoUser[i]);
		}
		System.out.print(" ]");
	}

	public static void inputName() {
		System.out.println("�̸��� �Է����ּ���. ");
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