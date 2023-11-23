#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int s,n,count=0;
	cin>>s>>n;
	int x,y;
	vector<pair<int,int>>v;
	for(int i=0;i<n;i++){
		cin>>x>>y;
		v.push_back({x,y});		
	}
	sort(v.begin(),v.end());
	for(auto x:v){
		if(s>x.first){
			s+=x.second;
			count++;
		}
	}
	if(count==n){
		cout<<"YES";
	}
	else
		cout<<"NO";
	return 0;
}