public class LibraryMember{
	private String memberID;
	private String name;
  
  	public LibraryMember(){}

	public LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
  
	public String getMemberID(){
	    return memberID;
	}
  
	public String getName(){
		return name;
	}
	
	public void setMemberID(String memberID){
		this.memberID=memberID;
	}
	
	public void setName(String name){
		this.name=name;
	}
  
	public void displayMemberDetails(){
		System.out.println("MemberID:"+getMemberID());
		System.out.println("Name:"+getName());

	}

  
}