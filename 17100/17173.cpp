#include <iostream>

using namespace std;

int main(){
    int n, m, re = 0, arr[1000];
    cin >> n >> m;
    for(int i = 0; i<m; i++)
        cin >> arr[i];
    for(int i = 1; i<=n; i++)
        for(int j = 0; j<m; j++)
            if(!(i%arr[j]))
                re += i, j = m;
    cout << re;
}