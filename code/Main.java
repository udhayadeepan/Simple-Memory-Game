import java.util.*;
class Main
{
	public static Scanner scan=new Scanner(System.in);
	public static int size=4; // default row x column
	public static void main(String[] args) {
		while (true){
			screen.clr();
			System.out.println("-------------Memory Game-------------");
			System.out.println("1.start\n2.change level\n3.Exit");
			System.out.print("Enter option:");
			create t=new create();
			switch(scan.nextInt())
			{
			case(1):

				t.Memory_Game(size);
				break;
			case(2):
				screen.clr();
				System.out.println("1.Default(4x4)\n2.Medium(6x6)\n3.Hard(8x8)");
				System.out.print("enter option:");
				switch(scan.nextInt())
				{
				case(1):
					size=4;
					break;
				case(2):
					size=6;
					break;
				case(3):
					size=8;
					break;
				}
				break;
			case(3):
				System.out.println("-----BYE-----");
				return;

			default:
				System.out.println("------Pls enter correct option---------");
				screen.clr(1000);
				Main.main(null);
			}
			
		}

	}
}