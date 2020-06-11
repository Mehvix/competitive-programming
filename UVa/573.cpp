#include <iostream>
using namespace std;

int main() {
    double H, U, D, F;
    while(scanf("%lf %lf %lf %lf", &H, &U, &D, &F) == 4 && H!=0.0) {
        double x = 0.0;
        double change = U * (F / 100);
        int day = 0;

        while(true) {
            day ++;
            if(U > 0) x += U;
            U -= change;
            if(x > H) break;
            x -= D;
            if(x < 0) break;
        }

        if (x >= H) cout << "success on day " << day << endl;
        else cout << "failure on day " << day << endl;
    }

    return 0;
}

