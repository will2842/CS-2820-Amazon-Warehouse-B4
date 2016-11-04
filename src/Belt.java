import java.util.ArrayList;

public class Belt 
{
	public ArrayList<Integer> shippedItemIDList;
	
	public void pack(Integer OrderID)//receive from picker and send to packer
	{
		ship(OrderID);
		
	}
	
	public void ship(Integer orderID)//ships out of warehouse and store in list of shipped orders
	{
		shippedItemIDList.add(orderID);
	}

}
