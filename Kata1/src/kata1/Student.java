package kata1;

import java.util.Date;

public class Student {
    
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private static final int MILLISECONDS_PER_MINUTE = 60 * MILLISECONDS_PER_SECOND;
    private static final int MILLISECONDS_PER_HOUR = 60 * MILLISECONDS_PER_MINUTE;
    private static final int MILLISECONDS_PER_DAY = 24 * MILLISECONDS_PER_HOUR;
    private static final double MILLISECONDS_PER_YEAR = (365.25 * MILLISECONDS_PER_DAY);
    
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public int getAge(){
         long today = new Date().getTime();
         long birthday = birthDate.getTime();
         long difference = today - birthday;
         long age = (long) (difference / MILLISECONDS_PER_YEAR); //(1000*60*60*24*365.25));
         return (int) age;
    }
}
