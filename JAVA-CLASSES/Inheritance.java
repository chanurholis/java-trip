class Inheritance {
    protected String Vehicle = "ex";
}

class SubClass extends Inheritance {
    public static void main(String[] args) {
        Inheritance newInheritance = new Inheritance();
        System.out.println(newInheritance.Vehicle);
    }
}