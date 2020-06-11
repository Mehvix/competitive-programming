#include <iostream>

using namespace std;


int main() {
    int t = 0, n, p, r;
    float d, calc, bestReq, bestCost;
    string line, name, bestName;

    while (true) {
        t++;
        scanf("%d %d\n", &n, &p);  // need \n
        if(n == 0 and p == 0) break;
        if(t > 1) cout << endl;
        for(int i = 0; i < n; i++) getline(cin, line);  // don't care about names

        bestReq = 0.0;
        bestCost = 9999999;
        for(int i = 0; i < p; i++) {
            getline(cin, name);
            scanf("%f %d\n", &d, &r);  // need \n
            for(int j = 0; j < r; j++) getline(cin, line);  // don't care about names
            calc = (float) r / (float) p;
            if(calc > bestReq or (calc == bestReq and d < bestCost)) {
                bestReq = calc;
                bestCost = d;
                bestName = name;
            }
        }
        cout << "RFP #" << t << endl;
        cout << bestName << endl;
    }
}
