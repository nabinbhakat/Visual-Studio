/* 
Input-  1.No.of test cases
        2.Two numbers x and y
Output- Sum of Odd no b/w x and y excluding x and y
*/
#include<bits/stdc++.h>
using namespace std;
int main(){
    int t_case,x,y;
    long long int sum=0;
    cin>>t_case;
    for(int i=0;i<t_case;i++){
        cin>>x>>y;
        if(x>y){
            for(int j=y+1;j<x;j++){
                if(j%2!=0)
                sum+=j;
            }
        }
        else{
            for(int j=x+1;j<y;j++){
                if(j%2!=0)
                sum+=j;
            }
        }
        cout<<sum<<"\n";
        sum=0;
    }
    return 0;
}