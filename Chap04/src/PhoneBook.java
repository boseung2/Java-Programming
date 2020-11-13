import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
		
	public void set(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
			System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�.");
	}
		
}

public class PhoneBook {
	private Phone phoneBook[];
	private int num;
	private static Scanner scanner;
	
	PhoneBook(int num){
		this.num = num;
		phoneBook = new Phone[num];
		for(int i=0; i<num; i++) 
			phoneBook[i] = new Phone();
	}
	
	void input() {
		for(int i=0; i<num; i++) {
		System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
		String name = scanner.next();
		String tel = scanner.next();
		phoneBook[i].set(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	boolean search(String name) {
		for(int i=0; i<num; i++) {
			if(name.equals(phoneBook[i].getName()))
				return true;
		}
		return false;
	}
	
	void search() {
		while(true) {
			System.out.print("�˻��� �̸�>");
			String name = scanner.next();
			for(int i=0; i<num; i++) {
				if(name.equals(phoneBook[i].getName())) {
					phoneBook[i].show();
					break;
				}
			}
			if(name.equals("�׸�"))
				break;
		}
	}
	//search�޼ҵ忡�� �̸��� ������ �迭�ȿ� �ݺ������� ����Ʈ, �̸��� ������ �����ϴ� , �׸��̸� �����ε� ���ǹ��� �ݺ����ȿ��������� ����ü ������
	//��� ����������� �𸣰���...�Ϥ�	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("�ο���>>");
		int num = scanner.nextInt();
		PhoneBook phoneBook = new PhoneBook(num);
		phoneBook.input();
		phoneBook.search();
	}

}
