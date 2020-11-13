public class Rectangle {
	
	private int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width*height;
	}
	
	public void show() {
		System.out.printf("(%d, %d)���� ũ�Ⱑ %dx%d�� �簢��\n", x, y, width, height);
	}
	
	public boolean contains(Rectangle compare) {
		if(this.x < compare.x && (compare.x + compare.width) < (this.x + this.width) &&
		   this.y < compare.y && (compare.y + compare.height) < (this.y + this.height)) {
			return true;
		}else 
			return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
