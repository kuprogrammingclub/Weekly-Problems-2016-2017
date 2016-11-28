## Beginner 1 - Rectangle Area by Skr379
__source__:
https://www.hackerrank.com/challenges/rectangle-area
#### Author
[Skr379](https://www.hackerrank.com/Skr379)

### Description
This is meant to force you to use your knowledge of classes and hopefully
introduce you to inheritance. (NOTE: If you don't understand inheritance feel free to
add the Rectangle-Area methods to the Rectangle class). Without further ado:

Create two classes:

#### Rectangle
The Rectangle class should have two data fields-width and height of int types. The class should have display() method, to print the width and height of the rectangle separated by space.

#### RectangleArea
The RectangleArea class is the derived from Rectangle class, i.e., it is the sub-class of Rectangle class. The class should have read_input() method, to read the values of width and height of the rectangle. The RectangleArea class should also overload the display() method to print the area (width * height) of the rectangle.

###Input Format

The first and only line of input contains two space separated integers denoting the width and height of the rectangle.

### Constraints
```
1 <= width,height <= 100
```

### Output Format

The output should consist of exactly two lines:
In the first line, print the width and height of the rectangle separated by space.
In the second line, print the area of the rectangle.

### Sample Input
```
10 5
```

### Sample Output
```
10 5
50
```



### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial
for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output)
and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).  If you check out
the README under the Weekly-Problems-2016-2017 there are many more resources
available to start learning different languages!
