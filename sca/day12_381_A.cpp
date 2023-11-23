#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n; cin>>n;
	int x,s_sum=0,d_sum=0,turn=0;
	vector<int> v;
	for(int i=0;i<n;i++){
		cin>>x;
		v.push_back(x);
	}
	while(!v.empty()){
		if(turn%2==0){
			if(v[v.size()-1]>v[0]){
				s_sum+=v[v.size()-1];
				v.pop_back();
			}
			else{
				s_sum+=v[0];
				v.erase(v.begin());
			}
			turn++;
		}
		else{
			if(v[v.size()-1]>v[0]){
				d_sum+=v[v.size()-1];
				v.pop_back();
			}
			else{
				d_sum+=v[0];
				v.erase(v.begin());
			}
			turn++;
		}
	}
	cout<<s_sum<<" "<<d_sum;
	return 0;
}