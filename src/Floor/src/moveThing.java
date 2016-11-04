
public class moveThing extends Thing{ //contains robots and shelves
	public int width= 1;
	public int length=1;
	public int id;
	public void m_robot(int x_loc, int y_loc, int s){
		super.thing(x_loc,y_loc,this.width,this.length);
		super.AllowToMove();
		id = s;
	}
}
