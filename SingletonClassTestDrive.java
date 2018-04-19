
//package com.kishor.design;

public class SingletonClassTestDrive 
{
	public static void main(String[] args) throws CloneNotSupportedException   {
    SingletonClass instance1 = SingletonClass.getInstance();
   // SingletonClass instance2 = (SingletonClass) instance1.clone();
    System.out.println("instance1 hashCode:- " + instance1.hashCode());
  //  System.out.println("instance2 hashCode:- "+ instance2.hashCode()); 
  }
}
