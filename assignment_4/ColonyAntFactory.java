package assignment_4;

class ColonyAntFactory implements AntFactory {
    @Override
    public Ant createAnt(String antType) {
        if ("WorkerAnt".equalsIgnoreCase(antType)) {
            return new WorkerAnt();
        } else if ("Worrior".equalsIgnoreCase(antType)) {
            return new WarriorAnt();
        }
        return null; // Return null for unknown ant types
    }
}
