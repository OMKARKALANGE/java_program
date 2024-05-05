package javademo;

public class ArrayDemo2 {
	

	public static void main(String[] args) {
	int[] a= {12, 21,0, 5,7}; 
		
		int[] b=a;
		
	
		for(int i=0; i< b.length;i++)   
		{
			System.out.println(b[i]); 
					
		}
		
		  a[2]=52; 
		  System.out.println("======");
		  System.out.println(b[2]);
		  
		  b[4]=100; 
		  System.out.println(a[4]);
		 
		int[] c= {12, 21,0, 5,7};
		int[] d=new int[a.length];

		
		
		for(int i=0; i<a.length;i++)
		{
			b[i]=a[i];             
		}
		a[2]=56;
		System.out.println(b[2]);
		
		b[4] = 100; 
		
	}
		
		

}



