public class Main
{
    public void search(int arr[],int l,int h,int se){
        if(l<h){
            int m=(l+h)/2;
            if(arr[m]==se)
                System.out.print(arr[m]);
            else if(se<arr[m])
                search(arr,l,m,se);
            else if(se>arr[m])
                search(arr,m+1,h,se);
        }
    }
    public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int flag=0;
	    for(int i=0;i<n-1;i++){
	        for(int j=0;j<-1-i;j++){
	            if(arr[i]<arr[j]){
	                int t=arr[i];
	                arr[i]=arr[j];
	                arr[j]=t;
	                flag=1;
	            }
	        }
	        if(flag==0)
	            break;
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
    }
}