#include<iostream>

int forSum(int* nums, int size)
{
	int total = 0;
	for(int i = 0; i < size; i++)
	{
		total += nums[i];
	}
	return total;
}

int whileSum(int* nums, int size)
{
	int total = 0;
	int i = 0;
	while(i < size)
	{
		total += nums[i];
		i++;
	}
	return total;
}

int recursionSum(int* nums, int size, int iteration)
{
	if(iteration < size)
	{
		return nums[iteration] + recursionSum(nums, size, iteration + 1);
	}
	else
	{
		return nums[iteration];
	}
}

int main()
{
	//Obtain size of array
	std::cout << "How many values would you like in your list?: ";
	int size = 0;
	std::cin >> size;
	
	//Creates and populates array with user values
	int* nums = new int[size];
	for(int i = 0; i < size; i++)
	{
		std::cout << "Enter value number " << i+1 << ": ";
		std::cin >> nums[i];
	}
	
	std::cout << "Sum from for-loop: " << forSum(nums, size);
	
	std::cout << "\nSum from while-loop: " << whileSum(nums, size);
	
	std::cout << "\nSum from recursion: " << recursionSum(nums, size, 0);
}
