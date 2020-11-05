package model;

public class PrivatePL extends Playlist{
	
	private String creatorUser;
	
	public PrivatePL(String namePlaylist, String creatorUser, int duration){
		super(namePlaylist, duration);
		this.creatorUser = creatorUser;
	}
	
	public String toString(){
		return "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +getDuration()+ "\n **  Genre: " +getPLGenres()+ "\n **  Creator: " +creatorUser+ "\n********************************";
	}
	
	
	
	
	
	
}