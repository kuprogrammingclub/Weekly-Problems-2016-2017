#!/usr/bin/python

'''
File: Beginner3.py
Author: Stefan Mendoza
Date: 2 September 2016
Description: Week1 / Beginner3 for KU Programming Club (2016-2017)
'''

def isPalindrome(name):
    midpoint = len(name)/2
    palindrome = True

    for i in range(0, midpoint):
        if name[i] != name[len(name) - (1 + i)]:
            return False
    return True

print("What's your name?")
name = raw_input("> ")

name_list = list(name.lower())

if isPalindrome(name.lower()):
    print("Your name backwards is '{0}'. Your name is a palindrome!"
        .format(''.join(name_list)))
else:
    name_list.reverse()
    print("Your name backwards is '{0}'. Your name isn't a palindrome."
        .format(''.join(name_list)))
