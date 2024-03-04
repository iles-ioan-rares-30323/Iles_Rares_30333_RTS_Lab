public class Main {
    public static void main(String[] args) {

        int i,j;
        int[][] x = {{2,3,1},{7,1,6},{9,2,4}};
        int[][] y = {{8,5,3},{3,9,2},{2,7,3}};

        int[][] z = new int[3][3];

        for(i = 0;i<3;i++)
            for(j = 0;j<3;j++)
                z[i][j] = x[i][j] + y[i][j];


        System.out.println("The sum of the matrices is:");
            for(i = 0;i<3;i++)
                for(j = 0;j<3;j++)
            {System.out.print(z[i][j] + " ");
                if(j==2) System.out.println();}

        for(i = 0;i<3;i++)
            for(j = 0;j<3;j++)
                z[i][j] = x[i][0] * y[0][j] + x[i][1] * y[1][j] + x[i][2] * y[2][j];


        System.out.println("The product of the matrices is:");
        for(i = 0;i<3;i++)
            for(j = 0;j<3;j++)
            {System.out.print(z[i][j] + " ");
                if(j==2) System.out.println();}
    }
}