package exercise_1;

public class eleventh {

   public class SBI{

        public void getdetails(){

            System.out.println("SBI BRANCH Details : " + "rate of intrest : " + 10);
        }

    }

     public class BOI{

        public void getdetails()
        {
            System.out.println("BOI BRANCH Details : " + "rate of intrest : " + 10);
        }

    }

     public class ICICI{

        public void getdetails(){
            System.out.println("icici branch Details :" + "rate of intrest :" + 10);
        }

    }

    public static void main(String[] args) {

       eleventh obj = new eleventh();
        eleventh.SBI ob1 = obj.new SBI();

         ob1.getdetails();

        eleventh.BOI ob2 = obj.new BOI();

        ob2.getdetails();

        eleventh.ICICI ob3 = obj.new ICICI();

        ob3.getdetails();
    }
}

