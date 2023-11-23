    #include<bits/stdc++.h>
    using namespace std; 
    int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long int t;
    cin>>t;
    string s;
    long int sus=0;
    do{
            sus=0;
            cin>>s;
            if(s.size()==1){
            cout<<"1\n";
            }
            else{
                for(int i=0;i<s.size();i++){
                    if(s[i]=='1'){
                        sus=1;
                    }
                    else{
                        if(s[i]=='?'){
                            sus++;
                        }
                        else{
                            sus++;
                            i=s.size();
                        }
                    }
                }
                cout<<sus<<"\n";
            }
            t--;
    }while(t>0);
    return 0;
}