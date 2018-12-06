public class Battleships_in_a_Board{
	public static void main(String[] args) {
		char[][] board={{'X','.','.','X'},
						{'.','.','.','X'},
						{'.','.','.','X'}};
		System.out.print(countBattleships(board));
	}
	public static int countBattleships(char[][] board) {
		if(board.length<=0||board[0].length<=0)
			return 0;
		int res=0, col=board[0].length, row=board.length;
		for(int i=0;i<row;i++){
			for(int j=0; j<col;j++){
				if(board[i][j]=='.'||(i>0&&board[i-1][j]=='X')||(j>0&&board[i][j-1]=='X'))
					continue;
				res++;
			}
		}
		return res;
    }
}