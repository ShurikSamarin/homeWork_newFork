package tree_structure;


import members.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable{
    private int id;
    private int humanId;
    private List<Human> humanList;

    public FamilyTree(int id){
        this.id = id;
        humanList = new ArrayList<>();
    }

    public void addHuman(Human human){
        human.setId(humanId++);
        humanList.add(human);
    }

    public String getHumanInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Members list:\n");
        for (Human human: humanList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
            
        }
        return stringBuilder.toString();
    }
   
}
