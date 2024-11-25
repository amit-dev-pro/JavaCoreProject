import java.util.Scanner;

public class showRoomBased {
    public static void maruti() {
        String[] f = {"Engine Type : Z12E",
                "Engine Capacity : 1197",
                "Max. Power : 60kw@5700 rpm",
                "No. of Cylinders : 3",
                "Fuel Efficiency : 24.8 km/l"};

        for(String str: f) {
            System.out.println(str);
        }
    }

    public static void fortuner1() {
        String[] fe={"city mileage : 8 km/pl"
                ,"Fuel Type : Diesel",
                "No. of Cylinders : 4",
                "Max. Power : 201.15bhp@3000-3400rpm",
                "Sitting Capacity : 7",
                "Fuel Tank Capacity : 80 Litres"};

        for(String str1:fe) {
            System.out.println(str1);
        }
    }

    public static void xuv() {
        String [] fea={"Fuel Type : Petrol",
                "No. of Airbags : 2",
                "Power Steering : Yes",
                "Engine Capacity : 1997 cc",
                "Transmission Type : Manual",
                "Anti Lock Breaking System : Yes"};

        for(String str2: fea) {
            System.out.println(str2);
        }
    }

    public static void main(String[]args){
        System.out.println("\n......................These All Cars are Available  My Showroom.......................\n");
        System.out.println("1. Maruti Suzuki\n"+"2. Toyota Fortuner\n"+"3. xuv 700\n");
        System.out.println("..................... WELCOME TO MY SHOWROOM .......................");



        Scanner sc=new Scanner(System.in);
        System.out.println("You Can Search Here Whatever you like ...");
        String c=sc.nextLine();

        String[] car={"Maruti suzuki","Toyota Fortuner","xuv 700"};

        for(String str : car) {
            if(str.equalsIgnoreCase("maruti suzuki")) {
                maruti();
                break;
            }
            else if(str.equalsIgnoreCase("Toyota Fortuner")) {
                fortuner1();
                break;
            }

            else if(str.equalsIgnoreCase("xuv 700")) {
                xuv();
                break;
            }
            else {
                System.out.println("you searched invalid things ..........");
            }
        }

        System.out.println("RADHA KRISHNA");
    }
}
