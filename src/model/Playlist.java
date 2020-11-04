package model;

public class Playlist{
	//Constants
	public static final int SIZE = 10;
	
	//Attributes
	private String namePlaylist;
	private int duration;
	
	//Relationships
	private Genre genres;
	private Song[] songs;
	
	//Builder
	public Playlist(String namePlaylist){
		this.namePlaylist = namePlaylist;
	}//End Builder
	
	//getters and setters
	public String getNamePlaylist(){
		return namePlaylist;
	}
	
	public void setNamePlaylist(String namePlaylist){
		this.namePlaylist = namePlaylist;
	}
	
	public Song[] getSongs(){
		return songs;
	}
	
	public void setSongs(Song[] songs){
		this.songs = songs;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public int getPLduration(){
		return PLduration;
	}

	public Genre getPLpopularGenre(){
		return PLpopularGenre;
	}
}