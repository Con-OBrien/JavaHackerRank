package builtinquestions.systemdesign;

public class CarRental {
    public static void main(String[] args) {
        //Car
        //Cars are part of an inventory, Inventory may contain different types of cars/vans
        //Cars themselves will have various important properties that will be important to a customer
        //1. Cost per day
        //2. Year
        //3. Make
        //4. Model
        //5. Doors
        //6. Seats
        //7. Availability
        //8. Getters for all these, setter for availability upon a booking
        //Customer can rent a car, has to pay for this
        //1. Unique ID
        //2. Name
        //3. Phone Number
        //4. Email
        //5. License ID
        //6. getters for each of these
        //Rental (the idea, the relationship between the car & customer & the business)
        //1. Rental ID
        //2. Customer -> Unique ID
        //3. Car - > Unique ID perhaps (License plate?)
        //4. start_date
        //5. end_date
        //6. total_cost
        //7. isActive
        //7. Getters for all and calc for total cost
        //Wider CarRentalSystem
        //1. List of cars
        //2. List of customers
        //3. list of active rentals
        //4. Add / Remove Cars
        //5. Add / Remove Customer
        //6. Rent / Return Cars
        //7. Get available / rented / specific customer rentals

       // USING THAT MODEL, RETURN A LIST OF ALL CARS THAT COST LESS THAN $100.

        //In CarRentalSystem we have a getter for getList OfCars, we can take this method and modify it to make a new method
        //getCarsWithPriceLessThan100()
        // for each car in the system
        // if the car . getrentalrate < 100 -> add to list of cars defined in method level variable
        // return that list once done looping

    }
}
