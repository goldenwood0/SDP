package assignment_4;

import java.util.ArrayList;
import java.util.List;

// Observer Pattern
class ColonyAntObserver implements AntObserver {
    private List<Ant> ants = new ArrayList<>();
    private String currentAntType;

    public void addAnt(Ant ant) {
        ants.add(ant);
    }

    public void needAnts(String antType) {
        System.out.println("Colony needs " + antType);
        currentAntType = antType;
        notifyAnts();
    }

    private void notifyAnts() {
        for (Ant ant : ants) {
            ant.respondToColonyNeed(currentAntType);
        }
    }

    @Override
    public void update(String antType) {
        currentAntType = antType;
        System.out.println("Colony updated: " + currentAntType);
        notifyAnts();
    }
}