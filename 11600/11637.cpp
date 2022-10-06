#include <iostream>
#include <algorithm>

using namespace std;

typedef struct{
    int a, b;
}num;

bool comp(const num &x, const num &y){
    return x.a < y.a;
}

int main(){
    int t, n;
    cin >> t;
    while(t--){
        int sum = 0;
        num arr[10];
        cin >> n;
        for(int i = 0; i<n; i++)
            cin >> arr[i].a, sum += arr[i].a, arr[i].b = i+1;
        sort(arr, arr+n, comp);
        cout << (arr[n-1].a==arr[n-2].a ? "no winner" : arr[n-1].a>sum/2 ? "majority winner" : "minority winner");
        if(arr[n-1].a!=arr[n-2].a)
            cout << " " << arr[n-1].b;
        cout << endl;
    }
}