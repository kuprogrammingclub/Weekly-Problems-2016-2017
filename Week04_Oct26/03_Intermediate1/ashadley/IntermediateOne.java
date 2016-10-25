
public class IntermediateOne {
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 6561; i++)
		{
			String base3 = Integer.toString(i, 3);
			for(int j = 8 - base3.length(); j > 0; j--)
			{
				base3 = "0" + base3;
			}
			base3 = "1" + base3;
			if(checkSolution(base3)) {printSolution(base3);}
		}
	}
	
	public static boolean checkSolution(String sol)
	{
		int total = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(sol.substring(i - 1, i).equals("1"))
			{
				total += getFullNum(i, getNumEnd(sol, i));
			}
			else if(sol.substring(i - 1, i).equals("2"))
			{
				total -= getFullNum(i, getNumEnd(sol, i));
			}
		}
		return(total == 100);
	}
	
	public static int getFullNum(int start, int end)
	{
		String total = "";
		for(int i = start; i <= end; i++)
		{
			total += Integer.toString(i);
		}
		return Integer.parseInt(total);
	}
	
	public static int getNumEnd(String sol, int start)
	{
		if(start == sol.length())
		{
			return start;
		}
		if(sol.substring(start, start + 1).equals("0")) //if the next piece of the solution is a zero, keep going
		{
			return getNumEnd(sol, start + 1);
		}
		else
		{
			return start;
		}
	}
	
	public static void printSolution(String sol)
	{
		System.out.print("1");
		for(int i = 2; i <= 9; i++)
		{
			if(sol.substring(i-1, i).equals("0"))
			{
				System.out.print(Integer.toString(i));
			}
			else if(sol.substring(i-1, i).equals("1"))
			{
				System.out.print(" + " + Integer.toString(i));
			}
			else if(sol.substring(i-1, i).equals("2"))
			{
				System.out.print(" - " + Integer.toString(i));
			}
		}
		System.out.println();
	}
}
