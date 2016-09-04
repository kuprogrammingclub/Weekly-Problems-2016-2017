'''
File: test_intermediate2.py
Author: Stefan Mendoza
Date: 4 September 2016
Description: Test for Week 1 / Intermediate 2 for KU Programming Club (2016-2017)
'''

from nose.tools import assert_equal
from nose.tools import assert_not_equal
from nose.tools import assert_raises
from nose.tools import raises
from python.implementation.intermediate2 import LetterValueMap
import unittest

class LetterValueMapTest(unittest.TestCase):
    letterValueMap = {}

    @classmethod
    def setup_class(self):
        self.letterValueMap = LetterValueMap()

    def test_lowercase(self):
        assert_equal(self.letterValueMap.getWordValue('abc'), 6)

    def test_uppercase(self):
        assert_equal(self.letterValueMap.getWordValue('ABC'), 6)

    def test_mixedcase(self):
        assert_equal(self.letterValueMap.getWordValue('aBc'), 6)

    def test_invalidCharacterRaises(self):
        assert_raises(KeyError, self.letterValueMap.getWordValue, "ab!")

    '''
    Uncomment the test below to see what a test failure looks like
    '''
    # def test_thisFails(self):
    #     assert_not_equal(self.letterValueMap.getWordValue('abc'), 6)
