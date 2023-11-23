#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	long long int n,k;
    int i=1;
    cin>>n>>k;
    if(n%2==0){
        if(k<=n/2)
            cout<<k+(k-1);
        else   
            cout<<k-(n-k);
    }
    else{
        if(k<=(n/2)+1)
            cout<<k+(k-1);
        else   
            cout<<k-1-(n-k);
    }
	return 0;
}