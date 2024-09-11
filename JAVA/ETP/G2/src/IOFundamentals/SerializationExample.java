package IOFundamentals;

import java.io.*;

class Student implements Serializable {
    String name;
    Character grade;
    Double marks;

    public Student(String name, Character grade, Double marks) {
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
}
public class SerializationExample {

    public static Student readFromFiles(String filename){
        try (FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Student obj = (Student) ois.readObject();
            return obj;
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToFiles(Student obj, String filename){
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            System.out.println("Object is Serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] arg) {
        Student obj = new Student("John",'A',90.0);
        String outputFilename = "src/IOFundamentals/serializable.txt";
        writeToFiles(obj,outputFilename);
        Student obj1 = readFromFiles("src/IOFundamentals/serializable.txt");
        if(obj1!=null){
            System.out.println("Name : " + obj1.getName());
            System.out.println("Grade : " + obj1.getGrade());
            System.out.println("Marks : " + obj1.getMarks());
        }
    }
}
