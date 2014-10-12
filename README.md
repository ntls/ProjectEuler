Project Euler
==============

Project 63
https://projecteuler.net/problem=63


*The 5-digit number, 16807=7^5, is also a fifth power. Similarly, the 9-digit number, 134217728=8^9, is a ninth power.*
*How many n-digit positive integers exist which are also an nth power?*



Solution:


Since 10^1 is a 2-digit number we will examine only 1-digit numbers as our base [1..9].
Moreover by using the Mathematical induction we can conclude that
if a^n has less than n digits then a^(n+1) will have less than (n+1) digits. (1)
   
Since we do not know the upper limit for power k, we stop when condition (1) is not met. 
