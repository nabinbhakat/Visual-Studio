#include<bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int t,c=0; cin>>t;
	long long int n,i,val,sum_beg=0,sum_end=0;
	vector<int> v;
	do{
		t--;
		cin>>n;
		for(i=0;i<n;i++){
			cin>>val;
			v.push_back(val);
		}
		if(n<=2)
			c=0;
		else{
			sort(v.rbegin(), v.rend());
			if(n==3){
				if(v[0]>v[1]+v[2]){
					cout<<"YES\n";
					c=1;
				}
			}
			else{
				sum_beg=v[0];
				sum_end=v[n-1]+v[n-2];
				for(i=1;i<n;i++){
					if(sum_beg>sum_end){
						cout<<"YES\n";
						i=n;
						c=1;	
					}
					else{
						sum_beg+=v[i];
						sum_end+=v[n-i-2];
					}
				}
			}
		}
		if(c==0)
			cout<<"NO\n";
		c=0;
		v.clear();
	}while(t>0);
	return 0;
}