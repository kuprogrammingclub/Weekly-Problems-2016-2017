## Beginner 2 - Binary to Decimal
__source__:
https://tausiq.wordpress.com/2009/07/27/uab-2005-problem-3-binary-to-decimal-converter/

### Description
A binary number is a sequence of bits (binary digits – 0’s and 1’s) of the form
BnBn-1……B1 B0, where each Bi is a bit.

The decimal equivalent is calculated by Bn * 2n+ Bn-1 * 2n-1 + … + B1 * 2 + B0.

Write a program to input a binary number and output the decimal equivalent.

The sample input will not have more than 8 individual bits (i.e., the largest value to be entered is 11111111).

### Example
```
Enter binary number: 101
In decimal: 5

Enter binary number: 11111
In decimal: 31
```

### Critical Test Cases
```
Enter binary number: 11111111
In decimal: 255
Enter binary number: 10101010
In decimal: 170
Enter binary number: 0
In decimal: 0
Enter binary number: 1
In decimal: 1
Enter binary number: 10
In decimal: 2
Enter binary number: 11
In decimal: 3
Enter binary number: 100
In decimal: 4
Enter binary number: 10000000
In decimal: 128
```

### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output) and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).  If you check out
the README under the Weekly-Problems-2016-2017 there are many more resources
available to start learning different languages!
