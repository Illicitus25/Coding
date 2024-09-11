package ExceptionHanding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InVaidProductIDException extends Exception{
    public InVaidProductIDException(String message) {
        super(message);
    }
}

class InValidQuantityException extends Exception{
    public InValidQuantityException(String message) {
        super(message);
    }
}

class paymentExcetion extends Exception{
    public paymentExcetion(String message) {
        super(message);
    }
}
class OutOfStockException extends Exception{
    public OutOfStockException(String message) {
        super(message);
    }
}

class OrderProcessedException extends  Exception{
    public OrderProcessedException(String message) {
        super(message);
    }
}
class OrderProcessor{

    private Map<Integer,Integer> productInventory;

    public OrderProcessor(){
        this.productInventory = new HashMap<>();
        productInventory.put(123,20);
        productInventory.put(234,90);
    }
    public void processOrder(int productId,int requestQuantity) throws OrderProcessedException {
        try {
            validateProductId(productId);
            validateRequestQuantity(requestQuantity);
            checkStockAvailability(productId, requestQuantity);
            processPayment();
            System.out.println("Order Processed!");
        }catch (InVaidProductIDException | InValidQuantityException | OutOfStockException | paymentExcetion e){
            throw new OrderProcessedException("Failed to process Order : " + e.getMessage());
        }

    }

    private void validateProductId(int productId) throws InVaidProductIDException {
        if(!productInventory.containsKey(productId))
            throw new InVaidProductIDException("Product is InValid");
    }

    private void validateRequestQuantity(int requestQuantity) throws InValidQuantityException {
        if(requestQuantity<0)
            throw  new InValidQuantityException("Quantities cannot be neagtive");
    }

    private void checkStockAvailability(int productID, int requestQuantity) throws OutOfStockException {
        if(!(productInventory.get(productID)>requestQuantity))
            throw new OutOfStockException("Product" + productID + "is out of stock");
    }

    private void processPayment() throws paymentExcetion {
        boolean paymentStatus = true;
        if(!paymentStatus){
            throw new paymentExcetion("Payment Failed!");
        }

    }
}
public class Example2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        try {
            OrderProcessor orderProcessor = new OrderProcessor();
            while (true)
            {
                System.out.println("Enter the prouct Id :");
                int productId = scanner.nextInt();
                System.out.println("Enter the quantity(Negative quantities are not allowed : ");
                int requestQuantity = scanner.nextInt();
                orderProcessor.processOrder(productId,requestQuantity);
            }
        } catch (OrderProcessedException e) {
            System.err.println("Error : " + e.getMessage());
            Throwable cause = e.getCause();
            while (cause!=null)
                System.err.println("Caused by : " + cause.getCause());
        }finally {
            scanner.close();
            System.out.println("Scanner is closed!");
        }

    }
}
