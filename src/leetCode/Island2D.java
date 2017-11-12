package leetCode;

public class Island2D {

	 int[][] grid;
	boolean[][] seen;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] input ={{0,0,1,0,0,0,0,1,0,0,0,0,0},
		             {0,0,0,0,0,0,0,1,1,1,0,0,0},
		             {0,1,1,0,1,0,0,0,0,0,0,0,0},
		             {0,1,0,0,1,1,0,0,1,0,1,0,0},
		             {0,1,0,0,1,1,0,0,1,1,1,0,0},
		             {0,0,0,0,0,0,0,0,0,0,1,0,0},
		             {0,0,0,0,0,0,0,1,1,1,0,0,0},
		             {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
	int result = new Island2D(). maxAreaOfIsland(input);
	
	System.out.println(result);
	}

	public int maxAreaOfIsland(int[][] grid) {
		this.grid=grid;
		seen = new boolean[grid.length][grid[0].length];
		int ans=0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
			ans = Math.max(ans, area(i,j));	
			}
		}
		return ans;
	}
	
	public int area(int r,int c)
	{
		if( r < 0 || r>= grid.length || c < 0 || c >= grid.length || grid[r][c] == 0 || seen[r][c] )
		{
			return 0;
		}
		else
		{
			seen[r][c]=true;
			return(1 + area(r+1,c)+area(r-1,c)+area(r,c-1)+area(r,c+1));
		}
	}
}
