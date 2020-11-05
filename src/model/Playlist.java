package model;

public class Playlist{
	//Constants
	public static final int SIZE = 10;
	
	//Relationships
	private Genre[] genres;
	private Song[] songs;
	
	//Attributes
	private String namePlaylist;
	private int duration;
	
	//Builder
	public Playlist(String namePlaylist, int duration){
		this.namePlaylist = namePlaylist;
		this.duration = duration;
		this.genres = genres;
	}//End Builder
	
	//getters and setters
	public String getNamePlaylist(){
		return namePlaylist;
	}
	
	public void setNamePlaylist(String namePlaylist){
		this.namePlaylist = namePlaylist;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public Song[] getSongs(){
		return songs;
	}
	
	public void setSongs(Song[] songs){
		this.songs = songs;
	}
	
	public int getPLduration(){
		return PLduration;
	}

	public Genre[] getPLGenres(){
		return PLGenres;
	}
}