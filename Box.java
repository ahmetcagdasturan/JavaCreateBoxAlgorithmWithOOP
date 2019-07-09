
public class Box {
	
	private int width;
	private int height;
	
	public Box() 
	{
		height = 3;
		
	}
	public void incrementBox() 
	{
		width++;
		System.out.println(width);
	}
	public void decrementBox() 
	{
		width--;
		System.out.println(width);
	}
	public int size(int x)
	{
		width = x;
		return width;
	}
	public int getArea() 
	{
		return width*height;
	}
	public void drawBox() 
	{
		for(int i=1;i<height+1;i++) 
		{
			for(int j=1;j<width+1;j++)
			{
				if((i==1 && j==1) || (i==1 && j==width) || (i==height && j==1) || (i==height && j==width))
				{
					System.out.print("+ ");
				}
				else if(i==1 || i == height)
				{
					System.out.print("- ");
				}
				else if(j== 1 || j== width)
				{
					System.out.print("| ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}

}
