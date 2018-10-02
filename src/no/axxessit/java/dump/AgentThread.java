// Copyright (c) 2013 Ericsson AB. All rights reserved.

package no.axxessit.java.dump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * Please document the responsibility of the type here.
 * 
 */
class Agent extends Thread
{

    /**
     * @param args
     */
     private ArrayList<String> populatedThreads = null;
     TobaccoThread tThread = new TobaccoThread("TobaccoThread");
     PaperThread pThread = new PaperThread("PaperThread");
     MatchesThread mThread = new MatchesThread("MatchesThread");
     ArrayList<String> allThreads = null;
     static Agent instance = null;
     Agent()
     {
         allThreads = new ArrayList<String>(3);
         allThreads.add("TobaccoThread");
         allThreads.add("PaperThread");
         allThreads.add("MatchesThread");
        
     }
     
     public static Agent getInstance(){
         if(instance == null){
             instance = new Agent();
         }
         return instance;
         
     }
    public ArrayList<String> getPopulatedThreads(){
        return populatedThreads;
    }
    public void setPopulatedThreads(ArrayList<String> popThreads){
        this.populatedThreads = popThreads;
    }
    public  void run()
    {
        int i=0;
        while(i<3)
        {
            
            try{
                populatedThreads = populateRandomThreads(allThreads);
                
                this.setPopulatedThreads(populatedThreads);
                tThread.start();
                pThread.start();
                mThread.start();
                wait();
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
        }
    }

    public static ArrayList<String> populateRandomThreads(ArrayList<String> allThreads)
    {
        ArrayList<String> popArrayList = new ArrayList<String>(2);
        Random rand = new Random();
        for (int i = 0; i < 2; i++)
        {
            int num = rand.nextInt(2);
            popArrayList.add(allThreads.get(num));
        }

        return popArrayList;
    }

}




public class AgentThread {
    public static void main(String[] args)
    {
        Agent a = new Agent();
        a.start();
    }
}