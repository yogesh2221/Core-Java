import java.util.*;

class Tile{
 	private int length;

	public int getTile(){
	return this.length;
	}
                  
	public void setTile(int length){
	this.length = length;
	}
	
	public int  TileArea(){
	return (this.length)*(this.length);
	}
           }

class Floor{
 	private int length;
	private int width;

	void totalTiles(Tile t){
            	double sqArea=t.TileArea();
           	 double flArea=FloorArea();

	System.out.println("No. of tiles required : "+(flArea/sqArea));
	}


	void setFloor(int length, int width){
		this.length = length;
		this.width = width;
	}

	public int FloorArea(){
 		return this.length * this.width; 
		}

       }
	

public class Question42{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side of square: ");
		int sq = sc.nextInt();
		
		System.out.println("Enter length of rectangle: ");
		int len = sc.nextInt();
		System.out.println("Enter width of rectangle: ");
		int wid = sc.nextInt();

		Tile t =new Tile();
		t.setTile(sq);

		Floor f = new Floor();
		f.setFloor(len, wid);

		f.totalTiles(t);

	}
	
}