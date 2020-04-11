#include<iostream>
int main()
{
  int i,n,rem,c=0;
  std::cin>>n;
  do
  {
    rem=n%10;
    c++;
    n=n/10;
    
}while(n!=0);
  std::cout<<c;
}