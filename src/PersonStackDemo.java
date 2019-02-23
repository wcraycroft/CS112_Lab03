public class PersonStackDemo {

    public static void main (String[] args) {
        // Instantiate new PersonStack
        PersonStack persons = new PersonStack();
        // Add 5 Persons to stack
        persons.push(new Person("Jason Mendosa", new Date(8, 19, 1991)));
        persons.push(new Person("Bob Ross", new Date(2, 25, 1976)));
        persons.push(new Person("Toby Johnson", new Date(3, 14, 1999)));
        persons.push(new Person("Lee Mack", new Date(7, 5, 1953)));
        persons.push(new Person("Harvey Dent", new Date(8, 8, 1990)));
        persons.push(new Person("Bruce Banner", new Date(1, 19, 2000)));

        // TODO: ended here
        
    }
}
