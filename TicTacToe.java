import java.util.*;
import java.io.*;
import java.awt.*;
public class TicTacToe{
    private static String[] grid; 
    private static String turn;
    private static String turn2;
    private static String turn3;

    
    
    
    public static String findWinner() 
    { 
        for (int i = 0; i < 8; i++) { 
            String win = null; 
           
  
            switch (i) { 
            case 0: 
                win = grid[0] + grid[1] + grid[2]; 
                break; 
            case 1: 
                win = grid[3] + grid[4] + grid[5]; 
                break; 
            case 2: 
                win = grid[6] + grid[7] + grid[8]; 
                break; 
            case 3: 
                win = grid[0] + grid[3] + grid[6]; 
                break; 
            case 4: 
                win = grid[1] + grid[4] + grid[7]; 
                break; 
            case 5: 
                win = grid[2] + grid[5] + grid[8]; 
                break; 
            case 6: 
                win = grid[0] + grid[4] + grid[8]; 
                break; 
            case 7: 
                win = grid[2] + grid[4] + grid[6]; 
                break; 
            } 
           
            if (win.equals("XXX")) { 
                return "X"; 
            } 
              
           
            else if (win.equals("OOO")) { 
                return "O"; 
            } 
        } 
          
        for (int i = 0; i < 9; i++) { 
            if (Arrays.asList(grid).contains( 
                    String.valueOf(i + 1))) {
                        break; 
                 
            } 
            else if (i == 8) { 
                return "draw";
                
                
                 
            } 
        } 
  
      
        System.out.println( 
            turn + "'s turn; enter a slot number to place "
            + turn + " in:"); 
        return null; 
    } 
      
    
    
    static void printGameBoard() 
    { 
        System.out.println("|---|---|---|"); 
        System.out.println("| " + grid[0] + " | "
                           + grid[1] + " | " + grid[2] 
                           + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + grid[3] + " | "
                           + grid[4] + " | " + grid[5] 
                           + " |"); 
        System.out.println("|-----------|"); 
        System.out.println("| " + grid[6] + " | "
                           + grid[7] + " | " + grid[8] 
                           + " |"); 
        System.out.println("|---|---|---|"); 
    } 
  
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Welcome to the game!");
        System.out.println("Player 1 enter your name: ");
        String p1 = in.nextLine();
        System.out.println("Player 2 enter your name: ");
        String p2 = in.nextLine();
        grid = new String[9]; 
        turn = "X"; 
        String winner = null; 
  
        for (int i = 0; i < 9; i++) { 
            grid[i] = String.valueOf(i + 1); 
        } 
  
        System.out.println("Welcome to the first level " + p1 +" and " + p2 +"!!!"); 
        printGameBoard(); 
  
        System.out.println( 
            "Player 1 please enter your num : "); 
  
        while (winner == null) { 
            int num; 
            
            try { 
                num = in.nextInt(); 
                if (!(num > 0 && num <= 9)) { 
                    System.out.println( 
                        "Invalid num;  please re-enter a number:"); 
                    continue; 
                } 
            } 
            catch (InputMismatchException e) { 
                System.out.println( 
                    "Invalid num; please re-enter a number:"); 
                continue; 
            } 
              
            
            if (grid[num - 1].equals( 
                    String.valueOf(num))) { 
                grid[num - 1] = turn; 
  
                if (turn.equals("X")) { 
                    turn = "O"; 
                } 
                else { 
                    turn = "X"; 
                } 
  
                printGameBoard(); 
                winner = findWinner(); 
            } 
            else { 
                System.out.println( 
                    "Slot already taken; re-enter another number:"); 
            } 
        } 
        
        
        if (winner.equalsIgnoreCase("draw")) { 
           System.out.println( 
                "It's a tie!"); 
              
                
                
        } 
        
        
        else { 
            System.out.println( 
                "Congratulations! " + winner 
                + "'s have won! Thanks for playing and welcome to the next level."); 
        } 
        Scanner sc = new Scanner(System.in); 
        grid = new String[16]; 
        turn2 = "X"; 
        String winner2 = null; 
  
        for (int j = 0; j < 16; j++) { 
            grid[j] = String.valueOf(j + 1); 
        } 
  
        System.out.println("Welcome to the second level"); 
        printGameBoard2(); 
  
        System.out.println( 
            "X will play first. Enter a slot number to place X in:"); 
  
