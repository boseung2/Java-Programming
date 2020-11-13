import java.util.Scanner;

public class chap02_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>>");
		int num = scanner.nextInt();
		if(num % 10 == num/10) System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		
		scanner.close();

	}

}
