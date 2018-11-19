public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String codeWord;

    public CodeWordChecker(int min, int max, String codeWord){
        this.min = min;
        this.max = max;
        this.codeWord = codeWord;
    }

    public CodeWordChecker ( String codeWord){
        this.min = 6;
        this.max = 20;
        this.codeWord = codeWord;
    }

    public boolean isValid(String str){
        if(str.indexOf(this.codeWord) == -1){
            return false;
        }
        return true;
    }
}
