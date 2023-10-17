import java.util.Scanner;

public class Trafficlightsimulator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the colour of signal");
        String colour=sc.nextLine();
        switch(colour){
            case "red":{
                System.out.println("STOP! THE LIGHT IS RED");
                colour = "green";
                    System.out.println("next state:" +colour);
                    break;
                }
                case "yellow":{
                    System.out.println("PREPARE TO STOP . THE LIGHT IS YELLOW");
                    colour = "red";
                    System.out.println("next state:"+colour);
                    break;
                }
                case "green":{
                    System.out.println("GO! THE LIGHT IS GREEN");
                    colour = "yellow";
                    System.out.println("next state:" +colour);
                    break;
                }
                default:{
                    System.out.println("invalid state");
                }
            }
        }
    }
    

