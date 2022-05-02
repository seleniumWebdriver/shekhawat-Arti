package ArrayProgram;

public class SecNThrdLargestval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int larg[] = {4,6,3,7,9,2,8};
		int temp=0;
		
		for (int i=0; i<larg.length; i++)
		{
			for(int j=i+1; j<larg.length; j++)
			{
				if(larg[i]>larg[j])
				{
					temp=larg[i];
					larg[i]=larg[j];
					larg[j]=temp;
					
				}
			}
		
		}
		System.out.println("Second Largest value"+ larg[larg.length-2]);
		System.out.println("Third Largest value"+ larg[larg.length-3]);
	}

}
