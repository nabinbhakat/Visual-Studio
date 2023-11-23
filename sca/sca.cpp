#include<bits/stdc++.h>
using namespace std;
bool compare(int a,int b){
    return a<b;
}
int main(){
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    // int main;
    // cin>>main;
    
    // for(int i=0;i<=main;i++)
    //     cout<<i<<" ";


    // vector<int> a;
    // a.push_back(5);
    // cout<<"Capacity "<<a.capacity()<<" Size: "<<a.size()<<endl;
    // a.push_back(10);
    // cout<<"Capacity "<<a.capacity()<<" Size: "<<a.size()<<endl;
    // a.push_back(16);
    // cout<<"Capacity "<<a.capacity()<<" Size: "<<a.size()<<endl;
    
    // vector<int> b;
    // b.reserve(10);

    vector<int>c={1,5,6,8,4,6,2,3,7,9};

    // for(int i=0;i<10;i++){
    //     cout<<c[i]<<" ";
    // }

    // for(int x:c){
    //     cout<<x<<" ";
    // }

    // for(auto it =c.begin();it!=c.end();it++){
    //     cout<<*it<<" ";
    // }
    // //time- O(nlogn)
    // sort(c.begin(),c.end());
    // cout<<"\nAfter sort\n";
    // for(int i=0;i<10;i++){
    //     cout<<c[i]<<" ";
    // }
    // reverse(c.begin(),c.end());
    // cout<<"\nAfter reverse\n";
    // for(int i=0;i<10;i++){
    //     cout<<c[i]<<" ";
    // }
    
    // sort(c.begin(),c.end(),compare);
    // cout<<"\nusing comparator\n";
    // for(int i=0;i<10;i++){
    //     cout<<c[i]<<" ";
    // }


    // pair<int,int> p;
    // p.first=1;
    // p.second=2;

    // vector<pair<int,int>> vp;
    // for(int i=0;i<=5;i++){
    //     int x,y;
    //     cin>>x>>y;
    //     vp.push_back({x,y});
    // }
    // for(pair<int,int> p:vp){
    //     cout<<p.first<<" "<<p.second<<endl;
    // }

    // vector<pair<int,int>> ex;
    // for(int i=0;i<10;i++){
    //     ex.push_back({1,i+1});
    // }
    // for(auto x: ex){
    //     cout<<x.first<<" "<<x.second<<endl;
    // }
    // for(int i=0;i<ex.size();i++){
    //     cout<<ex[i].first<<" "<<ex[i].second<<endl;
    // }



    // int n;
    // cin>>n;
    // vector<pair<string,int>> s;
    // for(int i=0;i<n;i++){
    //     string s1;
    //     cin>>s1;
    //     s.push_back({s1,s1.size()});
    // }
    // for(auto x:s){
    //     cout<<x.first<<" "<<x.second<<endl;
    // }


    //Map
    //sorted
    //does not store duplicate key value 
   // map<string ,int> mp;
    // mp.insert({"one",1});
    // mp.insert({"two",2});
    // mp.insert({"one",3});
    // mp.insert({"four",1});

    // for(auto x:mp){
    //     cout<<x.first<<" "<<x.second<<endl;
    // }


    // int n;
    // cin>>n;
    // for(int i=1;i<=n;i++){
    //     string s;
    //     cin>>s;
    //     int freq=mp[s];
    //     mp[s]=freq+1;
    //     //mp[s]++;
    // }

    // for(auto x:mp){
    //     cout<<x.first<<" "<<x.second<<endl;
    // }

    map<char,int> mp;
    string s;
    cin>>s;
    // for(int i=0;i<s.size();i++){
    //     // int freq=mp[{s[i]}];
    //     // mp[{s[i]}]=freq+1;
    //     mp[s[i]]++;
    // }
    // for(auto x:mp){
    //     cout<<x.first<<" "<<x.second<<endl;
    // }
    // for(int i=0;i<s.size();i++){
    //     if(mp[s[i]]==1){
    //         cout<<s[i]<<endl;
    //         break;
    //     }
    // }



    for(int i=0;i<s.size();i++){
        mp[s[i]]++;
    }
    for(auto x:mp){
        cout<<x.first<<" "<<x.second<<endl;
    }
    char temp;
    for(int i=0;i<s.size()-1;i++){
        if(mp[s[i+1]]>mp[s[i]]){
            temp=s[i+1];
        }
    }
    cout<<temp;
    return 0;
}