package Week2.Day8.Medicine;

public class Ointment extends Medicine {

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Ointment :: For external use only.");
    }

}
