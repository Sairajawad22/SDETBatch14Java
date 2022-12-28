package practice;

class practice {
    public static void main (String[] args) {
        try {
            int[] a = {1};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){

            e.printStackTrace();
        }

    }
}






