public class Main
{
    public void FloydWarshall(int arr[][],int n){
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                for(int c=0;c<n;c++){
                    if(arr[a][b]>arr[a][c]+arr[c][b]){
                        arr[a][b]=arr[a][c]+arr[c][b];
                    }
                }
            }
        }
    }
	public static void main(String[] args) {
	    int un=99999999;
		int arr[][]={{un,1,un,6,un},
		             {1,un,5,2,3},
		             {un,5,10,9,1},
		             {6,2,9,un,un},
		             {un,3,1,un,un}};
		Main ob=new Main();
		ob.FloydWarshall(arr,arr.length);
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}