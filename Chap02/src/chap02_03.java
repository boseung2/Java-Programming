import java.util.Scanner;

public class chap02_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money, num;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		money = scanner.nextInt();
		
		num = money/50000;
		if(num > 0)	System.out.println("�������� " + num + "��");
		money %= 50000;
		
		num = money/10000;
		if(num > 0)	System.out.println("������ " + num + "��");
		money %= 10000;
		
		num = money/1000;
		if(num > 0)	System.out.println("õ���� " + num + "��");
		money %= 1000;
		
		num = money/100;
		if(num > 0)	System.out.println("��� " + num + "��");
		money %= 100;
		
		num = money/50;
		if(num > 0)	System.out.println("���ʿ� " + num + "��");
		money %= 50;
		
		num = money/10;
		if(num > 0)	System.out.println("�ʿ� " + num + "��");
		money %= 10;
		
		num = money;
		if(num > 0)System.out.println("�Ͽ� " + num + "��");
		
		}

}
