package compositepattern;

public class Song extends SongComponent {

	String songName;
	String bandName;
	int releaseYear;

	public Song(String newSongName, String newBandName, int newReleaseYear) {
		songName = newSongName;
		bandName = newBandName;
		releaseYear = newReleaseYear;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void displaySongInfo() {
		System.out.println(getSongName() + " is of type " + getBandName()
				+ " released in the year " + getReleaseYear());
	}

}
