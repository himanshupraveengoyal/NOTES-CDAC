package advancedJava;


interface Devesh{  
void print();  
}  
interface Dev extends Devesh{  
void show();  
}  
class InterfaceExample implements Dev{  
  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	InterfaceExample obj = new InterfaceExample();  
obj.print();  
obj.show();  
 }  
}  