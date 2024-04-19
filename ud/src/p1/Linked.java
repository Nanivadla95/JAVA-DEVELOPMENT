package p1;

public class Linked {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
		Node head=null;
		public void insert(int data) {
			
		Node newNode=new Node(data);
		if(head == null) {
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
		public void insertf(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
			
		}
		void deletef(int data) {
			Node temp=head;
			head=temp.next;
			free(temp);
		}
		private void free(Node temp) {
		
			
		}
		void insertd(int data,int pos) {
			Node newNode =new Node(data);
			Node temp=head;
			while(pos>1) {
				temp=temp.next;
				pos--;
			}
			Node temp2=temp.next;
			temp.next=newNode;
			newNode.next=temp2;
		
			
		}
		public void deletep(int pos) {
			Node temp=head;
			while(pos>2) {
				temp=temp.next;
				pos--;
			}
			System.out.print(temp.data);
			Node temp2=temp.next;
			temp.next=temp2.next;
			                                                                                                                                                                                                                                                       
			
		}
		public void delete() {
			Node temp=head;
			Node temp2=temp.next;
			while(temp2.next!=null) {
				temp=temp.next;
				temp2=temp2.next;
			}
			temp.next=null;
			temp2=null;
		}
		public void display() {
			Node temp=head;
			while(temp!=null) {
				//System.out.println(temp.data);
				temp=temp.next;
			}
		
			
		}
	
		public static void main(String[] args) {
			Linked o=new Linked();
			o.insert(10);
			o.insert(20);
			o.insert(30);
			o.insert(40);
		    o.insertd(50,3);
		    o.deletep(1);
		    //o.delete();
			o.display();
			
			
		}

}
