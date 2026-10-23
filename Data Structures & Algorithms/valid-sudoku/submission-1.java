class Solution {
    public boolean isValidSudoku(char[][] board) {
        // For row check
        for(int i = 0; i < 9; i++){
        HashSet<Character> row = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j]!='.'){
                    if(!row.add(board[i][j])){
                        return false;
                    }
                }
            }
        }

        // For Column Check
        for(int i = 0; i < 9; i++){
        HashSet<Character> column = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i]!='.'){
                    if(!column.add(board[j][i])){
                        return false;
                    }
                }
            }
        }

        // For Particular box check
        for(int rs = 0; rs < 9; rs+=3){
            for(int cs = 0; cs < 9; cs+=3){
                HashSet<Character> set = new HashSet<>();
                for(int j = rs; j < rs+3; j++){
                    for(int k = cs; k < cs+3; k++){
                        if(board[j][k]!='.'){
                            if(!set.add(board[j][k])){
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
