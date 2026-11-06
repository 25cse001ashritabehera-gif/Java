// Experiment 5 – Q4: Interface NumberPrinter

import java.util.*;

interface NumberPrinter {
    void printNumber(Integer num);
}

class Display implements NumberPrinter {
    public void printNumber(Integer num) {
        System.out.println("Number: " + num);
    }
}

public class NumberPrinterDemo {
    public static void main(String[] args) {

        Display d = new Display();

        d.printNumber(100);
    }
}
