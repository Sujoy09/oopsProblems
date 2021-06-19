package com.bridgelabz.oopsProblems;

import java.util.List;
import com.bridgelabz.oopsProblems.Model.Stock;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JsonUtil jsonUtil = new JsonUtil();
        List<Stock> listStock=jsonUtil.convertJsonToObj("C:\\Users\\user\\eclipse-workspace\\oopsProblems\\src\\main\\java\\com\\bridgelabz\\oopsProblems\\Inventory.json");
        System.out.println(listStock.size());
    }
}
