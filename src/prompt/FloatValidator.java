package prompt;

public class FloatValidator implements Validator {

    public boolean isValid(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
