package lambdafunctional;
/* POJO: Plain Old Java Object
 * 1) Constructor with no parameter
 * 2) Constructor with all parameter
 * 3) getter() and setter() (encapsulation)
 * 4) toString()
 * 
 * we use Source>>Generate Constructor using fields
 * 
 */
public class Course {
	private String season;
	private String course;
	 int avgScore;
	private int numOfStd;
	
	
	public Course() {
	
	}


	public Course(String season, String course, int avgScore, int numOfStd) {
		this.season = season;
		this.course = course;
		this.avgScore = avgScore;
		this.numOfStd = numOfStd;
	}


	public String getSeason() {
		return season;
	}


	public void setSeason(String season) {
		this.season = season;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getAvgScore() {
		return avgScore;
	}


	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}


	public int getNumOfStd() {
		return numOfStd;
	}


	public void setNumOfStd(int numOfStd) {
		this.numOfStd = numOfStd;
	}


	@Override
	public String toString() {
		return "Course [season=" + season + ", course=" + course + 
				", avgScore=" + avgScore + ", numOfStd=" + numOfStd
				+ "]";
	}
	
	
	
	
}
