package com.cydeo;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items=new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        System.out.println("--------------------------------------------------------");

        FootballPlayer joe=new FootballPlayer("joe");
        SoccerPlayer sam=new SoccerPlayer("sam");
        BaseballPlayer pat=new BaseballPlayer("Pat");
Team<SoccerPlayer> liverpool=new Team("Liverpool");
Team<BaseballPlayer> redSox=new Team("Red Sox");
Team<FootballPlayer> bulls=new Team("Bulls");
//liverpool.addPlayer(joe);
//redSox.addPlayer(sam);

    }

    private static void printDoubled(ArrayList<Integer> items) {
       // for(Object each: items){ // collection type is an object items hold objects
           // System.out.println((Integer)each*2); // cast to integer type to operate
        for (int each : items) {
            System.out.println(each*2);

        }
        }
    }

