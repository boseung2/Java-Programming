import java.util.Scanner;


class CurrencyConverter {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸����  $" + CurrencyConverter.toDollar(1000000) + "�Դϴ�.");
		System.out.println("$100�� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();
	}
}
