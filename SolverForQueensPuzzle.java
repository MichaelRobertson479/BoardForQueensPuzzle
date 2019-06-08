import java.util.*;

public class SolverForQueensPuzzle {

	public static void main (String[] args) {
	
		BoardForQueensPuzzle board = new BoardForQueensPuzzle(8);
		solve(board);

	}

	public static void solve (BoardForQueensPuzzle board){

		//given a legally and fully filled board
		if (board.accept())
		System.out.println(board);

		//given illegally filled board
		else if (board.lastIsNg()){		
		//stop
		}


		//given a legally but partially filled board
		else {
			for (int file = 0; file < board.ranks(); file++) {
				BoardForQueensPuzzle copy = new BoardForQueensPuzzle(board.ranks());
				for (int rank = 0; rank <= board.lastRankFilled; rank++) {
					copy.populate(board.filesWithQueens[rank]);
				}
				copy.populate(file);
				solve(copy);
			}
		}
	}
}
				
				
			
			
			

		