//import java.util.Objects;
//
//class Teacher{
//    String name;
//    int id;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Teacher teacher = (Teacher) o;
//        return id == teacher.id && Objects.equals(name, teacher.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }
//
//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//}
//public class ObjectDemo2 {
//    public static void main(String a[]){
//        Teacher obj = new Teacher();
//        obj.id = 1;
//        obj.name = "ABC";
//
//        Teacher obj1 = new Teacher();
//        obj1.id = 1;
//        obj1.name = "ABC";
//
//        System.out.println(obj.toString());
//        System.out.println(obj.equals(obj1));
//    }
//}
