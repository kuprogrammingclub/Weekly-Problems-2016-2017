'''
File: intermediate2.py
Author: Stefan Mendoza
Date: 4 September 2016
Description: Week 1 / Intermediate 2 for KU Programming Club (2016-2017)
'''

# To allow us to get the list of letters
import string

class LetterValueMap:
    letter_value = {}

    def __init__(self):
        self.letter_value = self.generateLetterValueMap()

    def generateLetterValueMap(self):
        mapping = {}

        for i in range(0, len(string.ascii_lowercase)):
            # Creating a mapping for both upper and lowercase letters
            mapping[string.ascii_lowercase[i]] = i + 1
            mapping[string.ascii_uppercase[i]] = i + 1

        return mapping

    def getWordValue(self, word):
        letter_value = self.generateLetterValueMap()
        value = 0

        for letter in word:
            value += letter_value[letter]

        return value

if __name__ == "__main__":
    print("What is the word you'd like to place a value on?")
    word = input("> ")

    if word == '':
        print("\nWhoops! You didn't enter anything.")
        print("Exiting...")
    else:
        value = 0
        mapping = LetterValueMap()

        try:
            value = mapping.getWordValue(word)
            print("The total value of your word is {0}.".format(value))
        except KeyError as error:
            print("\nWhoops! You entered a word with an invalid character!")
            print("Exiting...")
        except Exception as error:
            print("\nWhoops! Something went wrong.")
            print("Exiting...")
