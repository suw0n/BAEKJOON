#include <iostream>

using namespace std;

int main() {
    int n, m, l;
    cin >> n, m = 0, l = n;
    for(int z = 1; z<n*2; z++){
        m = z>n ? m-1 : m+1;
        l = z>n ? l+1 : l-1;
        for(int i = 0; i<l; i++)
            cout << " ";
        for(int i = 0; i<m; i++)
            cout << "*";
        cout << endl;
    }
}