    #include<bits/stdc++.h>
    using namespace std; 
    int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int x,y;
    y=a[n-1];
    if(y==a[n-2])
            x=a[n-2];
        else{
            for(int i=n-1;i>0;i--){
                if(a[i]==a[i-1]){
                x=a[i];
                break;
                }
            }
        }
    for(int i=n-2;i>0;i--){
        if(y%a[i]!=0){
            x=a[i];
            break;
        }
    }
    cout<<y<<" "<<x;
    
    return 0;
    }