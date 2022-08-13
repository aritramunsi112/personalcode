#include<iostream>
#include<algorithm>
#include<vector>
typedef long long ll;
using namespace std;

class Solution
{
    int x,y;
public:
Solution(int ,int);
  void solve();
};

Solution::Solution(int x,int y)
{
    this->x=x;
    this->y=y;
}

void Solution::solve()
{
  vector<int> v;
  v.push_back(x);
  v.push_back(y);
  for(int i=0;i<v.size();i++)
  {
    cout<<v[i]<<" ";
  }
  cout<<endl;
}
int main(int argc,char *argv[])
{
    Solution *ob=new Solution(10,20);
    
    ob->solve();
    //
    //
    
    return 0;
}

