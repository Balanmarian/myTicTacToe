public class MyTicTacToe {

     public static final char SYMBOL_X = `X`;
     public static final char SYMBOL_0 = `0`;

    public static final int GAME_SIZE = 3;


    char [] [] game = new char [GAME_SIZE][GAME_SIZE];

    Player player1;
    Player player2;

    public MyTicTacToe(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void showGame(){
        for (int i = 0; i < GAME_SIZE; i++){
            for (int j = 0; j< GAME_SIZE; i++)
        }
        System.out.print(game [i][j]);

    }

}
      public void initBoard(){
    for (int i = 0;i < GAME_SIZE; i++){
        for ( int j = 0;j < GAME_SIZE;i=j++){
            game[i][j]= `.`;
        }
    }

     public boolean isWin(){
        //testez linii
        //testez coloane

          }

     public void playGame() {
        initBoard();
        System.out.println(" incepe jocul ");
        showGame();



        Player currentPlayer = player1;
        int nrMoves = 0;
        boolean isWin = false ;

        while(isWin == false && nrMoves < 9){

            //citesc mutare
            //validez mutare
            //efectuez mutare
            //numar mutare
        }
     }
}