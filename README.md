# LongestCommonPrefixLengthSum
Calculates the sum of similarities of a string S with each of its suffixes

This program takes input.txt file. Except for 1st line which stores the string number, each line corresponds to a string on which the program calculates 
the sum of similarities of it and each of its suffixes and then produces and output.txt file which stores each sum of similarities.

For best case scenario, where each string has similarity only with itself the algorithm runs with O(t*n) time complexity where t is the number of test cases 
and n is the string length.

For worst case scenario, where each string has similarities with every one of its suffixes, the algoritm runs with t * (n*(n-1))/2 => O(t*n^2) run time complexity
where t is the number of test cases and n is the string length.
