package assignment_4;

class WarriorAnt implements Ant {
    @Override
    public void respondToColonyNeed(String antType) {
        if (antType.equalsIgnoreCase("Warriors")) {
            System.out.println("Warrior Ant: For the Queen!!!");
            // Logic to create and assign warrior ants
        }
    }

    public void registerObserver(ColonyAntObserver colony) {
    }
}
