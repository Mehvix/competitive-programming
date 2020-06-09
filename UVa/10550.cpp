//https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3565

#include <iostream>
using namespace std;


int main() {
    int i0, i1, i2, i3;

    while (scanf("%d %d %d %d", &i0, &i1, &i2, &i3) == 4) {
        int sum = 0;

        // turn the dial clockwise 2 full turns
        sum += 40 * 2;

        // stop at the first number of the combination
        sum += i0 - i1;
        if (i0 < i1) sum += 40;

        // turn the dial counter-clockwise 1 full turn
        sum += 40;

        // continue turning counter-clockwise until the 2nd number is reached
        sum += i2 - i1;
        if (i1 > i2) sum += 40;

        // turn the dial clockwise again until the 3rd number is reached
        sum += (i2 - i3);
        if (i2 < i3) sum += 40;

        cout << ((sum/40) * 360) << endl;
    }
    return 0;


}