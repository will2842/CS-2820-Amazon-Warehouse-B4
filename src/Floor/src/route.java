
public class route extends Thing{
	
	public int width= 10;
	public int length=2;
	public String name;
	public void route(int x_loc,int y_loc, int id){ //x,y here is the left start point of the route
		super.thing(x_loc,y_loc,this.width,this.length);
		name = "Hawk Highway" + id;
	}
}
