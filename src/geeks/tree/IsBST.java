package geeks.tree;

public class IsBST {

	public int preVal = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet o = new TreeSet(5);
		o.LeftNode= new TreeSet(3);
		o.RightNode= new TreeSet(7);
		
		o.LeftNode.LeftNode=new TreeSet(1);
		o.LeftNode.RightNode = new TreeSet(2);
		
		System.out.print(new IsBST().funIsBST(o));
		
	}
	public boolean funIsBST(TreeSet tSet)
	{
		if(tSet == null)
			return true;
		
		// LEFT NODE MUST BE LESSER THAN PARENT NODE
		//RIGHT NODE MUST BE GREATER THAN PARENT NODE
		
		if(!funIsBST(tSet.LeftNode))
		{
			return false;
		}
		
		if(tSet.val < preVal)
			return false;
		
		preVal = tSet.val;
		
		
		return funIsBST(tSet.RightNode);
	}

}

