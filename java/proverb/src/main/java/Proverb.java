class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder stringBuilder = new StringBuilder();

        int length = words.length;
        if (length <1) {
            return "";
        }

        for (int i = 0; i < length-1; i++) {
            stringBuilder.append("For want of a ").append(words[i]).append(" the ").append(words[i + 1]).append(" was lost.").append(System.lineSeparator());
        }
        stringBuilder.append("And all for the want of a ").append(words[0]).append(".");

        return stringBuilder.toString();

    }

}
