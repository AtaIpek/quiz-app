public class QuizMaker {

    private QuizQuestion[] quizQuestionary;

    public QuizMaker() {
        quizQuestionary = new QuizQuestion[3];
        quizQuestionary[0] = new QuizQuestion("q1", "a1");
        quizQuestionary[1] = new QuizQuestion("q2", "a2");
        quizQuestionary[2] = new QuizQuestion("q3", "a3");
    }

    public QuizQuestion createQuizQuestion() {
        int i = (int) Math.random() * quizQuestionary.length;
        return quizQuestionary[i];
    }
}
