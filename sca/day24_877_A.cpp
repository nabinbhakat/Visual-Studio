#include<bits/stdc++.h>
using namespace std; 
int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    vector<string> s={"Danil","Olya","Slava","Ann","Nikita"};
    string line,temp="";
    getline(cin,line);
    int found=0;
    for(int i=0;i<line.size();i++){
        if(line[i]=='D'){
            temp="";
            temp+=line[i];temp+=line[i+1];temp+=line[i+2];temp+=line[i+3];temp+=line[i+4];
            if(temp==s[0]){
                found++;
            }
        }
        else if(line[i]=='O'){
            temp="";
            temp+=line[i];temp+=line[i+1];temp+=line[i+2];temp+=line[i+3];
            if(temp==s[1]){
                found++;
            }
        }
        else if(line[i]=='S'){
            temp="";
            temp+=line[i];temp+=line[i+1];temp+=line[i+2];temp+=line[i+3];temp+=line[i+4];
            if(temp==s[2]){
                found++;
            }
        }
        else if(line[i]=='A'){
            temp="";
            temp+=line[i];temp+=line[i+1];temp+=line[i+2];
            if(temp==s[3]){
                found++;
            }
        }
        else if(line[i]=='N'){
            temp="";
            temp+=line[i];temp+=line[i+1];temp+=line[i+2];temp+=line[i+3];temp+=line[i+4];temp+=line[i+5];
            if(temp==s[4]){
                found++;
            }
        }
    }
    if(found==1){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
    return 0;
    }