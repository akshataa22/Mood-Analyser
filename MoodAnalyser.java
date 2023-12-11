enum MoodAnalysisError{
    NULL,
    INVALID,
    EMPTY
}

class InvalidMoodException extends Exception {
    private MoodAnalysisError error;
    public InvalidMoodException(MoodAnalysisError error,String message) {
        super(message);
        this.error = error;
    }

    public MoodAnalysisError getError() {
        return error;
    }
}
public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){                      //default constructor with no message
        this.message = null;
    }
    public MoodAnalyser(String message){        //parameterized constructor
        this.message = message;
    }
    public void analyseMood() throws InvalidMoodException{                 //method with no parameters
        try {
            if(message == null){
                throw new InvalidMoodException(MoodAnalysisError.NULL,"Mood cannot be null.");
            }
            if(message.isEmpty()){
                throw new InvalidMoodException(MoodAnalysisError.EMPTY,"Mood cannot be empty.");
            }

            if (message.equals("I am in a sad mood")) {
                System.out.println("SAD");
            } else if (message.equals("I am in a happy mood")) {
                System.out.println("HAPPY");
            } else {
                throw new InvalidMoodException(MoodAnalysisError.INVALID,"Invalid message");
            }
        } catch(InvalidMoodException i) {
            System.out.println("This is a exception handled block from Mood Analyser class.");
            System.out.println("Message from Mood Analyser class: " + i.getMessage());
            System.out.println("Error: " + i.getError());
            throw i;
        }
    }
}