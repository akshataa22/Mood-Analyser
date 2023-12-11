public class Main {
    public static void main(String[] args) {
        try {
            MoodAnalyser mood = new MoodAnalyser("angry mood");
            mood.analyseMood();
        } catch (InvalidMoodException i) {
            System.out.println("This is a exception handled block from Main class.");
            System.out.println("Message from Main class: " + i.getMessage());
        }
    }
}