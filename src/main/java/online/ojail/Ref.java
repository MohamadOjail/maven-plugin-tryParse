package online.ojail;

/**
 * this class will serve as a template for creating a reference object
 * @param <X> choose Integer or Double
 */
public class Ref <X>{
    /**
     *
     */
    private X value;

    /**
     * empty constructor
     */
    public Ref() {}

    /**
     * getter method
     * @return Integer, Double, or Null
     */
    public X getValue() {
        return value;
    }

    /**
     * setter method
     * @param value Integer or Double
     */
    public void setValue(X value) {
        this.value = value;
    }

    /**
     * @return a string
     */
    @Override
    public String toString() {
        return value == null ? "object is null" : value.toString();
    }
}
