package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1 ; i <=  10000 ; i++){ // we added numbers in arraylist
            numbers.add(i);
        }

        // created synchronized lists to store even and odd numbers
        List<Integer> evenNumber = Collections.synchronizedList(new ArrayList<Integer>());
        List<Integer> oddNumber = Collections.synchronizedList(new ArrayList<Integer>());

        int heapSize = 2500;

        List<Thread> threads = new ArrayList<>(); //  create a list to keep threads
        for (int i = 0 ; i < 4 ; i++){ //  created 4 threads in total
            int start = i * heapSize; // determined the starting index of the thread
            int end = (i + 1 ) * heapSize; // determined the ending index of the thread

            List<Integer> subList = numbers.subList(start,end);
            Thread thread = new Thread(new NumberProcessor(subList,evenNumber,oddNumber));
            threads.add(thread); //  adding the thread to the list
            thread.start(); // starting to thread
        }

        for (Thread thread : threads){  // waits for the thread in the loop to complete
            try {
                thread.join();
            }
            catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
        // print to odd numbers and even numbers list
        System.out.println("odd numbers : " + oddNumber);
        System.out.println("Even numbers : " + evenNumber);
    }
}
