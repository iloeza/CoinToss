package JavaSteps;

public class gameclass {

	//Variables declaration
		int Totaltoss;
		int Totalheads;
		int totaltails;
	
	//Constructor 
	gameclass()
	{
		this.Totalheads = 0;
		this.totaltails = 0;
		this.Totaltoss = 0;
	}

	//Method that generates the random number and assign it to its variable
public void caraosol(int a) 
{
	for(int i=0; i<a;i++) 
	{
	  int aleatorio =(int)(Math.random()*2); // 0 equals to tails, 1 equals to heads
		//System.out.println(aleatorio); this can be used to check the 10 randomly generated numbers
	    if(aleatorio == 1)
		{
	    	Totalheads += 1;
		}
		else
		{
			totaltails += 1;
		}	
	}	
	System.out.println("Total of tails: "+totaltails);
	System.out.println("Total of heads: "+Totalheads);
	System.out.println("Total of tosses: "+a);
}
}

