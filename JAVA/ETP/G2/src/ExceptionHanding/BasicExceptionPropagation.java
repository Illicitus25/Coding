package ExceptionHanding;

public class BasicExceptionPropagation {
    static void method3() throws Exception {
        throw new Exception("Exception in method 3");
    }
    static void method2() throws Exception {
        method3();
    }
    static void method1() throws Exception {
        method2();
    }
    public static void main(String[] arg){
        try {
            method1();
        }catch (Exception e){
            System.out.println("Exception caught in main : " + e.getMessage());
        }

    }
}
