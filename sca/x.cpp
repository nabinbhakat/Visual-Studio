#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int t;
    cin>>t;
    do{
        t--;
        int a,b,c;
        cin>>a>>b>>c;
        int count=0;
        if(a==b){
            cout<<"0\n";
        }
        else{
            while(a!=b){
                if(a>b){
                    a-=c;
                    b+=c;
                }
                else{
                    a+=c;
                    b-=c;
                }
                count++;
            }
        }
        cout<<count<<"\n";
    }while(t>0);
    return 0;
}