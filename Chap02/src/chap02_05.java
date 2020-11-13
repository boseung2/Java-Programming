import java.util.Scanner;

public class chap02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if( a+b<c || b+c<a || c+a<b) System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		else System.out.println("�ﰢ���� �˴ϴ�.");
		
		scanner.close();
				
	}

}
