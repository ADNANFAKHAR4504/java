public class Binary{

	public static void main(String[] args) {
		int[] a={2,5,7,9,11,14,16,19,23,28,29,33}; //Here we should use the sorted array::
		int Li=0;
		int Hi=a.length-1;
		int search=16;
         int mid=(Li+Hi)/2;
         while(Li<=Hi)
         {
		if(a[mid]==search)
		{
			System.out.println("the searching number is"+mid);
		    break;
		}
		else if(a[mid]<search)
		{
			Li=mid+1;
		}
		else
		{
		 Hi=mid-1;
		}
		 mid=(Li+Hi)/2;
		 if(Li>Hi)
		 {
		 	System.out.println("number not found");
		 }
	}
  }
}