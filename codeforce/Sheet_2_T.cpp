/*
Input- No of lines(ex-3)
Output-
  *
 ***
*****
*/
#include<bits/stdc++.h>
using namespace std;
int main(){
    int lines;
    cin>>lines;
    for(int i=0;i<lines;i++){
        for(int j=lines-1-i;j>0;j--){
            cout<<" ";
        }
        for(int k=0;k<i+1;k++){
            cout<<"*";
        }
        if(i!=0){
            for(int k=0;k<i;k++){
            cout<<"*";
        } 
        }
        cout<<"\n";
    }
    return 0;
}