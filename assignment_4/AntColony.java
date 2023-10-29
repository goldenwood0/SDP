package assignment_4;

import java.util.Scanner;

public class AntColony {
    public static void main(String[] args) {
        // Observer Pattern
        ColonyAntObserver colony = new ColonyAntObserver();
        WorkerAnt workerAnt = new WorkerAnt();
        WarriorAnt warriorAnt = new WarriorAnt();

        colony.addAnt(workerAnt);
        colony.addAnt(warriorAnt);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ant type (Worker or Warrior):");
        String antType = scanner.nextLine();

        // Register the colony as an observer for ant type changes
        workerAnt.update(colony);
        warriorAnt.registerObserver(colony);

        // Notify the colony about the ant type
        colony.needAnts(antType);

        // Factory Pattern
        AntFactory antFactory = new ColonyAntFactory();

        Ant newAnt = antFactory.createAnt(antType);

        scanner.close();
    }
}
