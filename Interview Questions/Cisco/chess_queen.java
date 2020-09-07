

/**
 * Can the queen attack the 
 * pawn?
 */

public static boolean canAttack(int q_row, int q_col, int u_row, int u_col){
	if(q_col == u_col || q_row == q_col) return true;

	for(int i=0; i<8; i++){
		if(q_row+i==u_row+i && q_col+i==u_col+i) return true;
	}

	return false;
}