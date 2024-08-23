package July.ex27072024;

public class Lab149 {
    public static void main(String[] args) {
        int[][] array_2d = {{11, 12, 13},
                            {14, 15, 16},
                            {17, 18, 19}};

        for(int i = 0; i < array_2d.length; i ++) {
            for(int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
