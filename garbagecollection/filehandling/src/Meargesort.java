
public class Meargesort {
public void mearge(int arr[],int l,int m,int r)
{
	int n1=m-l+1;
			int n2=r-m;
			int[]L=new int[n1];
			int []R=new int[n2];
			for(int i=0;i<n1;i++)
			
				L[i]=arr[l+i];
				
			for(int j=0;j<n2;j++ )
				R[j]=arr[m+1+j];
			int i=0;
			int j=0;
			int k=l;
					while(i<n1&& j<n2) {
						if(L[i]<=R[j])
						{
							arr[k]=L[i];
									i++;
						}
						else {
							arr[k]=R[j];
							j++;
						}
						k++;
					}
					while(i<n1)
					{
						arr[k]=R[j];
						i++;
						k++;
					}
					while(j<n2)
					{
						arr[k]=R[j];
						j++;
						k++;
					}

}
public void sort(int[]arr,int l,int r)
{
	if(l<r)
	{
		int m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		mearge(arr,l,m,r);
	}
}
	public static void main(String[] args) {
		int[] arr= {12,11,13,5,6,7};
		Meargesort ob=new Meargesort();
		ob.sort(arr, 0, arr.length-1);
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			System.out.println();
		}
	}

}
