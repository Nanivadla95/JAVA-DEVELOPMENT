public class Main
{
    public int solution(int wt[],int pr[],int cap,int n){
        if(n<0 || cap==0)
            return 0;
        if(wt[n]>cap)
            return solution(wt,pr,cap,n-1);
        else{
            int a=0+solution(wt,pr,cap,n-1);
            int b=pr[n]+solution(wt,pr,cap-wt[n],n-1);
            return Math.max(a,b);
        }
        
    }
	public static void main(String[] args) {
		int wt[]={3,5,4,2,1};
		int pr[]={4,1,3,5,2};
		int cap=12;
		int n=wt.length;
		Main ob=new Main();
		//int c=ob.solution(wt,pr,cap,n-1);
	    //System.out.print(c);
	    int dp[][]=new int[n+1][cap+1];
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=cap;j++){
	            dp[0][j]=0;
	            dp[i][0]=0;
	        }
	    }
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=cap;j++){
	            if(wt[i-1]>j)
	                dp[i][j]=dp[i-1][j];
	            else
	                dp[i][j]=Math.max(dp[i-1][j],pr[i-1]+dp[i-1][j-wt[i-1]]);
	        }
	    }
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=cap;j++){
	            System.out.print(dp[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	}
}