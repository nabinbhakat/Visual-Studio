#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	long int n; cin>>n;
	long long int x;
	vector<long long int> v,v1,v2;
	for(int i=0;i<n;i++){
		cin>>x;
		v.push_back(x);
	}
	for(int i=0;i<n-1;i++){
		cin>>x;
		v1.push_back(x);
	}
	sort(v.begin(),v.end());
	sort(v1.begin(),v1.end());
	for(int i=0;i<n;i++){
		if(v[i]!=v1[i]){
			cout<<v[i]<<"\n";
			break;
		}	
	}
	for(int i=0;i<n-2;i++){
		cin>>x;
		v2.push_back(x);
	}
	sort(v2.begin(),v2.end());
	for(int i=0;i<n-1;i++){
		if(v1[i]!=v2[i]){
			cout<<v1[i];
			break;
		}	
	}
	return 0;
}