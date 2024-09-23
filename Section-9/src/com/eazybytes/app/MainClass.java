package com.eazybytes.app;

import com.eazybytes.model.Class1;
import com.eazybytes.model.Employee;
import com.eazybytes.model.Vehicle;
import com.eazybytes.service.VehicleService;

import static com.eazybytes.utility.MyConstants.*;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee();
        VehicleService vehicleService = new VehicleService();

        String input = new String("Hello World");

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);

        System.out.println(calculateTotalCost(9.99));

        Class1 model = new Class1();
        com.eazybytes.service.Class1 service = new com.eazybytes.service.Class1();

    }
}
