import java.util.Scanner;

public class chap03_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] inputNum = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0; i<10; i++) {
			inputNum[i] = scanner.nextInt();
		}
		
		System.out.print("3�� ����� ");
		for(int i=0; i<10; i++) {
			if(inputNum[i] % 3 == 0)
				System.out.print(inputNum[i] + " ");
		}
		
	}

}
