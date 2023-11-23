#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	map<string,string>mpair,npair;
	string f,s;
	int m,n;
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>f>>s;
		npair.insert({s,f});
	}
	for(int j=0;j<m;j++){
		cin>>f>>s;
		int x=s.size()-1;
		s.erase(s.begin()+x); // erased the ;(Semicolon) from the end of the string
		mpair.insert({f,s}); //find the key value from the map
		auto it=npair.find(s);
		cout<<f<<" "<<s<<";"<<" #"<<it->second<<"\n";
	}
	return 0;
}