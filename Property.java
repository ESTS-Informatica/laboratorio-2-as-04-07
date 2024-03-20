

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int NUMBER_OF_PROPERTIES = 0;
    private final String id;
    private String model;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = Integer.toString(++NUMBER_OF_PROPERTIES);
        this.model = description;
        this.price = price;
    }

    /**
     * Id selector.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return this.model;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {

    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {

    }

    @Override
    public String toString() {
        return "Descrição: " + this.model + "\n" + "Preço: " + this.price;
    }
}
