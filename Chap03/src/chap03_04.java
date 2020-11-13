import java.util.Scanner;

public class chap03_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i = ((int)c-97) ; i>=0; i--) {
			for(int j=97; j<=(i+97); j++) {
			System.out.print((char)j);
		}
			System.out.println();
		}
		
		
	}

}
