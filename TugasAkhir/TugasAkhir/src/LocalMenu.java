
public class LocalMenu extends Menu{

	String desc, location;

	public LocalMenu(String id, String nama, String type, int harga, String desc, String location) {
		super(id, nama, type, harga);
		this.desc = desc;
		this.location = location;
	}
	
	public void viewLocalMenu() {
		for (int i = 0; i < Menu.size(); i++) {
			System.out.println(i+1 + ". " + Menu.id + " | " + Menu.nama + " | " + Menu.harga + " | " + desc + " | " + location + " |");
		}
	}
}
