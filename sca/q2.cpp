#include<bits/stdc++.h>
using namespace std;
class Fraction
{
    int num;
    int denom;
    public:
    Fraction()//dfeault
    {
        num=0;
        denom=0;
    }
    Fraction(int n,int d)//parameterised
    {
        num=n;
        denom=d;
    }
    ~Fraction()//destructor
    {
        cout<<"object destroyed for Fraction class\n";
    }
    void getFraction()
    {
        cout<<num<<"/"<<denom<<endl;
    }
    void setFraction(int n,int d)
    {
        num=n;
        denom=d;
    }
    void addFraction(Fraction &a,Fraction &b)
    {
//    	int lcm=a.denom*b.denom/__gcd(a.denom,b.denom);
//    	res.denom=lcm;
//    	res.num=lcm*a.num/a.denom + lcm*b.num/b.denom;

		denom=a.denom*b.denom;
		num=a.num*b.denom + b.num*a.denom;
	}
	void reduceFraction(Fraction &a)
	{
		
		int gcd=__gcd(a.num,a.denom);
		num=a.num/gcd;
		denom=a.denom/gcd;
	}
    void divFraction(Fraction &a,Fraction &b)
    {
    	num=a.num*b.denom;
    	denom=b.num*a.denom;
	}
};
int main()
{
    Fraction f1(1,3);
    Fraction f2(1,2);
    cout<<"Fraction 1: ";f1.getFraction();
    f1.setFraction(1,4);
    cout<<"Fraction 1: ";f1.getFraction();
    cout<<"Fraction 2: ";f2.getFraction();
    Fraction f3;
    f3.addFraction(f1,f2);
    cout<<"Fraction 3: ";f3.getFraction();
    f3.reduceFraction(f3);
    cout<<"Fraction 3: ";f3.getFraction();
    f3.divFraction(f1,f2);
    cout<<"Fraction 3: ";f3.getFraction();


    return 0;
}
