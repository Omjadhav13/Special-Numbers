package spiders;

public class special_till_1000 {
	public static void check(int n) {
		int p=n;
		int sum=0;
		int mul=1;
		int add=0;
		int count=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			mul=mul*digit;
			add=mul+sum;
			n=n/10;	
		}
		if(add==p)
		{
			System.out.println(add+ " "+"special");
		}	
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			check(i);
		}
	}
}
