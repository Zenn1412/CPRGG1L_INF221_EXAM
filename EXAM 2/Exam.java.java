import java.util.Scanner;

public class App {

static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      System.out.println("1. Last six digits");
      System.out.print("Enter your ten digit student number: ");
      int studentNumber = scan.nextInt();
      int sixDig = studentNo(studentNumber);
      System.out.println("student number " +studentNumber +  " and last 6 digits number is  " + sixDig);

      System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits % 2 == 0)  {
          System.out.println("is Even");
        }else{
          System.out.println("ODD");
          }

          System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.println(firstName.length());
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        System.out.println(surName.length());

        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();

        if (firstNameInLowerCase == firstNameInLowerCase.toLowerCase()) {
            System.out.println("true");
        }
        else {
          System.out.println("false");
        }
        if (firstNameInUpperCase == firstNameInUpperCase.toUpperCase()) {
System.out.println("true");
        }
        else{
          System.out.println("false");
        }
      
      System.out.println("5. Vowel or Consonant");
      System.out.print("Enter the first character of your first name: ");
      char firstChar = scan.next().charAt(0);
      
      switch (firstChar) {
        case 'A': System.out.println("true");
        break;
        case 'E': System.out.println("true");
        break;
        case 'I': System.out.println("true");
        break;
        case 'O': System.out.println("true");
        break;
        case 'U': System.out.println("true");
        break;
        default: System.out.println("false");
        break;
      }
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
if (studentNumber == 2022102455) {
  System.out.println("Valid");
} else {
  System.out.println("invalid");
}
System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        if (firstNameInUpperCase == firstNameInUpperCase.toUpperCase()) {
          System.out.println("yes it is in uppercase");
                  }
                  else{
                    System.out.println("no, it is not on uppercase");
                  }
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();
        if (surName == surName.toLowerCase()) {
          System.out.println("yes, it is in lowercase");
      }
      else {
        System.out.println("no, it is not in lowercase");
      }
  System.out.println("8. Nested conditions");
  System.out.print("Enter your enrolled course (BSIT or BSCS): ");
  String course = scan.next();

  switch (course) {
  case "BSIT": System.out.print("Enter your specialization (MWAA or MAA): ");
  String specialization1 = scan.next();
  break;
  case "BSCS":  System.out.print("Enter your specialization (DF or ML): ");
  String specialization2 = scan.next();
  break;
  default: System.out.println("please choose between the two given only!");
  break;
  


}

  System.out.println("9. Selection");
  System.out.print("Enter your SHS strand: ");
  String strand = scan.next();

  switch (strand) {
    case "STEM": System.out.println("STEM");
    break;
    case "ICT": System.out.println("ICT");
    break;
    case "HUMSS": System.out.println("HUMSS");
    break;
    case "HOME ECONOMICS": System.out.println("HOME ECONOMICS");
    break;
    case "ARTS AND DESIGN":  System.out.println("ARTS AND DESIGN");
    break;
    case "TVL MARITIME": System.out.println("TVL MARITIME");
    break;
    default: System.out.println("Sadly, your choice is not on our list");
    break;
  }
  System.out.println("10. Validate student email address ");
  System.out.print("Enter your student email address: ");
  String studentEmailAddress = scan.next();

  if (studentEmailAddress.contains("agapito")){
System.out.println("yes, it contains my surname");
  }else {
System.out.println("it does not contain my surname");
}

System.out.println("11. Think like an ATM");
System.out.print("Enter the total amount of money in your bank account: ");
int amount = scan.nextInt();
System.out.println("your total amount of withdrawal is: " + amount);




      }    
      static int studentNo (int sixDig) {
          return sixDig = 102455 ;
      }
    
}



      
    
  