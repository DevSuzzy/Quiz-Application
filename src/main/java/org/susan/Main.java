package org.susan;

import org.susan.notes.txt.Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();
    }
}
class Quiz {
    Scanner sc = new Scanner(System.in);
    int correctAnsCount = 0;
    int incorrectAnsCount = 0;

    public void logic() {

        Questions q1 = new Questions(" Which statement is true about Java?",
                "A. Java is a sequence-dependent programming language ",
                "B. Java is a code dependent programming language ", "C. Java is a platform dependent programming language ",
                "D. Java is a platform independent programming language");
        Questions q2 = new Questions(" What is the extension of Java code files?", "A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions q3 = new Questions("Who invented Java programming?", "A. Guido Van Rossum", "B. James Gosling",
                "C. Dennis Ritchie", "D .Bjarne Stroupstrup");
        Questions q4 = new Questions("Which of the following is not a Java feature", "A. Object-Oriented", "B. Use of pointers",
                "C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in java", "A. identifier and keyword",
                "B. identifier", "C. Keyword", "D. none of the mentioned");


        Map<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'D');
        hmap.put(q2, 'D');
        hmap.put(q3, 'B');
        hmap.put(q4, 'B');
        hmap.put(q5, 'C');

        for (Map.Entry<Questions, Character> map : hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter Your Answer:  ");
            Character answer = sc.next().charAt(0);

            int Canswer = Character.compare(answer, map.getValue());
            if (Canswer == 0) {
                System.out.println("Correct");
                correctAnsCount++;
            } else {
                System.out.println("Incorrect");
                incorrectAnsCount++;

            }

        }
        System.out.println();
        System.out.println("...............Result........");
        System.out.println("Total Number of Questions: " + hmap.size());
        System.out.println("Correct Answered Questions: " + correctAnsCount);
        System.out.println("Incorrect Answered Questions : " + incorrectAnsCount);
        int percentage = (100 * correctAnsCount) / hmap.size();
        System.out.println("Percentage : " + percentage);
        if (percentage > 95) {
            System.out.println("Performance : Very Good !");
        } else if (percentage > 35) {
            System.out.println("Performance : Very Low!");

        } else {
            System.out.println("Performance : Medium!");
        }

    }
}
