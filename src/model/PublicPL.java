package model;

public class PublicPL extends Playlist{
	
	private double score;
	
	public PublicPL(String namePlaylist, double score, int duration){
		super(namePlaylist, duration);
		this.score = score;
	}
	
	public double getScore(){
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double average(Double score) {
		double average;
		setScore(getScore() + objSearch2.getDuration());
		return average;
	}
	
	public String toString(){ 
		String out;
		if(getPLGenres().length == 0) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:   \n **  Score: " +score+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +getPLGenres()+ "\n **  Score: " +score+ "\n************************************";
		}
		return out;
	}
	
}