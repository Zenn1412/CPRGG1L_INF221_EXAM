public class Student {
    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int sayMystudentNumber;
    String sayMystudentEmailAddress;
    boolean amIAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + sayMystudentNumber);
    }

    public void sayMystudentEmailAddress() {
        System.out.println("my email adress is " + sayMystudentEmailAddress);
    }

   public void amIAwesome() {
    System.out.println("Am i Awesome? the answer is " + amIAwesome);
   }


    public Student(String sur, String fn, char mi, String dot, int smn, String smea, boolean iaa) {
    surname = sur;
    firstname = fn;
    middleInitial = mi;
    sayMystudentNumber = smn;
    sayMystudentEmailAddress = smea;
    amIAwesome = iaa;
    }

}

