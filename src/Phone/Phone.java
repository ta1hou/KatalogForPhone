package Phone;

import java.util.Scanner;

public class Phone
{
    Scanner in = new Scanner (System.in) ;

    String model;
    String mark;
    String number;
    int ChargeLevel ;
    public Phone()
    {
        System.out.print("\nмарка -> ");
        mark = in.nextLine();
        System.out.print("\nмодель -> ");
        model = in.nextLine();

        ChargeLevel = 80;




    }


    public void numberDrug()
    {
        System.out.print("\nномер -> ");
        number = in.nextLine();
    }

    public int GetChargerLevel()
    {
        return ChargeLevel;
    }
    public void workPhon(int value)
    {
        ChargeLevel =- value;
    }

    public void GamePhone(int value)
    {
        System.out.print("\nзапуск игры");
        System.out.print("");
        System.out.print("██░▀██████████████▀░██\n" +
                      "　　█▌▒▒░████████████░▒▒▐█\n" +
                      "　　█░▒▒▒░██████████░▒▒▒░█\n" +
                      "　　▌░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▐\n" +
                      "　　░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░\n" +
                      "　 ███▀▀▀██▄▒▒▒▒▒▒▒▄██▀▀▀██\n" +
                      "　 ██░░░▐█░▀█▒▒▒▒▒█▀░█▌░░░█\n" +
                       "　 ▐▌░░░▐▄▌░▐▌▒▒▒▐▌░▐▄▌░░▐▌\n" +
                       "　　█░░░▐█▌░░▌▒▒▒▐░░▐█▌░░█\n" +
                       "　　▒▀▄▄▄█▄▄▄▌░▄░▐▄▄▄█▄▄▀▒\n" +
                       "　　░░░░░░░░░░└┴┘░░░░░░░░░\n" +
                       "　　██▄▄░░░░░░░░░░░░░░▄▄██\n" +
                       "　　████████▒▒▒▒▒▒████████\n" +
                       "　　█▀░░███▒▒░░▒░░▒▀██████\n" +
                       "　　█▒░███▒▒╖░░╥░░╓▒▐█████\n" +
                       "　　█▒░▀▀▀░░║░░║░░║░░█████\n" +
                       "　　██▄▄▄▄▀▀┴┴╚╧╧╝╧╧╝┴┴███\n" );

    }
    public void call() throws InterruptedException
    {
        int timeCall = 0;
        System.out.print("\nнаберите номер \n-> ");
        number = in.nextLine();
        System.out.println("производим звонок");
        for (int i =0; i<10; i++)
        {
            Thread.sleep(500);
            System.out.print(".");

        }

        System.out.println("вы разговариваете с "+number);
        /*for (int i =0; i<60; i++)
        {
            Thread.sleep(500);
            timeCall += i ;
            System.out.print(timeCall);

        }*/

        System.out.print("\n неразборчивые звуки возможно у консоли нет поддержки связи");
        System.out.println("");
        for (int i =0; i<5; i++)
        {
            Thread.sleep(400);
            System.out.print("пип ");

        }
        System.out.print("\n завершение звонка");

    }

    public void MessegePhone(int value)
    {

        System.out.print("\nвыберите получателя \nновый получатель(1) уже существующий(2)");
        int poluchatel = in.nextInt();

        switch (poluchatel)
{
    case 1 :
        System.out.print("\n");
        number= in.nextLine();
        System.out.print("\nвы пишите "+number);
        System.out.print("\n->");
        String messege = in.nextLine();
        System.out.print("\nвы написали"+number+"\n"+messege);

        break;
    case 2 :
        System.out.print("\nвы пишите "+number);
        System.out.print("\n->");
        String messege1 = in.nextLine();
        System.out.print("\nвы написали "+number+"\n"+messege1);
        break;
}

    }
    public void SocialNetwork(int value)
    {
        System.out.print("\nпроблемы с подключением к сети \nпроверти подключение к интернету или попробуйте зайти позже \n-");

    }


}
