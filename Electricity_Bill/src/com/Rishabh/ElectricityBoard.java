package com.Rishabh;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ElectricityBoard {
    private List<EBBill> ebBillList=new ArrayList<EBBill>();

    public ElectricityBoard() {
    }
    public void addBill(EBBill eb){
        this.ebBillList.add(eb);
    }
    public void generateBill(){
        for(EBBill obj:this.ebBillList){
            obj.calculateBillAmount();
        }
    }

    public List<EBBill> getEbBillList() {
        return ebBillList;
    }
    public List<EBBill> findMaximumUnitsConsumedEBBills(){
        int max= this.ebBillList.get(0).getUnitsConsumed();
        List<EBBill> ebBills=new ArrayList<EBBill>();
        for(EBBill obj:this.ebBillList){
            if(obj.getUnitsConsumed()>max ) {
                max=obj.getUnitsConsumed();
            }
        }
        //System.out.println("Max"+ max);
        for(EBBill obj: ebBillList){
            if(obj.getUnitsConsumed()== max){
                ebBills.add(obj);
            }
        }
        return ebBills;
    }
}
