class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // for (char[] row : board) {
        //     Set<Character> seen = new HashSet<>();
        //     for (char num : row) {
        //         if (num != '.') {
        //             if (seen.contains(num)) {
        //                 return false;
        //             } else {
        //                 seen.add(num);
        //             }
        //         }

        //     }
        // }

        List<Set<Character>> squares = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            squares.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> col = new HashSet<>();
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (col.contains(board[j][i])) {
                        return false;
                    } else {
                        col.add(board[j][i]);
                    }
                } 
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }

                    int box = (i / 3) * 3 + (j / 3);
                    if (squares.get(box).contains(board[i][j])) {
                        return false;
                    } else {
                        squares.get(box).add(board[i][j]);
                    }
                } 



            }
        }

        // for (int i = 0; i < board.length; i++) {
        //     multiple *= 3;
        //     Set<Character> square = new HashSet<>();
        //     for (int j = 0; j < board.length; j++) {
        //         square.add(square[i % 3 + multiple][j % 3 + multiple]);
        //     }
        // }
        return true;

    }
}
