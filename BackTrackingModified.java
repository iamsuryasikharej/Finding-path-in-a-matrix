
public class BackTrackingModified {
	int maze[][];
	boolean[][] visited;
	int sol[][];
	public void disp(int grid[][])
	{
		maze=grid;
		visited=new boolean[maze.length][maze.length];
		sol=new int[maze.length][maze.length];
		findPath(0,0);
	}
	private void findPath(int r, int c) {
		if(r<0 || r>=maze.length || c<0 || c>=maze.length || maze[r][c]==0 || visited[r][c]==true)
		{
			
			
			return;
		}
		else if(r==maze.length-1 && c==maze.length-1)
		{
			sol[r][c]=1;
			
			printSol();
			
			
			return;
		}
		sol[r][c]=1;
		visited[r][c]=true;
		findPath(r-1,c);//top
		findPath(r+1,c);//down
		findPath(r,c+1);//right
		findPath(r,c-1);//left
		sol[r][c]=0;
		visited[r][c]=false;
		

	}
	
	public void printSol()
	{
		System.out.println("printing road");
		for(int i=0;i<sol.length;i++)
		{
			for(int j=0;j<sol.length;j++)
			{
				System.out.print(sol[i][j]);
			}
			System.out.println();
		}
		System.out.println("printing road end");
	}
	
	public void printVisited()
	{
		System.out.println("printing visited");
		for(int i=0;i<visited.length;i++)
		{
			for(int j=0;j<visited.length;j++)
			{
				System.out.print(visited[i][j]);
			}
			System.out.println();
		}
		System.out.println("printing visited end");
	}

}
