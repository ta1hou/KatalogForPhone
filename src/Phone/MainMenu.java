package Phone;

import java.util.Scanner;

public class MainMenu
{
    Scanner in = new Scanner (System.in) ;
    public void Menu() throws InterruptedException
    {

        Thread.sleep(500);
        System.out.print("\nвы пришли в магазин техники");
        Thread.sleep(500);
        System.out.print("\nскопив школьные обеды теперь вы сможете купить новый телефон");
        Thread.sleep(500);
        System.out.print("\nк вам подходит консультант*");
        Thread.sleep(500);
        System.out.print("\nкакой телефон вы хотите?");
        Phone MyPhone = new Phone();
        Thread.sleep(500);
        System.out.print("\nкупив телефон вы идете домой \n");
        for(int i = 0; i <5; i++)
        {
            Thread.sleep(1000);
            System.out.print("идешь ");
        }
        System.out.print("\nпридя домой вы достаете телефон и уже готовы им пользоваться ");
        Thread.sleep(500);
        System.out.print("\nнадо записать телефон друга ");
        MyPhone.numberDrug();
        GameMenu(MyPhone);





    }


    public void GameMenu(Phone phone) throws InterruptedException {
        boolean GameOn = true;
        do
        {
            Thread.sleep(500);
            System.out.print("\nвыберите действие (1-играть) (2-войти в сеть) (3-позвонить) (4-написать) (5-выйти в окно) \n->");
            int vibor = in.nextInt();
            switch (vibor)
            {
                case 1:
                    phone.GamePhone(50);
                    if(phone.GetChargerLevel() <= 0)
                    {
                        System.out.print("\nтелефон сел");
                     GameOn = false;
                    }
                    phone.workPhon(10);
                    break;
                case 2:
                    phone.SocialNetwork(10);
                    if(phone.GetChargerLevel() <= 0)
                    {
                        System.out.print("\nтелефон сел");
                        GameOn = false;
                    }
                    phone.workPhon(10);
                    break;
                case 3:
                    phone.call();
                    if(phone.GetChargerLevel() <= 0)
                    {
                        System.out.print("\nтелефон сел");
                        GameOn = false;
                    }
                    phone.workPhon(10);
                    break;
                case 4:
                    phone.MessegePhone(10);
                    if(phone.GetChargerLevel() <= 0)
                    {
                        System.out.print("\nтелефон сел");
                        GameOn = false;
                    }
                    phone.workPhon(10);
                    break;
                case 5:
                    System.out.print("\nспасибо за то что играли! \nскинте деньги на карту для получения полный версии игры\n-> 4899 9333 3455 1882");
                    GameOn = false;
                    break;
            }
            System.out.print("");
            System.out.print(phone.GetChargerLevel());
        }
        while (GameOn);
    }

    private void EndGame(Phone phone)
    {
        if (phone.GetChargerLevel() <= 0)
        {
        }
    }
}
