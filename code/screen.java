import java.io.*;
public class screen
{
	public static void clr()
	
	{
		try 
		{
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		}catch(IOException | InterruptedException ex){}
	}
	public static void clr(int time)
	
	{
		try 
		{
			Thread.sleep(time);
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		}catch(IOException | InterruptedException ex){}
	}
}