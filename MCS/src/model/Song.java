package model;

public class Song{
	//Attributes
	private String title;
	private String artistName;
	private String releaseDate;
	private int duration;
	
	//Relationships
	private Genre genre;
	
	/**
	 * Create a song. <br>
	 * <b>pre: </b> Have registered the parameters to add a new song. <br>
	 * <b>post: </b> Added the song. <br>
	 * @param title Title of the song. title != "".
	 * @param artistName Name of the artist of the song. artistName != "".
	 * @param releaseDate Release date of the song. releaseDate != "".
	 * @param duration Duration in seconds of the song. duration != 0.
	 * @param genre Option chosen for the Genre of the song.
	 */
	//Builder
	public Song(String title, String artistName, String releaseDate, int duration, Genre genre){
		this.title = title;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.genre = genre;
	}//End Builder
	
	//getters and setters
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getArtistName(){
		return artistName;
	}
	
	public void setArtistName(String artistName){
		this.artistName = artistName;
	}
	
	public String getReleaseDate(){
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public Genre getGenre(){
		return genre;
	}
	
	public void setGenre(Genre genre){
		this.genre = genre;
	}
	
	/**
	 * Convert the duration of the song. <br>
	 * <b>pre: </b> There must be at least one registered song. <br>
	 * <b>post: </b> Converted the duration of seconds to (hours) minutes and seconds. <br>
	 * @return Duration converted.
	 */
	public String convertDuration() {
		String converted = "";
		int duration, minutes, seconds, hours;
		duration = getDuration();
		if(duration >= 3600) {
			hours = duration/3600;
			minutes = ((duration-hours*3600)/60);
			seconds = duration-(hours*3600+minutes*60);
			if(seconds < 10 && minutes > 10) {
				converted = hours + minutes +":0"+ seconds;
			}
			else if(seconds > 10 && minutes < 10) {
				converted = hours +":0"+ minutes +":"+ seconds;
			}
			else if(seconds < 10 && minutes < 10) {
				converted = hours +":0"+ minutes +":0"+ seconds;
			}
			else {
				converted = hours +":"+ minutes +":"+ seconds;
			}
		}
		else {
			minutes = duration/60;
			seconds = duration-(minutes*60);
			if(seconds < 10) {
				converted = minutes +":0"+ seconds;
			}
			else {
				converted = minutes +":"+ seconds;
			}
		}
		return converted;
	}
	
	/**
	 * Organize song information. <br>
	 * <b>pre: </b> There must be at least one registered song. <br>
	 * <b>post: </b> The song information was organized for print. <br>
	 * @return All song information organized.
	 */
	public String toString(){
		return "\n************* Song *************\n **  Title: " +title+ "\n **  Artist: " +artistName+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +genre+"\n********************************";
	}
}