class SphenicNumber
{
	public static void main(String[] args) 
	{

				int n=30;
				int count=0;
				int product=1;
		
		for(int i=2; i<=n; i++)
		{
		    if (n%i==0)
		   {
				boolean b =prime(i);
			if(b==true)
			{
				if(count<=3)
				{
					product=product*i;
				}
				count++;
			}
		   }  
		}
		if( count==3 && product==n )
		{
			System.out.println(n+"is a Spenic number");
		}
	}

	public static boolean prime(int n)
	{
		if (n==0 || n==1)
		{
			return false;
		}
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
