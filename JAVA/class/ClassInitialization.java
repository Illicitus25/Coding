class Employee{
    int id;
    String name;
    float salary;
     public Employee(int id,String name,float salary){
      this.id=id;
      this.name=name;
      this.salary=salary;
  
    }
  }
  class Student{
    int id;
    String name;
    int a;
    String b;
    void setname(int p,String q){
      a=p;
      b=q;
    }
  }
  
    public  class ClassInitialization{
    public static void main(String[] args) {
      Student s1=new Student();
      Student s2=new Student();
      Employee e1=new Employee();
  
      s1.id=25;
      s1.name="Ankit";
      System.out.println(s1.id);
      System.out.println(s1.name);
      s2.id=85;                                //initializing by reference
      s2.name="Shubham";
      System.out.println(s2.id);
      System.out.println(s2.name);
      s1.setname(22, "Mantu"); //initialization through method
      System.out.println(s1.a);
      System.out.println(s1.b);
    }
  }