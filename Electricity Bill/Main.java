#include<iostream>
using namespace std;
int main()
{
  int n,o;
  std::cin>>n;
  if(n<=200)
  {
    o=n*0.5;
    std::cout<<"Rs."<<o;
  }
  else if((n>200) && (n<=400))
          {
            o=n*0.65+100;
              std::cout<<"Rs."<<o;
          }
         else if((n>400) && (n<=600))
                 {
                   o=n*0.80+200;
                    std::cout<<"Rs."<<o;
                 }
                 else
                 {
                  o=n*1.25+425;
                    std::cout<<"Rs."<<o; 
                 }
                 }