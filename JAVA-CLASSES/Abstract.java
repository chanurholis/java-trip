abstract class Abstract {
    public String name = "Chacha Nurholis";
    public int age = 20;

    public abstract void study();
}

class Student extends Abstract {
    public int graduationYear = 2021;

    public void study() {
        System.out.println("Studying all day long");
    }
}

class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("My name is " + myObj.name);
        System.out.println("I am " + myObj.age);
        System.out.println("I graduated year " + myObj.graduationYear);
        myObj.study();
    }
}