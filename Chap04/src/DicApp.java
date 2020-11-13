import java.util.Scanner;

class Dictionary{
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i]))
				return eng[i];
		}
		return word;
	}
}


public class DicApp {
	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		System.out.println("�ѱ� �ܾ�?");
		String word = scanner.next();
			
	}

}
