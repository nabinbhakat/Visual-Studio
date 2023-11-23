#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int t; cin>>t;
	long int n,m,x,i;
	long long int shuff=0;
	vector<long int>card;
	do{
		t--;
		cin>>n;
		for(i=0;i<n;i++){
			cin>>x;
			card.push_back(x);
		}
		cin>>m;
		for(i=0;i<m;i++){
			cin>>x;
			shuff+=x;
		}
		shuff=shuff%n;
		rotate(card.begin(),card.begin()+shuff,card.end());
		cout<<card[0]<<"\n";
		card.clear();
		shuff=0;
	}while(t>0);
	return 0;
}