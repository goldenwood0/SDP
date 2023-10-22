package assignment_3;

class Translator_Adapter implements Ant_Speaker {
    private Human_Speaker human_Speaker;

    public Translator_Adapter(Human_Speaker human_Speaker) {
        this.human_Speaker = human_Speaker;
    }

    @Override
    public void speakInAnt(String message) {
        // Translate the Ant message to Human and pass it to the adaptee.
        String Human_Message = translateToHuman(message);
        human_Speaker.Sapiens(Human_Message);
    }

    private String translateToHuman(String message) {
        // In a real scenario, this method would handle proper translation.
        // For simplicity, we'll just add a prefix here.
        return "Translated: " + message;
    }
}