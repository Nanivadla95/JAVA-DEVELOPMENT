package p1;

import java.util.*;
public class Double {
	int top=-1;
	int stack[]=new int[4];
	public void push(int data) {
		if(top==4) {
			System.out.print("stack full");
		
		}

			stack[++top]=data;
	}
		public int pop() {
			if(top ==-1) {
				System.out.print("stack empty");
		
			}
			  int t=stack[top];
				top--;
				return t;
			
		}
		public int empty() {
			if(top ==-1) {
				return 0;
			}
			else {
				return 1;
			}
		}
		int min=999;
		public void min() {
			
			for(int i=0;i<stack.length;i++) {
				if(stack[i]<min) {
					min=stack[i];
					min=2*stack[i]-min;
					//System.out.print(stack[i]);
				}
				top--;
			
			
			}
			System.out.print(min);
		}
		public void display() {
			for(int i=0;i<stack.length;i++) {
				System.out.print(stack[i]);
			}
			
		}
	

	
		public static void main(String[] args) {
			
			Double s=new Double();
			Double s1=new Double();
			s.push(2);
			s.push(3);
			s.push(1);
			s.push(5);
			s.min();
			//s.push(1);
			/*while(s.empty()!=0) {
				s1.push(s.pop());
			}
			while(s1.empty()!=0) {
			  System.out.print(s1.pop());
			}*/
			//s.pop();
			//s.min();
			s.display();
		}


}
	
		