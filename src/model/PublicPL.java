package model;

public class PublicPL extends Playlist{
	
	private double score;
	
	public PublicPL(String namePlaylist, double score, int duration){
		super(namePlaylist, duration);
		this.score = score;
	}
	
	public String toString(){
		return "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +getDuration()+ "\n **  Genre: " +getPLGenres()+ "\n********************************";
	}
	

	
}