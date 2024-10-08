public class Main
{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    int vertex=4;
    Node graph[]=new Node[4];
    public void create(){
        for(int i=0;i<vertex;i++)
            graph[i]=null;
    }
    public void insert(int edge,int ver){
        Node newNode=new Node(ver);
        if(graph[edge]==null)
            graph[edge]=newNode;
        else{
            Node temp=graph[edge];
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }
    }
    public void display(){
        for(int i=0;i<vertex;i++){
            System.out.print(i+" -> ");
            Node temp=graph[i];
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void dfs(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+"->");
        Node temp=graph[v];
        while(temp!=null){
            int data=temp.data;
            if(visited[data]!=true)
                dfs(data,visited);
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
		Main ob=new Main();
		ob.create();
		ob.insert(0,1);
		ob.insert(1,2);
		ob.insert(2,3);
		ob.insert(3,0);
		ob.display();
		boolean visited[]=new boolean[4];
		ob.dfs(3,visited);
	}
}