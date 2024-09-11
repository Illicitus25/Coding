package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
public class Problem2Demo {
    private static  List<Product> filterProducts(List<Product> products, Predicate<Product> predicate){
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products){
            if(predicate.test(product)){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public static void main(String arg[]){
        //Supplier for intitializing objects
        Supplier<List<Product>> productSupplier =() -> {
            List<Product> products = new ArrayList<>();
            products.add(new Product("Laptop",20000));
            products.add(new Product("tablet",50));
            products.add(new Product("Chair",1000));
            products.add(new Product("pen",10));
            return products;
        };

        //Consumer to print products
        Consumer<List<Product>> printProductsConsumer = products -> {
            for(Product product : products){
                System.out.println(product);
            }
        };

        //Predicate to filter the products based on price
        Predicate<Product> pricePredicate = product -> product.getPrice() >= 500;

        // Function to calculate the total price
        Function<List<Product>, Double > totalPriceFunction = products -> {
            double totalPrice = 0;
            for (Product product : products){
                totalPrice+=product.getPrice();
            }
            return totalPrice;
        };

        List<Product> products = productSupplier.get();
        System.out.println("All Products");
        printProductsConsumer.accept(products);


        List<Product> filteredProducts = filterProducts(products,pricePredicate);
        System.out.println("Filtered Products");
        printProductsConsumer.accept(filteredProducts);

        System.out.println("Total price of filtered products : " + totalPriceFunction.apply(filteredProducts));
        System.out.println("Total price of All products : " + totalPriceFunction.apply(products));

    }
}
