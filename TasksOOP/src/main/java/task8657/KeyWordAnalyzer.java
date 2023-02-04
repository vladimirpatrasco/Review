package task8657;

public abstract class KeyWordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.equals(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
