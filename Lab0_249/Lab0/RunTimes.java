//import Algorithms.java;
import java.lang.*;

public class RunTimes
{
    public static void main(String args[])
        {
            long startTime, endTime, runTime;
            System.out.println("Logarithmic algorithm's running times:");

            for (int N = 1000; N<100000000; N=N*2){
               startTime = System.nanoTime();
               Algorithms.logarithmicAlgorithm(N);
               endTime = System.nanoTime();    
               runTime = (endTime-startTime)/(1000000);
               System.out.println("T(" + N + ") = " + runTime);
            }

            System.out.println("");
            System.out.println("Linear algorithm's running times:");

            for (int N = 1000; N<100000000; N=N*2){
               startTime = System.nanoTime();
               Algorithms.linearAlgorithm(N);
               endTime = System.nanoTime();
               runTime = (endTime-startTime)/(1000000);
               System.out.println("T(" + N + ") = " + runTime);
            } 

            System.out.println("");
            System.out.println("NlogN algorithm's running times:");

            for (int N = 1000; N<100000000; N=N*2){
               startTime = System.nanoTime();
               Algorithms.NlogNAlgorithm(N);
               endTime = System.nanoTime();
               runTime = (endTime-startTime)/(1000000);
               System.out.println("T(" + N + ") = " + runTime);
            }
 
            System.out.println("");
            System.out.println("Quadratic algorithm's running times:");

            for (int N = 1000; N<=512000; N=N*2){
               startTime = System.nanoTime();
               Algorithms.quadraticAlgorithm(N);
               endTime = System.nanoTime();
               runTime = (endTime-startTime)/(1000000);
               System.out.println("T(" + N + ") = " + runTime);
            }


            System.out.println("");
            System.out.println("Cubic algorithm's running times:");

            for (int N = 1000; N<=8000; N=N*2){
               startTime = System.nanoTime();
                Algorithms.cubicAlgorithm(N);
               endTime = System.nanoTime();
               runTime = (endTime-startTime)/(1000000);
               System.out.println("T(" + N + ") = " + runTime);
            }

            return;
        }
}
