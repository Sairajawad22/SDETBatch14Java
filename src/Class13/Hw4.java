package Class13;

public class Hw4 {
    public static void main(String[] args) {
     /*
     How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

      */
        String words = "This is sentence i want to reverse";
        String[] arr = words.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String reverse = arr[i];
            for (int j = reverse.length() - 1; j >= 0; j--) {
                System.out.print(reverse.charAt(j));
            }
            System.out.print(" ");

        }
        System.out.println("--------------------------------");
        // another way
        String str="This is sentence i want to reverse";
        String[] arr1=str.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]=stringBuilder.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);
    }
}
