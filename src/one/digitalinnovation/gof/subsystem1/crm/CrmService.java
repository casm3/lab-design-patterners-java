package one.digitalinnovation.gof.subsystem1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void storeClient(String name, String postalCode, String city, String state) {
        System.out.println("Client stored at CRM system");
        System.out.println(name);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(state);
    }
}
