package datastructure.LinkdList;

public class LinkdList {
	public static void main(String[] args) {
		LinkedListImpl l = new LinkedListImpl();
		for (int i = 1; i < 30; i++) {
			l.add(i * 1);
		}
		l.print();
		// l.PrintR();
		// l.delete(1);
		// l.deleteLast();
		// l.xchng(1,8);
		//l.xchngk(2);
		// l.del_k(200133);
		l.deleteFirst();
		l.print();

	}

}

class LinkedListImpl {

	private Node head;

	LinkedListImpl() {
		head = new Node(null);
	}

	void deleteFirst()
	{
		Node t=head;
		if(t==null)
			return;
		t.value=t.next.value;
		t.next=t.next.next;
		
		
		
		
		
	}
	
	
	
	
	
	void del_k(int key) {
		/* Node KN=new Node(key); */
		Node T = head;
		Node prv = head;
		int v = (Integer) T.value;
		if (key == (Integer) head.value) {
			head = T.next;
		}

		/* int k=(Integer) key; */
		while (T.next != null && v != key) {
			prv = T;
			T = T.next;
			v = (Integer) T.value;
		}

		if (T.next != null) {
			// System.out.println(prv.value);
			// System.out.println(T.next.value);
			prv.next = T.next;
		} else {
			System.out.println(key + "     not found !");
		}

	}

	void xchngk(int k) {
		if (head == null)
			return;

		Node tmp1 = head;
		Node tmp2 = head;
		Object f = 0, s = 0;

		int count = 1;
		while (tmp1 != null) {
			
			if (count == k) {
				f = tmp1.value;

			}

			else if (count >= k) {
				tmp2 = tmp2.next;

			}
			tmp1 = tmp1.next;

			count++;

		}

		s = tmp2.value;

		//System.out.println(f);
		//System.out.println(s);

		Node fin=head;
		while (fin != null) {
			if (fin.value == f)
			{

				fin.value = s;
				fin = fin.next;

			}

			if (fin.value == s)
			{
				fin.value = f;
				break;
			}

			fin = fin.next;
		}

	}

	void xchng(int f, int s) {
		/*
		 * method to exchagne 2 node depend upon index
		 */
		if (head == null || f == s)// exchange not possible with null and if
									// both ind are same then xchng not require
			return;
		if (f > s) {
			/* we need first index smaller and second for convineance */
			int tmp = f;
			f = s;
			s = tmp;
		}
		Node T = head; // creating node tha hold entire linked list
		for (int i = 1; i < f && T != null; i++) {
			/* finding value of first node to exchge */

			T = T.next;

		}

		Node fpd = new Node(T.value); /* saving value of first node to exchge */

		Node aftrfp = T.next; /* saving list that come after first node to exchge */

		T = head; /* set linked list pointer to default */
		for (int i = 1; i < s && T != null; i++) {

			T = T.next;

		}
		Node spd = new Node(T.value); /* saving value of second node to exchge */

		Node aftrsp = T.next; /* saving list that come after second node to exchge */
		spd.next = aftrfp; /*
							 * exchange the lists that come aftr fist to second
							 * node to second to fist
							 */
		fpd.next = aftrsp;

		T = head; /* set linked list pointer to default */

		if (f == 1) {

			head = spd; /*
						 * this is special condition when we hv to modified
						 * actual List head
						 */

		}

		for (int i = 1; i < f - 1 && T.next != null; i++) {

			T = T.next; /* finding location to change node */

		}
		/* aftr for loop we get index that behind actual node to replace */

		T.next = spd; /*
					 * replacing actual node with spd this is second node +
					 * followed by list remain after first node
					 */
		T = head; /* set linked list pointer to default */
		for (int i = 1; i < s - 1 && T.next != null; i++) {

			T = T.next;

		}
		/* aftr for loop we get index that behind actual node to replace */
		T.next = fpd; /*
					 * replacing actual node with fpd this is first node +
					 * followed by list remain after first second
					 */

		/* done */
	}

	void deleteLast() {
		Node Temp = head;

		if (Temp == null || Temp.next == null)
			return;

		while (Temp.next.next != null) {
			Temp = Temp.next;

		}
		System.out.println("Last  Node Deleted !");
		Temp.next = null;

	}

	void delete(int index) {

		Node Temp = head;

		if (Temp == null)
			return;
		int cnt = 1;

		if (index == 1) {

			head = Temp.next;
			System.out.println("First  Node Deleted !");
			return;

		}

		while (Temp != null && cnt != index - 1) {
			Temp = Temp.next;
			cnt++;
		}
		System.out.println(index + "  Node Deleted !");
		Temp.next = Temp.next.next;

	}

	void RevP(Node head) {

		if (head == null)
			return;

		// System.out.print(" "+head.value);
		RevP(head.next);
		System.out.print(" " + head.value);

	}

	void altrnateP(Node head) {

		if (head == null)
			return;

		System.out.print(" " + head.value);
		altrnateP(head.next);
		// System.out.print(" "+head.value);

	}

	void PrintR() {

		RevP(head);
		System.out.println();
		altrnateP(head);
		// System.out.println();
	}

	public void add(Object data) {
		Node Temp = new Node(data);
		if (head.value == null) {
			head = Temp;

		}

		else {
			Node Current = head;
			while (Current.next != null) {
				Current = Current.next;

			}
			Current.next = Temp;

		}

	}

	public int size() {

		Node Current = head;

		int sz = 0;
		while (Current != null) {
			sz++;
			Current = Current.next;
		}
		return sz;
	}

	public void print() {
		Node Current = head;

		while (Current != null) {
			System.out.print(" " + Current.value);
			Current = Current.next;
		}
		System.out.println();
	}

	class Node {
		Node next;
		Object value;

		Node(Object data) {
			next = null;
			value = data;

		}

	}

}