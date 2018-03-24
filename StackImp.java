
public class StackImp {
private int size =0,top =-1;
private int[] stack;

public StackImp(int size){
	this.size = size;
	stack = new int[size];
}

public void push(int element){
	if(top == size){
		System.out.println("Stack overflow");
	}
	else stack[++top]=element;
}

public int pop(){
	if(top ==-1) {
		System.out.println("Stack empty");
		return 0;
	}
	else 
		return stack[top--];
}

public void display(){
	if(top == -1){ 
		System.out.println("Empty Stack");
	}else {
	System.out.println("Stack element are ::: ");
	for(int i=top;i>=0;i--)
		System.out.println(stack[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImp s1 = new StackImp(6);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.display();
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
	}

}
