package com.Rishabh;

public class EBBill {
    private String consumerNumber;
    private String consumerName;
    private String consumerAddress;
    private int unitsConsumed;
    private double billAmount;

    public String getConsumerNumber() {
        return this.consumerNumber;
    }

    public String getConsumerName() {
        return this.consumerName;
    }

    public String getConsumerAddress() {
        return this.consumerAddress;
    }

    public int getUnitsConsumed() {
        return this.unitsConsumed;
    }

    public double getBillAmount() {
        return this.billAmount;
    }

    public void setConsumerNumber(String consumerNumber) {
        this.consumerNumber = consumerNumber;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public EBBill(String consumerNumber, String consumerName, String consumerAddress, int unitsConsumed) throws InvalidConsumerNumberException{
        if ( consumerNumber.length() != 10) {
            throw new InvalidConsumerNumberException("Invalid Consumer Number");
        }
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.consumerAddress = consumerAddress;
        this.unitsConsumed = unitsConsumed;
    }
    public void calculateBillAmount(){
        this.billAmount=0;
        if(this.unitsConsumed<=100){
            this.billAmount=0;
        }else if(this.unitsConsumed>100 && this.unitsConsumed<=300){
            this.billAmount=(this.unitsConsumed-100)*1.5;
        }else if(this.unitsConsumed>300 && this.unitsConsumed<=600){
            this.billAmount=(200*1.5)+(this.unitsConsumed-300)*3.5;
        }else if(this.unitsConsumed>600 && this.unitsConsumed<=1000){
            this.billAmount=(200*1.5)+(300*3.5)+(this.unitsConsumed-600)*5.5;
        }else{
            this.billAmount=(200*1.5)+(300*3.5)+(600*5.5)+(this.unitsConsumed-1000)*7.5;
        }
    }
}
