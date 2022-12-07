import java.util.*;
public class create
{
	public int num=0;
	static void Memory_Game(int n)
	{
		Random rn=new Random();
		char tiles[][]=new char[n][n];  //title with random symbols
		int a=33;
		int total=n*n;
		while(total!=0)
		{
			int count=(n%2==1 && total==1)?1:0;
			char c=(char)a++;
			while(count!=2)
			{
				int x=rn.nextInt(0,n);
				int y=rn.nextInt(0,n);
				if(tiles[x][y]==0)
				{
					tiles[x][y]=c;
					count++;
					total--;
				}
		    }
		}
		char[][] ans=new char[n][n]; //to store answers
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				ans[i][j]='X';


		try{
			arr.print(tiles);
		 Thread.sleep(n*2000);
		 screen.clr();
		}
		catch(Exception e){};
		input.user(tiles,ans,n,n*n,n);




	}
}