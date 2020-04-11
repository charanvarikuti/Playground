#include <iostream>
int main() 
{
	int i,n,s=0,rem;
  std::cin>>n;
  while(n!=0)
  {
    rem=n%10;
    s=rem+s*10;
    n=n/10;
  }
  std::cout<<s;// Type your code here
	
}