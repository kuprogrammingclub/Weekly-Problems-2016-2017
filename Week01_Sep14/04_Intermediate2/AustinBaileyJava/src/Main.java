import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("What is the word you'd like to place a value on?");
		Scanner myScanner = new Scanner(System.in);
		String unknownWord =myScanner.next();
		String values = unknownWord.toLowerCase();//changes all of the upper case characters to lower case
		int result = getValue(values);
		System.out.println("The total value of your word is " + result);
	}
	
	public static int getValue(String s)
	{
		int value=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				value++;
			}
			else if(s.charAt(i)=='b')
			{
				value+=2;
			}
			else if(s.charAt(i)=='c')
			{
				value+=3;
			}
			else if(s.charAt(i)=='d')
			{
				value+=4;
			}
			else if(s.charAt(i)=='e')
			{
				value+=5;
			}
			else if(s.charAt(i)=='f')
			{
				value+=6;
			}
			else if(s.charAt(i)=='g')
			{
				value+=7;
			}
			else if(s.charAt(i)=='h')
			{
				value+=8;
			}
			else if(s.charAt(i)=='i')
			{
				value+=9;
			}
			else if(s.charAt(i)=='j')
			{
				value+=10;
			}
			else if(s.charAt(i)=='k')
			{
				value+=11;
			}
			else if(s.charAt(i)=='l')
			{
				value+=12;
			}
			else if(s.charAt(i)=='m')
			{
				value+=13;
			}
			else if(s.charAt(i)=='n')
			{
				value+=14;
			}
			else if(s.charAt(i)=='o')
			{
				value+=15;
			}
			else if(s.charAt(i)=='p')
			{
				value+=16;
			}
			else if(s.charAt(i)=='q')
			{
				value+=17;
			}
			else if(s.charAt(i)=='r')
			{
				value+=18;
			}
			else if(s.charAt(i)=='s')
			{
				value+=19;
			}
			else if(s.charAt(i)=='t')
			{
				value+=20;
			}
			else if(s.charAt(i)=='u')
			{
				value+=21;
			}
			else if(s.charAt(i)=='v')
			{
				value+=22;
			}
			else if(s.charAt(i)=='w')
			{
				value+=23;
			}
			else if(s.charAt(i)=='x')
			{
				value+=24;
			}
			else if(s.charAt(i)=='y')
			{
				value+=25;
			}
			else if(s.charAt(i)=='z')
			{
				value+=26;
			}
		}
		return value;
	}
}
