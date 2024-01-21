package src.ders.ders6.akis001;

public class ForEach {
    public static void main(String[] args) {
/*        int[] array = {1, 8, 35, 3, 2, 4, 5, 6, 7};
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }*/

        String[][] matrix = {
                {"a", "b", "c" },
                {"d", "e", "f" }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("..................");

        for (String[] row : matrix){
            for (String element : row){
                System.out.print(element + " ");

            }
            System.out.println();
        }


    }
}
