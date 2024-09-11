package ExceptionHanding;

class CustomExceptions extends Exception{
    public CustomExceptions(String message) {
        super(message);
    }
}
public class CustomException {
    private static void validateAge(int age) throws CustomExceptions {
        if(age<0){
            throw new CustomExceptions("Age cannot be negative");
        }
    }
    public static void main(String[] arg){
        try{
            validateAge(-23);
        }catch (CustomExceptions e){
            System.out.println("CustomException Thrown");
        }
    }
}
