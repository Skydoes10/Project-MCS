package model;

public class PrivatePL extends Playlist{
	
	private String creatorUser;
	
	public PrivatePL(String namePlaylist, String creatorUser, int duration){
		super(namePlaylist, duration);
		this.creatorUser = creatorUser;
	}
	
	public String getCreatorUser(){
		return creatorUser;
	}
	
	public void setCreatorUser(String creatorUser) {
		this.creatorUser = creatorUser;
	}
	
	public String toString(){ 
		String out;
		if(getPLGenres().length == 0) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:  \n **  Creator: " +creatorUser+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +getPLGenres()+ "\n **  Creator: " +creatorUser+ "\n************************************";
		}
		return out;
	}	
	
}