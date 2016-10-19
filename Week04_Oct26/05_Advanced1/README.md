## Advanced 1
__Source__:
https://www.reddit.com/r/dailyprogrammer/comments/40rs67/20160113_challenge_249_intermediate_hello_world/

### Description

Punch (or punched) cards are an archaic form of recording instruction. Many people here may think of them from the early digital computing era, but they actually go back to fairground organs and textile mills in the 19th century! The format most of us are familiar with was originally patented by Hollerith, using stiff card stock. Over the years this format changed slightly and varied on this them, including a diagonal cut corner. For this challenge we'll focus on the tail end of punch cards with IBM, GE and UNIVAC type cards.

To use them, a program would be transcribed to the punch cards. Each column represented a single character, 80 columns to the card, 12 rows to the column. The zone rows can be used to have two punches per column. You can visualize it like this:

```
                  ____________
                 /
          /  12 / O
  Zone rows  11|   O
          \/  0|    O
          /   1|     O
         /    2|      O
        /     3|       O
  Numeric     4|        O
  rows        5|         O
        \     6|          O
         \    7|           O
          \   8|            O
           \  9|             O
               |______________
```

Each card vendor would have an alphabet, an array of characters that are numerically represented by the punches. Here's an example of the DEC9 simple alphabet showing you the punch codes and the order in which they appear.

```
DEC9 &-0123456789ABCDEFGHIJKLMNOPQR/STUVWXYZ:#@'="[.<(+^!$*);\],%_>?
     ________________________________________________________________
    /&-0123456789ABCDEFGHIJKLMNOPQR/STUVWXYZ:#@'="[.<(+^!$*);\],%_>?
12 / O           OOOOOOOOO                        OOOOOO
11|   O                   OOOOOOOOO                     OOOOOO
 0|    O                           OOOOOOOOO                  OOOOOO
 1|     O        O        O        O
 2|      O        O        O        O       O     O     O     O
 3|       O        O        O        O       O     O     O     O
 4|        O        O        O        O       O     O     O     O
 5|         O        O        O        O       O     O     O     O
 6|          O        O        O        O       O     O     O     O
 7|           O        O        O        O       O     O     O     O
 8|            O        O        O        O OOOOOOOOOOOOOOOOOOOOOOOO
 9|             O        O        O        O
  |__________________________________________________________________
```


You can see the first 12 characters are represented by a single punch, then the next 9 have two punches (with one in the upper zone), then the next 9 use the next zone as that second punch, the fourth 9 use the next zone as the second punch, then we start on the lower zone for the next sets of 6 with the upper zone punched increasingly.

For some more information, including from where some of this info was taken, please see __source__:http://homepage.cs.uiowa.edu/~jones/cards/codes.html <br>

or

Wikipedia __source__:http://en.wikipedia.org/wiki/Punched_card

So, given an alphabet array you should be able to encode a message in a punch card, right? Let's go back to the punch card! For this challenge, assume the same encoding methods as above given the character array at the top, they'll only differ in order of characters. 


### Furthermore

If you're looking for inspiration on a language to use, here's a basic tutorial for [Java](http://www.codeproject.com/Articles/2853/Java-Basics-Input-and-Output) and
[C++](http://www.cplusplus.com/doc/tutorial/basic_io/).<br>
If you check out the README under the Weekly-Problems-2016-2017 there are many more resources available to start
learning different languages!