        while (winner2 == null) { 
            int num2; 
            
            try { 
                num2 = sc.nextInt(); 
                if (!(num2 > 0 && num2 <= 16)) { 
                    System.out.println( 
                        "Invalid num; re-enter slot number:"); 
                    continue; 
                } 
            } 
            catch (InputMismatchException e) { 
                System.out.println( 
                    "Invalid num; re-enter slot number:"); 
                continue; 
            } 
              
            
            if (grid[num2 - 1].equals( 
                    String.valueOf(num2))) { 
                        grid[num2 - 1] = turn2; 
  
                if (turn2.equals("X")) { 
                    turn2 = "O"; 
                } 
                else { 
                    turn2 = "X"; 
                } 
  
                printGameBoard2(); 
                winner2 = find2ndWinner(); 
            } 
            else { 
                System.out.println( 
                    "Slot already taken; re-enter slot number:"); 
            } 
        } 
        
        
        if (winner2.equalsIgnoreCase("draw")) { 
            System.out.println( 
                "It's a tie!"); 
        } 
        
        
        else { 
            System.out.println( 
                "Congratulations! " + winner2 
                + "'s have won! "); 
        } 
        Scanner ken = new Scanner(System.in); 
        grid = new String[25]; 
        turn3 = "X"; 
        //String line3 = "X";
        String winner3 = null; 
  
        for (int k = 0; k < 25; k++) { 
            grid[k] = String.valueOf(k + 1); 
        } 
  
        System.out.println("Welcome to the third level"); 
        printGameBoard3(); 
  
        System.out.println( 
            "Player 1 please enter your slot:"); 
  
