#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int t,n; cin>>t;
	int h1,h2,h3,x;
	do{
		t--;
		cin>>n;
		h1=n%3;
		n-=n%3;
		h2=h3=n/3;
		h1+=n/3;
		h2+=1;
		h3-=1;
		if(h2==h1){
			h2-=1;
			h1+=1;
		}
		else if(h2>=h1){
			x=h2;
			h2=h1;
			h1=x;
		}
		cout<<h2<<" "<<h1<<" "<<h3<<"\n";
		h1=h2=h3=0;
	}while(t>0);
	return 0;
}