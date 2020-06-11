#include <iostream>
using namespace std;


int main() {
    int t, i1, i2;
    cin >> t;
    while (t -- > 0) {
        cin >> i1 >> i2;

        if (i1 > i2) cout << ">";
        else if (i1 < i2) cout << "<";
        else cout << "=";

        cout << endl;
    }

    return 0;
}

