package no.axxessit.java.dump;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Producer extends Thread
{
    private ArrayList<String> resourceOnTable;
    ArrayList<String> resources = new ArrayList<String>();

    @Override
    public void run()
    {
    	int i =1;
            while (i<3)
            {
                try {
					putMessage();
					System.out.println("Going to wait");
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                i++;
            }
    }

    private synchronized void putMessage() throws InterruptedException
    {
    	System.out.println("Going to place resources on Table");
        resourceOnTable = new ArrayList<String>();
        resources.add("Paper");
        resources.add("Matches");
        resources.add("Tobacco");
        resourceOnTable.addAll(resources);
        int n = resources.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n-1; i++)
        {
            int change = i + random.nextInt(n-1);
            swap(resources, i, change);
        }
        resourceOnTable.remove(resources.get(n-1));
    }

    private static void swap(List<String> a, int i, int change)
    {
        String helper = a.get(i);
        a.set(i, a.get(change));
        a.set(change, helper);
    }

    // Called by Consumer
    public void getMessage()
    {
    	synchronized (resourceOnTable) {
			
		}
        boolean isTobaccoThread = false;
        boolean isMatchesThread = false;
        boolean isPaperThread = false;
        if (resourceOnTable.size() == 2)
        {
            for (Object s : resourceOnTable)
            {
                if (s.toString().equals("Paper"))
                {
                    isPaperThread = true;
                }
                else if (s.toString().equals("Tobacco"))
                {
                    isTobaccoThread = true;
                }
                else if (s.toString().equals("Matches"))
                {
                    isMatchesThread = true;
                }
            }
            if (!isTobaccoThread && Thread.currentThread().getName().equals("Tobacco"))
            {
                consumeResources(resourceOnTable);
            }
            else if (!isMatchesThread && Thread.currentThread().getName().equals("Matches"))
            {
                consumeResources(resourceOnTable);
            }
            else if (!isPaperThread && Thread.currentThread().getName().equals("Paper"))
            {
                consumeResources(resourceOnTable);
            }
            notifyAll();
        }
    }

    public void consumeResources(ArrayList<String> resources)
    {
        System.out.println("Consumed by " + this.getName());
        for (String res : resources)
        {
            System.out.println("Used resource " + res);
        }
    }
}

class Consumer extends Thread
{

    public static void main(String args[])
    {
        Producer producer = new Producer();
        producer.start();
        new Tobacco(producer).start();
        new Matches(producer).start();
        new Paper(producer).start();
    }
}

class Tobacco extends Thread
{
    Producer producer;

    Tobacco(Producer p)
    {
       this.setName("Tobacco");
        producer = p;
    }

    @Override
    public void run()
    {
                producer.getMessage();
                System.out.println("Done Execution " +this.getName());

    }
}

class Matches extends Thread
{
    Producer producer;

    Matches(Producer p)
    {
        this.setName("Matches");
        producer = p;
    }

    @Override
    public void run()
    {
       
                producer.getMessage();
                System.out.println("Done Execution " +this.getName());
       
    }
}

class Paper extends Thread
{
    Producer producer;

    Paper(Producer p)
    {
        this.setName("Paper");
        producer = p;
    }

    @Override
    public void run()
    {
                producer.getMessage();
                System.out.println("Done Execution " +this.getName());

    }
}