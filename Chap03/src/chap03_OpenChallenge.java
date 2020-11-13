import java.util.Scanner;
import java.util.Random;

public class chap03_OpenChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		for(int i=1; ; i++) {
		int k = r.nextInt(100);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
		int a=0, b=99, inputNum=105;
		
		System.out.println(a + "-" + b);
		System.out.print(i + ">>");
		inputNum = scanner.nextInt();
		if(inputNum<k) {
			System.out.println("�� ����");
			a = inputNum;
		}else if(inputNum>k) {
			System.out.println("�� ����");
			b = inputNum;			
		}else {
			System.out.println("�¾ҽ��ϴ�.");
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			String text = scanner.next();
			if(text.equals("n"))break;
			else if(text.equals("y"))continue;
			else System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		}
		
		scanner.close();
		
	}

}
