# Java-Programs-from-Coding-Interviews
* Coding is an integral part of any programming job interviews, and Java development interviews are no exception. I would even suggest you should never hire anyone without testing their coding skill, coding is also an art, and more often than a good code is an excellent developer as well. If you look at tech giants like Amazon, Facebook, and Google they thoroughly test the coding skill of any developer they hire, notably Amazon who first send online coding exercises to filter Java programmers who can code. This online test usually gives you requirements and ask you to write a program in a limited time, usually 2 to 3 hours. The application should meet the output provided by the exercise itself. These type of tasks are very tough to crack if you don't have excellent coding skill.

**Btw, the most crucial question is how do you develop that kind of coding skill in the first place? Well, things always start small, and if you pay attention, there are many Java job interviews where you would have been asked to write small programs.

They are simple, but yet they give a good indication of the coding skill of prospective candidates. They are usually preferred by many companies because it often requires 10 to 20 minutes to write the solution and discuss them.

* In this list, I am going to share 50 of such small programs from Java Programming interviews. These programs are from various Data Structure and Algorithm topics like an array, string, linked list, binary tree, etc. If you don't have a good knowledge of Data structure and algorithm, I suggest you to first read a good book on Data Structure and Algorithms like Introduction to Algorithms by Thomas H. Cormen.

** But, If you find the book challenging, you can also join a comprehensive online course on Data structure and algorithms like Data Structures and Algorithms: Deep Dive Using Java on Udemy to learn better and more comfortable.

Java Program to removed duplicates from ArrayList
Here is our sample program to learn how to remove duplicates from ArrayList. The steps followed in the below example are:
Copying all the elements of ArrayList to LinkedHashSet. Why we choose LinkedHashSet? Because it removes duplicates and maintains the insertion order.
Emptying the ArrayList, you can use clear() method to remove all elements of ArrayList and start fresh. 
Copying all the elements of LinkedHashSet (non-duplicate elements) to the ArrayList. 


Read more: https://www.java67.com/2015/03/how-to-remove-duplicates-from-arraylist.html#ixzz6Mc4HjwTs
In this example, you can see we have created an ArrayList and added numbers into it, all prime numbers. We added '7' twice, so that it become duplicate. Now we print the ArrayList and you can see that it contains number 7 twice.
How to remove duplicates from ArrayList in Java

After that we created a LinkedHashSet from our ArrayList, clear our original ArrayList and then added all elements from set to the list. This time we should not have any duplicates because Set doesn't allow them and they should have filtered when elements copied from ArrayList to HashSet by Java. This is proved by printing the ArrayList again, now it doesn't contain 7 twice, but only once.

That's all about how to remove duplicates from ArrayList in Java. Though there are multiple ways to do this, I think using LinkedHashSet is the simplest one because its simple and also preserve the order of elements.

