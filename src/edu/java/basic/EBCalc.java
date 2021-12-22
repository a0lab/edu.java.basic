package edu.java.basic;

public class EBCalc implements EBOperations {
    String accountName;
    int meterReading;
    int usageUnits;
    float billAmount;
    float unitPrice = 1.55f;
    boolean isBillGenerated;

    EBCalc(String accountName, int intialReading) {
        this.meterReading = intialReading;
        this.accountName = accountName;
    }


    @Override
    public void setMeterReading(int currentMeterReading) {
        this.usageUnits = currentMeterReading - this.meterReading;
    }

    @Override
    public void generateBill() {
        this.billAmount = this.unitPrice * this.usageUnits;
        this.isBillGenerated = true;
    }

    @Override
    public void printBill() {
        if (!this.isBillGenerated) {
            System.out.println("Bill is not generated yet");
            return;
        }

        System.out.println("----------------------------------------------");
        System.out.println("Account Name:" + this.accountName);
        System.out.println("Account Usage:" + this.usageUnits);
        System.out.println("----------------------------------------------");
        System.out.println("Bill Amount:" + this.billAmount);
        System.out.println("----------------------------------------------");
    }
}
