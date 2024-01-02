
public class Menu {
	String id, nama, type, desc, loc;
	int harga;
	boolean ordered;
	public Menu(String id, String nama, String type, int harga, String desc, String loc) {
		super();
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.type = type;
		this.desc = desc;
		this.loc = loc;
	}
	
	public void viewMenu() {
		for (int i = 0; i < newMenu.size(); i++) {
			if (type == "special") {
				System.out.println(i+1 + ". " + menu.id + " | " + menu.nama + " | " + menu.harga + " | " + menu.desc + " |");
			}
			else if (type == "local") {
				System.out.println(i+1 + ". " + menu.id + " | " + menu.nama + " | " + menu.harga + " | " + menu.loc + " | " + menu.desc + " |");
			}		
		}
	}
	
}
