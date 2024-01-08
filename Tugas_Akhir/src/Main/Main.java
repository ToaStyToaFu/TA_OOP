package Main;

import java.util.Scanner;

import Restaurants.*;
import Reservations.*;
import Handler.*;

public class Main {
	
	static void Main() {
		Scanner sc = new Scanner(System.in);
		DBHandler db = new DBHandler();
		
		
		String location;   
		String ID;

		do {
			System.out.println("Welcome to LaperAh Reservation  Management");
			System.out.println("Please insert your ID");
			
			ID = sc.nextLine();
			location = db.searchEmployeeLocation(ID);
			
			if(location.isEmpty()) {
				System.out.println("Location error. Try again.");
			}
		} while(location.isEmpty());
		
		int selectManage;
		do {
			System.out.println("What do you want to manage?");
			System.out.printf("1. Reservation\n2. Menu\n3. Exit\n>> ");
			
			selectManage = sc.nextInt();
			sc.nextLine();
			
			if(selectManage == 1) {
				sc.close();
				ReservationMenu(location, db);
			}
			else if(selectManage == 2) {
				sc.close();
				MenuMenu(location, db);
			}
		}while(selectManage != 3);
	}
	
	static void ReservationMenu(String location, DBHandler db) {
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.printf("Reservation\n1. Add Reservation\n2. Update Reservation\n3. Exit>> ");
			select = sc.nextInt();
			sc.nextLine();
			
			if(select == 1) {
				String name;
				Integer tableAmmount;
				String tableType;
				Integer peopleAmmount;
				String tableStatus="";
				
				do {
					System.out.printf("Customer's name?\n>> ");
					name = sc.nextLine();
				}while(name.isEmpty());
				
				do {
					System.out.printf("How many tables?\n>> ");
					tableAmmount = sc.nextInt();
					sc.nextLine();
				}while(tableAmmount <= 0);
				
				do {
					System.out.printf("What table type?\n>> ");
					tableType = sc.nextLine();
				}while(tableType.isEmpty());
				
				do {
					System.out.printf("How many people?\n>> ");
					peopleAmmount = sc.nextInt();
					sc.nextLine();
				}while(peopleAmmount <= 0);
				
				String yesno;
				do {
					System.out.printf("Do customer want to order now? y/n\n>> ");
					yesno = sc.nextLine();
					if(yesno.equalsIgnoreCase("y")) {
						tableStatus = "in Reserve";
					}
					else if(yesno.equalsIgnoreCase("n")) {
						tableStatus = "in Order";
					}
				}while(!yesno.equalsIgnoreCase("y") && !yesno.equalsIgnoreCase("n"));
				
				Reservation reserve = new Reservation(name, tableAmmount, tableType, 
						peopleAmmount, tableStatus, location);
				db.addReservation(reserve);
			}
		}while(select != 3);
	}
	
	static void MenuMenu(String location, DBHandler db) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		do {
			System.out.printf("Menu\n1. Add menu\n2. Update menu\n3. Delete menu\n4. Exit\n>> ");
			select = sc.nextInt();
			sc.nextLine();
			
			if(select == 1) {
				
			}
		}while(select != 4);
	}
	
	public static void main(String[] args) {
		Main();
	}
	
}
