package model;

abstract public class Playlist{
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
		genres = new Genre[SIZE];
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

	public void setPLGenres(Genre[] genres){
		this.genres = genres;
	}
	
	public Genre[] getPLGenres(){
		return genres;
	}
	
	public int getPLduration(){
		
		return PLduration;
	}
	
	public String convertDuration() {
		String converted = "";
		int duration, minutes, seconds;
		duration = getDuration();
		minutes = duration/60;
		seconds = duration-(minutes*60);
		if(seconds < 10) {
			converted = minutes +":0"+ seconds;
		}
		else {
			converted = minutes +":"+ seconds;
		}
		return converted;
	}
}