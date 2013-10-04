package kata1;

import java.util.Date;

public class NewMain {

    public static void main(String[] args) {
        Student Javi= new Student("Javi", new Date(93,7,8));
        System.out.println(Javi.getName() + " tiene: " + Javi.getBirthDate() + " años");
        System.out.println("Edad: " + Javi.getAge());
    }
}
