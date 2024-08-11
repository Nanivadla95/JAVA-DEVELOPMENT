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
    Node table[]=new Node[10];
    public void create(){
        for(int i=0;i<10;i++)
            table[i]=null;
    }
    public Node getNode(int data){
        Node newNode=new Node(data);
        return newNode;
    }
    public int hash(int data){
        return data%10;
    }
    public void insert(int data){
        int key=hash(data);
        if(table[key]==null)
            table[key]=getNode(data);
        else{
            Node temp=table[key];
            while(temp.next!=null)
                temp=temp.next;
            temp.next=getNode(data);
        }
    }
    public String search(int data){
        int key=hash(data);
        if(table[key]!=null){
            Node temp=table[key];
            while(temp!=null){
                if(temp.data==data)
                    return "Yes";
                temp=temp.next;
            }
        }
        else{
            return "No";
        }
        return "No";
    }
    public void display(){
        for(int i=0;i<10;i++){
            System.out.print(i+" -> : ");
            Node temp=table[i];
            if(temp!=null){
                while(temp!=null){
                    System.out.print(temp.data+" ");
                temp=temp.next;
                }
            }
            else
                System.out.print("null");
            System.out.println();
        }
    }
    public void delete(int data){
        int key=hash(data);
        if(table[key]!=null){
            Node t1=table[key];
            Node t2=null;
            if(t1.data==data){
                if(t1.next!=null)
                    t2=t1.next;
                table[key]=t2;
                System.out.println("Data is deleted");
                return;
            }
            t2=t1.next;
            while(t2!=null){
                if(t2.data==data){
                    Node t3=null;
                    if(t2.next!=null)
                        t3=t2.next;
                    t1.next=t3;
                    System.out.println("Data is deleted");
                    return;
                }
                t1=t1.next;
                t2=t2.next;
            }
        }
        else{
            System.out.println("data is not present");
        }
    }
	public static void main(String[] args) {
		Main ob=new Main();
		ob.create();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(11);
		ob.insert(12);
		System.out.println(ob.search(30));
		ob.display();
		ob.delete(20);
		ob.display();
	    
	}
}