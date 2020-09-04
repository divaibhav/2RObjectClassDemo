/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Sep-20
 *  Time: 11:07 AM
 */
package databean;
// overriding toString(), equals(), hashCode()
public class Student {
    private int rollNo;
    private String name;

    //override equals()

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        //checking type of current object and obj
        if(obj instanceof Student){
            //compare instance variables for equality
            // but first cast obj to student
            Student student = (Student) obj;
            //now compare
            if(rollNo == student.getRollNo() && name.equals(student.getName())){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }














    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
