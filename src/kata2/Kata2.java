package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        // colecciones: array list, hashmap
        // metodos de clase 
        // metodos de objetos
        // buscar el numero mas frecuente y el numero de apariciones
        // money calculator
        Person javi = new Person("Javi", 20);
        Person carlos = new Person("Carlos", 20);
        Person alvaro = new Person("Alvaro", 20);
        Person adan = new Person("Adan", 20);
        Person dani = new Person("Dani", 20);
        Person jose = new Person("Jose", 20);
        Person pedro = new Person("Pedro", 20);
        System.out.println("Tengo: "+javi.getAge());
        System.out.println("Mi nombre es: "+javi.getName());
        javi.setName("Javier");
        System.out.println("Me cambie el nombre a: "+javi.getName());
        System.out.println("Javi es un: "+javi.getType());
        
        
        Person[] people = {javi, carlos, adan, dani, jose};
        Person[] preguntas = {pedro, carlos, adan, dani, adan, jose, adan, jose};
        HashMap <Person,Integer> histogram = new HashMap();
        
        
        int maximo = 0;
        String nombre = "";
        
        
        for (int i = 0; i < people.length; i++) {
            histogram.put(people[i],0);
        }
        System.out.println("Adan ha preguntado: "+histogram.get(adan));
        System.out.println("Alvaro esta en clase? "+histogram.containsKey(alvaro));
        System.out.println("Adan esta en clase? "+histogram.containsKey(adan));
        
        for (int i = 0; i < preguntas.length; i++) {
            if(histogram.containsKey(preguntas[i])){
                histogram.put(preguntas[i],(histogram.get(preguntas[i]))+1);
            }
            else{
                System.out.println("El alumno "+ preguntas[i].getName()+" no esta en esta clase");
            }
        }
        
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()+" ha preguntado: "+histogram.get(people[i]));
            
        }
        
        for (int i = 0; i < people.length; i++) {
            if(maximo<histogram.get(people[i])){
                maximo = histogram.get(people[i]);
                nombre = people[i].getName();
            }
            
        }
        System.out.println("El que mas ha preguntado es "+nombre);
        System.out.println("Ha preguntado: "+maximo);
    }
}
