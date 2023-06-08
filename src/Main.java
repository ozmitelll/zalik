import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}




class Test {
    private List<Question> questions;

    public Test() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void conductTest() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            if(scanner.hasNextLine()) {
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                    score++;
                }
            }


        }

        System.out.println("Результат: " + score + "/" + questions.size());
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.print("This program created K. Ozmitel, 201 group.\n");
        Test test = new Test();
        test.addQuestion(new Question("Питання 1: Скільки буде 2+2?", "4"));
        test.addQuestion(new Question("Питання 2: Яка столиця Франції", "Париж"));
        test.addQuestion(new Question("Питання 3: Яка письменниця намальована на 200-гривневій купюрі?", "Леся Українка"));
        test.addQuestion(new Question("Питання 4: Столиця України?", "Київ"));
        test.addQuestion(new Question("Питання 5: 2*2+2?", "6"));
        
        test.conductTest();
    }
}