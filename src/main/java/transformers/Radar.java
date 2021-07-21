package transformers;

public class Radar implements IScanner {
    @Override
    public void locate() {
        System.out.println("Beep... beep... beep... Enemy located!");
    }
}