package player;

import java.text.DecimalFormat;

public class Player {
     public String name;
     private String contact;
     private String email;
     private String collegeName;
     private int age;
     public int n;
     public Player(int n){
        this.n=n;
     }
     public void setName(String name){
        this.name=name;
     }
     public void setEmail(String email){
        this.email=email;
     }
     public boolean setContact(String contact){
        if(contact.length()==10){
            this.contact=contact;
          return true;
        }
          else
          return false;
     }
     public boolean setAge(int age){
        if(age<=0)
        {
            return false;
        }
        else{
            this.age=age;
            return true;
        }
     }
     public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
     }
      public void getDetails(){
        System.out.println("Player details:");
        System.out.println("Name : "+this.name);
       
        System.out.println("Mobile number : "+contact);
         System.out.println("Age : "+this.age);
         System.out.println("CollegeName : "+this.collegeName);
     }

}
