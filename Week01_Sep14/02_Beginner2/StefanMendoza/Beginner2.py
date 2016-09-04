'''
File: Beginner2.py
Author: Stefan Mendoza
Date: 2 September 2016
Description: Week 1 / Beginner 2 for KU Programming Club (2016-2017)
'''

def calculate(age):
    return (23 - age)


print("How old are you?")

try:
    age = int(raw_input("> "))

    if age == 23:
        print("We're the same age! Nice!")
    elif age > 23:
        print("I'm 23. You're {0} years older than me!".format(-1 * (calculate(age))))
    else:
        print("I'm 23. You're {0} years younger than me!".format(calculate(age)))
except Exception:
    print("Woah! Something went wrong!")
