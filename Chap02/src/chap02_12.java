import java.util.Scanner;

public class chap02_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		double a = scanner.nextDouble();
		String operator = scanner.next();
		double b = scanner.nextDouble();
		
		if(operator.equals("+"))
			System.out.println(a+b);
		else if(operator.equals("-"))
			System.out.println(a-b);
		else if(operator.equals("*"))
			System.out.println(a*b);
		else if(operator.equals("/")) {
			if(b == 0) System.out.println("0���� ���� �� �����ϴ�.");
		else System.out.println(a/b);
		}		
		
		scanner.close();
	}

}
