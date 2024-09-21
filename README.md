Producer Consumer Problem
-------------------------
Problem:  
To make sure that the producer won’t try to add data into the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.

Solution:
Initially, the buffer size is 1
The producer is going to produce if there is space in the buffer.
The next time the consumer removes an item from the buffer, it notifies the producer, who starts to fill the buffer again.
In the same way, the consumer can go to sleep if it finds the buffer to be empty.
The next time the producer puts data into the buffer, it wakes up the sleeping consumer.

Concepts Used:
MultiThreading, Synchronization, and Inter-thread Communication.
