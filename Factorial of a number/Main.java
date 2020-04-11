#include<iostream>
int main(){
  int n,i,s=1;
  std::cin>>n;
for(i=1;i<=n;i++)
{
  s=s*i;
}
  std::cout<<s;
}