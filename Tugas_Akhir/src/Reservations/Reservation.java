package Reservations;

import Handler.*;

public class Reservation {
	String name;
	Integer tableAmmount;
	String tableType;
	Integer peopleAmmount;
	String tableStatus;
	String location;
	
	
	
	public String getName() {
		return name;
	}



	public Integer getTableAmmount() {
		return tableAmmount;
	}



	public String getTableType() {
		return tableType;
	}



	public Integer getPeopleAmmount() {
		return peopleAmmount;
	}



	public String getTableStatus() {
		return tableStatus;
	}



	public String getLocation() {
		return location;
	}



	public Reservation (String name, int tableAmmount, String tableType, int peopleAmmount, String tableStatus, String location) {
		this.name = name;
		this.tableAmmount = tableAmmount;
		this.tableType = tableType;
		this.peopleAmmount = peopleAmmount;
		this.tableStatus = tableStatus;
		this.location = location;
	}
}
