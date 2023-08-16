package org.example;

import java.util.List;

public class NumberProcessor implements Runnable {

    private List<Integer> inputList;
    private List<Integer> evenNumber;
    private List<Integer> oddNumber;

    public NumberProcessor(List<Integer> inputList, List<Integer> evenNumber, List<Integer> oddNumber) {
        this.inputList = inputList;
        this.evenNumber = evenNumber;
        this.oddNumber = oddNumber;
    }


    @Override
    public void run() {
        for (Integer number : inputList){
            if (number % 2 == 0){
                evenNumber.add(number);
            }
            else {
                oddNumber.add(number)   ;
            }
        }
    }
}
