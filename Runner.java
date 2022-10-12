
public class Runner {
 public static void main(String[] args) {
	BackTracking bb=new BackTracking();
	int maze[][]= {{1,1,1},{1,1,0},{0,1,1}};
	BackTrackingModified bbm=new BackTrackingModified();
	bbm.disp(maze);
	bbm.printVisited();
}
}
