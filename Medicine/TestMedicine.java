package Week2.Day8.Medicine;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine medicine = new Medicine();
        Medicine[] medicinesArr = new Medicine[10];

        Random random = new Random();

        for (int i = 0; i < medicinesArr.length; i++) {
            int randomValue = random.nextInt(3);

            if (randomValue == 0) {
                medicine = new Tablet();
                medicinesArr[i] = medicine;
            } else if (randomValue == 1) {
                medicine = new Syrup();
                medicinesArr[i] = medicine;
            } else {
                medicine = new Ointment();
                medicinesArr[i] = medicine;
            }
        }

        for (Medicine m : medicinesArr) {
            m.displayLabel();
            System.out.println();
        }
    }
}

/*

Company Name : Mankind    Company Address : Aurangabad
Syrup :: Shake well before use.

Company Name : Mankind    Company Address : Aurangabad
Tablet :: Store in a cool and dry place.

Company Name : Mankind    Company Address : Aurangabad
Tablet :: Store in a cool and dry place.

Company Name : Mankind    Company Address : Aurangabad
Syrup :: Shake well before use.

Company Name : Mankind    Company Address : Aurangabad
Ointment :: For external use only.

Company Name : Mankind    Company Address : Aurangabad
Ointment :: For external use only.

Company Name : Mankind    Company Address : Aurangabad
Syrup :: Shake well before use.

Company Name : Mankind    Company Address : Aurangabad
Syrup :: Shake well before use.

Company Name : Mankind    Company Address : Aurangabad
Syrup :: Shake well before use.

Company Name : Mankind    Company Address : Aurangabad
Ointment :: For external use only.



* */