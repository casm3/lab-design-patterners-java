package one.digitalinnovation.gof.subsystem2.postalcode;

public class CepApi {
    public static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recoverCity(String cep) {
        return "Brasília";
    }

    public String recoverState(String cep) {
        return "Brasília";
    }
}
