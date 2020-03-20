package ru.job4j.tracker;

public class StubInput implements Input {
    // массив ответов от "пользователя"
    private String[] answers;
    /*счетчик, чтобы при повторном вызове мы метода askStr мы получали
    следующую ячейку из нашего массива.*/
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question, int length) {
        return Integer.valueOf(askStr(question));
    }
}
