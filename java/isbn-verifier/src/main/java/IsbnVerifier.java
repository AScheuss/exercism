class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        int sum = 0;
        String[] split = stringToVerify.split("");
        int i = 0;

        for (String s : split) {
            switch (s) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    sum += Integer.valueOf(s) * (10 - i);
                    i++;
                    break;
                case "-":
                    break;
                case "X":
                    if (i!=9) return false; //X is allowed only for last "digit"
                    sum += 10 * (10 - i);
                    i++;
                    break;
                default:
                    return false;
            }
        }
        return i == 10 && (sum % 11 == 0);

    }

}
