public class m_belt extends Thing{
	public int x= 1 ;
	public int y= 2;
	public int w= 1;
	public int l=8;
	public boolean needtorun = false;
	public void m_belt(){
		super.thing(x,y,w,l);
	}
	public void runit(){
		needtorun = true;
	}
	public void stop(){
		needtorun = false;
	}
	
}
