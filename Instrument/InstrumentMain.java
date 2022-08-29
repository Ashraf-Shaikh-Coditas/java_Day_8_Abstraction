package Week2.Day8.Instrument;

public class InstrumentMain {
    public static void main(String[] args) {
        Instrument instrument;
        Instrument[] InstrumentArr = new Instrument[10];

        instrument = new Flute();
        InstrumentArr[0] = instrument;

        instrument = new Guitar();
        InstrumentArr[1] = instrument;

        instrument = new Piano();
        InstrumentArr[2] = instrument;

        instrument = new Piano();
        InstrumentArr[3] = instrument;

        instrument = new Guitar();
        InstrumentArr[4] = instrument;

        instrument = new Flute();
        InstrumentArr[5] = instrument;

        instrument = new Flute();
        InstrumentArr[6] = instrument;

        instrument = new Piano();
        InstrumentArr[7] = instrument;

        instrument = new Guitar();
        InstrumentArr[8] = instrument;

        instrument = new Flute();
        InstrumentArr[9] = instrument;

        for (Instrument i : InstrumentArr) {
            i.play();
        }

        int counter = 0;  // for displaying index values starting from 0.

        for (Instrument i : InstrumentArr) {
            if (i instanceof Flute) {

                System.out.println("Flute instance present at index :: " + counter++);

            } else if (i instanceof Guitar) {

                System.out.println("Guitar instance present at index :: " + counter++);

            } else {

                System.out.println("Flute instance present at index :: " + counter++);

            }
        }
    }
}

/*

Flute is playing toot toot toot toot...
Guitar is playing tin tin tin tin...
Piano is playing tan tan tan tan...
Piano is playing tan tan tan tan...
Guitar is playing tin tin tin tin...
Flute is playing toot toot toot toot...
Flute is playing toot toot toot toot...
Piano is playing tan tan tan tan...
Guitar is playing tin tin tin tin...
Flute is playing toot toot toot toot...


Flute instance present at index :: 0
Guitar instance present at index :: 1
Flute instance present at index :: 2
Flute instance present at index :: 3
Guitar instance present at index :: 4
Flute instance present at index :: 5
Flute instance present at index :: 6
Flute instance present at index :: 7
Guitar instance present at index :: 8
Flute instance present at index :: 9



* */