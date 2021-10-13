public class Midterm {
    public static void main (String[] args) {
        // Check whether at least the number of rows and columns is provided
        if (args.length > 1) {
            int row = Integer.parseInt(args[0]);
            int col = Integer.parseInt(args[1]);
    
            // Create a 2D array
            double[][] arr = new double[row][col];
            
            // Given values start from index 2
            int currIndex = 2;

            // Insert given value (based on args index) to the array
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    // Check if the current index is not out of bound
                    if (currIndex < args.length) {
                        // Check if the value is a float or "blank"
                        if (args[currIndex].equals("blank")) {
                            arr[i][j] = 0.0;
                        }
                        else {
                            arr[i][j] = Double.parseDouble(args[currIndex]);
                        }

                        // Increment current index, check the next value (if available)
                        ++currIndex;
                    }
                    // Assign 0.0 if no additional value is given
                    else {
                        arr[i][j] = 0.0;
                    }
                }
            }

            // Compute the average of each row and print out the results
            for (int i = 0; i < row; ++i) {
                double sum = 0.0;

                System.out.print("| ");
                for (int j = 0; j < col; ++j) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("| ");

                double average = sum / col;
                System.out.println(average);
            }
        }
        else {
            System.out.println("Expected input: row col list_of_values");
        }      
    }
}
