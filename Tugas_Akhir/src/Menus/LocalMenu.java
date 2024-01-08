package Menus;

public class LocalMenu extends Menu{
	String desc, location;

	public LocalMenu(String id, String nama, String type, int harga, String desc, String location) {
		super(id, nama, type, harga);
		this.desc = desc;
		this.location = location;
	}
}
