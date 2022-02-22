package twodimensional;

public class TwoDimension {
    public static void main(String[] args) {
        // create a two-dimensional array (literal syntax)
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // get the sum of the first row?
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        System.out.println(firstRowSum);

        // get the number rows?
        System.out.println(data.length);

        // get the number of cols in the first row
        System.out.println(data[0].length);

        // create a two-dimensional array with the size
        String[][] students = new String[6][3];
        students[0][0] = "Keiji";
        students[0][1] = "Derrick";
        students[0][2] = "Misato";
        students[1][0] = "Koki";
        students[1][1] = "David";
        students[1][2] = "Alex";
        students[2][0] = "Masayuki";
        students[2][1] = "Cybill";
        students[2][2] = "Victor";
        students[3][0] = "Yusuke K";
        students[3][1] = "Guilherme";
        students[3][2] = "Yusuke I";
        students[4][0] = "Joao";
        students[4][1] = "Pedro";
        students[4][2] = "Helena";
        students[5][0] = "Kaiya";
        students[5][1] = "Eduardo";
        students[5][2] = "Clelia";

        // loop over students to print their name
        // for each row,
        //     for each col
        for (int r = 0; r < students.length; r++) {
            for (int c = 0; c < students[r].length; c++) {
                System.out.print(students[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("=============================");

        // for-each loop
        for (String[] row : students) {
            for (String student : row) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
