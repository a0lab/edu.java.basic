package io.jpm.bm.util;

public class MagicNumber {
    public float number;

    public MagicNumber() {
        this.number = 0;
    }
    public MagicNumber(float number) {
        this.number = number;
    }

    final String[] digitGroups = { "", "hundred","thousands", "lakhs", "crores" };

    public StringBuilder toWord() {
        StringBuilder wordString = new StringBuilder();
        long[] digitNumbers = this.splitNumber(this.number);

        for (int i = 4; i >= 0; i--)
        {
            if (digitNumbers[i] != 0)
            {
                if (i == 0 && wordString.length() > 0) wordString.append("and ");
                wordString.append(this.convertPartToWord(digitNumbers[i]) + " ");
                wordString.append(digitGroups[i] + " ");
            }
        }
        return wordString;
    }

    private StringBuilder convertPartToWord(float number)
    {
        final String[] zero2Nine =  { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        final String[] tengroup =  { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        final String[] teengroup = { "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

        StringBuilder wordString = new StringBuilder();

        // if single digit
        if (number < 10) {
            wordString.append(zero2Nine[(int)number]);
        }
        // if ten, twenty...ninety
        else if ((number % 10) == 0) {
            wordString.append(tengroup[(int)number/10-1]);
        }
        // from eleven to nineteen
        else if (number > 10 && number < 20) {
            wordString.append(teengroup[(int)(number % 10) - 1]);
        }
        else {
            wordString.append(tengroup[(int)(number) / 10 - 1]);
            wordString.append(" ");
            wordString.append(zero2Nine[(int)(number % 10)]);
        }
        return wordString;
    }

    private long[] splitNumber(float number) {
        long seed = (long) number;
        long[] digitArray = { 0, 0, 0, 0, 0 };

        //get last two digit
        if (seed != 0)
        {
            digitArray[0] = (long) seed % 100;
            seed = seed / 100;
        }

        //Get hundreds
        if (seed != 0)
        {
            digitArray[1] = (long) seed % 10;
            seed = seed / 10;
        }

        //Get thousands
        if (seed != 0)
        {
            digitArray[2] = (long) seed % 100;
            seed = seed / 100;
        }

        //Get Lakhs
        if (seed != 0)
        {
            digitArray[3] = (long) seed % 100;
            seed = seed / 100;
        }

        //Get Crores
        if (seed != 0)
        {
            digitArray[4] = (long) seed % 100;
            seed = seed / 100;
        }
        return digitArray;
    }
}
