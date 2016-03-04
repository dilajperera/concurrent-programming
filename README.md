# concurrent-programming
This repository is used to save source code regarding concurrent-programming

Dining Philosopers
----------------------

I have written this program to solve this problem by Arbitrator solution algorithm, mentioned here, to solve this (https://en.wikipedia.org/wiki/Dining_philosophers_problem). 

[
Problem :
Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers.

Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when he has both left and right forks. Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher. After he finishes eating, he needs to put down both forks so they become available to others. A philosopher can take the fork on his right or the one on his left as they become available, but cannot start eating before getting both of them.

Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply and an infinite demand are assumed.

The problem is how to design a discipline of behavior (a concurrent algorithm) such that no philosopher will starve; i.e., each can forever continue to alternate between eating and thinking, assuming that no philosopher can know when others may want to eat or think.

The problem was designed to illustrate the challenges of avoiding deadlock, a system state in which no progress is possible. To see that a proper solution to this problem is not obvious, consider a proposal in which each philosopher is instructed to behave as follows:

think until the left fork is available; when it is, pick it up;
think until the right fork is available; when it is, pick it up;
when both forks are held, eat for a fixed amount of time;
then, put the right fork down;
then, put the left fork down;
repeat from the beginning.
]
