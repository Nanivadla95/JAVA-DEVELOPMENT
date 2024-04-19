package p1;



public class Linked1 {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
		Node head=null;
		void insert(int data) {
			Node newNode=new Node(data);
			if(head== null) {
				head=newNode;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		void position(int pos) {
			Node temp=head;
			while(pos>1) {
				temp=temp.next;
				pos--;
			}
	
		}
		void insertf(int data,int pos) {
			Node newNode=new Node(data);
			Node temp=head;
			while(pos>1) {
				temp=temp.next;
				pos--;
			}
			Node temp2=temp.next;
			temp.next=newNode;
			newNode.next=temp2;
		}
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data);
				temp=temp.next;
			}
		}
		int count=1;
		void count() {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				count++;
			}
			System.out.println("count"+count);
			
		}
	
		void res(int n) {
			
			Node temp=head;
			while(n>1) 
				temp=temp.next;
				n--;
			}
			n=count-n;
			System.out.print(n);
			System.out.print(temp.data);
			
		}
		public static void main(String[] args) {
			Linked1 l1=new Linked1();
			l1.insert(10);;
			l1.insert(20);
			l1.insert(30);
			l1.insert(40);
			l1.insertf(20,2);
			//l1.position(2);
			//l1.display();
			l1.count();
			l1.res(3);
		}

}
