package JV2_Ass_2;

import java.util.ArrayList;

public class PersonModel<E> {
    ArrayList<E> arrPerson = new ArrayList<>();

//    public PersonModel() {
//        this.arrPerson= new ArrayList<>();
//    }

    public ArrayList<E> getArrPerson() {
        return arrPerson;
    }

    public void setArrPerson(ArrayList<E> arrPerson) {
        this.arrPerson = arrPerson;
    }
    //Method add 1 thanh vien moi
    public void add(E newMember){
        arrPerson.add(newMember);
    }
    //Method Print list of members
    public void print(){
        for(E x: arrPerson){
            System.out.println(x.toString());
        }
     }
}
