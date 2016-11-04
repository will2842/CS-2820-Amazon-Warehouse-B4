
public class ChargingStation extends Thing {
	public int width= 2;
	public int length=1;
	public void floor(int x_loc, int y_loc){
		super.thing(x_loc,y_loc,this.width,this.length);
	}
	public boolean IsCharging(int x,  int y){
		boolean result = false;
		if((x<x_loc+width&&x>x_loc)&&(y>y_loc&&y<y_loc+length)){
			result = true;
		}
		return result;
	}
}
