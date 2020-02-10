package sample;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Controller {
    int current = 0;
    int current2 = 0;
    private Label dailyQuotes;
    ArrayList<String> randomQuotes = new ArrayList<>();

    public Controller(){
        randomQuotes.add("Success is not final; failure is not fatal: It is the courage to continue that counts.");
        randomQuotes.add("It is better to fail in originality than to succeed in imitation");
        randomQuotes.add("The road to success and the road to failure are almost exactly the same.");
        randomQuotes.add("Success usually comes to those who are too busy to be looking for it");
        randomQuotes.add("Opportunities don't happen. You create them.");
        randomQuotes.add("Don't be afraid to give up the good to go for the great.");
    }

    public void randomNr() {
        Random random = new Random();
        int myRand = random.nextInt(randomQuotes.size());
        current = myRand;
        dailyQuotes.setText(randomQuotes.get(myRand));
        System.out.println(dailyQuotes);
    }

}
