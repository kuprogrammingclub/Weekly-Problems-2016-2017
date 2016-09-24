'''
Stephen Longofono
KU Programming Club Week 02 2016-2017 Semester

Prompt: Find the longest palindrome present in a given string.  Do it fast.

This is a bottom-up approach, looking at each index and then branching out within
the bounds of the string to look for palindromes.  Each substring is assigned a value
representing the length of the longest palindrome within it, as measured from the center at
the focus point.  When the palindrome value stops improving, the algorithm moves on to the 
next index.

''' 

# Determine the appropriate helper to call for substring s (eve or odd)
def pallyVals(s, width):
	if width < 0:
		return 0
	elif width < 2:
		return width
	elif width % 2 == 0:
		return pallyVals_even(s)
	return pallyVals_odd(s)

# Given an even substring, determine the number of identical characters at the same length from center
def pallyVals_even(s):
	count = 0
	leftCenter = (len(s)-1)/2
	rightCenter = len(s)/2
	while valid(len(s), rightCenter, count) and (s[leftCenter-count] == s[rightCenter+count]):
		count +=1

	return 2 * count 

# Given an odd substring, determine the number of identical characters at the same length from center
def pallyVals_odd(s):
	count = 1
	center= len(s)/2
	while valid(len(s), center, count) and (s[center-count] == s[center+count]):
		count += 1
	return (2 * count) - 1

# Check array bounds
def valid(s, c, n):
	return ((c-n) >= 0) and ((c+n) < s)

# Do work son
def pallyMax(s):
	print '\nChecking ', s
	maxLen = 0
	maxWord = ''
	count = 0

	# for each index focus
	for i in range(len(s)):
		offset = 0
		if valid(len(s), i, offset):
			
			# Get initial test strings:
			tempStr1 = s[i-offset:i+offset+1]
			tempStr2 = s[i-offset:i+offset+2]
			

			# evaluate palindrome length
			temp1 = pallyVals(tempStr1, len(tempStr1))
			temp2 = pallyVals(tempStr2, len(tempStr2))

			count += 1

			runningMax1 = [0, tempStr1]
			runningMax2 = [0, tempStr2]

			# so long as we are improving in length, continue
			while (temp1 > runningMax1[0]) and valid(len(s), i, offset):
#Uncomment to see process	print 'Checked:', tempStr1, temp1
		
				runningMax1[0] = temp1
				runningMax1[1] = tempStr1
				
				# increment offset
				offset += 1

				# get new test string
				tempStr1 = s[i-offset:i+offset+1]
				temp1 = pallyVals(tempStr1, len(tempStr1))
				count += 1
	

			offset = 0
			while (temp2 > runningMax2[0]) and valid(len(s), i, offset):
#Uncomment to see process	print 'Checked:', tempStr2, temp2

				runningMax2[0] = temp2
				runningMax2[1] = tempStr2

				# increment offset
				offset += 1

				# get new test string
				tempStr2 = s[i-offset:i+offset+2]
				temp2 = pallyVals(tempStr2, len(tempStr2))
				count += 1

			# Check if we need to update overall max
			if runningMax1[0] > maxLen:
				maxLen = runningMax1[0]
				maxWord = runningMax1[1]

			if runningMax2[0] > maxLen:
				maxLen = runningMax2[0]
				maxWord = runningMax2[1]

	print 'The longset palindrome found was', maxWord 
	print 'Count of palindrome checks:', count


import sys
if len(sys.argv) > 1:
	if sys.argv[1]== 'test':	
		pallyMax('mom')
		pallyMax('racecar')
		pallyMax('momracecar')
		pallyMax('stewarttrawets')
		pallyMax('momracecarapexxepa')
		pallyMax('apexxeparacecarmom')
		pallyMax('stewarttrawetsmomracecar')
		pallyMax('abcdeff')
	else:
		print 'Test run usage:\t\t\tpython pally.py test'
		print 'Interactive usage:\t\tpython pally.py'
else:
	running = True
	while running:
		pallyMax(raw_input('\n\nEnter a string to check: '))
		running = ('y' == raw_input('\n\nAnother? (y/n): '))
