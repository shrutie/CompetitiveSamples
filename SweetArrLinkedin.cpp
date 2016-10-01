#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	int first,lastt;
	int sum_f=0;
	cin>>n;
	//int arr[n];
	int arr[n];
	string s;
	for(int i=0;i<n;i++){
	 cin>>arr[i];
	 s=s+char(arr[i]);
	}
	int max=arr[0];
  for(int i=1;i<n;i++)
     { if(arr[i] > max)
        max= arr[i];
        //cout<<"Maximum of array"<<max<<endl;
	}
	int sum[max+1];
	memset(sum,-1,sizeof(sum));
//	cout<<s<<endl;
	for(int i=0;i<n;i++){
		first=s.find_first_of(s[i]);
		//cout<<"First: "<<first<<endl;
		lastt=s.find_last_of(s[i]);
		//cout<<"last: "<<lastt<<endl;
	//	cout<<"s[i] "<<s[i]<<" int(s[i] "<<int(s[i])<<endl;
	//	cout<<sum[int(s[i])]<<" "<<endl;
		
		if(sum[int(s[i])]< 0){
			sum[int(s[i])]=(lastt-first);
			sum_f=sum_f+sum[int(s[i])];
		//	cout<<"sum[i]: "<<sum[int(s[i])]<<" for:"<<int(s[i])<<endl;
		}
	}
	cout<<sum_f;
}
