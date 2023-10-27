package prompt;

public class IntValidator implements Validator {

    public boolean isValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
