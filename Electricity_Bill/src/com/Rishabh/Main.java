package com.Rishabh;

import java.util.List;

public class Main {
    public static void checkForValidConsumerNumber()
    {
        ElectricityBoard eb=new ElectricityBoard();
        EBBill ebObj1=null;
        EBBill ebObj2=null;
        EBBill ebObj3=null;
        EBBill ebObj4=null;
        try {
            ebObj1 = new EBBill("0191919191", "John", "Chennai", 650);
            eb.addBill(ebObj1);

        } catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        try{
            ebObj2=new EBBill("0191919192","Peter","Mumbai",750);
            eb.addBill(ebObj2);

        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        try {
            ebObj3 = new EBBill("0191919193", "Tom", "Hyderabad", 750);
            eb.addBill(ebObj3);

        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }

        try {
            ebObj4 = new EBBill("01919191945", "Sam", "Chennai", 550);
            eb.addBill(ebObj4);

        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        eb.generateBill();
        System.out.println("Bill Details");
        if(ebObj1!=null){
            System.out.println("EBBill for John "+ebObj1.getBillAmount());//Expected 1625.0
        }
        if(ebObj2!=null){
            System.out.println("EBBill for Peter "+ebObj2.getBillAmount());//Expected 2175.0
        }
        if(ebObj3!=null){
            System.out.println("EBBill for Tom "+ebObj3.getBillAmount());//Expected 2175.0
        }
        if(ebObj4!=null){
            System.out.println("EBBill for Tom "+ebObj4.getBillAmount());//Expected 1175.0
        }
        List<EBBill> ebBills=eb.findMaximumUnitsConsumedEBBills();
        System.out.println("Consumer numbers for Maximum units consumed");
        for(EBBill eBill:ebBills){
            System.out.println(eBill.getConsumerNumber());
        }
    }
    public void checkForInvalidConsumerNumber(){
        ElectricityBoard eb=new ElectricityBoard();
        EBBill ebObj1=null;
        EBBill ebObj2=null;
        EBBill ebObj3=null;
        EBBill ebObj4=null;
        try{
            ebObj1=new EBBill("1919191", "John", "Chennai", 650);
            eb.addBill(ebObj1);
        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        try{
            ebObj2=new EBBill("0191919192", "Peter", "Mumbai", 750);
            eb.addBill(ebObj2);
        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        try{
            ebObj3=new EBBill("0191919193", "Tom", "Hyderabad", 750);
            eb.addBill(ebObj3);
        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        try{
            ebObj4=new EBBill("0191919194", "Sam", "Chennai", 550);
            eb.addBill(ebObj4);
        }catch (InvalidConsumerNumberException e){
            System.out.println("Exception "+e.getMessage());
        }
        eb.generateBill();
        System.out.println("Bill Details");
        if(ebObj1!=null){
            System.out.println("EBBill for John "+ebObj1.getBillAmount());//Expected 1625.0
        }
        if(ebObj2!=null){
            System.out.println("EBBill for Peter "+ebObj2.getBillAmount());//Expected 2175.0
        }
        if(ebObj3!=null){
            System.out.println("EBBill for Tom "+ebObj3.getBillAmount());//Expected 2175.0
        }
        if(ebObj3!=null){
            System.out.println("EBBill for Tom "+ebObj4.getBillAmount());//Expected 1175.0
        }
        List<EBBill> ebBills=eb.findMaximumUnitsConsumedEBBills();
        System.out.println("Consumer numbers for Maximum units consumed");
        for(EBBill eBill:ebBills){
            System.out.println(eBill.getConsumerNumber());
        }
    }

    public static void main(String[] args) {
        Main mainObj=new Main();
        mainObj.checkForValidConsumerNumber();
        mainObj.checkForInvalidConsumerNumber();
    }

}
