package com.quizsystem;

import java.util.*;

public class AdminService {

    public static void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = JsonUtil.readQuestions();

        while (true) {
            Question q = new Question();

            System.out.print("Input your question: ");
            q.question = sc.nextLine();

            System.out.print("Option 1: ");
            q.option1 = sc.nextLine();

            System.out.print("Option 2: ");
            q.option2 = sc.nextLine();

            System.out.print("Option 3: ");
            q.option3 = sc.nextLine();

            System.out.print("Option 4: ");
            q.option4 = sc.nextLine();

            System.out.print("Answer key: ");
            q.answerkey = sc.nextInt();
            sc.nextLine();

            questions.add(q);
            JsonUtil.writeQuestions(questions);

            System.out.print("Press 's' to add more or 'q' to quit: ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'q') break;
        }
    }
}
