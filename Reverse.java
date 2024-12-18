import java.util.Stack;

class ReverseString_Using_Stack {

  public static void main(String[] args) {
    String name = "Murali";

    Stack<String> st = new Stack<>();

    for (char c : name.toCharArray()) {
      st.push(Character.toString(c));
    }

    String rev = "";

    while (!st.empty()) {
      rev += st.pop();
    }

    System.out.println(rev);
  }
}
