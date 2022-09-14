package JAVA.Java;

public class Pattern {
    public static void main(String[] args) {
        // for (int i=0; i<4; i++){
        //     for(int j=0; j<5;j++){
        //         if (i==0||i==3||j==0||j==4){
        //             System.out.print("*");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // String x="*";
        // for (int i=4; i>=1; i--){
        //     for (int j=1; j<=i;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
        // for (int i=1;i<=6;i++){
        //     for (int j=1;j<=5-i+1;j++)
        //         System.out.print(j);
        //     System.out.println();
		// }
        // int z=1;
		// for (int i=1;i<6;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(z+" ");
        //         z++;
        //     }System.out.println();
        // }
        // for (int i=1;i<6;i++){
        //     for (int j=1;j<=i;j++){
        //         int x=i+j;
        //         if(x%2==0)
        //             System.out.print("1");
        //         else
        //             System.out.print("0");
        //     }System.out.println();
		// }
        // int n=5;
		// for (int i=1;i<=n;i++){
        //     for (int j=4;j>=i;j--)
        //         System.out.print(" ");
        //     for (int j=1;j<=n;j++)  
        //         System.out.print("*");
        //     System.out.println();
		// }
        // int n=5;
	    // int z=1;
		// for (int i=1;i<=n;i++){
        //     for (int j=4;j>=i;j--)
        //         System.out.print(" ");
        //     for (int j=1;j<=i;j++)  
        //         System.out.print(z+" ");
        //     z++;
        //     System.out.println();
		// }
        int n=5;
	    int z=1;
		for (int i=1;i<=n;i++){
            for (int j=4;j>=i;j--)
                System.out.print(" ");
            for (int j=1;j<=i;j++){
                //System.out.print("/"+j);
                
                for(int x=i;x>=1;x--)
                    System.out.print(x);
                
                for(int x=2;x<=i;x++)
                    System.out.print(x);
                break;
		}
        System.out.println();
		}
    }
}
