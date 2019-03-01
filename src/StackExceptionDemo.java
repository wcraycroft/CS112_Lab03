/* StackExceptionDemo.java
 * Authors: William Craycroft
 * Module:  4
 * Project: Lab 4, Project #2
 * Problem Statement: This class tests the functionality of the PersonStack, StackFullException, StackEmptyException and
 *      IllegalObjectTypeExceptions classes.
 *
 * Algorithm / Plan:
 *      1. Instantiate a new PersonStack object
 *      2. Push 5 new Person objects to stack
 *      3. Print current stack using PersonStack's toString() method
 *      4. Attempt to push a 6th Peron to stack, should throw a StackFullException
 *      5. Catch StackFullException, print error message.
 *      6. Pop 5 Person objects from the stack, print toString() of each popped object
 *      7. Attempt to pop 6th object from empty stack, should throw a StackEmptyException
 *      8. Catch StackEmptyException, print error message.
 *      9. Instantiate a new Date object
 *     10. Attempt to push Date object to PersonStack, should throw an IllegalObjectTypeException.
 *     11. Catch IllegalObjectTypeException, print error message.
 */

public class StackExceptionDemo {

    public static void main(String[] args) {

        // Instantiate new PersonStack
        PersonStack stack = new PersonStack();

        // Try block 1: testing StackFullException in push() method
        System.out.println("Entering try block 1 (StackFullException):\nAdding 5 Persons to stack:");
        try {
            // Push 5 new Person objects to stack
            stack.push(new Person("Jason Mendosa", new Date(8, 19, 1991)));
            stack.push(new Person("Bob Ross", new Date(2, 25, 1976)));
            stack.push(new Person("Toby Johnson", new Date(3, 14, 1999)));
            stack.push(new Person("Lee Mack", new Date(7, 5, 1953)));
            stack.push(new Person("Harvey Dent", new Date(8, 8, 1990)));

            // Print current stack
            System.out.println("Current stack contents:\n" + stack.toString());

            // Attempt to push a 6th Peron to stack
            System.out.println("Pushing 6th Person to stack");
            stack.push(new Person("Bruce Banner", new Date(1, 19, 2000)));
        }
        // Catch both exceptions thrown by the push() method
        catch (StackFullException | IllegalObjectTypeException e) {
            // Print error message
            System.err.println(e.getMessage());
        }
        System.out.println();

        // Try block 2: testing StackEmptyException in pop() method.
        System.out.println("Entering try block 2 (StackEmptyException):");
        try {
            // Pop 5 Person objects from the stack.
            System.out.println("Popping 5 Persons from stack");
            for (int i = 0; i < 5; i++) {
                // pops the object at top to stack and prints the object's toString()
                System.out.println("Popped: " + stack.pop().toString());
            }

            // Attempt to pop() 6th object from empty stack
            System.out.println("Popping 6th Person from stack");
            stack.pop();
        }
        // Catch the exception thrown by pop() method
        catch (StackEmptyException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();

        // Try block 3: testing IllegalObjectTypeException in push() method.
        System.out.println("Entering try block 3 (IllegalObjectTypeException):");
        try {
            // Instantiate non-Person object
            Date junk = new Date(8, 12, 1991);
            // Attempt to push object to stack
            System.out.println("Adding Date object to stack:");
            stack.push(junk);
        }
        catch (StackFullException | IllegalObjectTypeException e) {
            // Print error message
            System.err.println(e.getMessage());
        }
    }
}
