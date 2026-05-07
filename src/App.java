import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = {
            new Person("Juan",20,      new int[]{10, 15, 20}),//15
            new Person("Maria",18 ,    new int[]{15,15,20}),//16.66
            new Person("Pedro",25,     new  int[]{20, 15, 20}),// 18.33
            new Person("Ana",22,       new int[]{20, 20, 20}),// 20
            new Person("Jorgue",15 ,   new int[]{10, 10, 20}),//13
            

        };
        for(Person person :personas){
            System.out.println(person);

        }
        PersonController personController = new PersonController();
        personController.sortPeopleByAge(personas);
        System.out.println("-----Orden Por Edad------");
        for(Person persona : personas){
            System.out.println(persona);
        }
    
        personController.sortPeopleByName(personas);
        System.out.println("---------Ordenar por nombre----------");
        for(Person personita : personas){
            System.out.println(personita);
        }

        personController.sortPeopleByAvr(personas);
        System.out.println("---------Ordenar por promedio de notas ----------");
        for(Person personita : personas){
            System.out.println(personita);
        }

        
    }
}
