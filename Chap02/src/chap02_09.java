import java.util.Scanner;

public class chap02_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("�� �Է�>>");
		double xValue = scanner.nextDouble();
		double yValue = scanner.nextDouble();
		
		double distance = Math.sqrt((xValue - x)*(xValue - x) + (yValue - y)*(yValue - y));
		if(distance <= r)
			System.out.printf("��(%.1f, %.1f)�� �� �ȿ� �ִ�.", xValue, yValue);
		else
			System.out.printf("��(%.1f, %.1f)�� �� �ȿ� ����.", xValue, yValue);
		
		scanner.close();

	}

}
