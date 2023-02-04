package task8657;

public class Main {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer ta : analyzers) {
            if (ta.processText(text) != Label.OK) {
                return ta.processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String[] keyword = {"spam"};
        int maxlength = 10;
        TextAnalyzer[] ta = {new TooLongTextAnalyzer(maxlength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(keyword)};
        var m = new Main();
        System.out.println(m.checkLabels(ta, ":("));
    }
}
