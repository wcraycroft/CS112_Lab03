public class PersonStack {

    private Person[] mPersonArray;
    private int mNextAvailableIndex;

    public PersonStack() {
        mPersonArray = new Person[5];
        mNextAvailableIndex = 0;
    }

    public void push(Object newObject) {
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

    public Person pop() {
        // If stack is empty, throw StackEmptyException
        if (mNextAvailableIndex < 1) {
            throw new StackEmptyException();
        }
        // Return the Person object at top of stack
        else {
            return mPersonArray[--mNextAvailableIndex];
        }
    }

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
