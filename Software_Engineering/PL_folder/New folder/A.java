public class A {  
public static void main(String[] args) {
    String[] tokens = "Welcome to Java".split("o");
for (int i = 0; i < tokens.length; i++) {
    System.out.print(tokens[i] + " ");
}
}

@Override
public String toString() {
    return "A []";
}
}
