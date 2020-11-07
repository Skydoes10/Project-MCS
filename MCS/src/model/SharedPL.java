package model;

public class SharedPL extends Playlist{
	
	private String[] users;
	
	/**
	 * Create a shared playlsit. <br>
	 * <b>pre: </b> Have registered the parameters to create a new shared playlist. <br>
	 * <b>post: </b> Created a new shared playlist. <br>
	 * @param namePlaylist Name of the shared playlist. namePlaylist != "".
	 * @param users Names of users that create the shared playlist. users != null && users != "".
	 * @param duration Duration of the shared playlist. duration != 0.
	 */
	public SharedPL(String namePlaylist, String[] users, int duration){
		super(namePlaylist, duration);
		this.users = users;
	}
	
	public String[] getUsers(){
		return users;
	}
	
	public void setUsers(String[] users){
		this.users = users;
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
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:  \n **  Members: " +members()+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +printGenres()+ "\n **  Members: " +members()+ "\n************************************";
		}
		return out;
	}
	
	/**
	 * Organize members of the playlist to print. <br>
	 * <b>pre: </b> There must be at least one registered playlist. <br>
	 * <b>post: </b> The name of the playlist members was organized for print. <br>
	 * @return All name of the playlist members organized.
	 */
	public String members() {
		String send;
		send = ""+users[0];
		for(int i = 1; i < users.length; i++) {
			send += ", "+users[i];
		}
		return  send;
	}
	
}