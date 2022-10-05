#include <iostream>
#include <algorithm>

using namespace std;

bool comp(int a, int b){
    return a>b;
}

int main() {
    int a, b, arr[4] = {0, };
    for(int i = 0; i<4; i++)
        cin >> arr[i];
    cin >> a >> b;
    sort(arr, arr+4, comp);
    cout << arr[0]+arr[1]+arr[2]+(a>b?a:b);
}