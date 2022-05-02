package SimpleProgram;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value= 10;
		int i=0, j=1;
		int k=i+j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		int count=3;
		while(count < value)
		{
			i=j;
			j=k;
			k=i+j;
			System.out.println(k);
			count++;
		}
	}
	}


