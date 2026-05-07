package models;

public class Person {
    private String name;
    private int age;
    private int[] grades;

    public Person(String name, int age , int[] grades ) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public void setGrade(int[] grades) {
        this.grades = grades;
    }

    //Calcular el promedio 

    public double getAverage(){
        int sum = 0;
        for(int nota : grades){
            sum = sum + nota;

        }
        double promedio = sum / 3 ; 
        return promedio;
    }


    @Override
    public String toString() {
        return "Person (" +  name + "," + "Edad  " + age + " Promedio " + getAverage() + ")";
    }


    

    
    
}
