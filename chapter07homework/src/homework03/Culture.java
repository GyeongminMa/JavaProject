package homework03;

public abstract class Culture {
	String title;
	int diNum;
	int actNum;
	int attendance;
	int score;
	
	public Culture(String title,int diNum,int actNum, int attendance, int score) {
		this.title =title;
		this.diNum = diNum;
		this.actNum = actNum;
		this.attendance = attendance;
		this.score = score;
		}
	public void setTotalScore(int score) {
		
	}
	public String getGrade() {
		
	}
	public abstract void getInformation();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDiNum() {
		return diNum;
	}
	public void setDiNum(int diNum) {
		this.diNum = diNum;
	}
	public int getActNum() {
		return actNum;
	}
	public void setActNum(int actNum) {
		this.actNum = actNum;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
	
	
}
