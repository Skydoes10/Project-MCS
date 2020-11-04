package model;

public class PrivatePL extends Playlist{
	
	public PrivatePL(String namePlaylist){
		super(namePlaylist);
	}
	
	public String toString(){
		return "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +duration+ "\n **  Genre: " +genre+ "\n********************************";
	}
	
	
	
	
	
	
}