import java.util.*;

public class HeartOfHearts
{
    public static void main(String[] args) 
    {
    
     var scan1 = new Scanner(System.in);
     var N = scan1.nextInt();
    
    
        if (N == 1) {
        System.out.println("♥♡♥");
        System.out.println("♡♥♡");
        }
        else if ( N!= 1)  //Top Part
        {
            int topWhites = N;
            int topMiddleBlack = N;
            int topSideBlack = N -1;
            while ( topSideBlack != 0) 
            {
                if (topMiddleBlack > 0)
                {
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                for (int i = 0 ; i < topWhites ; ++i) System.out.print("♥");
                for (int i = 0 ; i < topMiddleBlack ; ++i) System.out.print("♡");
                for (int i = 0 ; i < topWhites ; ++i) System.out.print("♥");
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                System.out.println();
                topSideBlack--;
                topMiddleBlack--;
                topMiddleBlack--;
                topWhites++;
                topWhites++;
                }
                else if (topMiddleBlack == 0)
                {
                 for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                 for (int i = 0 ; i < topWhites ; ++i) System.out.print("♥");
                 for (int i = 0 ; i < topWhites ; ++i) System.out.print("♥");
                 for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                 System.out.println();
                 topSideBlack--;
                 topMiddleBlack--;
                 topWhites++;
                 topWhites++;
                }
                // 4 even
                else if (N % 2 == 0)
                {
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                for (int i = 0 ; i < (topWhites + topWhites) - 2 ; ++i) System.out.print("♥"); 
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                System.out.println();
                topSideBlack--;
                topMiddleBlack--;
                topMiddleBlack--;
                topWhites++;
                }
                // 4 odd
                else
                {
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                for (int i = 0 ; i < (topWhites + topWhites) - 1 ; ++i) System.out.print("♥"); 
                for (int i = 0 ; i < topSideBlack ; ++i) System.out.print("♡");
                System.out.println();
                topSideBlack--;
                topMiddleBlack--;
                topMiddleBlack--;
                topWhites++;
                }

            }   

          }          
           // Bottom part
          
        int bottomWhites = 0;
        int bottomBlacks = N*5-2;
        while (bottomBlacks > 0 && N!=1)
        {
        for (int i = 0 ; i < bottomWhites ; ++i) System.out.print("♡");
        for (int i = 0 ; i < bottomBlacks ; ++i) System.out.print("♥");
        for (int i = 0 ; i < bottomWhites ; ++i) System.out.print("♡");
        System.out.println();
        bottomWhites++;
        bottomBlacks--;
        bottomBlacks--;
        }
    }
          
}
