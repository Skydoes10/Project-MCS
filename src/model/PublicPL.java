package model;

public class PublicPL extends Playlist{
	
	private double score;
	
	public PublicPL(String namePlaylist, double score, int duration){
		super(namePlaylist, duration);
		this.score = score;
	}
	
	public double setScore(){
		return score;
	}
	
	public void getScore(double score) {
		this.score = score;
	}
	
	public double average(Double score) {
		double average;
		
		return average;
	}
	
	public String toString(){ 
		String out;
		if(getPLGenres().length == 0) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +getDuration()+ "\n **  Genre:   \n **  Score: " +score+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +getDuration()+ "\n **  Genre: " +getPLGenres()+ "\n **  Score: " +score+ "\n************************************";
		}
		return out;
	}
	
}