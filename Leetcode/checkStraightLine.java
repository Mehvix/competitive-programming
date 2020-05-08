import java.util.*;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 1){return false;}
        else if(coordinates.length == 2){return true;}
        else {
            double lastX = coordinates[1][0];
            double lastY = coordinates[1][1];
            double slope = (lastX - coordinates[0][0])/(lastY - coordinates[0][1]);
            boolean vertical = Double.isInfinite(slope);
            for (int i = 2; i < coordinates.length; i++) {
                int[] coordinate = coordinates[i];
                double curX = coordinate[0];
                double curY = coordinate[1];

                if(vertical) {
                    if (curY != lastY) {
                        return false;
                    }
                } else if (curX - lastX != slope*(curY - lastY)){return false;}
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, -5}, {1, 7}}));
    }
}