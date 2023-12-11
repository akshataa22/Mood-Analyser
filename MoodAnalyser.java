public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){                      //default constructor with no message
        this.message = null;
    }
    public MoodAnalyser(String message){        //parameterized constructor
        this.message = message;
    }
    public void analyseMood(){                  //method with no parameters
        if(message == "I am in a sad mood"){
            System.out.println("SAD");
        } else{
            System.out.println("HAPPY");
        }
    }
}
