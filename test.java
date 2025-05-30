import java.util.Scanner;

class Test {
    public static void main(String[] args){
     Student student = new Student("Moin", 25);
     student.roll = 75;
     System.out.println(student.roll);
    }
}


class Asfi{
    static void learn(){
        String name = "MD ASFI";
        int roll_number = 79;
        String favourite_teacher = "AD";
        String data_1 = "Excel and Practice on Laptop..";
        System.out.println("Name is : "+name+" Roll is : "+roll_number+" favourite teacher is : "+favourite_teacher);
        System.out.println("Course is Learning Now a days :: "+ data_1);
    }
     void add(){
        System.out.println("Asfi is Asfi .. Not Moin..");
    }
}


class  Moin extends Asfi{
    @Override
     void add(){
        System.out.println("1234-XXXX-1452-YY");
    }

}

interface Multiply{
    void multi();
}


class Data implements Multiply{
    public void multi(){
    System.out.println("Multi.........");
    }
}


class Interview{
    String name;
    int age;
    int roll;

    Interview(String name, int age){
        this.name = name;
        this.age = age;
    }
}


class Student extends Interview {
    Student(String name ,int age){
        super(name,age);
    }
}