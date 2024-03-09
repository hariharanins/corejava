package day2;

public class Customer
{	
	private int cid;
	private String name;
    private String address;
    
                  //default constructor   
    public Customer()
    {
    	this.cid=01;
    	this.name="unknown";
    	this.address="somewhere";
    	
    }
    
    
       // paramaterized constructor
    public Customer( int cid, String name, String address)
    {
    	this.cid=cid;
    	this.name=name;
    	this.address=address;
    }
    
    
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}//override
	@Override
	public String toString() {
		return "Customer [cid="+cid+",name="+name+",address="+address+"]";
	}
	

}

	


