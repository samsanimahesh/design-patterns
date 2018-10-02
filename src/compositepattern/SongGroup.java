package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{
	
	ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	String groupName;
	String groupDescription;
	
	public SongGroup(String newGroupName,String newGroupDescription){
		groupName = newGroupName;
		groupDescription = newGroupDescription;
	}
	
	public String getGroupName(){
		return groupName;
	}
	
	public String getGroupDescription(){
		return groupDescription;
	}
	
	public void add(SongComponent newSongComponent){
		songComponents.add(newSongComponent);
	}
	
	public void remove(SongComponent newSongComponent){
		songComponents.remove(newSongComponent);
	}
	
	public SongComponent getComponent(int index){
		return (SongComponent)songComponents.get(index);
	}
	
	public void displayInfo(){
		System.out.println("Group Name is " +getGroupName());
		System.out.println("Group Description is " +getGroupDescription());
		
		Iterator<?> songIterator = songComponents.iterator();
		while(songIterator.hasNext()){
			SongComponent songInfo = (SongComponent)songIterator.next();
			songInfo.displaySongInfo();
			
		}
	}
	

}