        while (winner3 == null) { 
            int num3; 
            
            try { 
                num3 = sc.nextInt(); 
                if (!(num3 > 0 && num3 <= 25)) { 
                    System.out.println( 
                        "Invalid input; re-enter slot number:"); 
                    continue; 
                } 
            } 
            catch (InputMismatchException e) { 
                System.out.println( 
                    "Invalid input; re-enter slot number:"); 
                continue; 
            } 
              
            
            if (grid[num3 - 1].equals( 
                    String.valueOf(num3))) { 
                        grid[num3 - 1] = turn3; 
  
                if (turn3.equals("X")) { 
                    turn3 = "O"; 
                } 
                else { 
                    turn3 = "X"; 
                } 
  
                printGameBoard3(); 
                winner3 = find3rdWinner(); 
            } 
            else { 
                System.out.println( 
                    "Slot already taken; re-enter slot number:"); 
            } 
        } 
        
        
        if (winner3.equalsIgnoreCase("draw")) { 
            System.out.println( 
                "It's a draw! Thanks for playing."); 
        } 
        
        
        else { 
            System.out.println( 
                "Congratulations! " + winner3
                + "'s have won! Thanks for playing and welcome to the next level."); 
        } 



    }  public static String find2ndWinner() 
    { 
        for (int j = 0; j < 15; j++) { 
            String win2= "X"; 
  
            switch (j) { 
            case 0: 
                win2 = grid[0] + grid[1] + grid[2] + grid[3]; 
                break; 
            case 1: 
                win2 = grid[4] + grid[5] + grid[6] + grid[7]; 
                break; 
            case 2: 
                win2 = grid[8] + grid[9] + grid[10] + grid[11]; 
                break; 
            case 3: 
                win2 = grid[12] + grid[13] + grid[14] + grid[15]; 
                break; 
            case 4: 
                win2 = grid[0] + grid[4] + grid[8] + grid[12]; 
                break; 
            case 5: 
                win2 = grid[1] + grid[5] + grid[9] + grid[13]; 
                break; 
            case 6: 
                win2 = grid[2] + grid[6] + grid[10] + grid[14]; 
                break; 
            case 7: 
                win2 = grid[3] + grid[7] + grid[11] + grid[15]; 
                break; 
            case 8: 
                win2 = grid[0] + grid[5] + grid[10] + grid[15]; 
                break; 
            case 9: 
                 win2 = grid[3] + grid[6] + grid[9] + grid[12]; 
                break; 
            
            } 
           
            if (win2.equals("XXXX")) { 
                return "X"; 
            } 
              
           
            else if (win2.equals("OOOO")) { 
                return "O"; 
            } 
        } 
          
        for (int j = 0; j < 16; j++) { 
            if (Arrays.asList(grid).contains( 
                    String.valueOf(j + 1))) { 
                break; 
            } 
            else if (j == 15) { 
                return "draw"; 
                
            } 
        } 
  
      
        System.out.println( 
            turn2 + "'s turn; enter a slot number to place "
            + turn2 + " in:"); 
        return null; 
    } 
      
    
    
    static void printGameBoard2() 
    { 
        System.out.println("|----|----|----|----|"); 
        System.out.println("|  " + grid[0] + " |  "
                           + grid[1] + " | " + grid[2] 
                           + "  |  " + grid[3] + " |"); 
        System.out.println("|-------------------|"); 
        System.out.println("|  " + grid[4] + " |  "
                           + grid[5] + " | " + grid[6] 
                           + "  |  " + grid[7] + " |"); 
        System.out.println("|-------------------|"); 
        System.out.println("|  " + grid[8] + " | "
                           + grid[9] + " | " + grid[10] 
                           + " | " + grid[11] + " |"); 
        System.out.println("|-------------------|");
        System.out.println("| " + grid[12] + " | "
                           + grid[13] + " | " + grid[14] 
                           + " | " + grid[15] + " |"); 
        System.out.println("|----|----|----|----|");    
    }
    public static String find3rdWinner() 
    { 
        for (int j = 0; j < 15; j++) { 
            String win3= "X"; 
  
            switch (j) { 
            case 0: 
                 win3 = grid[0] + grid[1] + grid[2] + grid[3]+ grid[4]; 
                break; 
            case 1: 
                win3 = grid[5] + grid[6] + grid[7] + grid[8] + grid[9]; 
                break; 
            case 2: 
                win3 = grid[10] + grid[11] + grid[12] + grid[13] + grid[14]; 
                break; 
            case 3: 
                win3 = grid[15] + grid[16] + grid[17] + grid[18] + grid[19]; 
                break; 
            case 4: 
                win3 = grid[20] + grid[21] + grid[22] + grid[23] + grid[24]; 
                break; 
            case 5: 
                win3 = grid[0] + grid[5] + grid[10] + grid[15] +  grid[20]; 
                break; 
            case 6: 
                win3 = grid[1] + grid[6] + grid[11] + grid[16] +  grid[21]; 
                break; 
            case 7: 
                win3 = grid[2] + grid[7] + grid[12] + grid[17] +  grid[22]; 
                break; 
            case 8: 
                win3 = grid[3] + grid[8] + grid[13] + grid[18] + grid[23];; 
                break; 
            case 9: 
                win3 = grid[4] + grid[9] + grid[14] + grid[19] + grid[24];; 
                break; 
            case 10: 
                win3 = grid[0] + grid[6] + grid[12] + grid[18] + grid[24];; 
                break; 
            case 11: 
                win3 = grid[4] + grid[8] + grid[12] + grid[16] + grid[20];; 
                break; 
            
            } 
           
            if (win3.equals("XXXXX")) { 
                return "X"; 
            } 
              
           
            else if (win3.equals("OOOOO")) { 
                return "O"; 
            } 
        } 
          
        for (int k = 0; k < 25; k++) { 
            if (Arrays.asList(grid).contains( 
                    String.valueOf(k + 1))) { 
                break; 
            } 
            else if (k == 24) { 
                return "draw"; 
                
            } 
        } 
  
      
        System.out.println( 
            turn3 + "'s turn; enter a slot number to place "
            + turn3 + " in:"); 
        return null; 
    } 
      
    
    
    static void printGameBoard3() 
    { 
        System.out.println("|----|----|----|----|---|"); 
        System.out.println("|  " + grid[0] + " |  "
                           + grid[1] + " | " + grid[2] 
                           + "  |  " + grid[3] + " | "+ grid[4] + " | "); 
        System.out.println("|-----------------------|"); 
        System.out.println("|  " + grid[5] + " |  "
                           + grid[6] + " | " + grid[7] 
                           + "  |  " + grid[8] + " |"+grid[9] + " |"); 
        System.out.println("|-----------------------|"); 
        System.out.println("|  " + grid[10] + "| "
                           + grid[11] + " | " + grid[12] 
                           + " | " + grid[13] + " |"+ grid[14] + " |"); 
        System.out.println("|-----------------------|");
        System.out.println("| " + grid[15] + " | "
                           + grid[16] + " | " + grid[17] 
                           + " | " + grid[18] + " |"+ grid[19] + " |"); 
        System.out.println("------------------------|");    
        System.out.println("| " + grid[20] + " | "
                           + grid[21] + " | " + grid[22] 
                           + " | " + grid[23] + " |"+ grid[24] + " | "); 
        System.out.println("|----|----|----|----|---|");   
        
    }  
    } 
    
  
   
    

      
