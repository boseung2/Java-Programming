import java.util.Scanner;

public class chap03_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int inputNum = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int count = inputNum / unit[i];
			if(count > 0) {
				System.out.println(unit[i] + "�� ¥�� : " + count + "��");
				inputNum -= unit[i] * count;
			}
		}
		
	}

}
