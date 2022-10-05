#include <iostream>

using namespace std;

int main() {
    int n, m = 0;
    cin >> n;
    for(int z = 1; z<n*2; z++){
        m = z>n ? m-1 : m+1;
        for(int i = 1; i<=m; i++)
            cout << "*";
        cout << endl;
    }
}