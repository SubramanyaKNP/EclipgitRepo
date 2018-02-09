
public class CreateList {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateList llist=new CreateList();
		
		//create three empty list
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		//connect all the lists.
		llist.head.next=second;
		second.next=third;
		
		//print the ele's of list
		llist.printList();
		

	}

}
