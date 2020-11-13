public class Song {
	
	private String title, artist, country;
	private int year;
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public Song() {
	}
	
	public void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ�  " + title);
	}
	
	public static void main(String[] args) {
		Song newSong = new Song("Dancing queen", "ABBA", 1978, "������");
		newSong.show();
	}

}
