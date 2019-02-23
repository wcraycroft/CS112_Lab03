/* Person.java - Simplified version of Employee class from textbook.
 * Author:     Textbook
 * Module:     4
 * Project:    Lab 4, Project 2
 * Description: Represents a person's name a birthdate
 *
 *        Instance variables:
 *             (String) name
 *             (Date) birthDate
 *
 * Class Invariant: All objects have a name String and birthdate.
 * A name string of "No name" indicates no real name specified yet.
 * A birthdate of Jan 1, 1000 indicates no real birthdate specified yet.
 *
 * For this lab, you will need to use the toString method and a constructor.  A
 * sample use of the constructor:
 *
 *     Person MickJagger = new Person("Mick Jagger", new Date(7, 31, 1943)) ;
 */
public class Person {

    // Instance Variables
    private String name;
    private Date birthDate;

    /**
     Precondition: Neither theName nor theDate is null.
    */
    public Person(String theName, Date theDate) {
        if (theName == null || theDate == null) {
             System.out.println("Fatal Error creating person.");
             System.exit(0);
        }
        name = theName;
        birthDate = new Date(theDate);
    }

    public Person(Person originalObject) {
         name = originalObject.name;
         birthDate = new Date(originalObject.birthDate);
    }

    public String getName( ) {
        return name;
    }

    public Date getBirthDate( ) {
        return new Date(birthDate);
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName) {
        if (newName == null) {
             System.out.println("Fatal Error setting person's name.");
             System.exit(0);
        } else {
            name = newName;
        }
    }

    /**
     Precondition newDate is not null.
    */
    public void setBirthDate(Date newDate) {
        if (newDate == null) {
             System.out.println("Fatal Error setting person birthdate.");
             System.exit(0);
        } else {
            birthDate = new Date(newDate);
        }
    }

    public String toString( ) {
        return ("Name: " + name + "  born: " + birthDate.toString( ));
    }

    public boolean equals(Object anObject) {
        if (anObject == null || getClass() != anObject.getClass()) {
            return false ;
        }
        Person otherPerson = (Person) anObject ;
        return (name.equals(otherPerson.name) &&
                birthDate.equals(otherPerson.birthDate));
    }
}