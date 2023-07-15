abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkIn=true;
	
	public LibraryItem(){}
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getItemID(){
		return itemID;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setItemID(String itemID){
		this.itemID=itemID;
	}
	
	public void checkOut(){
		checkIn=false;
		System.out.println("Item ID:"+itemID+"checked out");
	}
	
	public void checkIn(){
		checkIn=true;
		System.out.println("Item ID:"+itemID+"checked in");
	}
	
	public void displayItemDetails(){
		System.out.println("Title:"+getTitle());
		System.out.println("ItemID:"+getItemID());
		System.out.println("Checked In:"+checkIn);
	}
}