package com.company;

public class Main {

    public static void main(String[] args) {
        String personsName = "Azamat ";
        int ageOfPerson = 29;
        int temperature = 40;

        if((temperature > 30 || temperature < -20) && (ageOfPerson >20 || ageOfPerson <45)) {
        System.out.println(personsName + "Остаеться дома");
        } else{
         System.out.println(personsName + "Идет в гости");
        }


        if (ageOfPerson < 20 && (temperature > 0 || temperature < 28)){
            System.out.println(personsName + "Остаеться дома у друга");
        } else {
            System.out.println(personsName + "Идет в гости к родственникам");
        }


        if (ageOfPerson > 45 && (temperature > -10 || temperature < 25)){
            System.out.println(personsName + "Остаеться дома");
        } else {
            System.out.println(personsName + "Идет в гости");


        }
    }




    }

