import java.util.Scanner;

public class chap02_10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù���� ���� �߽ɰ� ������ �Է�>>");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r1 = scanner.nextDouble();
		
		System.out.print("�ι��� ���� �߽ɰ� ������ �Է�>>");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r2 = scanner.nextDouble();
		
		double distance = Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
		if(distance <= r1+r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scanner.close();

	}

}
