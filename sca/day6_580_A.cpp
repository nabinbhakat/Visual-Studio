#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n;cin>>n;
	vector<long long int> v;
	long long int t,tcount=0,fcount=0;
	for(int i=0;i<n;i++){
		cin>>t;
		v.push_back(t);
		if(i>=1){
			if(v[i-1]<=v[i]){
				tcount++;
			}
			else{
				if(fcount<tcount)
					fcount=tcount;
				tcount=0;
			}

		}
	}
    if(fcount<tcount)
					fcount=tcount;
    cout<<fcount+1;
	return 0;
}