class eBayRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String result = eBay.register("Mohan", "Das", "mohandas346@gmail.com", "mohansry68hsc");
        System.out.println("Registration Result: " + result);

        System.out.println("Main ended");
    }
}