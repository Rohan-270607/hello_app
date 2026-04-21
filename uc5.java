public class uc5 {
    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}