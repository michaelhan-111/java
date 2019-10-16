public class Lab02 {
    public static void main(String[] args) {
        int[][] test = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int subtotal = 0;
        int total = 0;
        String oddeven;

        for (int row = 0; row < test.length; row++) {
            System.out.println();
            System.out.println("Row " + row + ":");
            for (int col = 0; col < test[row].length; col++) {
                System.out.println(test[row][col] + " ");
                //subtotal = 0;
                subtotal = subtotal + test[row][col];
            }
            if (subtotal % 2 == 0) {
                oddeven = "even";
            } else {
                oddeven = "odd";
            }
            System.out.print("Subtotal for row " + row + " is " + subtotal + ", and is " + oddeven + "." );
            System.out.println();
            total = total + subtotal;
            subtotal = 0;
        }
        System.out.println("Total:" + total);
    }
}
