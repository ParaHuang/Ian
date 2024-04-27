package day12;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(33);
		Node n2 = new Node(44);
		Node n3 = new Node(55);
		Node n4 = new Node(66);
		Node n5 = new Node(77);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//		n5.next = ?;	// = null;
		
		Node newNode = new Node(100);
		newNode.next = n1;
		
	}

}

class Node{
	Integer element;
	Node next;//null

	Node(Integer element){
		this.element = element;
	}
}








