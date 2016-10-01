	#include <iostream>
    #include <cstring>
    #include <algorithm>
    #include <set>
    #define MAX 100005
    #include <cassert>
    #define lli long long
    using namespace std;
    int A[MAX];
    int main()
    {
        int t, n, sum_n = 0, i, j;
        lli ans;
        set <int> s;
        cin >> t;
        while ( t-- )
        {
            s.clear();
            cin >> n;
            sum_n += n;
            ans = 0;
            for ( int i = 0; i < n; i++ ) 
            {
                cin >> A[i];
            }
            i = 0, j = 0;
            while ( i < n ) 
            {
                while ( j < n && s.find(A[j]) == s.end() ) 
                {
                    s.insert(A[j]);
                    j++;
                }
                ans += (1LL*(j - i)*(j - i + 1))/2;
                s.erase(A[i]);
                i++;
            }
            cout << ans << endl;
        }
        return 0;
    }

