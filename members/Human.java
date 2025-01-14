package members;

import java.io.Serializable;

import tree_structure.Subject;

public class Human implements Serializable, Comparable<Human>, Subject{
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Boolean gender;
    private int father_id;
    private int mother_id;
    private int birthday_date;
    private String birth_place;
    /*private String siblings;
    private String children;
    private Boolean alive_status;  */

    public Human(String name, String surname, String patronymic, String birth_place){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birth_place = birth_place;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public Boolean getGender(){
        return gender;
    }

    public int getFather_id(){
        return father_id;
    }

    public int getMother_id(){
        return mother_id;
    }


    public String getName() {
        return name;
    }

    public String getSurName(){
        return surname;
    }

    public String getBirth_place(){
        return birth_place;
    }

    public Integer getBirthday_date(){
        return birthday_date;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", surname: " + surname + ", patronymic: " + patronymic + ", birth place: " + birth_place;
    }

    @Override
    public int compareTo(Human o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public Object Human() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Human'");
    }

    @Override
    public Object Dog() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Dog'");
    }

}   
