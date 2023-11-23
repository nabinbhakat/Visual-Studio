#include<bits/stdc++.h>
using namespace std;
int main(){
    long long int n,sum=0,a,b;
    cin>>n>>a>>b;
    for(int i=1;i<20;i++){
        if(i==a||i==b||i==(a+b)){
            sum+=i;
            cout<<i<<endl;
        }
    }
    cout<<sum;
    return 0;
}