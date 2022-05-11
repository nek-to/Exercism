import java.util.Locale;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
//        throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        StringBuilder result = new StringBuilder();
        StringBuilder toClean = new StringBuilder(identifier);
        char c = ' ';
        for (int i = 0; i < toClean.toString().length(); i++){
            c = toClean.toString().charAt(i);
            // Ex 1
            if (c == ' '){
                result.append('_');
            }
            // Ex 2
            else if (Character.isISOControl(c)) {
                result.append("CTRL");
            }
            // Ex 3
            else if (c == '-') {
                result.append(Character.toUpperCase(toClean.toString().charAt(i+1)));
                toClean.replace(i, i+1, "");
            }
            // Ex 4
            else if (Character.isLowerCase(c) && String.valueOf(c).matches("\\p{InGREEK}")) {
                toClean.replace(i,i,"");
            } else if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
