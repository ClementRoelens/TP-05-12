package org.example.Classes;

import java.util.List;
import java.util.Scanner;

public class HCI {
    static Scanner scanner = new Scanner(System.in);
    public static void selectHeroe(List<Characters> charactersList){

        System.out.println("\nSélectionnez le personnage que vous voulez utiliser : ");
        for (int i = 0; i < charactersList.size(); i++) {
            if (charactersList.get(i).isAlive){
                System.out.printf("%d - %s\n", i, charactersList.get(i).name);
            }
        }

        int selection = scanner.nextInt();

        System.out.println("Qui voulez-vous attaquer ?");
        for (int i = 0; i < charactersList.size(); i++) {
            if (i != selection && charactersList.get(i).isAlive){
                System.out.printf("%d - %s\n", i, charactersList.get(i).name);
            }
        }

        int target = scanner.nextInt();

        Characters assaillant = charactersList.get(selection);
        Characters defender = charactersList.get(target);
        defender.takeDamages(assaillant.makeDamages());
        if (defender.isAlive){
            System.out.printf("%s contre-attaque\n", defender.name);
            assaillant.takeDamages(defender.makeDamages());
        }

        HCI.selectHeroe(charactersList);
    }
}
