/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class GradeMessage {
    public static void main (String[] args)
    {
        String decision = "unknown";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Is your grade good?");
        String answer = in.nextLine();
        if (answer.equals("Yes")){
            decision = "Grade: Excellent";
        }
        System.out.println("Calculating....");
        
        System.out.println(decision);
        in.close();
    }
}
