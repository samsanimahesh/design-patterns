package compositepattern;

public abstract class SongComponent {
	
	public void add(SongComponent songComponent){
		throw new UnsupportedOperationException("Not supported");
	}
	
	
	public void remove(SongComponent songComponent){
		throw new UnsupportedOperationException("Not supported");
	}
	
	public SongComponent getComponent(int componentIndex){
		throw new UnsupportedOperationException("Not supported");
	} 
	
	public String getBandName(){
		throw new UnsupportedOperationException("Not supported");
	} 
	
	public String getSongName(){
		throw new UnsupportedOperationException("Not supported");
	}
	
	public int getReleaseYear(){
		throw new UnsupportedOperationException("Not supported");
	}
	
	public void displaySongInfo(){
		throw new UnsupportedOperationException("Not supported");
	}

}
