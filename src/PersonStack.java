/* PersonStack.java
 * Author:  William Craycroft
 * Module:  4
 * Project: Lab 4, Project #2
 * Description: This class stores a stacking array of 5 Person objects. It is able to push and pop object to and from
 *              the stack, as well as print a list of all Person object currently in the stack.
 *
 *      Fields:
 *          mPersonArray (Person[]) - the array/stack of Person objects
 *          mNextAvailableIndex (int) - the index of the next available slot in the array.
 *      Methods:
 *          Constructors:
 *              Default constructor - creates empty array, starting at index 0.
 *          push(Object newObject) - Adds the passed Object to the stack.
 *          pop() - Returns and deletes the topmost Person in the stack.
 *          toString() - returns String displays all current Person objects in the array.
 */

public class PersonStack {

    private Person[] mPersonArray;
    private int mNextAvailableIndex;

    public PersonStack() {
        mPersonArray = new Person[5];
        mNextAvailableIndex = 0;
    }

    // Adds the passed Object to the stack.
    public void push(Object newObject) throws IllegalObjectTypeException, StackFullException {
        // If object is null or not a Person object, throw IllegalObjectTypeException
        if (newObject == null || !(newObject instanceof Person)) {
            throw new IllegalObjectTypeException();
        }
        // If stack is full, throw StackFullException
        else if (mNextAvailableIndex > 4) {
            throw new StackFullException();
        }
        // Add object to stack
        else {
            Person newPerson = (Person) newObject;
            mPersonArray[mNextAvailableIndex++] = newPerson;
        }
    }

    // Removes and returns the topmost Person in the stack.
    public Person pop() throws StackEmptyException{
        // If stack is empty, throw StackEmptyException
        if (mNextAvailableIndex < 1) {
            throw new StackEmptyException();
        }
        // If stack is not empty...
        else {
            // Temporarily store the Person object at top of stack
            Person temp = mPersonArray[--mNextAvailableIndex];
            // Remove that object from the stack (set to null)
            mPersonArray[mNextAvailableIndex] = null;
            // Return the temp object
            return temp;
        }
    }

    // Returns a String listing all Person objects currently in the stack.
    public String toString() {
        String output = "";
        for (Person currentPerson : mPersonArray) {
            output += currentPerson.toString() + "\n";
        }
        if (output.equals("")) {
            return "The PersonStack is empty.";
        }
        return output;
    }
}
