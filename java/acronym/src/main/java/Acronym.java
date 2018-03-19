class Acronym {

    private String acronym = "";

    Acronym(String phrase) {
        String upperCasePhrase = phrase.toUpperCase();
        String[] split = upperCasePhrase.split(".[ -]");

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split) {
             stringBuilder.append(s.charAt(0));
        }
        this.acronym = stringBuilder.toString();
    }

    String get() {
        return this.acronym;
    }

}
