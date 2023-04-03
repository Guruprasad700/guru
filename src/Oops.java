import java.util.*;

public class Oops {
    //private static Teacher obj;
    //private static Teacher //obj.setslaray(money);

    //public static void main(String[] args) {
        public static void main (String[] args) {
            // Your code here
            Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            int age=in.nextInt();
            int money =in.nextInt();
            //Teacher c=new Teacher();
            Teacher obj= new Teacher(name,age,money);
            obj.setName(name);
            obj.ageTecher(age);
            obj.setSalary(money);
        }
    }
    class Teacher {
        String name;
        int age;
        private int salary;
        public Teacher(String name, int age, int salary){
            name=name;
            age=age;
            this.salary=salary;
        }
        public void setName(String name ){
            name=name;
            System.out.println("Name: "+name);
        }
        public void ageTecher(int age){
            age=age;
            System.out.println("Age: "+age);
        }
        void setSalary(int salary){
            this.salary=salary;
            System.out.println("Salary: "+this.salary);
        }

    }
//Name: raj
//Age: 22
//Salary: 20000
//Name: raj
//Age: 23
//Salary: 20000
//Name: guru
//Age: 22
//Salary:  28474
/*int money =in.nextInt();
        Teacher c=new Teacher();
        c.setName(name);
                c.ageTecher(age);
                c.setSalary(money);
                }
                }*/
/*
class Teacher {
    String name;
    int age;
    private int salary;
    public void setName(String name ){
        name=name;
        System.out.println("Name:"+name);
    }
    public void ageTecher(int age){
        age=age;
        System.out.println("Age:"+age);
    }
    void setSalary(int salary){
        this.salary=salary;
        System.out.println("Salary:"+this.salary);
    }

}*/
