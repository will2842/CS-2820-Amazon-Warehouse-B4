import java.util.*;

//Max Riley Class Order

class Order {
	
	//instance variables for order ID, Address, Locations, and a hashmap that will use Item ID's as keys
	//and a list of integers to count the amount they want of a certain object
	public Integer OrderID;
	public Map<Integer, Integer> ItemIDList;
	public String Address;
	public String OrderLocation;
	
	
	public  Order(Integer OrderID, Map<Integer, Integer> ItemIDList, String Address){
		this.OrderID = OrderID;
		this.ItemIDList = ItemIDList;
		this.Address = Address;
		this.OrderLocation = "Start";
	}
	
	//Gets order ID from Order
	public Integer getOrderID(){
		return this.OrderID;
	}
	
	//Gets Address from Order
	public String getAddress(){
		return this.Address;
	}
	
	//Gets Locations of Order
	public String getLocation(){
		return this.OrderLocation;
	}
	
	//Set Location of a certain order
	public void setLocation(String Location){
		this.OrderLocation = Location;
	}
	
	
}


//Makes a list of OrderingSystemInterface so we have an overview of all OrderingSystemInterface currently being worked on,
//And also lets you remove completed orders and add new orders
class OrderingSystem implements OrderingSystemInterface{
	
	//Instance variable is a map, the Key being orderIDs
	public Map<Integer, Order> OngoingOrders;
	
	public void OrderingSystem(){
		this.OngoingOrders = new HashMap<>();
	}

	@Override
	//Lets you add order with just Items wanted and address, creates OrderID and makes key with it
	public Boolean placeOrder(Map<Integer,Integer> newItemList, String newAddress){
		//Add a thing that checks inventory to see if it can be processed 
		Integer uniqueID = Integer.valueOf(UUID.randomUUID().toString());
		Order newOrder = new Order(uniqueID, newItemList, newAddress);
		this.OngoingOrders.put(uniqueID, newOrder);

		return true;
	}
	
	//removes item by orderID
	
	public void finishOrder(Integer OrderID){
		this.OngoingOrders.remove(OrderID);
	}

}
