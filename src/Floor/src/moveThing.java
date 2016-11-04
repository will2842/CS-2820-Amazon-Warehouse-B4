import java.util.List;
import java.util.ArrayList;
public class moveThing extends Thing{ //contains robots and shelves
	public int w= 1;
	public int l=1;
	public int id;
	public ArrayList<String> items;
	public void moveThing(int x_loc, int y_loc, int s, ArrayList<String> items){
		super.thing(x_loc,y_loc,w,l);
		super.AllowToMove();
		id = s;
		this.items = items;
	}
}
