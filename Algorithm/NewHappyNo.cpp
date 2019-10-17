#include<iostream>
using namespace std;
int main()
{
	int fn=0,sn=0,tn=0;
	int n,n1,n2,count;
	cout<<"Enter the Range:";
	cin>>n1>>n2;
	
	for(int l=n1;l<=n2;l++)
	{
		n=l;
		count=1;
		while(n!=1)
		{
			if(count<10)
			{
				if(n>=100)
				{
					fn=n%100;
					sn=fn/10;
					tn=fn%10;
					fn=n/100;
					n= (fn*fn)+(sn*sn)+ (tn*tn);
//					cout<<"fn:"<<fn<<"sn:"<<sn<<"tn:"<<tn<<"\n";
					count++;
				}
				if(n<100)
				{
					count++;
					sn = n % 10;
					fn = n / 10;
//					cout<<"fn:"<<fn<<"sn:"<<sn<<"\n";
					n = (sn*sn) + (fn*fn);
				}
			}
			else
			{
				break;
			}
		}
		if(count<10)
		cout<<l<<" "<<count<<"\n";
	}
}
