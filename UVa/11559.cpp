#include <iostream>
using namespace std;

int main() {
    int n, b, h, w;

    while (scanf("%d %d %d %d", &n, &b, &h, &w) == 4) {
        int lo = 500001;
        for (int i = 0; i < h; i++){
            int cost;
            cin >> cost;

            int rooms;
            for (int j = 0; j < w; j++){
                cin >> rooms;
                if (rooms >= n and n * cost <= b) lo = min(n*cost, lo);
            }

        }
        if (lo == 500001) cout << "stay home" << endl;
        else cout << lo << endl;
    }

    return 0;
}

