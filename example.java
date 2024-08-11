public class Main
{   
    //github.com/Anand-29
    public boolean helper(int arr[][],int r,int c){
        if(r>3 || c>3 || r<0 || c<0 || arr[r][c]==0)
            return false;
        return true;
    }
    public boolean sol(int ar[][],int sol[][],int r,int c){
        if(r==3 && c==3 && ar[r][c]==1){
            sol[r][c]=1;
            return true;
        }
        if(helper(ar,r,c)==true){
            sol[r][c]=1;
            if(sol(ar,sol,r,c+1)==true){
                return true;
            }
            if(sol(ar,sol,r+1,c)==true){
                return true;
            }
            if(sol(ar,sol,r-1,c)==true){
                return true;
            }
            if(sol(ar,sol,r,c-1)==true){
                return true;
            }
            sol[r][c]=0;
        }
        return false;
    }
	public static void main(String[] args) {
        int ar[][]={{1,1,1,1},
                    {1,1,0,1},
                    {1,1,0,1},
                    {1,1,0,1}};
        int sol[][]={{0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}};
        Main ob=new Main();
        if(ob.sol(ar,sol,0,0)==true){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.print("No solution");
        }
	}
}