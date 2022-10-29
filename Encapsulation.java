class Encapsulation {
    public static void main(String[] args) {
        // create new object from Person
        Person newPerson = new Person("Chacha");
        System.out.println(newPerson.getName());
        System.out.println(newPerson.setName("Nurholis"));
    }
}

class Person {
    private static String name;

    public Person(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public String setName(String paramName) {
        return name = paramName;
    }
}