import java.util.*;
class input
{
	public static void user(char[][] tile,char[][] ans,int n,int total,int clue)
	{
		
		Scanner scan=new Scanner(System.in);
		screen.clr();
		arr.print(ans);
		System.out.printf("-----For quit->q || For clue c->clue left:%d || Balance : %d -------\n",clue,total);
		System.out.print("enter row:");
		char h=scan.next().charAt(0);
		int row=0;
		if(total==0)
		{
			System.out.println("---CONGRATULATION YOU HAVE GOOD MEMORY POWER---");
			return;
		}
		if(h=='c' || h=='Q')
		{
			if(clue>0){
				arr.print(tile);
				try{
				Thread.sleep(2000);}
				catch(Exception e){}
				clue--;
				user(tile,ans,n,total,clue);
			}
			else 
			{
				System.out.println("---SORRY NO CLUE---");
				user(tile,ans,n,total,clue);
			}
		}
		if(h=='q' || h=='Q')
		{
			System.out.println("--better luck next time--");
			screen.clr(2000);

			Main.main(null);
		}
		else if(h>='0' && h<='9')
				row=((int)h)-49;
		
		System.out.print("enter column:");
		int col=scan.nextInt()-1;
		if(row>=n || col>=n)
		{
			System.out.print("----out of range!------");
			user(tile,ans,n,total,clue);
		}
		if(ans[row][col]=='X')
		{
			ans[row][col]=tile[row][col];
			screen.clr();
			arr.print(ans);
			System.out.print("enter row:");
			int row1=scan.nextInt()-1;
			System.out.print("enter column:");
			int col1=scan.nextInt()-1;
			if(row1>=n || col1>=n || (row1==row && col1 == col))
			{
				System.out.print("invalid input!");
				ans[row][col]='X';
				user(tile,ans,n,total,clue);
			}
			if(tile[row1][col1]==tile[row][col])
			{
				ans[row1][col1]=tile[row1][col1];
				total=total-2;
			}
			else 
			{
				ans[row][col]='X';
			}

		}
		else 
		{
			System.out.println("---------Already opened!---------");
		}
		
		user(tile,ans,n,total,clue);

	}


}