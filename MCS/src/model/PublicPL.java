package model;

public class PublicPL extends Playlist{
	
	private double score;
	private int amountScores;
	
	/**
	 * Create a public playlsit. <br>
	 * <b>pre: </b> Have registered the parameters to create a new public playlist. <br>
	 * <b>post: </b> Created a new public playlist. <br>
	 * @param namePlaylist Name of the public playlist. namePlaylist != "".
	 * @param score Score of the public playlist. score != 0.0.
	 * @param duration Duration of the public playlist. duration != 0.
	 * @param amountScores Number of times a public playlist was rated. amountScores != 0.
	 */
	public PublicPL(String namePlaylist, double score, int duration, int amountScores){
		super(namePlaylist, duration);
		this.score = score;
		this.amountScores = amountScores;
	}
	
	public double getScore(){
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public int getAmountScores(){
		return amountScores;
	}
	
	public void setAmountScores(int amountScores) {
		this.amountScores = amountScores;
	}
	
	/**
	 * Calculate average score. <br>
	 * <b>pre: </b> There must be at least one registered playlist and rated. <br>
	 * <b>post: </b> The average score has been calculated. <br>
	 * @return average score.
	 */
	public double average() {
		double average;
		if(getAmountScores() == 0) {
			average = 0;
		}
		else {
			average = getScore()/getAmountScores();
		}
		return average;
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
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre:   \n **  Score: " +average()+ "\n************************************";
		}
		else {
			out = "\n************* Playlist *************\n **  title: " +getNamePlaylist()+ "\n **  Duration: " +convertDuration()+ "\n **  Genre: " +printGenres()+ "\n **  Score: " +average()+ "\n************************************";
		}
		return out;
	}
	
}