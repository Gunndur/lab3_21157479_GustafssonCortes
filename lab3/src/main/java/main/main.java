package main;
import clases.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        option_21157479_GustafssonCortes op1 = new option_21157479_GustafssonCortes();
        ArrayList<String> key = new ArrayList<>();
        key.add("Viajar");
        key.add("wenapo");
        op1.option(1, "holan", 2, 3, ("Viajar"));
        System.out.println(op1.getCode());
        System.out.println(op1.getMessage());
        System.out.println(op1.getChatbotCodeLink());
        System.out.println(op1.getInitialFlowCodeLink());
        System.out.println(op1.getKeyword());
    }
}