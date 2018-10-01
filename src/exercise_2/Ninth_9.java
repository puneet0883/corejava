package exercise_2;

public class Ninth_9 {

    public static void main(String[] args) {
        System.out.println("class for furniture");
    }
}
  interface stresstest{


  }

  interface firetest {

  }

  abstract class Wooden{}

  abstract class Metal{}

  class chair extends Wooden implements stresstest, firetest  {

      public static void main(String[] args) {

          System.out.println("for wooden chairs");
      }

  }

  class tables extends Wooden implements stresstest, firetest{

      public static void main(String[] args) {


          System.out.println("for wooden table");
      }

  }

  class Metallicchair extends Metal implements stresstest,firetest{

      public static void main(String[] args) {
          System.out.println("for metallic chairs");
      }
  }

  class Metallictable extends Metal implements stresstest,firetest{
      public static void main(String[] args) {
          System.out.println("for metallic tables");
      }
  }


