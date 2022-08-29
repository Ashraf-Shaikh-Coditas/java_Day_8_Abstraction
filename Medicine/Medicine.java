package Week2.Day8.Medicine;

public class Medicine {
    private String companyName;
    private String companyAddress;

    public Medicine() {
        this.companyName = "Mankind";
        this.companyAddress = "Aurangabad";
    }

    public void displayLabel() {
        System.out.println("Company Name : "+companyName+"    Company Address : "+companyAddress);
    }

}
