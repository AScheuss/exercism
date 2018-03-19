class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String asString = String.valueOf(numberToCheck);

		int numberOfDigits = asString.length();

		Integer result = asString.chars()
				.map(Character::getNumericValue)
				.map(i -> (int) Math.pow(i, numberOfDigits))
				.sum();

		return result == numberToCheck;
	}

}
