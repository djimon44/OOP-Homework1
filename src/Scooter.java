/**
 * Represents a Scooter object.
 */
public class Scooter {

    // Unique identifier for the scooter.
    int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location;
    double x, y;

    // Indicates if the scooter is available
    boolean available;

    /**
     * Get the ID of the scooter.
     *
     * @return The ID of the scooter.
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the scooter.
     * id - The ID to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the model name of the scooter.
     *
     * @return The model name of the scooter.
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the model name of the scooter.
     * model The model name to set.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the battery level of the scooter.
     *
     * @return The battery level of the scooter.
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * Set the battery level of the scooter.
     * batteryLevel The battery level to set.
     */
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * Get the X coordinate of the scooter.
     * The X coordinate of the scooter.
     */
    public double getX() {
        return x;
    }

    /**
     * Set the X coordinate of the scooter.
     * The X coordinate to set.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Get the Y coordinate of the scooter.
     * The Y coordinate of the scooter.
     */
    public double getY() {
        return y;
    }

    /**
     * Set the Y coordinate of the scooter.
     * y The Y coordinate to set.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Check if the scooter is available.
     *
     * @return True if the scooter is available, false otherwise.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Set the availability of the scooter.
     *
     * @param available True to set the scooter as available, false otherwise.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Set the coordinates of the scooter.
     *
     * @param x The X coordinate to set.
     * @param y The Y coordinate to set.
     */
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the string representation of the scooter.
     *
     * @return The string representation of the scooter.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
