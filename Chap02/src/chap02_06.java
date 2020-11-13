import java.util.Scanner;

public class chap02_06 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int ten, one;
		
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		int num = scanner.nextInt();
		ten = num/10;
		one = num%10;
		
		if(ten == 3 || ten == 6 || ten == 9) {
			if(one == 3 || one == 6 || one == 9) System.out.println("�ڼ�¦¦");
			else System.out.println("�ڼ�¦");
		}
		
	}

}
