public class Main
{
    public int solution(int pr[],int cl,int tl){
        if(cl<=0 )
            return 0;
        if(tl==1)
            return pr[0];
        
        int a=0+solution(pr,cl-1,tl);
        int nl=tl-cl+1;
        int b=0;
        if(cl<=tl){
             b=pr[cl-1]+solution(pr,cl,tl-cl);
        }
            return Math.max(a,b);
        
    }
	public static void main(String[] args) {
		int arr[]={3,5,4};
		Main ob=new Main();
		int c=ob.solution(arr,arr.length,arr.length);
	    System.out.print(c);
	    
	}
}