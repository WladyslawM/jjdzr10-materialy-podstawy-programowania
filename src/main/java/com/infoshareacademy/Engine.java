package com.infoshareacademy;

public class Engine {
   private Integer power;
   private Integer capacity;

   public void setPower(Integer power) {
       this.power = power;
   }
   public void setCapacity(Integer capacity){
       this.capacity = capacity;
   }

   public Integer getPower() {
       return power;
   }
   public Integer getCapacity() {
       return capacity;
   }
   public void intPower () {
       System.out.println(power);
   }

   public void intCapacyti() {
       System.out.println(capacity);
   }

}
