# SternBrocot
The fractions of the first line is (0/1),(1/1),(1/0). For the next line it adds the numerator and denominator for the values next to each one. For example, the second line will be (0/1), (1/2), (1/1), (2/1),(1/0). So  the fraction (1/1) will have a left child of (1/2) and a right child of (2/1). This program can find the path from the (1/1) root node to the numbers given. For example the fraction (5/7) will have the path of "LRRL". This program compares the current node we are on which at the beginning is (1/1) and calculates the fraction which is 1 and see if the value is less than or greater than the value we want. If it is less than it will go to the left and if it is greater than it will go right.
