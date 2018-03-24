class Node{
	private int data;
	private Node next;
	public Node(int data){
		this.data = data;
	}
	public void setData(int data){
		this.data = data;
	}
	public int getData(){
		return data;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return this.next;
	}
}
public class LinkedList {
	private int length = 0;
	Node head = null;
	
	public Node getHead(){
		return head;
	}
	public void insertAtFront(Node node){
		node.setNext(head);
		head = node;
		length++;
	}
	public void insertAtEnd(Node node){
		if(head == null){
			head = node;
		}else{ Node tempNode = head;
				while(tempNode.getNext()!=null){
					//System.out.print(tempNode.getData()+"  ");
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(node);
				node.setNext(null);
				
		}
	}
	public void insertAtAnyPosition(Node node, int pos){
		Node currentNode = head, tempNode = null;
		int i=1;
		if(pos == 1){
			head = node;
			head.setNext(currentNode);			
		}else{
			while (pos != i && currentNode!=null){
				tempNode = currentNode;
				currentNode = currentNode.getNext();
				i++;
				
			}
			
			tempNode.setNext(node);
			node.setNext(currentNode);
		}
	}
	
	public void deleteFromFront(){
		if(head == null){
			System.out.println("Empty List");
		}else{
			System.out.println("\nDeleted Element from front ::: " + head.getData());
			head = head.getNext();
		}
	}
	
	public void deleteFromEnd(){
		if(head == null){
			System.out.println("Empty List");
		}else{
			Node currentNode = head;
			Node prevNode = null;
			while(currentNode.getNext() != null){
				prevNode = currentNode;
				currentNode = currentNode.getNext();
			}
			System.out.println("\nDeleted data from front::: " +currentNode.getData());
			prevNode.setNext(null);
		}
	}
	public void deleteFromAnyPos(int pos){
		int i=1;
		if(head == null){
			System.out.println("Empty list");
		}
		if(pos == 1){
			head = head.getNext();
		}else{
			Node currentNode = head, prevNode = null;
			while(pos !=i && currentNode.getNext() != null){
				prevNode = currentNode;
				currentNode = currentNode.getNext();
				i++;
			}
			System.out.println("\nDeleted node ::: " + currentNode.getData());
			prevNode.setNext(currentNode.getNext());
		}
		
	}
    public void displayList(){
    	Node tempNode = head;
    	if(head == null){
    		System.out.println("Empty List");
    	}else{
    		System.out.println("List element are ::");
    	while(tempNode!= null){
    		System.out.print(tempNode.getData()+"  ");
    		tempNode = tempNode.getNext();
    	 }
    	}
    }
    public static void main(String[] args){
    	LinkedList list = new LinkedList();
    	Node node1 = new Node(5);
    	list.insertAtFront(node1);
    	Node node2 = new Node(8);
    	list.insertAtFront(node2);
    	Node node3 = new Node(10);
    	list.insertAtEnd(node3);
    	Node node4 = new Node(13);
    	list.insertAtFront(node4);
    	Node node5 = new Node(50);
    	list.insertAtEnd(node5);
    	System.out.println();
    	Node node6 = new Node(9);
    	list.insertAtAnyPosition(node6, 7);
    	list.displayList();
    	list.deleteFromFront();
    	list.displayList();
    	list.deleteFromEnd();
    	list.displayList();
    	list.deleteFromAnyPos(2);
    	list.displayList();
    }
}
