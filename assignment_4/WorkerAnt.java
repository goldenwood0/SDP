package assignment_4;

class WorkerAnt implements Ant {
    @Override
    public void respondToColonyNeed(String antType) {
        if (antType.equalsIgnoreCase("Workers")) {
            System.out.println("Worker Ant: I'm ready to work!");
            // Logic to create and assign worker ants
        }
    }

    public void update(ColonyAntObserver colony) {
    }
}