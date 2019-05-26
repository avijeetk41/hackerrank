package com.avijeet.warmup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BSTNode {
	BSTNode left, right;
	int data;

	BSTNode(int data) {
		this.data = data;
		left = right = null;
	}
}


public class LevelOrderTraversal {



	static void levelOrder(BSTNode root) {
		Queue<BSTNode> queue = new LinkedList<>();

		if (null != root) {
			queue.add(root);

			while (!queue.isEmpty()) {
				BSTNode tempNode = queue.poll();
				System.out.println(tempNode.data);

				if (null != tempNode.left) {
					queue.add(tempNode.left);
				}

				if (null != tempNode.right) {
					queue.add(tempNode.right);
				}

			}
		}

	}

	public static BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			return new BSTNode(data);
		} else {
			BSTNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BSTNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
