package jtesting;

public class Condition {
	
	
	public int checktype(int x)
	{
		if(x>0)
		{
			
			return x+10;
		
		}
		else if(x<0)
		{
			
			return x-10;
		}
		else  if(x==0)
		{
			return x+100;
		}
		return 0;
		
	}

}
