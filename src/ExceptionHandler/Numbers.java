package ExceptionHandler;

import static java.lang.System.exit;

public class Numbers {
    public boolean isNumber(String value)
    {
        try {

            double d = Double.parseDouble(value);
        }
        catch(NullPointerException e) {
            return  false;
        }
        catch( NumberFormatException e) {
            System.out.println("Invalid Number Format!");
            exit(0);

        }
        catch(Exception e) {
            return false;

        }
        return true;

    }

    }

