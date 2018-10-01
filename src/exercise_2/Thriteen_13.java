package exercise_2;

public class Thriteen_13 {

    public static class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }
    static class CustomExceptionImpl {
        public static void main(String[] args) {
            try {
                throw new CustomException("Something went wrong 1");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }
}
