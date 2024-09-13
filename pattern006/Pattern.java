package pattern006;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				// print star
				if(i==j || j==5 || i==1 )
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