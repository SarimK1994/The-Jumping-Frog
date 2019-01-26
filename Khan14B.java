/**************************************************************************
*                                                                         *
*     Program Filename:  Khan14B.java                                     *
*     Author          :  Sarim Khan    	                                *
*     Date Written    :  October 16th, 2017    	                          *
*     Purpose         :  To find probability of successfully leaving pond *
*     Input from      :  Keyboard                                         *
*     Output to       :  Screen                                           *
*                                                                         *
**************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Khan14B 
{
	public static void main(String[] args)
	{
		int Frog;
		double Total, iterations; 
      double Counter = 0;
		Random RNG = new Random();      
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("How many times would you like to iterate the trial?");
		iterations = Scan.nextDouble();
		
		for(int i = 0; i <= iterations; i++)
		{
			Frog = 1;
			int P;
			
			while(Frog != 0 || Frog != 10)
			{
				if(Frog == 0)
				{
					break;
				}//frog dies
				
				if(Frog == 1)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 1)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 1
				
				if(Frog == 2)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 2)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 2
				
				if(Frog == 3)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 3)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 3
				
				if(Frog == 4)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 4)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 4
				
				if(Frog == 5)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 5)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 5
				
				if(Frog == 6)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 6)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 6
				
				if(Frog == 7)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 7)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 7
				
				if(Frog == 8)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 8)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 8
				
				if(Frog == 9)
				{
					P = RNG.nextInt(10) + 1;
					if(P > 9)
						Frog++;
					else
						Frog--;
					continue;
				} //end move 9
				
				if(Frog == 10)
				{
					Counter++; 
					break;
				} //frog lives
			} //end while
			
		} //end for
		
		Total = Counter/iterations;
		
		System.out.println(Total);
	}
}
