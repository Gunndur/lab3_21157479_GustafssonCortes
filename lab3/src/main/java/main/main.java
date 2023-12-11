package main;
import clases.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        option_21157479_GustafssonCortes op1 = new option_21157479_GustafssonCortes();
        op1.option_21157479_GustafssonCortes(1, "holan", 2, 3, "Viajar", "a", "ffasdsdfa");

        flow_21157479_GustafssonCortes fl1 = new flow_21157479_GustafssonCortes();
        fl1.flow_21157479_GustafssonCortes(1,"comoandan", );




        System.out.println(op1.getCode());
        System.out.println(op1.getMessage());
        System.out.println(op1.getChatbotCodeLink());
        System.out.println(op1.getInitialFlowCodeLink());
        System.out.println(op1.getKeyword());
        System.out.print("[");
        for(String x : op1.getKeyword()){
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.print("]");
    }
}