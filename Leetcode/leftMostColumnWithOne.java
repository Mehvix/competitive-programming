import java.util.*;

// This is the BinaryMatrix's API interface.
// You should not implement it, or speculate about its implementation
interface BinaryMatrix {
    public int get(int x, int y);
    public List<Integer> dimensions = null;
};

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int rowSize = binaryMatrix.dimensions().get(0) - 1;
        int colSize = binaryMatrix.dimensions().get(1) - 1;
        int pointerRow = 0;
        int pointerCol = colSize;
        while (pointerRow <= rowSize && pointerCol >= 0){
            if (binaryMatrix.get(pointerRow, pointerCol) == 1){
                pointerCol --;
            }
            else {
                pointerRow ++;
            }
        }
        if (pointerCol == colSize){
            return -1;
        } else {
            return pointerCol + 1;
        }
    }
}