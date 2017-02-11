## Beginner 1 - Vector-Sort
__source__:
https://www.hackerrank.com/challenges/vector-sort
#### Author
[saikiran9194](https://www.hackerrank.com/challenges/vector-sort)

### Description
You are given N integers.Sort the N integers and print the sorted order.
Store the N integers in a vector.Vectors are sequence containers representing
arrays that can change in size.

* *Declaration*

```
vector<int>v; (creates an empty vector of integers)
```

* *Size*

```
int size=v.size();
```

* *Pushing an integer into a vector*

```
v.push_back(x);(where x is an integer.The size increases by 1 after this.)
```

* *Popping the last element from the vector*

```
v.pop_back(); (After this the size decreases by 1)
```

* *Sorting a vector*

```
sort(v.begin(),v.end()); (Will sort all the elements in the vector)
```

To know more about vectors, [Click Here](https://www.hackerrank.com/external_redirect?to=http://www.cplusplus.com/reference/vector/vector/)


### Input Format
The first line of the input contains N where N is the number of integers. The
next line contains N integers.

### Constraints
1 <= N <= 10^5
1 <= V_i <= 10^9, where V_i is the ith integer in the vector.
![](https://latex.codecogs.com/gif.latex?1\leq&space;N\leqslant&space;10^5" title="1\leq N\leqslant 10^5)

![](https://latex.codecogs.com/gif.latex?1\leq&space;V_i&space;\leqslant&space;10^9,&space;\textup{where}&space;\&space;V_i&space;\&space;\textup{is&space;\&space;the}&space;\&space;i_t_h&space;\&space;\textup{integer&space;in&space;the&space;vector.}" title="1\leq V_i \leqslant 10^9, \textup{where} \ V_i \ \textup{is \ the} \ i_t_h \ \textup{integer in the vector.})

### Output Format

Print the integers in the sorted order one by one in a single line followed by
a space.

### Sample Input
```
5
1 6 10 8 4
```

### Sample Output
```
1 4 6 8 10
```

### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial
for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output)
and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).  If you check out
the README under the Weekly-Problems-2016-2017 there are many more resources
available to start learning different languages!
