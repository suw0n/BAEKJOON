#include <iostream>

using namespace std;

int gcd(int a, int b){
    if(!b)
        return a;
    return gcd(b, a%b);
}

int main() {
    int t, n;
    cin >> t;
    while(t--){
        int arr[100];
        long long int re = 0;
        cin >> n;
        for(int i = 0; i<n; i++)
            cin >> arr[i];
        for(int i = 0; i<n-1; i++)
            for(int j = i+1; j<n; j++)
                re+=gcd(arr[i], arr[j]);
        cout << re << "\n";
    }
}