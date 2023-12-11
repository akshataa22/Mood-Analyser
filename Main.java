public class Main {
    public static void main(String[] args) {
        try {
            MoodAnalyser mood = new MoodAnalyser();
            mood.analyseMood();
        } catch (IllegalArgumentException i) {
            System.out.println("Illegal Argument exception is printed.");
            System.out.println(i.getMessage());
        }
    }
}