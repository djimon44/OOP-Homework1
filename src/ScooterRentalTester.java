import java.util.concurrent.TimeUnit;

/**
 * A class to test the functionality of renting scooters from the rental company.
 */
public class ScooterRentalTester {

    public static void main(String[] args) {
        //Creating a Rental Company
        RentalCompany JetScooters = new RentalCompany();

        // Creating Scooters
        Scooter scooter1 = new Scooter();
        Scooter scooter2 = new Scooter();

        // Adding scooters
        JetScooters.addScooter(scooter1);
        JetScooters.addScooter(scooter2);

        // Rent the scooter and go from home to the university
        rentAndTravel(JetScooters, scooter1.getId(), 41.7121106, 44.7489232);

        // Leave the scooter at the university
        returnAndRent(JetScooters, scooter1.getId(), 15, 41.7121106, 44.7489232);

        // Rent the scooter again after 1 hour and go back home
        rentAndTravel(JetScooters, scooter1.getId(), 41.71701034407886, 44.774293322013726);

        // Leave the scooter near home
        returnAndRent(JetScooters, scooter1.getId(), 15, 41.71701034407886, 44.774293322013726);
    }

    /**
     * Rent a scooter from the rental company, travel to the specified location, and leave the scooter there.
     *
     * @param rentalCompany The rental company from which to rent the scooter.
     * @param scooterId     The ID of the scooter to rent.
     * @param destinationX  The X coordinate of the destination.
     * @param destinationY  The Y coordinate of the destination.
     */
    private static void rentAndTravel(RentalCompany rentalCompany, int scooterId, double destinationX, double destinationY) {
        System.out.println("Renting scooter...");
        rentalCompany.rentScooter(scooterId);
        System.out.println("Travelling to destination...");
        // Simulating travel time
        try {
            TimeUnit.SECONDS.sleep(5); // Simulating travel time of 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Arrived at destination: (" + destinationX + ", " + destinationY + ")");
    }

    /**
     * Return a scooter to the rental company, wait for the specified time, rent it again, and travel to a new location.
     *
     * @param rentalCompany The rental company to return and rent the scooter from.
     * @param scooterId     The ID of the scooter to return and rent.
     * @param waitHours     The number of hours to wait before renting the scooter again.
     * @param destinationX  The X coordinate of the new destination.
     * @param destinationY  The Y coordinate of the new destination.
     */
    private static void returnAndRent(RentalCompany rentalCompany, int scooterId, int waitHours, double destinationX, double destinationY) {
        System.out.println("Returning scooter...");
        rentalCompany.returnScooter(scooterId, destinationX, destinationY);
        // Waiting for the specified time
        try {
            System.out.println("Waiting for 1 hour...");
            TimeUnit.SECONDS.sleep(waitHours); //Simulating a wait for 1 hour but actually is 15 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
