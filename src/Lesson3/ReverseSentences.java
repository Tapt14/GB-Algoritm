package Lesson3;

public class ReverseSentences {
    private final String text;
    private final MyStack<Character> stackChar;

    public ReverseSentences(String text) {
        this.text = text;
        stackChar = new MyStack<>(text.length());
    }

    public StringBuilder reversingResult (){

        StringBuilder reverseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            stackChar.push(text.charAt(i));
        }

        while (!stackChar.isEmpty()) {
            reverseText.append(stackChar.pop());
        }

        return reverseText;
    }


}
