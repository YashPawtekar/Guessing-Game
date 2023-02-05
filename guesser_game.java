import java.util.*;

class Guesser {

    int guesserNum;

    int guesser() {
        System.out.println("Guesser guess this number : -");
        Scanner scan = new Scanner(System.in);
        guesserNum = scan.nextInt();
        return guesserNum;
    }
}

class Player {
    int playerNum;

    int player() {
        System.out.println("Player guess any number : -");
        Scanner scan = new Scanner(System.in);
        playerNum = scan.nextInt();
        return playerNum;
    }
}

class Umpire{
    int numfromGusser;
    int numfromplayerNum1;
    int numfromplayerNum2;
    int numfromplayerNum3;
  
    void collectNumGusser(){
        Guesser g= new Guesser();
        numfromGusser = g.guesser();
    }
    void colletNumPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numfromplayerNum1 = p1.player();
        numfromplayerNum2 = p2.player();
        numfromplayerNum3 = p3.player();
    }
    void compareNumber(){
     if(numfromGusser == numfromplayerNum1){
        if(numfromGusser == numfromplayerNum2){
            if(numfromGusser == numfromplayerNum3){
                System.out.println("All player are Winner . . . ");
            }else{
                System.out.println("Player 1 and Player 2 is the Winner . . . "); 
            }
        }else{
            System.out.println("Player 1 is the Winner . . . ");
        }
         
     }else if(numfromGusser == numfromplayerNum2){
        if(numfromGusser == numfromplayerNum3){
            System.out.println("Player 2 and Player 3 is the Winner . . . "); 
        }else{
            System.out.println("Player 2 is the Winner . . . ");
        }
        
     }else if(numfromGusser == numfromplayerNum3){
        System.out.println("Player 3  is the Winner . . . "); 
     }else{
        System.out.println("Game is loss . . .");
     }
    }

}

class Start{
  public static void main(String[] args){
    Umpire u= new Umpire();
    u.collectNumGusser();
    u.colletNumPlayer();
    u.compareNumber();
  }
}