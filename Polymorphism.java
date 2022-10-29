class Polymorphism {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.animalSound();

        Cat myCat = new Cat();
        myCat.animalSound();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes the sound!");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("mohhhhh");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("meoww");
    }
}