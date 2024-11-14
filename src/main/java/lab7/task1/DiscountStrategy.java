package lab7.task1;

@FunctionalInterface
public interface DiscountStrategy {
    public double applyDiscount(Product product);
}
