## Intermediate 2 - Exceptional Server
__source__:
https://www.hackerrank.com/challenges/exceptional-server

### Author:
[Dalimil](https://www.hackerrank.com/Dalimil)


### Description

Your friend set up a small computational server that performs complex
calculations.It has a function that takes large numbers as its input and returns
a numeric result. Unfortunately, there are various exceptions that may occur
during execution.

Complete the code in your editor so that it prints appropriate error messages, should anything go wrong. The expected behavior is defined as follows:

* If the compute function runs fine with the given arguments, then print the
result of the function call.

* If it fails to allocate the memory that it needs, print "Not enough memory".

* If any other standard C++ exception occurs, print "Exception: *S*" where *S*
is the exception's error message.

* If any non-standard exception occurs, print Other Exception.

#### Input format

The first line contains an integer, *T*, the number of test cases.
Each of the *T* subsequent lines describes a test case as 2 space-separated integers, *A* and *B*, respectively.

#### Constraints

* 1 <= T <= 10^3
* 0 <= A,B <= 2^60

#### Output format

For each test case, print a single line containing whichever message described
in the Problem Statement above is appropriate. After all messages have been printed, the locked stub code in your editor prints the server load.

#### Sample Input

```
2
-8 5
1435434255433 5
```

#### Sample Output

```
Exception: A is negative
Not enough memory
2
```

#### Explanation

* See the implementation of the compute function.
* *2* is the server load.

#### Code to be used/edited

```
#include <iostream>
#include <exception>
#include <string>
#include <stdexcept>
#include <vector>
#include <cmath>
using namespace std;

class Server {
private:
	static int load;
public:
	static int compute(long long A, long long B) {
		load += 1;
		if(A < 0) {
			throw std::invalid_argument("A is negative");
		}
		vector<int> v(A, 0);
		int real = -1, cmplx = sqrt(-1);
		if(B == 0) throw 0;
		real = (A/B)*real;
		int ans = v.at(B);
		return real + A - B*ans;
	}
	static int getLoad() {
		return load;
	}
};
int Server::load = 0;

int main() {
	int T; cin >> T;
	while(T--) {
		long long A, B;
		cin >> A >> B;



        /* Enter your code here. */



    }    
    cout << Server::getLoad() << endl;
	return 0;
}
```

#### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output) and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).  If you check out
the README under the Weekly-Problems-2016-2017 there are many more resources
available to start learning different languages!
