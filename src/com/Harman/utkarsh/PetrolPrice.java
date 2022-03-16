package com.Harman.utkarsh;

abstract class PetrolPrice {
    abstract void changePrice(); // hide it from
}
class Govt extends PetrolPrice{
    void changePrice(){
        System.out.println("Increment by 2%");

    }

    public static void main(String[] args) {

        PetrolPrice price= new Govt();
        price.changePrice();

    }



}