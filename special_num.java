package spiders;

public class special_num {
	public static void main(String[] args) {
		int n=19;  //input
		int p=n;
		int sum=0;
		int mul=1;
		int add=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;//0 0 8
			mul=mul*digit;//00 0
			add=mul+sum;//0 0 8
			n=n/10;
		}
		if(add==p) {
			System.out.println("special");
		}
		else {
			System.out.println("not a special");
		}
		
	}
}
