class OuterClass {
    protected String x = "x from outer";

    static class InnerClass {
        protected String y = "y from inner";
    }
}

class Cool {
    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = new OuterClass.InnerClass();

        System.out.println(myOuterClass.x);
        System.out.println(myInnerClass.y);
    }
}