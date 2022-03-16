package com.Harman.utkarsh;
// Exception Handling
public class Check_Exception {

//    public static void main(String[] args) {
//        try{
//            int x = 10, y = 0,z;
//            z=x/y;
//            System.out.println(z);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//
//        }
//
//
//
//    }

    //
//    public static void main(String[] args) {
//        try{
//            String name = null;
//            System.out.println(name.length());
//
//        }
//        catch(ArithmeticException e){
//
//            System.out.println("Divide by Zero is not possible");
//        }
//        catch(NullPointerException e){
//
//            System.out.println("Null value is not accepted");
//        }
//        catch (Exception e){
//
//            System.out.println(e);
//        }
//    }
//
//
// Introduction to finally
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException e) {
            System.out.println("Null value is not accepted");

        }
        finally {
            System.out.println("Harman is nice company");
        }
    }

}