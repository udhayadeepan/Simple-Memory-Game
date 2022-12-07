public class arr 
{
	public static void print(char[][] arr)
	
	{
		screen.clr();
		System.out.println("-----------Memory Game-----------\n");
		for(char a[]:arr)
		{
			for(char c:a)
			{
				System.out.printf("%6c",c);
			}
			System.out.println("\n");
		}

	}
}