class dNode{
	dNode frontNext=null,backNext=null,next=null;
	int data;
	
	public dNode(int data){
		this.frontNext = null;
		this.data = data;
		this.backNext = null;
	}
	public int getData(){
		return data;
	}
	public dNode getFrontNext(){
		return this.frontNext;
	}
	public dNode getBackNext(){
		return this.backNext;
	}
	public void setBackNext(dNode node){
		this.backNext = node;
	}
	public void setFrontNext(dNode node){
		this.frontNext = node;
	}
}
public class DoublyLinkedListImp {
    dNode head = null;
    
    public void insertAtBegin(dNode node){
    	if(head == null){
    		head = node;
    		node.setBackNext(null);
    	}else{
    		dNode currentNode = head;
    		node.setBackNext(currentNode);
    		head = node;
    	}
    }	
    
    public void insertAtEnd(dNode node){
    	dNode currentNode = head;
    	if(head == null){
    		head = node;
    		node.setBackNext(null);
    	}else{
    		while(currentNode.getBackNext()!=null){
    			
    			currentNode = currentNode.getBackNext();
    		}
    		currentNode.setBackNext(node);
    		node.setFrontNext(currentNode);
    	}
    }
    public void insertAtAnyPos(dNode node, int pos){
    	if(head == null){
    		System.out.println("Empty List");
    	}else {
    		dNode currentNode= head, tempNode = null;
    		int i=1;
    		while ( pos !=i && currentNode.getBackNext()!= null){
    			tempNode = currentNode;
    			currentNode = currentNode.getBackNext();
    			i++;
    		}
    		tempNode.setBackNext(node);
    		node.setBackNext(currentNode);
    		node.setFrontNext(tempNode);
    		
    	}
    }
    public void displayFromBegin(){
     if(head == null){
    	 System.out.println("Empty List");
     }else {
    	 System.out.println("\nList elements from Front are:::");
    	 for(dNode currentNode = head; currentNode!= null; currentNode = currentNode.getBackNext()){
    		 System.out.print(currentNode.getData() + "  ");
    	 }
     }
    }
    public void displayFromEnd(){
    	dNode back = head, current = null;
        if(head == null){
       	 System.out.println("Empty List");
        }else {
        	while(back.getBackNext()!=null) {
        		current = back;
        		back=back.getBackNext();
        		back.setFrontNext(current);
        	}
       	 	System.out.println("\nList elements from Back are:::");
       	 	for(dNode currentNode = back; currentNode!= null; currentNode = currentNode.getFrontNext()){
       		 System.out.print(currentNode.getData() + "  ");
       	 	}
        }
       }
    
	public static void main(String[] args){
	DoublyLinkedListImp dlist = new DoublyLinkedListImp();
	dNode node1 = new dNode(2);
	dNode node2 = new dNode(5);
	dNode node3 = new dNode(3);
	dNode node4 = new dNode(4);
	dNode node5 = new dNode(10);
	dNode node6 = new dNode(9);
	dNode node7 = new dNode(11);
	dlist.insertAtBegin(node1);
	dlist.insertAtBegin(node2);
	dlist.insertAtBegin(node3);
	dlist.insertAtBegin(node4);
	dlist.displayFromBegin();
	dlist.displayFromEnd();
	dlist.insertAtEnd(node5);
	dlist.insertAtBegin(node6);
	dlist.displayFromBegin();
	dlist.displayFromEnd();
	dlist.insertAtAnyPos(node7, 4);
	dlist.displayFromBegin();
	dlist.displayFromEnd();
  }
}
