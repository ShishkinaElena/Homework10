package dz10;

public class NameAbonent {

    public static String getNameAbonent() throws NameException{
        String abonent = "";
        if (abonent.length() < 4) throw new NameException("   ", abonent);
        getNameAbonent();
        return abonent;
    }


static class   NameException  extends Exception {
    public String getAbonent() {
        return abonent;
    }

    public void setAbonent(String abonent) {
        this.abonent = abonent;
    }

    public NameException(String message, String abonent) {
        super(message);
        this.abonent = abonent;
    }

    private String abonent;

}
}
