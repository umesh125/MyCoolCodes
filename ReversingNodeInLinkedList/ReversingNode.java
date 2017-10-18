package ReversingNodeInLinkedList;

public class ReversingNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		root.next.next.next.next.next = new Node(6);
		root.next.next.next.next.next.next = new Node(7);
		root.next.next.next.next.next.next.next = new Node(8);
		root.next.next.next.next.next.next.next.next = new Node(9);
		root.next.next.next.next.next.next.next.next.next = new Node(10);
		//Node r=root.next;
		print(root);
		//root=null;
		
	//	print(r);
	//	DeleteUsingIndex(root, 3);
		// print(root);
		// ExChng(root, 6, 4);
		// print(root);
		 ExChngKth(root,1);
		//clearAll(root);
		print(root);
	}

	static  void clearAll(Node head)
	{

		head=null;
		
		
	}
	
	
	
	
	static void ExChngKth(Node root, int k) {
		if (root == null)
			return;

		Node tmp1 = root;
		Node tmp2 = root;
		int f = 0, s = 0;

		int count = 1;
		while (tmp1 != null) {
			if (count == k) {
				f = tmp1.data;

			}

			else if (count >= k) {
				tmp2 = tmp2.next;

			}
			tmp1 = tmp1.next;

			count++;

		}

		s = tmp2.data;
		if (f > s) {
			int tmp = f;
			f = s;
			s = tmp;

		}

		// System.out.println(f);
		// System.out.println(s);

		while (root != null) {
			if (root.data == f) {

				root.data = s;
				root = root.next;

			}

			if (root.data == s) {
				root.data = f;
				break;
			}

			root = root.next;
		}

	}

	static void print(Node root) {
		if (root == null)
			return;

		while (root != null) {
			System.out.print(" " + root.data + " ");
			root = root.next;
		}
		System.out.println();
	}

	static void ExChng(Node root, int f, int s) {
		if (root == null)
			return;

		if (f > s) {
			int tmp = f;
			f = s;
			s = tmp;
		}

		System.out.println("Exchanging " + f + " with " + s);
		while (root != null) {
			if (root.data == f) {

				root.data = s;
				root = root.next;

			}

			if (root.data == s) {
				root.data = f;
				break;
			}

			root = root.next;
		}

	}

	static void DeleteUsingIndex(Node root, int index) {
		if (root == null)
			return;

		Node tmp = root;

		if (index == 1) {
			//System.out.println("index==1");
			tmp = tmp.next; /* as we cannot remove first node we update value of first node with value of second node and remove second node*/
			root.data = tmp.data;
			root.next=root.next.next;
			return;

		}

		int c = 1;

		while (tmp.next != null) {
			if (index - 1 == c) {
				tmp.next = tmp.next.next;
				return;

			}
			tmp = tmp.next;
			c++;
		}

	}

}

class Node {
	Node next;
	int data;

	Node(int input) {
		this.data = input;

	}

}