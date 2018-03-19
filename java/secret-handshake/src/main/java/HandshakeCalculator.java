import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> returnList = new ArrayList<>();
        String numberAsBinaryStringReversed = new StringBuilder(Integer.toBinaryString(number)).reverse().toString();

        if (numberAsBinaryStringReversed.length() > 0 && numberAsBinaryStringReversed.charAt(0) == '1') {
            returnList.add(Signal.WINK);
        }

        if (numberAsBinaryStringReversed.length() > 1 && numberAsBinaryStringReversed.charAt(1) == '1') {
            returnList.add(Signal.DOUBLE_BLINK);
        }

        if (numberAsBinaryStringReversed.length() > 2 && numberAsBinaryStringReversed.charAt(2) == '1') {
            returnList.add(Signal.CLOSE_YOUR_EYES);
        }

        if (numberAsBinaryStringReversed.length() > 3 && numberAsBinaryStringReversed.charAt(3) == '1') {
            returnList.add(Signal.JUMP);
        }

        if (numberAsBinaryStringReversed.length() > 4 && numberAsBinaryStringReversed.charAt(4) == '1') {
            Collections.reverse(returnList);
        }

        return returnList;
    }

}
