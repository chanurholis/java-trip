class Constructor {
    String name;

    public Constructor(String paramName) {
        name = paramName;
    }

    public static void main(String[] args) {
        Constructor newConstructor = new Constructor("Josen Mor");
        System.out.println(newConstructor.name);
    }
}