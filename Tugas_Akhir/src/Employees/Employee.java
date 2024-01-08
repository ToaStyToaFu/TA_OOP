
public class Employee {
	String id, name, location;
	Restaurant restaurant;
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.restaurant = restaurant;
	}
	
	public boolean manageMenu() {
		if (restaurant == Restaurant.loc) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addMenu(Menu menu) {
		if (manageMenu() == true) {
			Restaurant.addMenu(menu);
			System.out.println("Menu added");
		}
		else {
			System.out.println("You do not have permission to access the menu");
		}
	}
	
	public void updateMenu(String id, String nama, String type, int harga, String type, String desc, String loc) {
		if (Menu.type == "special") {
			if (Menu.ordered == false) {
				Menu.updateMenu(id, nama, type, harga, desc);
				System.out.println("This menu is updated");
			}
			else if (Menu.ordered = true) {
				System.out.println("This menu cannot be updated");
			}		
		}
		else if (Menu.type == "local") {
			if (Menu.ordered == false) {
				Menu.updateMenu(id, nama, type, harga, loc, desc);
				System.out.println("This menu is updated");
			}
			else if (Menu.ordered = true) {
				System.out.println("This menu cannot be updated");
			}		
		}
	}
	
	public void reservation(String tableNum, String customerName, int tableAmount, String tableType, int customerAmount) {
		Restaurant.reservation(tableNum, customerName, tableAmount, tableType, customerAmount);
		String status = new String("in reserve");
	}
	
	public void order(String tableNum, List<Menu> orders) {
		Restaurant.order(tableNum, orders);
		String status = new String("in order");
	}
	
	public void checkOut(String tableNum) {
		Restaurant.checkOut(tableNum);
		String status = new String("finalized");
	}
	
}
