package dsa_practice.scenario_based;

import java.util.*;

class Student{
    int id;
    String name;
    Stack<Integer> lastVisited;

    Student(int id,String name){
        this.id=id;
        this.name=name;
        this.lastVisited=new Stack<>();
    }

    void visitQuestion(int questionId){
        lastVisited.push(questionId);
    }

    Integer goBack(){
        if(lastVisited.isEmpty())return null;
        return lastVisited.pop();
    }
}

class Question{
    int id;
    String question;
    String correctAnswer;

    Question(int id,String question,String correctAnswer){
        this.id=id;
        this.question=question;
        this.correctAnswer=correctAnswer;
    }
}

class ScoreTracker{
    static ArrayList<Question> questions=new ArrayList<>();
    HashMap<Integer,String> answers=new HashMap<>();

    void submitAnswer(int questionId,String answer){
        answers.put(questionId,answer);
    }

    int calculateScore(){
        int score=0;
        for(Question q:questions){
            String submitted=answers.get(q.id);
            if(submitted!=null && submitted.equalsIgnoreCase(q.correctAnswer)){
                score++;
            }
        }
        return score;
    }
}

public class OnlineExamReviewSystem{
    public static void main(String[] args){
        ScoreTracker.questions.add(new Question(1,"2+2?","4"));
        ScoreTracker.questions.add(new Question(2,"Capital of India?","Delhi"));
        ScoreTracker.questions.add(new Question(3,"Java is OOP?","Yes"));
        Student student=new Student(101,"Anurag");
        ScoreTracker tracker=new ScoreTracker();
        student.visitQuestion(1);
        tracker.submitAnswer(1,"4");
        student.visitQuestion(2);
        tracker.submitAnswer(2,"Delhi");
        student.visitQuestion(3);
        tracker.submitAnswer(3,"No");
        System.out.println("Last visited question: "+student.goBack());
        System.out.println("Final Score: "+tracker.calculateScore());
    }
}
