package controllers;

import models.Person;

public class PersonController {

    //Metodo que ordenad personas por su edad usando Insertion
    public void sortPeopleByAge(Person[] personas) {

        for(int i = 1; i < personas.length; i++){
        Person aux  = personas [i];
        int j = i - 1;
        while(j >= 0 &&
             personas[j].getAge() < aux.getAge()){
            personas[j + 1] = personas[j];
            j--;
            
            
        }
        personas[j +1 ]= aux;




        }

        
    }   

    //Comparar cadenas de texto
    public void sortPeopleByName(Person[] personas){
        for(int i = 1; i < personas.length; i++){
        Person aux  = personas [i];
        int j = i - 1;
        while(j >= 0 &&
             personas[j].getName().compareTo(aux.getName()) <0){

                
            personas[j + 1] = personas[j];
            j--;
            
            
        }
        personas[j + 1]= aux;

        }

        

    }

    public void sortPeopleByAvr(Person[] personas){
        for(int i = 1; i < personas.length; i++){
        Person aux  = personas [i];
        int j = i - 1;


        while(
            j >= 0 &&
             personas[j].getAverage() > aux.getAverage()) {
            personas[j + 1] = personas[j];
            j--;
            
            
        }
        personas[j +1 ]= aux;

        }

        

    }
    


}
