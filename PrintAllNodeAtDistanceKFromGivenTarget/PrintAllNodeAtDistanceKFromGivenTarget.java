package PrintAllNodeAtDistanceKFromGivenTarget;



public class PrintAllNodeAtDistanceKFromGivenTarget {

	/**
	 * @param args
	 *            Algorithm 1.first find root either left or right side. 2.print
	 *            nodes from target at given distance initialize dl or dr to
	 *            zero 3.check if recent ancestor at given distance if yes then
	 *            print its data 4.if recent ancestor is not at given distance
	 *            and go to right of recent ancestor and prints its child node
	 *            whic present at distance given distance - 2- dl or dr
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root=new BTNode(10);
		root.left=new BTNode(6);
		root.right=new BTNode(25);
		root.left.left=new BTNode(3);
		root.left.right=new BTNode(8);
		root.right.left=new BTNode(15);
		root.right.right=new BTNode(26);
		root.left.left.left=new BTNode(1);
		root.left.left.right=new BTNode(4);
		root.left.right.left=new BTNode(7);
		root.left.right.right=new BTNode(9);
		root.right.left.left=new BTNode(14);
		root.right.left.right=new BTNode(16);
		root.right.right.left=new BTNode(23);
		root.right.right.right=new BTNode(23);
		// NodesFromRoot(root,0);

		NodeFromTarget(root, root.right.right, 2);
	}

	static void NodesFromRoot(BTNode root, int k) {
		/* Simply Print Nodes at distance k from root */

		if (root == null)
			return;

		if (k == 0) {
			System.out.print(" " + root.data + " ");
			return;
		}

		NodesFromRoot(root.left, k - 1);
		NodesFromRoot(root.right, k - 1);

	}

	static int NodeFromTarget(BTNode root, BTNode target, int d) {
		if (root == null)
			return -1;

		if (root == target) {
			NodesFromRoot(root, d); /*
									 * first find out target then print its all
									 * nodes which at distance d
									 */
			return 0; /* return dl=0 */
		}

		int dl = NodeFromTarget(root.left, target, d);
		// System.out.println("   dl=="+ dl);
		if (dl != -1) {
			if (dl + 1 == d) {
				/*
				 * Check previous node from current node at given distance d, if
				 * yes then print its data
				 */

				System.out.print(root.data);
			} else {
				/*
				 * if previous node is not at given distance then go to right of
				 * previous node and print its nodes at d-2-dl we decrease
				 * distance by two because we consider node at two edge away
				 * from current node and decrease by dl because it dl is
				 * distance of each node from target
				 */
				NodesFromRoot(root.right, d - dl - 2);
			}

			return 1 + dl; /* increase dl by 1 as move to next connected node */

		}

		/*
		 * if target is not found at left side then go to right of tree and
		 * preform same step
		 */
		int dr = NodeFromTarget(root.right, target, d);
		// System.out.println("   dr  "+ dr);
		if (dr != -1) {
			if (dr + 1 == d) {

				System.out.print(root.data);
			} else {
				NodesFromRoot(root.left, d - dr - 2);
			}

			return 1 + dr;

		}

		return -1;
	}

}

class BTNode {
	BTNode left;
	BTNode right;
	int data;

	BTNode(int input) {
		this.data = input;
		left = null;
		right = null;

	}

}
