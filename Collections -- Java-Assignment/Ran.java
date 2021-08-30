// Write a program that prints its arguments in random order. 
// Do not make a copy of the argument array. 
// Demonstrate  how to print out the elements using both streams and the traditional enhanced for statement.

import java.util.*;

public class Ran {

    public static void main(String[] args) {
        
        
        List<String> tempList = Arrays.asList(args);
        Collections.shuffle(tempList);
        tempList.stream()
        .forEach(e->System.out.format("%s ",e));
        for (String arg: tempList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}
