package geeks.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversalTree {

	List<Integer> lst = new ArrayList<Integer>();
	Stack<TreeSet> st = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet o = new TreeSet(5);
		o.LeftNode = new TreeSet(3);
		o.RightNode = new TreeSet(7);

		o.LeftNode.LeftNode = new TreeSet(1);
		o.LeftNode.RightNode = new TreeSet(2);

		List<Integer> result = new InOrderTraversalTree().getInorderTreeItr(o);

		for (Integer integer : result) {
			System.out.println(integer);
		}
	}

	// with recursion
	public List<Integer> getInorderTree(TreeSet tree) {
		// recursive through left nodes
		// print parent node
		// recursive through right nodes

		if (tree != null) {

			getInorderTree(tree.LeftNode);

			lst.add(tree.val);

			getInorderTree(tree.RightNode);
		}
		return lst;
	}

	public List<Integer> getInorderTreeItr(TreeSet tree) {
		while (tree != null || !st.empty()) {
			if (tree != null) {
				st.push(tree);
				tree = tree.LeftNode;
				continue;
			}
			TreeSet x =st.pop();
			
			lst.add(x.val);
			
			tree =x.RightNode;

		}
		return lst;
	}

}
