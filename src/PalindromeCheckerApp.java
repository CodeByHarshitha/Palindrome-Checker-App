import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class PalindromeCheckerApp {


    public static void UseCase1PalindromeCheckerApp() {
        System.out.println("Welcome to palindrome checker App\nVersion 2.0");
        System.out.println("System initialized successfully");
    }


    public static void UseCase2PalindromeCheckerApp() {
        String str = "madam"; // hardcoded string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }


    public static void UseCase3PalindromeCheckerApp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

        public static void UseCase4PalindromeCheckerApp() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String:");
            String str = input.nextLine();
            char[] arr = str.toCharArray();

            int i = 0;
            int j = arr.length - 1;
            boolean isPalindrome = true;

            while (i < j) {
                if (arr[i] != arr[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            
            if (isPalindrome) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is Not a Palindrome");
            }
        }
        public static void UseCase5PalindromeCheckerApp() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String:");
            String str = input.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            String rev = "";
            while (!stack.isEmpty()) {
                rev = rev + stack.pop();
            }
            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
         public static void UseCase6PalindromeCheckerApp(){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a String:");
                String str = input.nextLine();
                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    queue.add(c);   // enqueue
                    stack.push(c);  // push
                }
                boolean isPalindrome = true;

                while (!queue.isEmpty()) {
                    char fromQueue = queue.remove(); // dequeue
                    char fromStack = stack.pop();    // pop
                    if (fromQueue != fromStack) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println(str + " is a Palindrome");
                } else {
                    System.out.println(str + " is Not a Palindrome");
                }

            }
    public static void UseCase7PalindromeCheckerApp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            deque.add(str.charAt(i)); // adds to the rear by default
        }
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }

    }



        
        public static void main(String[] args) {
            UseCase7PalindromeCheckerApp();
        }
    }
