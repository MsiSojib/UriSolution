import java.util.Scanner;

public class Uri1190 {
    public static void main(String[] args) {
        double[][] doubleArray = new double[12][12];
        Scanner input = new Scanner(System.in);
        char processType;
        processType=input.next().charAt( 0 );
        for(byte i =0; i<12; i++){
            for(byte j=0; j<12; j++){
                doubleArray[i][j]=input.nextDouble();
            }
        }
        if(processType=='S'){
            double sum=0;
            byte jLoop=11;
            for(byte i =1; i<6; i++){
                for(byte j =jLoop; j<12 ; j++){
                    sum+=doubleArray[i][j];
                }
                jLoop--;
            }
            jLoop=7;
            for(byte i=6; i<11; i++){
                for(byte j=jLoop; j<12; j++){
                    sum+=doubleArray[i][j];
                }
                jLoop++;
            }
            System.out.printf("%.1f\n",sum);
        }
        else {
            double sum=0;
            int totalElement=0;
            byte jLoop=11;
            for(byte i =1; i<6; i++){
                for(byte j = jLoop; j<12 ; j++){
                    sum+=doubleArray[i][j];
                    totalElement++;
                }
                jLoop--;
            }
            jLoop = 7;
            for(byte i=6; i<11; i++){
                for(byte j=jLoop; j<12; j++){
                    sum+=doubleArray[i][j];
                    totalElement++;
                }
                jLoop++;
            }
            sum/=totalElement;
            System.out.printf("%.1f\n",sum);
        }

    }
}
