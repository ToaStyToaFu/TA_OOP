
public class SpecialMenu extends Menu{

	String desc;
	
	public SpecialMenu(String id, String nama, String type, int harga, String desc) {
		super(id, nama, type, harga);
		this.desc = desc;
	}
	
	public void viewSpecialMenu() {
		for (int i = 0; i < Menu.size(); i++) {
			System.out.println(i+1 + ". " + Menu.id + " | " + Menu.nama + " | " + Menu.harga + " | " + desc + " |");
		}
	}
	
}
