package lambda;


import java.util.InputMismatchException;
import java.util.Scanner;

class SelfException extends Exception{
    SelfException(){
        super ("Second Number less than 5");
        }
    }


public class Main {
    public static void main(String[] args) {
        System.out.println("The program Starts here");
        try{

            Sum add = (a,b) -> a+b;
            Sub diff =(a,b) -> a-b;
            PrOduct mul = (a,b) -> a*b;
            Divide div = (a,b) -> a/b;
            Modulus mod = (a,b) -> a%b;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();



            switch (button) {
                case 1:
                    System.out.println(add.sum(a, b));
                    break;
                case 2:
                    System.out.println(diff.sub(a,b));
                    break;
                case 3:
                    System.out.println(mul.product(a, b));
                    break;
                case 4:
                    System.out.println(div.divide(a,b));
                    break;
                case 5:
                    System.out.println(mod.modulus(a,b));
                    break;
                default:
                    System.out.println("Wrong Button Number");
            }

            if(b<5) {
                throw new SelfException();
            }

        }catch(SelfException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Only numbers Accepted");
        }
        catch(ArithmeticException e){
            System.out.println("cannot be divided by 0");
        }

        System.out.println("Program Ends Here");
    }
}
