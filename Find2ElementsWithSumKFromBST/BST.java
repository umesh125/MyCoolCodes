package Find2ElementsWithSumKFromBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

	/**
	 * This algorithm working Only For Binary Search Tree where (left < ROOT <
	 * right) 1.Save left element up to last left including root 2.Save right
	 * elements up to last right including root 3.Check if any Stack is empty
	 * from 2 stacks if yes then return 4.if (stack1 peek+stack2 peek )==key
	 * then return else if(stack1 peek+stack2 peek)<key then pop peek value from
	 * stack1 and push right value of poped value else if(stack1 peek+stack2
	 * peek)>key then pop peek value from stack2 and push left value of poped
	 * value
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node T = new Node(15);
		T.left = new Node(10);
		T.right = new Node(20);
		T.left.left = new Node(9);
		T.left.right = new Node(12);
		T.right.left = new Node(16);
		T.right.right = new Node(26);

		/*
		 * Node T = new Node(1); T.right = new Node(2); T.right.right = new
		 * Node(3); T.right.right.right = new Node(4); T.right.right.right.right
		 * = new Node(5); T.right.right.right.right.right = new Node(6);
		 * T.right.right.right.right.right.right = new Node(7);
		 */

		// LO(T);
		SumK(T, 30);

	}

	static void SumK(Node root, int k) {
		Stack<Node> leftStack = new Stack<Node>(); /*
													 * To Store left side
													 * Elements
													 */
		Stack<Node> rightStack = new Stack<Node>(); /*
													 * To Store Right side
													 * Element
													 */

		Node leftSide = root;
		Node rightSide = root;

		while (!leftStack.empty() || !rightStack.empty() || rightSide != null
				|| leftSide != null) // or simply while (true)
		{

			while (rightSide != null) {
				rightStack.push(rightSide);
				rightSide = rightSide.right; /*
											 * put all right element from root
											 * including root
											 */

			}

			while (leftSide != null) {
				leftStack.push(leftSide);
				leftSide = leftSide.left; /*
										 * Put all left elements froom root
										 * including root
										 */

			}
			if (leftStack.empty() || rightStack.empty()) {

				System.out.println("Pair Not Found !"); /*
														 * if any stack is empty
														 * pair could not found
														 * simply return
														 */
				return;
			}

			if (leftStack.peek().data + rightStack.peek().data < k) {
				/*
				 * if key is greater than sum of peek value pop value from left
				 * stack move to right of left side node.
				 */
				leftSide = leftStack.pop();
				leftSide = leftSide.right;
			}

			else if (leftStack.peek().data + rightStack.peek().data > k) {
				/*
				 * if key is lesser than sum of peek value pop value from left
				 * stack move to left of right side Node
				 */
				rightSide = rightStack.pop();
				rightSide = rightSide.left;
			} else /* if (s1.peek().data + s2.peek().data == k) */
			{
				/* key equal to sum of peek value then pair found */
				System.out.println("Pair Found");
				System.out.println(leftStack.peek().data + ","
						+ rightStack.peek().data);
				return;
			}

		}

	}

	static void LO(Node root) {
		int ln = 0;
		Queue<Node> q = new LinkedList<Node>();
		if (root != null) {

			q.add(root);

			while (!q.isEmpty()) {
				ln = q.size();
				while (ln > 0) {
					Node tmp = q.remove();
					System.out.print(" " + tmp.data + " ");
					if (tmp.left != null)
						q.add(tmp.left);

					if (tmp.right != null)
						q.add(tmp.right);
					ln--;
				}
				System.out.println();

			} // end while

		} // end if

	}

}

class Node {
	Node left;
	Node right;
	int data;

	Node(int input) {
		left = null;
		right = null;
		this.data = input;

	}

}
