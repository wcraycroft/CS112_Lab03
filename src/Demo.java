public class Demo {

    public static void main(String[] args) {


        int[] testArray = new int[5] ;
        int index = 1000 ;

        // Put the next statement in a try-catch block

        try {
            if (index < 0 || index >= testArray.length) {
                throw new MyException(index);
            } else {
                System.out.println(testArray[index]);
            }
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }

}
