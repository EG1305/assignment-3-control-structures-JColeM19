//Code by Cole Miller

public class MultiplesOfTen {
	public static void main(String[] args)
	{
	
		int i = 0;
		for(int n = 10; n <= 1000; n += 10)
		{
		System.out.print(n + " ");
		i++;
		if(i % 10 == 0)
		{
			System.out.print("\n");
		}
		}	
	}
}