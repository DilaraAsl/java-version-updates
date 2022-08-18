package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player>{ // Team <T> T stands for type - T can be Soccer Team, Football Team , Baseball team
    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) { // add the player to the team
        if(members.contains(player)){
            System.out.println(((Player)player).getName()+" is already on the team.");
            return false;
        }
        else {
            members.add(player);
            System.out.println(((Player)player).getName()+ " is added to the team."+ this.name); // this.name team name
        }
        return true;
    }
}