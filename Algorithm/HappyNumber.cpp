#include<iostream>
using namespace std;
int fn = 0, sn = 0, tn = 0;

int main()
{
	int n,r=1;
	cout << "Enter the number:";
	cin >> n;

if(r<10){

	while (n!=1 && n>100)
	{
	
	
		
			r++;
			fn=n%100;
			sn=fn/10;
			tn=fn%10;
			n= (fn*fn)+(sn*sn)+ (tn*tn);
				cout<<"fn:"<<fn<<"sn:"<<sn<<"tn:"<<tn<<"\n";
		
}
while (n!=1 && n<100)		

	{
		
		
		
			r++;
			sn = n % 10;
			fn = n / 10;

			cout<<"fn:"<<fn<<"sn:"<<sn<<"\n";
			n = (sn*sn) + (fn*fn);
			}
		cout<<r;
}
}
