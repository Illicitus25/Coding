//import java.util.Objects;
//
//class Student{
//    private String name;
//    private int rollNo;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo && Objects.equals(name, student.name);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollNo);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNo=" + rollNo +
//                '}';
//    }
//}
//public class ObjectClassdemo {
//    public static void main(String[] args) {
//        Student obj = new Student();
////        obj.name = "ABC";
////        obj.rollNo = 1;
////
////        Student obj1 = new Student();
////        obj1.name = "ABC";
////        obj1.rollNo = 1;
//
//        System.out.println(obj.toString());
//        System.out.println(obj.equals(obj1));
//
//    }
//}
