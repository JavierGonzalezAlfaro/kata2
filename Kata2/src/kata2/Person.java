package kata2;

import java.util.HashMap;

public class Person {
    private String name;
    private int age;
    private static String type = "Human";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setType(String type) {
        Person.type = type;
    }
    
    public static String getFrecuency(HashMap <Person,Integer> histogram, Person[] preguntas ){
        int maximo = 0;
        String nombre = "";
        
        for (int i = 0; i < preguntas.length; i++) {
            histogram.put(preguntas[i],(histogram.get(preguntas[i]))+1);
        }
        
        for (int i = 0; i < preguntas.length; i++) {
            if(maximo<histogram.get(preguntas[i])){
                maximo = histogram.get(preguntas[i]);
                nombre = preguntas[i].getName();
            }
            
        }
        return "El que mas ha preguntado es: "+nombre+" y lo ha hecho: "+maximo+" veces.";
    }
    
}
