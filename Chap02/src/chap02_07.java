import java.util.Scanner;

public class chap02_07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if( x >= 100 && x <= 200 && y >= 100 && y <= 200) 
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.", x, y);
		else 
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.", x, y);
		
		scanner.close();
		
	}

}
