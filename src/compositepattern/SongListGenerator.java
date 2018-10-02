package compositepattern;

public class SongListGenerator {
	public static void main(String[] args) {
		
		SongComponent industrialMusic = new SongGroup("Industrial Music ", "Industrial music is a kind of music");
		SongComponent dubStepMusic = new SongGroup("dubStepMusic", "Dub Step Music is a kind of Music");
		SongComponent heavyMetalMusic = new SongGroup("HeavyMetalMusic", "Heavy Metal Music is a kind of music");
		
		SongComponent everySong = new SongGroup("SongList", "Every Song List");
		everySong.add(industrialMusic);
		industrialMusic.add(new Song("Billd", "LP",1976));
		industrialMusic.add(new Song("LLDP", "PL", 1976));
		
		industrialMusic.add(dubStepMusic);
		dubStepMusic.add(new Song("Pulihora","PB",2000));
		dubStepMusic.add(new Song("jaffa","PB",2000));
		
		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("blurredlines","TI",1990));
		
		DiscJockey cL = new DiscJockey(everySong);
		cL.getSongList();
	}

}
