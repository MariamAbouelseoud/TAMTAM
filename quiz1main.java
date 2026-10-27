/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author maria
 */
public class quiz1main {
    public static void main(String[] args) {
        Vehicle [] v={new Car(3,"abc","nissan"),new Car(4,"cde","kia"),new Motorcycle(5, "fgh","verna" ),new Motorcycle(6, "ijk", "elantra")};
        for(int i=0;i<v.length;i++)
        {
            v[i].displayInfo();
            System.out.println("v[i].calculateRentalCost(3);");
        }
        double price=0;
        for(int i=0;i<v.length;i++)
        {
            price=price+v[i].calculateRentalCost(5);
            
        }
        System.out.println("The total cost for 5 days of renting for all vehicles is "+price);
        
        for(int i=0;i<v.length;i++)
        {
            if (v[i] instanceof Car)
            {   Car c=(Car)v[i];
                System.out.println("The number of seats in car number"+i+""+"is "+c.getNumberOfSeats());
            }
        }
        
    }
    
}
