package com.quizsystem;

import java.util.*;

public class StudentService {

    public static void start(String name) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = JsonUtil.readQuestions();
        Random rand = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            Question q = questions.get(rand.nextInt(questions.size()));

            System.out.println("\n" + (i+1) + ". " + q.question);
            System.out.println("1. " + q.option1);
            System.out.println("2. " + q.option2);
            System.out.println("3. " + q.option3);
            System.out.println("4. " + q.option4);

            int ans = sc.nextInt();
            if (ans == q.answerkey) score++;
        }

        if (score >= 8)
            System.out.println("Excellent! You got " + score + "/10");
        else if (score >= 5)
            System.out.println("Good! You got " + score + "/10");
        else if (score >= 3)
            System.out.println("Very poor! You got " + score + "/10");
        else
            System.out.println("Failed! You got " + score + "/10");
    }
}
