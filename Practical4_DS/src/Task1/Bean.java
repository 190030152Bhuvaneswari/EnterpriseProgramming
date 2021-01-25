package Task1;

public class Bean {
	private int itemid;
	private String itemname;
	private int cost;
	public Bean(int itemid,String itemname,int cost){
		this.itemid=itemid;
		this.itemname=itemname;
		this.cost=cost;
		
	}
	public Bean() {
		// TODO Auto-generated constructor stub
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
