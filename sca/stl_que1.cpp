#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    map<char,int> m;
    for(int i=0;i<s.size();i++){
        m[s[i]]++;
    }
    // for(auto x:m){
    //     cout<<x.first<<" "<<x.second<<"\n";
    // }
    for(int i=0;i<s.size();i++){
        if(m[s[i]]==1){
            cout<<s[i]<<"\n";
            break;
        }
    }
    return 0;
}