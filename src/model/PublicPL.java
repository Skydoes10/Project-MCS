package model;

public class PublicPL extends Playlist{
	
	private double score;
	private int amountScores;
	
	public PublicPL(String namePlaylist, double score, int duration, int amountScores){
		super(namePlaylist, duration);
		this.score = score;
		this.amountScores = amountScores;
	}
	
	public double getScore(){
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public int getAmountScores(){
		return amountScores;
	}
	
	public void setAmountScores(int amountScores) {
		this.amountScores = amountScores;
	}
	
	public double average() {
		double average;
		if(getAmountScores() == 0) {
			average = 0;
		}
		else {
			average = getScore()/getAmountScores();
		}
		return average;
	}
	
	public String toString(){ 
		String out;
		if(getPLGenres()[0] == null) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:   \n **  Score: " +average()+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +printGenres()+ "\n **  Score: " +average()+ "\n************************************";
		}
		return out;
	}
	
}