package model;

public class PrivatePL extends Playlist{
	
	private String creatorUser;
	
	/**
	 * Create a private playlsit. <br>
	 * <b>pre: </b> Have registered the parameters to create a new private playlist. <br>
	 * <b>post: </b> Created a new private playlist. <br>
	 * @param namePlaylist Name of the private playlist. namePlaylist != "".
	 * @param creatorUser Name of user that create the private playlist. creatorUser != "".
	 * @param duration Duration of the private playlist. duration != 0.
	 */
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
	
	/**
	 * Organize playlist information. <br>
	 * <b>pre: </b> There must be at least one registered playlist. <br>
	 * <b>post: </b> The playlist information was organized for print. <br>
	 * @return All playlist information organized.
	 */
	public String toString(){ 
		String out;
		if(getPLGenres()[0] == null) {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:  \n **  Creator: " +creatorUser+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +printGenres()+ "\n **  Creator: " +creatorUser+ "\n************************************";
		}
		return out;
	}	

}