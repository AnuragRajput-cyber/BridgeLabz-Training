package dsa_practice.scenario_based;

import java.util.*;

class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}

public class EventFeedbackAndRatingAnalyzer {

    static void addRating(Map<String, List<Integer>> feedback,
                          String eventId, int rating)
            throws InvalidRatingException {

        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be between 1 and 5");

        feedback.computeIfAbsent(eventId, k -> new ArrayList<>()).add(rating);
    }

    static double calculateAverage(List<Integer> ratings) {
        int sum=0;
        for (int r:ratings) sum+=r;
        return (double) sum / ratings.size();
    }

    public static void main(String[] args) {
        try {
            Map<String,List<Integer>>feedback=new HashMap<>();

            addRating(feedback,"E215",2);
            addRating(feedback,"E215",5);
            addRating(feedback,"E215",3);
            addRating(feedback,"E101",5);
            addRating(feedback,"E101",4);

            String topEvent=null;
            double highestAvg = 0;

            for (var entry: feedback.entrySet()) {
                double avg =calculateAverage(entry.getValue());
                System.out.println(entry.getKey() +" -> Avg Rating: "+ avg);

                if (avg >highestAvg){
                    highestAvg =avg;
                    topEvent =entry.getKey();
                }
            }

            System.out.println("Top Rated Event: "+topEvent);

        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        }
    }
}
