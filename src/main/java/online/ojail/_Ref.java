package online.ojail;

/**
 * @author Mohamad Ojail - <a href="http://ojail.online">Link to website</a>
 * @version 1.0.0
 * @description: this class will serve as a template for creating a reference object
 * @param <X> choose Integer or Double
 */
public class _Ref<X>{

    /**
     * Default constructor
     */
    public _Ref() {
    }

    private X value;

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
