package pattern005;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				// print star
				if(i==j || i<j )
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