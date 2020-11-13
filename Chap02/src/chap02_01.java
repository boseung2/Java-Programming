import java.util.Scanner;

public class chap02_01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>>");
		int won = scanner.nextInt();
		double dollar = won/(double)1100;
		System.out.println(won + "���� $" + dollar +"�Դϴ�.");		
		
		scanner.close();
			
	}

}
