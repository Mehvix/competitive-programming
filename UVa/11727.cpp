#include <iostream>
using namespace std;

int main() {
    int t, x, y, z;
    cin >> t;

    for (int i = 1; i < t+1; i++) {
        cin >> x >> y >> z;
        cout << "Case " << i << ": " << min(min(max(x,y), max(y,z)), min(max(y,z), max(x,z))) << endl;
    }

    return 0;
}

