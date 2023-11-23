    #include<bits/stdc++.h>
    using namespace std; 
    int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int m,n,x,i,j;
    map<int,int>mp;
    cin>>n>>m;
    int a[n];
    for(i=0;i<n;i++){
        cin>>a[i];
    }
    for(j=n;j>=0;j--){
        mp[a[j]]++;
        a[j]=mp.size()-1;
    }
    for(i=0;i<m;i++){
        cin>>x;
        cout<<a[x-1]<<"\n";
    }
    return 0;
}