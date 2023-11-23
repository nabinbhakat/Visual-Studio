#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int t; cin>>t;
	int n,count=0,swap=0;
	do{
		t--;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++){
			cin>>a[i];
			if(i%2==a[i]%2){
				a[i]=-1;
				count++;
			}
		}
		if(n==1){
				if(count==1)
					cout<<"0\n";
				else
					cout<<"-1\n";
		}
		else if(n==count){
			cout<<"0\n";
		}
		else if(n-1==count){
			cout<<"-1\n";
		}
		else{
			for(int i=0;i<n;i++){
				if(a[i]!=-1){
					for(int j=i+1;j<n;j++){
						if(a[j]!=-1){
							if((a[j]%2==i%2)&&(a[i]%2==j%2)){
								a[i]=-1;
								a[j]=-1;
								swap++;
								count+=2;
							}
						}
					}
				}
			}
			if(n==count)
				cout<<swap<<"\n";
			else
				cout<<"-1\n";
		}
		swap=0;
		count=0;
	}while(t>0);
	return 0;
}