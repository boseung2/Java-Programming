import java.util.Scanner;

public class chap02_OpenChallenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String chulSu = scanner.next();
		System.out.print("���� >> ");
		String youngHe = scanner.next();
		
		if(chulSu.equals(youngHe)) {
			System.out.println("�����ϴ�.");
		}
		else if(chulSu.equals("����")) {
			if(youngHe.equals("����")) System.out.println("���� �̰���ϴ�.");
			else if(youngHe.equals("��")) System.out.println("ö���� �̰���ϴ�.");
		}
		
		else if(chulSu.equals("����")) {
			if(youngHe.equals("����")) System.out.println("���� �̰���ϴ�.");
			else if(youngHe.equals("��")) System.out.println("ö���� �̰���ϴ�.");
		}
		
		else {
			if(youngHe.equals("����")) System.out.println("���� �̰���ϴ�.");
			else if(youngHe.equals("����")) System.out.println("ö���� �̰���ϴ�.");
		}
		
		scanner.close();
	}

}
