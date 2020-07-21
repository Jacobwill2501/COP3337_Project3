
//=============================================================================
// PROGRAMMER: Jacob Williams
// PANTHER ID: 6182345
//
// CLASS: COP3337
// SECTION: RVDC
// SEMESTER: Summer 2020
// CLASSTIME: Online
//
// Project: Project 3
// DUE: July 12, 2020 11:59 pm
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this 
//                work is my own and that none of it is the work of any other person.
//=============================================================================

package app;

import java.util.ArrayList;
import java.util.Arrays;

/*
Group 5 Sequence
---------------------------------------------
1, 1, 2, 8, 1, 52, -43, 353, -557, 2578, -5470, 19931, -49166, 159697, -425707, 1305737, -3622130, 10792996, -30556483, 89723036
*/

public class Controller{
    
    protected static int q,r,s;
    
    public static void main(String[] args){
        
        ArrayList<Integer> givenSequence = new ArrayList<>(Arrays.asList(1, 1, 2, 8, 1, 52, -43, 353, -557, 2578, -5470, 19931, -49166, 159697, -425707, 1305737, -3622130, 10792996, -30556483, 89723036));
        ArrayList<Integer> newSequence = new ArrayList<>();
        
        for(q = -10; q < 11; q++){
            for(r = -10; r <11; r++){ 
                for(s = -10; s < 11; s++){
                    newSequence.clear();
                    for(int i = 1;i < 21; i++){
                        newSequence.add(newFib(i));
                    }
                    if(givenSequence.equals(newSequence)){
                        System.out.println("The given sequence: " + givenSequence);
                        System.out.println("The found sequence: " + newSequence);
                        System.out.println("\nX is: " + q);
                        System.out.println("Y is: " + r);
                        System.out.println("Z is: " + s);
                    } 
                }
            }
        }
    }
    
    public static int newFib(int n){
        
        int x = q;
        int y = r;
        int z = s;
        
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                break;
        }
       
        return (((newFib(n-1))*x)+((newFib(n-2))*y)+((newFib(n-3))*z));
    }
}

