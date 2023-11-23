#include<bits/stdc++.h>
using namespace std;
bool compare(vector<pair<char,int>> x,vector<pair<char,int>> y){
    return x>y;
}
int main(){
    string s;
    cin>>s;
    map<char,int>m;
    for(int i=0;i<s.size();i++){
        m[s[i]]++;
    }
    vector<pair<char,int>>p;
    for(auto x:m){
        p.push_back({x.first,x.second});
    }
    sort(p.begin(),p.end(),compare);
    for(int i=0;i<p.size();i++){
        cout<<p[i].first<<" "<<p[i].second;
    }
    return 0;
}