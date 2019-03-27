package Session_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Show menu
    public void showMenu(){
        System.out.println("Moi ban chon menu:");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
    }
    //1. Add student. 
    public void addStu(ArrayList<Student> stuList){
        Student objStu = new Student();
        Scanner sc= new Scanner(System.in);
        objStu.setId(stuList.size()+1);
        System.out.println("Name: ");
        objStu.setName(sc.nextLine());
        System.out.println("Age: ");
        if(sc.hasNextInt()){
            objStu.setAge(sc.nextInt());
        }else{
            System.out.println("Du lieu nhap sai dinh dang!");
        }

        System.out.println("Address: ");
        objStu.setAddress(sc.nextLine());
        sc.next();
        System.out.println("GPA: ");
        if(sc.hasNextDouble()){
            objStu.setGpa(sc.nextDouble());;
        }else{
            System.out.println("Du lieu nhap sai dinh dang!");
        }

        stuList.add(objStu);
        System.out.println("Add Student succeed!");
    }
    //2. Edit student by id.
    public void editStu(int id, ArrayList<Student> stuList){
        System.out.println("Ban dang edit sinh vien id = " + id);
        int index=-1;
        for(Student x: stuList){
            if(x.getId()==id){
                index= stuList.indexOf(x);
                break;
            }
        };
        if(index>=0){
            System.out.println("Moi nhap lai thong tin sinh vien:");
            Scanner sc= new Scanner(System.in);
            System.out.println("Name: ");
            stuList.get(index).setName(sc.nextLine());
            System.out.println("Age: ");
            if(sc.hasNextInt()){
                stuList.get(index).setAge(sc.nextInt());
            }else{
                System.out.println("Du lieu nhap sai dinh dang!");
            }
            System.out.println("Address: ");
            stuList.get(index).setAddress(sc.nextLine());
            sc.next();
            System.out.println("GPA: ");
            if(sc.hasNextDouble()){
                stuList.get(index).setGpa(sc.nextDouble());
            }else{
                System.out.println("Du lieu nhap sai dinh dang!");
            }

            System.out.println("Edit succeed!");
        }else {
            System.out.println("Khong tim duoc sinh vien nay!");
        }
    }

    // 3. Delete student by id. 
    public void deleteStu(int id, ArrayList<Student> stuList){
        System.out.println("Ban dang xoa sinh vien id = " + id);
        int index=-1;
        Student stuDelete= new Student();
        for(Student x: stuList){
            if(x.getId()==id){
                index= stuList.indexOf(x);
                stuDelete= x;
                break;
            }
        };
        if(index==-1){
             System.out.println("Khong tim duoc sinh vien nay!");
        }else {
            stuList.remove(stuDelete);
            System.out.println("Delete succeed!");
        }
    }
    //4. Sort student by gpa. 
    public void sortGpa(ArrayList<Student> stuList){
        for (int i=0; i<stuList.size();i++){
            for (int j=i+1; j<stuList.size();j++){
                if (stuList.get(i).getGpa()<stuList.get(j).getGpa()){
                    Student x = new Student();
                    x = stuList.get(i);
                    stuList.set(i,stuList.get(j));
                    stuList.set(j,x);
                }
            }
        }
        System.out.println("Sort by GPA succeed!");
    }
    //5. Sort student by name. 
    public void sortName(ArrayList<Student> stuList){
        for (int i=0; i<stuList.size();i++){
            for (int j=i+1; j<stuList.size();j++){
                if (stuList.get(i).getName().compareTo(stuList.get(j).getName())>0){
                    Student x = new Student();
                    x = stuList.get(i);
                    stuList.set(i,stuList.get(j));
                    stuList.set(j,x);
                }
            }
        }
        System.out.println("Sort by Name succeed!");
    }
    //6. Show student. 
    public void showListStudent(ArrayList<Student> stuList){
        System.out.println("List student:");
        for (Student x: stuList){
            System.out.println(x.getId()+ ":"+ x.getName()+":"+x.getGpa());
        }
    }
    //0. Exit.
    public void exitMenu(){
        System.out.println("Exit menu!!!");
    }

}
