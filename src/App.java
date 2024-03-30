import java.util.Scanner;
import player.Player;
import board.Board;
import logic.Logic;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO N-QUEEENS GAME");
        System.out.println("Here place n number of queeens in safe position");
        System.out.println("Lets get started!!");
       
       
        System.out.println("Enter size of chess board");
        int n=sc.nextInt();
        Player player=new Player(n);
        System.out.println("Let me get player details");
        System.out.println("Name: ");
        player.setName(sc.next());
        System.out.println("Age: ");
        player.setAge(sc.nextInt());
        System.out.println("College Name: ");
        player.setCollegeName(sc.next());
        System.out.println("Contact:");
        player.setContact(sc.next());
        System.out.println("Email:");
        
        player.setEmail(sc.next());
        System.out.println("Once verify your details");
        player.getDetails();
        Board board=new Board(n);
        Logic logic=new Logic(board);
        System.out.println("Intial configuration:");
        board.getBoardConfig();
        boolean choice=true;
        while(choice){
            
            
               System.out.println("You are left with "+player.n+" queens");
               System.out.println("Options:");
               System.out.println("case 1 : Quit()");
               System.out.println("case 2 : setQueen()");
               System.out.println("case 3 : resetQueen()");
               System.out.println("case 4 : isSafe()");
               System.out.println("case 5 : isWinner()");
               System.out.println("case 6 : BoardConfiguration()");
               switch(sc.nextInt()){
                case 1:  System.out.println("If you want to quit game choose 1");
                          choice=false;
                         break;
               case 2:  board.setQueen(sc.nextInt(),sc.nextInt());
                         player.n--;
                         break;
                case 3: board.resetQueen(sc.nextInt(),sc.nextInt());
                            player.n++;
                break;
                case 4:  if(logic.isSafe(sc.nextInt(),sc.nextInt()))
                            System.out.println("All queens are safe");
                            else
                            System.out.println("May be queens are not in safe position");
                            break;
                case 5:   if(logic.isWinner())
                                 {
                                    System.out.println("Hooray you won the game");
                                    choice=false;
                                 }
                                 else
                                 System.out.println("Seems some mistake there");
                                    break;

                case 6:   board.getBoardConfig();
                           
                       
               }

        }

    }
}
