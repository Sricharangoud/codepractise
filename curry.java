public class curry {

    public static void main(String[] args) {
        title();
        ingredients();
        steps();
        endMessage();
    }
    static void title() {
        System.out.println("Tamarind Chutney Recipe");
    }
    static void ingredients() {
        System.out.println("Ingredients:");
        System.out.println("1. Tamarind - 1/2 cup");
        System.out.println("2. Jaggery - 1/2 cup");
        System.out.println("3. Red chilli powder - 1/2 tsp");
        System.out.println("4. Cumin powder - 1/2 tsp");
        System.out.println("5. Salt - 1/4 tsp");
    }
    static void steps() {
        System.out.println("Steps:");
        System.out.println("1. Soak tamarind in warm water for 15 minutes.");
        System.out.println("2. Squeeze the tamarind and take the pulp.");
        System.out.println("3. Heat the pulp and add jaggery.");
        System.out.println("4. Add chilli powder, cumin powder and salt.");
        System.out.println("5. Cook for 5 minutes and let it cool.");
    }
    static void endMessage() {
        System.out.println("Your Tamarind Chutney is ready");
    }
}