#include <bits/stdc++.h>
using namespace std;
int32_t main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int t; cin>>t;
	#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    int t; cin>>t;
    long long int l,r,x,y;
	int flag=0;
	do{
		t--;
		cin>>l>>r;
		x=l;
        y=r;
		for(int i=1;i<=2;i++){
			if((lcm(x,y)<=r)&&(x<y)){
				cout<<x<<" "<<y<<"\n";
				flag=1;
                i=r;
			}
            else if((l*2)<=r){
                y=x*2;
            }
		}
		if(flag==0)
			cout<<"-1 -1\n";
		flag=0;
	} while(t>0);
    return 0;
}
	return 0;
}