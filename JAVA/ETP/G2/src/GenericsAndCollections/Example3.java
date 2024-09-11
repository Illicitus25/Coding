//package GenericsAndCollections;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Example3 {
//
//    public static void addToList(List<? super Integer> list, Object element){
//        list.add(element);
//    }
//    public static void main(String[] arg){
//        List<Object>  objectList = new ArrayList<>();
//        List<Number>  numberList = new ArrayList<>();
//        List<Integer> integerList = new ArrayList<>();
//
//        addToList(objectList,"String");
//        addToList(objectList,3);
//
//        addToList(numberList,3);
//        addToList(numberList,3.5);
//
//        addToList(integerList,3);
//    }
//}
