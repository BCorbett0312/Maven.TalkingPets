package io.zipcoder.polymorphism;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Integer numPets;

        ArrayList<Pet> petArrayList = new ArrayList<Pet>();




        System.out.println("How many pets do you have?"+ "\nEnter 0 to quit");
        while (!scanner.hasNextInt()){
            System.out.println("That is not a valid number of animals");
            scanner.next();


        }
        numPets = scanner.nextInt();

        if( numPets < 0){
            System.out.println("It appears you have no pets and do not need this application." + "\nIf you have pets restart and enter a positive number");
        }

        while (numPets > 0){
//            System.out.println("How many pets do you have?"+ "\nEnter 0 to quit");
//            while (!scanner.hasNextInt()){
//                System.out.println("That is not a valid number of animals");
//                scanner.next();
//            }





            for(int i = 0; i < numPets; i++){
                askForPetType();
                String petType = scanner.next().toLowerCase();

                if (petType.contains("cat")){
                    askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Cat(petName));
                    numPets--;


                }
                else if(petType.contains("dog")){
                    askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Dog(petName));
                    numPets--;
                }
                else if(petType.contains("fox")){
                    askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Fox(petName));
                    numPets--;
                }
                else if(petType.contains("bird")){
                    askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Bird(petName));
                    numPets--;
                }
                else {
                    System.out.println("Please enter a valid pet type");
                    i--;
                }


            }


        }

        for(int i = 0; i<petArrayList.size(); i++){
            System.out.println("The animal named " +petArrayList.get(i).getName() + " says " + petArrayList.get(i).speak() + "!");
        }


    }
    private static void askForPetType() {
        System.out.println("Is the pet a cat, dog, bird, or fox?");
    }
    private static void askForPetName() {
        System.out.println("What is the name of that pet");
    }
    }





