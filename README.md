[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17629446)
# unit-5-time-practice-frq
Time free response problem for the AP CSA Unit on writing classes.  Adapted from Runestone Academy's Unit 5 Practice FRQ

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

## Instructions
You will implement a `Time` class that keeps track of time using a 24-hour format.  Objects of the `Time` class hold a time value for a European-style 24 hour clock.  The value consists of hours, minutes, and seconds.  The range of the value is `00:00:00` (midnight) to `23:59:59` (one second before midnight).  Complete the `Time` class, as well as the requested methods of the `Time` class by following the steps below.  Test your class in `Main`.

### Part A
The `Time` class should have three attributes (fields; instance variables): one for hours, one for minutes, and one for seconds.  Create these attributes in the `Time` class.

### Part B
Create a non-default constructor for the `Time` class.  It should take in three `int` values as parameters (inputs), and use those inputs to assign the hours, minutes, and seconds of the `Time` object.  You may assume that
* The input number of hours is between 0 and 23 inclusive
* The input number of minutes and seconds is between 0 and 59 inclusive
```java
Time(2, 3, 4);     // Constructs a Time object with time 02:03:04
Time(14, 38, 46);  // Constructs a Time object with time 14:38:46
```

### Part C
Create a default constructor for the `Time` class.  It should not take in any parameters (inputs), and should set the time to midnight.  You can either manually make the constructor, or use the `this` keyword to call the constructor you creaetd in Part B.

### Part D
Write a comment above the `pad` method that describes what it does.

### Part E
Write the `toString` method for the `Time` class.  It should return a string representation of the time in the form of `hh:mm:ss`.  You must use the `pad` method in your solution.

### Part F
Write the method `tick` for the `Time` class.  The `tick` method should add 1 to the number of seconds of the current time.  If the number of seconds is 60, then it should add 1 to the number of minutes, and reset the number of seconds to 0.  If the number of minutes is now 60, then it should add 1 to the number of hours, and reset the number of seconds to 0.  If the number of hours is now 24, then it should reset the hours to 0.

### Part G
Write the method `add` for the `Time` class, which takes a `Time` object as parameter, and adds the two times together.  It is highly suggested to perform the computation for the fourth (4th) example by hand.

Hint: An efficient solution can be found by using the modulo (%) operator.
* Adding a time of `01:01:01` with `02:02:02` results in a time of `03:03:03`.
* Adding a time of `00:00:59` with `00:00:01` results in a time of `00:01:00`.
* Adding a time of `00:59:59` with `00:00:01` results in a time of `01:00:00`.
* Adding a time of `09:30:30` with `02:45:45` results in a time of `12:16:15`.
* Adding a time of `23:59:59` with `23:59:59` results in a time of `23:59:58`.
