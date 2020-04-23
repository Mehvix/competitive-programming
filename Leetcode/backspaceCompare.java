import java.util.*;

class Solution {
    StringBuilder newS = new StringBuilder();
    StringBuilder newT = new StringBuilder();
    // retrospect, you maybe could do something with 2 pointers for each string that may be faster...
    for (char i: S.toCharArray()){
        if (i == '#'){
            if (newS.length() > 0) {
                newS = new StringBuilder(newS.substring(0, newS.length() - 1));
            }
        } else {
            newS.append(i);
        }
    }
    for (char i: T.toCharArray()){
        if (i == '#'){
            if (newT.length() > 0) {
                newT = new StringBuilder(newT.substring(0, newT.length() - 1));
            }
        } else {
            newT.append(i);
        }
    }
    return newS.toString().equals(newT.toString());
}