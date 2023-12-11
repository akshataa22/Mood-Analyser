public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){                      //default constructor with no message
        this.message = null;
    }
    public MoodAnalyser(String message){        //parameterized constructor
        this.message = message;
    }
    public void analyseMood() throws IllegalArgumentException{                 //method with no parameters
        try {
            if(message == null){
                throw new IllegalArgumentException("Mood cannot be empty.");
            }

            if (message.equals("I am in a sad mood")) {
                System.out.println("SAD");
            } else if (message.equals("I am in a happy mood")) {
                System.out.println("HAPPY");
            } else {
                System.out.println("Unexpected mood: " + message);
            }
        } catch(IllegalArgumentException i) {
            System.out.println("This is a exception handled block");
            System.out.println(i.getMessage());
        }
    }
}
