package doubler.impl;

import com.kilo.Person;

import doubler.Doubler;

public class DoublerImpl implements Doubler {
    public int doubleIt(int toDouble) {
        // Creating a Person object just for kicks
        Person person = new Person(String.valueOf(toDouble));
        return Integer.parseInt(person.getName()) * 2;
    }
}
