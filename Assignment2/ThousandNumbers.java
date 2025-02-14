//Code by Cole Miller

public class ThousandNumbers {
	public static void main(String[] args)
	{
		int n = 0;
		
		while(n++ < 1000)
		{
		System.out.print(n + " ");
		if(n % 10 == 0)
		{
			System.out.print("\n");
		}
		}
		
	}

}
