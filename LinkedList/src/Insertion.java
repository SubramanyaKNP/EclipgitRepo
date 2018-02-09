
public class Insertion {

Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public void printList(){
		
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void insertFront(int newData){
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAtPos(Node prevNode,int newdata){
		if(prevNode==null){return;}
		Node newNode=new Node(newdata);
		prevNode.next=newNode;
		
	}
	
	public static void main(String[] args) {
		
		Insertion llist=new Insertion();
		llist.head=new Node(1);
		Node second=new Node(2);
		llist.head.next=second;
		llist.printList();
		llist.insertFront(11);
		llist.printList();

	}

}
