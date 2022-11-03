import java.util.Scanner;

public class Test_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, width, i, j;
        System.out.print("height: ");
        height = sc.nextInt();
        System.out.print("width: ");
        width = sc.nextInt();

        for (i = 1; i <= height; i++){
            for (j = 1; j <= width; j++){
                if ( i==1 || height==i || j==width || j==1 ){
                    System.out.print("* ");
                }else {
                    System.out.print
                            ("  ");
                }
            }
            System.out.println();
        }
      sc.close();
    }
}
