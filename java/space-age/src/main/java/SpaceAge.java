class SpaceAge {

    private static final long EARTH_TIME = 31557600L;
    private static final long MERCURY_TIME = 7600544L; // 0.2408467 * 31557600 = 7600544
    private static final long VENUS_TIME = 19414149L; //0.61519726 * 31557600 = 19414149
    private static final long MARS_TIME = 59354033L;
    private static final long JUPITER_TIME = 374355659L;
    private static final long SATURN_TIME = 929292363L;
    private static final long URANUS_TIME = 2651370019L;
    private static final long NEPTUNE_TIME = 5200418560L;

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double roundToTwoDigits(double doubleToRound) {
        return (double) Math.round(doubleToRound * 100) / 100;
    }

    double getAge(final long planetTime) {
        return roundToTwoDigits(getSeconds() / planetTime);
    }


    double onEarth() {
        return getAge(EARTH_TIME);
    }

    double onMercury() {
        return getAge(MERCURY_TIME);
    }

    double onVenus() {
        return getAge(VENUS_TIME);
    }

    double onMars() {
        return getAge(MARS_TIME);
    }

    double onJupiter() {
        return getAge(JUPITER_TIME);
    }

    double onSaturn() {
        return getAge(SATURN_TIME);
    }

    double onUranus() {
        return getAge(URANUS_TIME);
    }

    double onNeptune() {
        return getAge(NEPTUNE_TIME);
    }

}
