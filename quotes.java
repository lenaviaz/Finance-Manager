import java.util.ArrayList;
import java.util.Random;

public class quotes {

    String yes;

    String a = "a";
    String b = "b";
    String c = "c";

    ArrayList<String> myquotes = new ArrayList<String>();
    
    public void init(){
     myquotes.add(a);
     myquotes.add(b);
     myquotes.add(c);

    }

    public String getRandString(){
        Random random = new Random();
        
        //lets get 5 random elements from ArrayList
        for(int i=0; i < myquotes.size(); i++){
            yes = myquotes.get( random.nextInt(myquotes.size()) 
                    );

    }
        return yes.toString();
    
}
}
