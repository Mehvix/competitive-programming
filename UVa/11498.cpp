#include <iostream>
using namespace std;

int main() {
    int t = 0, x, y, i1, i2;
    cin >> t;
    while (t != 0) {
        cin >> x >> y;

        while (t-- > 0) {
            cin >> i1 >> i2;

            if (i1 == x || i2 == y) {
                cout << "divisa" << endl;
            } else {
                if (i2 > y) cout << "N";
                else cout << "S";

                if (i1 > x) cout << "E";
                else cout << "O";
                cout << endl;
            }
        }
        cin >> t;
    }

    return 0;
}

