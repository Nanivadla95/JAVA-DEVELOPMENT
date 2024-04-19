package Node;
import java.util.*;
public class lMain {
  int top=1;
  char stack[]=new char[5];
  public void push(char data) {
	  if(top==4) {
		  System.out.print("stack full");
		  return;
		  
	  }
	  stack[++top]=data;
	  
  }
	public char pop(){
	if(top==-1) {
		System.out.print("Empty stack");
		return 'a';
	}	
	return stack[top--];
	     }
	public char peek() {
		 return stack[top];
	       }
	      public char Empty() {
	    	  if(top==-1) {   	  
	    	  return 0;
	    	  }
	    	  else {
	    		  return 1;	  
	    }  
	    	  }
	    	  public void display() {
	    		  for (int i=top;i>=0;i--) {
	    			  System.out.print(stack[i]);
	   
	    		  }
	    	  }
	    	  public static void main(String[]args) {
	    		  lMain s1=new lMain();
	    		  lMain s2=new lMain();
	    		  s1.push('a');
	    		  s1.push('b');
	    		  s1.push('c');
	    		  s1.push('d');
	              s1.pop();                                                
	    	      s1.display();
	    	      while(s1.Empty()!=0) {
	    	    	  s2.push(s1.pop());
	    	      }
	    	      
	    	      while(s2.Empty()!=0) {
	    	    	  System.out.print(s2.pop()+" ");
	    	      }
	    	  }
	     
}
	
