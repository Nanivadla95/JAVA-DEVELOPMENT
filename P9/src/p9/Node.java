package p9;
	import java.util.*;
	import org.w3c.dom.Node;
	public class Node {
		Class node{
		int data;
		Node next;
	    Node(int data){
	this.data=data;
	this.next=null;
		}

	}
	Node head=null;
	public void insert(int data) {
		Node newnode=new Node(data);
		if(head==null) {
		 head=newnode;
	   }
		else {
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
		   }
	    	temp.next=newnode;
		 }	

	public void indertend(int data) {
	Node newnode=new Node(data);
	newnode.next=head;
	 head =newnode;
	}
	public void deletfront() {
		Node temp=head;
		head=temp.next;	
	  temp=null;
	}
	public void intsertposition(int data,int pos) {
		Node newnode=new Node(data);
		Node temp1=head;
		while(pos>1) {
			
			temp1=temp1.next;
			pos--;
		}
		Node temp2=temp1.next;
		temp1.next=newnode;
		newnode.next=temp2;
	}
		public void deletposition(int pos) {
			Node temp1=head;
			while
		}
	   }
	 }

}
