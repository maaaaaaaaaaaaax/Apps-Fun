
public class Tents {

    char[][] board = new char[6][6];
    char[] Marks = new char [3];
    
    public Tents(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                board[i][j] = ' ';
            }
        }
 
        Marks[0] = 'B'; // = Baum
        Marks[1] = 'T'; // = Tent
 
    }

    private void resetGame(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                board[i][j] = ' ';
            }
        }
    }

    private boolean hasWon(){
    //ToDo
    return true;
    }

    public void play(int i, int j){
        char symbol = 'T';

        if (board[i][j] == ' ') {
            // Zeichen von aktuellem Spieler setzen
            board[i][j] = symbol;
            // Brett ausgeben
            printBoard(board);
            // Sieg Ã¼berprÃ¼fen
            /**if (hasWon()) {
                resetGame();
                System.out.println("Spieler " + symbol + " hat gewonnen!");
            }
            */ //BrettfÃ¼lle Ã¼berprÃ¼fen
           // if (isBoardFull(board)) {
            //    resetGame();
            //    System.out.println("Unentschieden");
            //}
           
        }
    }

    // prueft ob das gesamte Spielfeld mit den Zeichen der Spieler gefuellt ist.
    // wenn ja gib true zurueck, andernfalls false
    private boolean isBoardFull(char[][] board) {
        boolean isFull = true;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(board[i][j] == ' ') isFull = false;
            }
        }
        return isFull;
    }
     
    // gibt den aktuellen Zustand des Spielfeldes auf der Konsole aus.
    private void printBoard(char[][] board) {
        String fieldVis = "";
        // zeichne Spielfeld
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(j != 6) fieldVis += "|";
                fieldVis += " " + board[i][j] + " ";
                
            }
            fieldVis += "|" + "\n";
            if(i != 6) fieldVis += "-------------------------\n";
        }
        System.out.println(fieldVis);
    }

    public static void main(String[] args) {
 
        Tents tent = new Tents();
 
        // DER CODE KANN AUSKOMMENTIERT WERDEN SOBALD AUFGABE A BEARBEITET WURDE
 
        System.out.println("\n--- Spiel 1 ---\n");
        tent.printBoard(tent.board);
    }
    
}
