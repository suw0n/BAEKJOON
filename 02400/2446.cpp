#include <iostream>

using namespace std;

int main() {
    int n, m, l = -1;
    cin >> n, m = n*2+1;
    for(int z = 1; z<n*2; z++){
        m = z>n ? m+2 : m-2;
        l = z>n ? l-1 : l+1;
        for(int i = 1; i<=l; i++)
            cout << " ";
        for(int i = 1; i<=m; i++)
            cout << "*";
        cout << endl;
    }
}