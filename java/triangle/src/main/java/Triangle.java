class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 + side2 < side3
            || side1 + side3 < side2
            || side2 + side3 < side1
            || side1 == 0
            || side2 == 0
            || side3 == 0) {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    boolean isScalene() {
        return !(isEquilateral() || isIsosceles());
    }

}
//Solution in http://exercism.io/submissions/57176624635f4a5b9203fff4e3450ade :
//import java.util.List;
//        import java.util.Optional;
//        import java.util.function.Predicate;
//
//        import static java.util.Arrays.asList;
//
//class Triangle {
//
//    List<Double> triangle;
//
//    Triangle(double side1, double side2, double side3) throws TriangleException {
//        triangle = Optional.of(asList(side1, side2, side3))
//                .filter( legalTriangle )
//                .orElseThrow(() -> new TriangleException());
//    }
//
//    boolean isEquilateral() {
//        return triangle.stream().distinct().count() == 1;
//    }
//
//    boolean isIsosceles() {
//        return triangle.stream().distinct().count() < 3;
//    }
//
//    boolean isScalene() {
//        return triangle.stream().distinct().count() == 3;
//    }
//
//    private static Predicate<List<Double>> legalTriangle = l -> {
//        double sum = l.stream()
//                .mapToDouble(Double::doubleValue)
//                .sum();
//
//        return l.stream()
//                .allMatch(side ->
//                        (sum - side > side) && (side > 0));
//    };
//}