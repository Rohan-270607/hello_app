public class uc6 {
    public static void main(String[] args) {

        String name = "";

        // If no arguments → default
        if (args.length == 0) {
            name = "World";
        }
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove last ", "
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}