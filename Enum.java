class Enum {
    enum Gender {
        MALE,
        FEMALE
    }

    Gender myGender;

    public Enum() {
        myGender = Gender.MALE;
    }

    public static void main(String[] args) {
        Enum gen = new Enum();

        switch (gen.myGender) {
            case MALE -> System.out.println("my gender is male");
            case FEMALE -> System.out.println("my gender is female");
        }
    }
}