
public class Station extends Thing {
	int w = 1;
	int l = 1;
	public void Station(int x, int y){
		super.thing(x,y,w,l);
	}
	public boolean HitMeBro(int x, int y){
		boolean result = false;
		if((x<x_loc+width&&x>x_loc)&&(y>y_loc&&y<y_loc+length)){
			result =  true;
			//belt.runit;
		}
		return result;
	}
}
