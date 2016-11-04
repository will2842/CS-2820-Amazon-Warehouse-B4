
public class route extends Thing{
	
	public static int width= 10;
	public static int length=2;
	public String name;
	public route(int x_loc,int y_loc, int id){ //x,y here is the left start point of the route
		super(x_loc,y_loc,width,length);
		name = "Hawk Highway" + id;
	}
}
