package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        Person javi = new Person("Javi", 20);
        Person carlos = new Person("Carlos", 22);
        Person alvaro = new Person("Alvaro", 18);
        Person adan = new Person("Adan", 21);
        Person dani = new Person("Dani", 20);
        Person jose = new Person("Jose", 19);
        System.out.println("Tengo: "+javi.getAge());
        System.out.println("Mi nombre es: "+javi.getName());
        javi.setName("Javier");
        System.out.println("Me cambie el nombre a: "+javi.getName());
        System.out.println("Javi es un: "+Person.getType());
        
        
        Person[] people = {javi, carlos, alvaro, adan, dani, jose};
        Person[] preguntas = {carlos, adan, dani, adan, jose, adan, jose};
        HashMap <Person,Integer> histogram = new HashMap();
        
        for (int i = 0; i < people.length; i++) {
            histogram.put(people[i],0);
        }
        System.out.println("Adan ha preguntado: "+histogram.get(adan));
        System.out.println("Alvaro esta en clase? "+histogram.containsKey(alvaro));
        System.out.println("Adan esta en clase? "+histogram.containsKey(adan));
        
        System.out.println(Person.getFrecuency(histogram, preguntas));
    }
}