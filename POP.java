
package Main;
import java.util.*;
public class POP {
int top=1;
int stack[]=new int[5];
int min=-1;
public void push(int data){
 if (top==-1){
  min=data;
  stack[++top]=data;
 }
  else if(data<min){
   stack[++top]=2*data-min;
   min =data;
   }
   else{
   stack[++top]=data;
   }
}  
  public int pop(){
  if (stack[top]<min){
    int temp=min;
    min=2*min-stack[top--]; 
    return temp;
  }
  else{
    return stack[top--];
     }
    }
  public static void Main(String []args){
                 POP ob=new POP();
	    		  ob.push('2');
	    		  ob.push('3');
	    		  ob.push('1');
	              System.out.println(ob.min);
	              System.out.println(ob.pop());
	              System.out.println(ob.min);
  }
    }
  
  