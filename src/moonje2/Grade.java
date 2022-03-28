package moonje2;

public class Grade {
	
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int ave = (math+science+english)/3;
		return ave;
	}
	

}
