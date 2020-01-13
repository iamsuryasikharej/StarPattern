
public class Pattern {
	public void disp()
	{
		
		for (int i=1;i<=5;i++)
		{
			System.out.println();
			for(int x=0;x<5;x++)
			{
//				System.out.println("X="+x);
				if(i==1)
				{
					System.out.print("*");
				}
				else
				{
					for(int j=x;j<i-1;j++)
					{
						System.out.print(" ");
						x=x+1;
						
					}
					
					System.out.print("*");
					
				}
			}
		}
			
	}

}
