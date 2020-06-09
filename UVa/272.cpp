//https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208

#include <bits/stdc++.h>
using namespace std;

int main() {
    string in;
    bool open = false;

    while(getline(cin, in)) {
        string out;
        for (char i : in) {
            if (i == '"') {
                if (!open) out += "``";
                else out += "''";
                open = !open;
            } else {
                out += i;
            }
        }
        cout << out << endl;
    }
    return 0;
}

