interface IPerson {
    public void eyeColor();
}

class Inerface implements IPerson {
    public static void main(String[] args) {
        // code ...

        Inerface newInterface = new Inerface();
        newInterface.eyeColor();
    }

    public void eyeColor() {
        // code ...

        System.out.println("brown");
    }
}