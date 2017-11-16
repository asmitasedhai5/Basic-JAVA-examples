package com.usermanagement.view;


import java.util.List;
import java.util.Scanner;

import com.usermanagement.dao.UserDAO;
import com.usermanagement.dao.impl.DAOimpl;
import com.usermanagement.model.User;

public class UserView {
	public void userInformation() {
		do{
		Scanner s = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("CRUD:");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Display");
		System.out.println("Enter your choice: ");
		choice = scan.nextInt();
		User u = new User();
		UserDAO ud=new DAOimpl();
		switch (choice) {
		case 1:
			System.out.println("**Insert Operation**");
			System.out.println("Firstname: ");
			String fname = s.next();
			System.out.println("Lastname: ");
			String lname = s.next();
			System.out.println("Address: ");
			String address = s.next();
			
			u.setFname(fname);
			u.setLname(lname);
 			u.setAddress(address);
			ud.insert(u);

			break;
		case 2:
			System.out.println("**Update Operation**");
			System.out.println("Id: ");
			int id = s.nextInt();
			u.setId(id);
			ud.selectId(id);
			System.out.println("Firstname: ");
			fname = s.next();
			System.out.println("Lastname: ");
			lname = s.next();
			System.out.println("Address: ");
			address = s.next();
			
			u.setFname(fname);
			u.setLname(lname);
			u.setAddress(address);
			

			break;
		case 3:
			System.out.println("Delete Operation");
			break;
		
		case 4:
			System.out.println("**Display Operation**");
			System.out.println("Id"+"  "+"Fname"+"  "+"Lname"+"  "+"Address");
			List<User> ul=new DAOimpl().display();
			for(User userList:ul){
				
				System.out.println(userList.getId()+"  "+userList.getFname()+"  "+userList.getLname()+"  "+userList.getAddress());
				
			}

			break;
			
			
		default:
			
			System.out.println("You have entered wrong option.");
			System.out.println();
		}
		}while(true);
		
		
	}
}
