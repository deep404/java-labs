package com.company.lab4;
import java.io.File; //Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read the text files

public class Main {

    static boolean isCorrectExpression(String data) {

        Stack exp = new Stack(data.length());
        String expr = "";
        for (int i = 0; i < data.length(); i++) {
            char x = data.charAt(i);
            if(x=='(' || x=='[' || x== '{' || x==')' || x=='}' || x== ']')
                expr += x;
        }

        //Deque<Character> exp = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                //Push the element in the stack
                exp.push(x);
                continue;
            }

            //IF current character is not opening bracket, then is must
            // be closing. So stack cannot be empty at this point
            if (exp.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = exp.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case ']':
                    check = exp.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;

                case '}':
                    check = exp.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

            }
        }
        //Check Empty Stack
        return (exp.isEmpty());
        }

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\User\\Desktop\\POO\\java-labs\\src\\com\\company\\lab4\\all_expressions.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if (isCorrectExpression(data))
                    System.out.println("Expression is correct\n");
                else
                    System.out.println("Expression is wrong\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
