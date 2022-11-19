package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsystem1.crm.CrmService;
import one.digitalinnovation.gof.subsystem2.postalcode.CepApi;

public class Facade {
    public void migrateClient(String name, String postalCode){
        String city = CepApi.getInstance().recoverCity(postalCode);
        String state = CepApi.getInstance().recoverState(postalCode);
        CrmService.storeClient(name, postalCode, city, state);
    }
}
