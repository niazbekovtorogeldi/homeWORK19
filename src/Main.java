import java.lang.reflect.AccessibleObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                                             System.out.println("бир планета танданыз");  
        Scanner scanner = new Scanner(System.in);

        String planetName=scanner.next();


        Planet planet = Planet.valueOf(planetName.toUpperCase());



        planet = Planet.valueOf(planetName.toUpperCase());

        switch (planetName) {
                    case "МАРС":
                        System.out.println(planetName + "-жер планетасына окшош");
                          break;
                    case "ЮПИТЕР":
                        System.out.println(planetName + "-күн системасындагы эң чон планета");
                          break;
                    case "МЕРКУРИЙ":
                         System.out.println(planetName+"-наименьшая планета Солнечной системы и самая близкая к Солнцу");
                          break;
                    case "ВЕНЕРА":
                         System.out.println(planetName+"-вторая по удалённости от Солнца и шестая по размеру планета Солнечной системы");
                          break;
                    case "ЖЕР":
                          System.out.println(planetName+"-третья по удалённости от Солнца планета Солнечной системы");
                          break;
                    case "САТУРН":
                           System.out.println(planetName+"-классифицируется как газовая планета-гигант");
                          break;
                    case "УРАН":
                           System.out.println(planetName+"-планета Солнечной системы, седьмая по удалённости от Солнца, третья по диаметру и четвёртая по массе");
                          break;
                    case "НЕПТУН":
                           System.out.println(planetName+"-восьмая и самая дальняя от Солнца планета Солнечной системы");
                          break;
                    default:
                        System.out.println( "бул планета тизмеде жок, башка планета танданыз");
                }
            }
        }

