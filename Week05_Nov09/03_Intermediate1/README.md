## Intermediate 1
__source__:
https://tausiq.wordpress.com/2009/09/27/diamond-word/


### Description
General Statement: Read a word and output that word in a diamond pattern such that the entire word is the center horizontal line of the diamond and each row out from this center drops a letter on each end of the word.

Input: The first line of the data set for this problem is an integer that represents the number of strings that follow. Each string is on a separate line.

Output: Output the diamond pattern using all upper case letters.
The output is to be formatted exactly like that for the sample output given below.

Assumptions: All letters are upper case.
The maximum word length is 10.

Discussion: If there are an odd number of letters, the top and bottom of the diamond will be the middle letter. If there are an even number of letters, the top and bottom of the diamond will be the middle 2 letters.

### Example
```
Sample Input:
3
SAMPLE
PROGRAM
PROBLEMS
Sample Output:

  MP
 AMPL
SAMPLE
 AMPL
  MP

   G
  OGR
 ROGRA
PROGRAM
 ROGRA
  OGR
   G

   BL
  OBLE
 ROBLEM
PROBLEMS
 ROBLEM
  OBLE
   BL

```

#### Furthermore
If you're looking for inspiration on a language to use, here's a basic tutorial for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output) and [C++](http://www.cplusplus.com/doc/tutorial/basic_io/).  If you check out
the README under the Weekly-Problems-2016-2017 there are many more resources
available to start learning different languages!
