import java.util.Scanner;

public class chap02_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scanner.nextInt();
		
		if(month >= 1 && month <=2)
			System.out.println("�ܿ�");
		else if(month >= 3 && month <= 5)
			System.out.println("��");
		else if(month >= 6 && month <= 8)
			System.out.println("����");
		else if(month >= 9 && month <= 11)
			System.out.println("����");
		else if(month == 12)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
		
		scanner.close();

	}

}
