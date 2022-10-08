#include <iostream>

using namespace std;

int main() {
    int n, k;
    while(true){
        int m = 0, re = 0;
        cin >> n  >> k;
        if(cin.eof())
            break;
        while(n){
            m += n, re += n, n = 0;
            while(m>=k)
                m-=k, n++;
        }
        cout << re << endl;
    }   
}