package test07;

class Movie{
	private String title;
	private double score;
	private String director;
	private String day;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "[영화 제목 =" + title + ", 관람객 평점 =" + score + ", 영화 감독 =" + director + ", 개봉일 =" + day + "]";
	}
	
	
	

}
public class test04 {

	public static void main(String[] args) {
		Movie Movie = new Movie();
		Movie.setTitle("탑건 : 매버릭");
		Movie.setDirector("토니 스콧");
		Movie.setScore(9.6);
		Movie.setDay("2022.06.22");
		
		System.out.println(Movie.toString());
		
				
	}
}
