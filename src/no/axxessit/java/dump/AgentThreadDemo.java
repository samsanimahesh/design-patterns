package no.axxessit.java.dump;

import java.util.ArrayList;
import java.util.Random;

public class AgentThreadDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		ResourceAgent agent = new ResourceAgent();
		agent.run();

	}

}

class ResourceAgent implements Runnable {
	
	ArrayList<String> allThreads = new ArrayList<String>(3);
	ArrayList<String> populatedThreads = new ArrayList<String>(2);
	
	
	ResourceAgent() {
		allThreads.add("TobaccoThread");
		allThreads.add("PaperThread");
		allThreads.add("MatchesThread");
	}

	@Override
	public void run() {
		populatedThreads = populateThread(allThreads);
		CigaretteThread tThread = new CigaretteThread("TobaccoThread",populatedThreads);
		MatchesThread mThread = new MatchesThread("MatchThread",populatedThreads);
		PaperThread pThread = new PaperThread("PaperThread",populatedThreads);
		tThread.start();
		mThread.start();
		pThread.start();
		try {
			System.out.println("Agent Thread Going to Wait State");
			wait();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	private ArrayList<String> populateThread(ArrayList<String> allThreads) {
		ArrayList<String> popArrayList = new ArrayList<String>(2);
        Random rand = new Random();
        for (int i = 0; i < 2; i++)
        {
            int num = rand.nextInt(2);
            popArrayList.add(allThreads.get(num));
        }
        if(popArrayList.get(0).equals(popArrayList.get(1))){
        	
        }

        return popArrayList;
	}

}

class CigaretteThread extends Thread
{
	ArrayList<String> resourcesOnTable = new ArrayList<String>(2);
	CigaretteThread(String name,ArrayList<String> populatedThreads)
    {
        Thread.currentThread().setName(name);
        resourcesOnTable = populatedThreads;
        
    }
    public void run(){
        synchronized (resourcesOnTable) {
			boolean isTobaccoThread = findRelevantThread(resourcesOnTable);
			if(!isTobaccoThread){
	            System.out.println("Taken the Paper and Matches");
	            System.out.println("Cigarette Made");
	            System.out.println("Cigarette Burnt");
	            System.out.println("About to notify Agent Thread by TobaccoThread");
	            notify();
	        }else{
	            System.out.println("TobaccoThread is present on the Table. Hence Exiting");
	        }
		}
        
    }
    public boolean findRelevantThread(ArrayList<String> resourcesOnTable){
        for(String resource : resourcesOnTable){
            if(resource.equals(this.getName())){
                return true;
            }
        }
        return false;
    }

}

class PaperThread extends Thread
{
	ArrayList<String> resourcesOnTable = new ArrayList<String>(2);
    PaperThread(String name,ArrayList<String> populatedThreads)
    {
        Thread.currentThread().setName(name);
        resourcesOnTable = populatedThreads;
    }
    public void run(){
        synchronized (resourcesOnTable) {
        	 boolean isPaperThread = findRelevantThread(resourcesOnTable);
             if(!isPaperThread){
                 System.out.println("Taken the Tobacco and Matches");
                 System.out.println("Cigarette Made");
                 System.out.println("Cigarette Burnt");
                 System.out.println("About to notify Agent Thread by Paper Thread");
                 notify();
             }else{
                 System.out.println("TobaccoThread is present on the Table. Hence Exiting");
             }
		}
        
    }
    public boolean findRelevantThread(ArrayList<String> resourcesOnTable){
        for(String resource : resourcesOnTable){
            if(resource.equals(this.getName())){
                return true;
            }
        }
        return false;
    }

}

class MatchesThread extends Thread
{
	ArrayList<String> resourcesOnTable = new ArrayList<String>(2);
    MatchesThread(String name,ArrayList<String> populatedThreads)
    {
        Thread.currentThread().setName(name);
        resourcesOnTable = populatedThreads;
        
    }
    public void run(){
        synchronized (resourcesOnTable) {
        	boolean isMatchesThread = findRelevantThread(resourcesOnTable);
            if(!isMatchesThread){
                System.out.println("Taken the Tobacco and Paper");
                System.out.println("Cigarette Made");
                System.out.println("Cigarette Burnt");
                System.out.println("About to notify Agent Thread by MatchesThread");
                notify();
            }else{
                System.out.println("TobaccoThread is present on the Table. Hence Exiting");
            }
		}
        
        
    }
    public boolean findRelevantThread(ArrayList<String> resourcesOnTable){
        for(String resource : resourcesOnTable){
            if(resource.equals(this.getName())){
                return true;
            }
        }
        return false;
    }

}
