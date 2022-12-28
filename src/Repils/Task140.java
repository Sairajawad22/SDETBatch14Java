package Repils;

public class Task140 {
/*
For you to do:

Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

```
this is long
```
 */
        public static void main(String[] args) {
            String[] arr = {"hey", "yolo", "hi", "this is long"};
            System.out.println(maxLength(arr));
            //should print "this is long"
        }
        static String maxLength(String[] myArr) {
            String maxString = "";
            for (String s : myArr) {
                if (s.length() > maxString.length()) {
                    maxString = s;
                }
            }
            return maxString;
        }
    }

