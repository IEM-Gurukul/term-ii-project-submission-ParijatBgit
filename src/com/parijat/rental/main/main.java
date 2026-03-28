package com.parijat.rental.main;
import com.parijat.rental.model.*;
import com.parijat.rental.service.rentalService;
import java.util.Scanner;

public class main{
    public static void main(String[] args){

        rentalService service = new rentalService();
        Scanner sc= new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--------------- Rental Management System ---------------");
            System.out.println("1. Add Item");
            System.out.println("2. Register Customer");
            System.out.println("3. Rent Item");
            System.out.println("4. Return Item");
            System.out.println("5. Display Items");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();
            try{
                switch (choice){
                    case 1:
                        System.out.print("Enter item type (1.Four Wheeler, 2.Two Wheeler, 3.Room, 4.Accessories): ");
                        int type= sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Item ID: ");
                        String itemId =sc.nextLine();
                        System.out.print("Enter Base Rate: ");
                        double rate =sc.nextDouble();
                        rentableItems item =null;
                        if (type == 1) item= new FourWheeler(itemId, rate);
                        else if (type == 2) item= new TwoWheeler(itemId, rate);
                        else if (type == 3) item= new Room(itemId, rate);
                        else if (type == 4) item= new Accessories(itemId, rate);
                        service.addItem(item);
                        System.out.println("Item Added Successfully!!");
                        break;

                    case 2:
                        System.out.print("Enter Customer ID: ");
                        String cid = sc.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String name = sc.nextLine();
                        service.registerCustomer(new customer(cid, name));
                        System.out.println("Customer registered!");
                        break;

                    case 3:
                        System.out.print("Enter Transaction ID: ");
                        String tid = sc.nextLine();
                        System.out.print("Enter Customer ID: ");
                        String custId = sc.nextLine();
                        System.out.print("Enter Item ID: ");
                        String iid = sc.nextLine();
                        System.out.print("Enter Days: ");
                        int days = sc.nextInt();
                        service.rentItem(tid, custId, iid, days);
                        System.out.println("Item rented successfully!");
                        break;

                    case 4:
                        System.out.print("Enter Transaction ID: ");
                        String returnId = sc.nextLine();
                        service.returnItem(returnId);
                        System.out.println("Item returned successfully!");
                        break;

                    case 5:
                        service.displayItems();
                        break;

                    case 6:
                        System.out.println("Exiting the system. THANK YOU VISIT AGAIN!!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }while(choice != 6);
        sc.close();
    }
}