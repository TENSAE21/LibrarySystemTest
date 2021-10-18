# LibrarySystemTest


Standard MPP test - Implemented

Problem 1. [Lambdas/Streams] In your prob1 package, you will find a class Problem1 that contains two static methods:
static List<String> elementsInJustOne(List<String> list1, List<String> list2) static List<String> getAllFairfieldCustomers(List<Customer> list)
The method elementsInJustOne returns a list of all Strings that occur in exactly one of the two input lists. Below is an example of how this method should behave:
Example: If list1 = {"A", "B", "D"} and list2 = {"B", "C", "D"}, then the return listshouldbe{"A", "C"}.
 Hint: Consider using the static method Stream.concat.
The method getAllFairfieldCustomers returns a list of all names of Customers
Fairifield. The Customer class has been provided for you in your prob1 package. A main method has been provided that will help you test your code.
Requirements for Problem 1.
who live in
1. Your code may not contain any loops (while loops, for loops).
2. The body of each of the methods elementsInJustOne, getAllFairfieldCustomers
must be a single Stream pipeline. You must not make use of instance variables or local variables declared in the body of either method. (Example of a local variable:
int myMethod() {
int x = //computation
return x; }
Here, x is a local variable. Not allowed in this problem.)
3. You may not create auxiliary methods for use in your pipeline.
4. There must not be any compilation errors or runtime errors in the solution that you submit.



Problem 2. [UML  Code] Translate the class diagram below into code. The diagram shows the relationships between classes in a Library System. A LibraryMember has a CheckoutRecord, which is composed of zero or more CheckoutRecordEntries. Each CheckoutRecordEntry provides information about one item (a LendingItem) that the LibraryMember checked out at some time in the past. LendingItems are either Books or CDs.Your solution must include every class in the diagram and all attributes and methods shown in every class. Your solution must also accurately reflect inheritance relationships, one-way associations, and dependencies shown in the diagram. Except for your implementation of the getPhoneNums method in Admin, your code must not include attributes or methods that are not directly shown in the diagram below. In your prob2 package, you will find empty shells of all the classes that appear in the class diagram below; you must fully implement these classes, and you must not introduce any additional classes.
The static method
 
static List<String> getPhoneNums(LibraryMember[] members, LendingItem item)
in the Admin class should do the following: It must return a sorted list of the phone numbers of those library members who have checked out, at least once, the LendingItem item that is passed in as input. In order to compare the input item with the LendingItems that you can find in library members' checkout records, you will have to override equals in an appropriate way (the equals method is not shown in the diagram – you will need to decide which class(es) need to override equals).
A class Test has been included in your prob2 package (this class is not shown in the class diagram below). This class provides a main method with data that can be used to test your implementation. The expected output of the main method in Test is shown in the comments for that method.
Note: You do NOT need to use a stream pipeline in your implementation of getPhoneNums – in fact, you do not need to use any special Java 8 constructs or techniques.
