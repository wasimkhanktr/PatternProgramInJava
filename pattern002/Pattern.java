package pattern002;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				// print star
				if(i==1 || j==1 || i==5 || j==5)
					System.out.print(" * ");
				else
//					print space
					System.out.print("   ");
			}
			//for next line
			System.out.println();
		}

	}

}