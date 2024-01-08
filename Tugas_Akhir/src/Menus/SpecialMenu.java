package Menus;

public class SpecialMenu extends Menu{

	String desc;
	
	public SpecialMenu(String id, String nama, String type, int harga, String desc) {
		super(id, nama, type, harga);
		this.desc = desc;
	}
}
