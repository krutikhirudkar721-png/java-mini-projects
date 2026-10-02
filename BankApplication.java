// Use throws and handle exception in main//
class BankApplication {
    static void process() throws Exception {
        throw new Exception("Transaction failed");
    }
    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
