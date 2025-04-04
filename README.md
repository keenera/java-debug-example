# CIS 1200 IntelliJ Debugger Exercise
The following instructions will walk you through a short debugging exercise. The point of this exercise is to familiarize you with the IntelliJ debugger as it will be incredibly useful in debugging your own code (especially on Homework 7!). Please try to work through this exercise before your mid semester check-in with your TA so they can help you with any difficulties you are having.
If you don't know how to use the IntelliJ debugger, watch [this video](https://www.youtube.com/watch?v=1bCgzjatcr4) for some guidance.

Get started:

* Download `debug_example.zip` in the recitation materials folder and open the project in IntelliJ.

* Open `CircleTest.java`, which has the two debugging examples, and run the file to see which test cases are currently failing. You must do Example #1 before doing Example #2. The only other file needed for both examples is `Circle.java`.

## Example #1
### *Failing test case: `testCircleAreaLargerRadius()`*
In this example we initialize a new circle and print its area. The bug is in Circle.java's getArea() method. Line 17 of Circle.java adds the radii instead of multiplying them. Feel free to debug this exercise on your own or use the steps below:

1. An overview of what the code does:
    * Our test case `testCircleAreaLargerRadius()` makes a new circle, `myCircle`, and calculates its area by calling `myCircle.getArea()`

2. Run `CircleTest.java` to see the output for the test case `testCircleAreaLargerRadius()`.

3. Place a breakpoint on line 36 of `CircleTest.java` by clicking the red circle next to the line number.
    * Adding a breakpoint means that when we run `CircleTest.java` in debug mode, we will run all code up to (but not including) line 36.

4. Run the debugger (start program in debug mode):
    * Right click on `CircleTest.java` and press "Debug 'CircleTest'"
    * OR click the bug icon  in the top right corner, making sure CircleTest is selected in the dropdown to the left.

5. Take a look at the debugger panel. Variables will show up here. `myCircle` should be in the panel with its fields (objects show up as dropdowns that you can expand to see the values of individual fields).
    * Note that the values of `myCircle`’s fields are as expected, so the issue is probably not the constructor of `Circle.java` and might be the `getArea()` method.

6. Use the "Step Over" button to run that line of code, and move to the next line of the test. `actualArea` should populate in the debugger panel and we can see it is not the expected value, which will cause the assertion on the following line to fail.

7. Rerun the debugger with the same breakpoint, but this time use the "Step Into" button to go to `Circle.java`'s `getArea()` method.

8. Use the "Step Over" button until you reach line 21. Notice that the value of the variable `rSquared` is 8 instead of 16. We can see that the problem is that we add the radii instead of multiplying them.

9. Fix the issue and rerun `CircleTest.java`.

## Example #2
### *Failing test case: `testSumOfAreas()`*
In this example we calculate the sum of the areas of an array of circles. This is a great example of how to use the debugger with a for-loop. The bugs are on line 27 in `Circle.java`, inside `getAreaSum()`, a static method in the `Circle` class. Feel free to debug this exercise this on your own or use the steps below:

1. An overview of what the code does:
    * Our test case `testSumOfAreas()` creates 3 new circles, `c1`, `c2`, and `c3`, stores them in an array `circles`, and passes that array into `getAreaSum()`
    * `getAreaSum()` takes in an array of circles, iterates over it, and sums the circles' areas.

2. Run `CircleTest.java` to see the output for the test case `testSumOfAreas()`.

3. Place a breakpoint on line 47 of `CircleTest.java`.

4. Start debugger mode.

5. Take a look at the debugger pane – variables show up here, including `circles`, which shows up as a dropdown that can be expanded to see the elements of the array.

6. Use the "Step Into" button to go to `Circle.java`'s `getAreaSum()` method.

7. Use the "Step Over" button to run through the loop. You will see that the index variable changes, and the debugger returns to the top of the loop on each iteration. As you walk through the iterations, notice that `sum` is not being updated correctly — we are using 1 as our index on each iteration of the instead of our index variable `i`, and setting `sum` to the area of the current circle instead of adding to the existing sum.

8. Fix the issues and run `CircleTest.java`.

## Example #3
### *Failing test case: `testFindNonAliases()`*
In this example, we return the elements of a `List<Circle>` that are NOT reference-equal to the circle we call the method on. This example shows you what Collections look like in the debugger, and how to spot when your code doesn’t enter loops as expected.

1. An overview of what the code does:
    * Our test case `testFindNonAliases()` creates 4 new circles, `c1`, `c2`, `c3`, `c4`, aliases `c1` with another identifier `c5`, creates a list cList that stores `c1`, `c2`, `c3`, `c4`, `c5`, `c5`, `c4` in that order, and passes `cList` into `c1.findNonAliases()`
    * `findNonAliases()` takes in a list of circles, iterates over it, and returns a list of the circles NOT reference-equal to the circle we called the method on. In other words, because we called `findNonAliases()` on `c1`, we should see an output list that looks like `c2`, `c3`, `c4`, `c4`.

2. Run `CircleTest.java` to see the output for the test case `testFindNonAliases()`.

3. Place a breakpoint on line 74 of `CircleTest.java`.

4. Start debugger mode.

5. Take a look at the debugger pane – variables show up here, including `cList`, which shows up as a dropdown that can be expanded to see the elements of the list.
     * The individual elements of `cList`, which are `Circle` objects, can also be expanded to see their fields.

7. Use the "Step Into" button to go to `Circle.java`'s `findNonAliases()` method.

8. Click the "Step Over" button once to see `output` get initialized to an empty `LinkedList`.
9. Use the "Step Over" button to run through the loop. You will see that instead of entering the body of the loop, the debugger immediately jumps to line 39 and `output` is still empty. Notice that this happened because we accidentally iterated over `output` (which was empty) and not our parameter `cList`. To fix this, we can replace output with `cList` in the for-each loop header on line 34.

10. Fix the issue and run `CircleTest.java`.
