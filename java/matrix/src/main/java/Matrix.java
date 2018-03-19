import java.util.Arrays;

class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) {
        String[] split = matrixAsString.split(System.lineSeparator());
        matrix = new int[split.length][split[0].split(" ").length];
        int index = 0;
        for (String s : split) {
            String[] numbers = s.split(" ");
            int index2 = 0;
            for (String number : numbers) {
                matrix[index][index2] = Integer.valueOf(number);
                index2++;
            }
            index++;
        }

    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix).mapToInt(ints -> ints[columnNumber]).toArray();
    }

    int getRowsCount() {
        return matrix.length;
    }

    int getColumnsCount() {
        return matrix[0].length;
    }
}
