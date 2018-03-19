class RnaTranscription {

    String transcribe(String dnaStrand) {
		StringBuilder rnaBuilder = new StringBuilder();
		String[] split = dnaStrand.split("");

		
		for (String s : split) {
			switch (s) {
			case "T":
				rnaBuilder.append("A");
				break;
			case "A":
				rnaBuilder.append("U");
				break;
			case "G":
				rnaBuilder.append("C");
				break;
			case "C":
				rnaBuilder.append("G");
				break;
			}
		}
    	return rnaBuilder.toString();
    }

}
