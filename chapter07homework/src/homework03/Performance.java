package homework03;

public class Performance {
String genre;
	
	public Movie(String genre) {
		this.genre = genre;
		}
	
	//메소드
	public abstract void getInformation() {
		System.out.println(title + actNum + diNum + score + attendacne +getGrade());
	}
}
