import java.util.ArrayList;

// Solution from Cracking the Coding Interview 4th
// There was no content of isFree(), so I complete it
// 9.2 Imagine a robot sitting on the upper left corner of an X by Y grid. The robot can only move in two directions: right and down. How many possible paths are there for the robot to go from (0,0) to (X, Y)?
// FOLLOW UP
// Imagine certain spots are "off limits," such that the robot cannot step on them.
// Design an algorithm to find a path for the robot from the top left to the bottom right.

public class GetPath {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		GetPath Gp=new GetPath();
		ArrayList<Point> path = new ArrayList<>();

	
		//System.out.println("final result: "+Gp.getPath(0, 0, path));
		System.out.println("final result: "+Gp.getPath(2, 2, path));

		System.out.println("Show points on path");
		for(Point p: path){
			System.out.println("("+p.getX()+", "+p.getY()+")");
		
		}


	}
	
	// To find a path from the origin, we just work backwards like this. Starting from the last cell, we try to find a path to each of its adjacent cells.
	// insert end point (x, y)
	// getPath() is to check if there are any path to (x,y)
	public boolean getPath(int x, int y, ArrayList<Point> path){
		Point p = new Point(x,y);
		path.add(p);
		if(x==0 && y==0){
			return true; //find a path
		}
		boolean success = false;
		if(x>=1 && isFree(x-1,y)){// Try right
			success = getPath(x-1,y, path);// free, go right
		}
		if(!success && y>=1 && isFree(x, y-1)){ //Try down
			success = getPath(x, y-1, path);// free, go down
		}
		if(!success){
			
			path.remove(p); //Wrong way, better stop going this way
			System.out.println("remove ("+p.getX()+", "+p.getY()+")");
			System.out.println("Show points on path after remove p");
			for(Point pp: path){
				System.out.println("("+pp.getX()+", "+pp.getY()+")");
			
			}
			
		}
		System.out.println("show result inside getPath: "+success+ " for ("+p.getX()+", "+p.getY()+")");

		
		
		return success;
	}
	
	//check the if x>=0, y>=0, or encounter any unaccessed point
	private boolean isFree(int x, int y){
		boolean free=true;
		Point unAcessP1 = new Point(2,1);
		if(x <0 || y<0 ){
			free =false;
		}
		if(x== unAcessP1.getX() && y== unAcessP1.getY() ){
			free = false;
		}
			
		
		
		return free;
	}

}
