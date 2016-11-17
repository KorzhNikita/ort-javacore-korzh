package ua.dp.ort.module8;

public class PointsData {

	// Points coord.
	private int x;
	private int y;
	
	//Points names
	private String name;
	
	//constructor
	public PointsData (String pointName, int x, int y) {
		setX (x);
		setY (y);
		setName (pointName);		
	}
	
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setName(String name){
		this.name = name;
	}
	
	//getters
	public int getX () {
		return x;		
	}
	public int getY () {
		return y;		
	}
	public String getName () {
		return name;
	}
}