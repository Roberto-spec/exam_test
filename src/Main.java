import java.util.Scanner;

public class Main  {
    Scanner scanner=new Scanner(System.in);
    Scanner scanner_line=new Scanner(System.in);


        public static void main(String[] args) {
            int a;
            Main main=new Main();
            History history=new History();
            Client client;
            do{
                a=main.Menu();
                if(a==1) {
                    client=new Client(main.input_cm(),main.input_kg(),main.input_name());
                    history.add(client);
                    main.show_result(client);
                }
                if(a==2&&history.lents()>=1){
                    client=history.find(main.input_name());
                    if(client.getName().equals("NO MATCH")) System.out.println("Нет совпадений");
                    else main.find_result(client);

                }
            }while (a!=3);



        }

        int Menu(){

            int a;
            System.out.println("Меню");
            System.out.println("[1]Новый расчет ИМТ");
            System.out.println("[2]История расчетов ИМТ");
            System.out.println("[3]Выход");
            System.out.print("Сделайте выбор: ");
            a=scanner.nextInt();
            return a;
        }
        String input_name(){
            String s=new String();
            System.out.print("Введите имя: ");
            s=scanner_line.nextLine();
            return s;
        }
        double input_kg(){
            double a=0;
            do {
                System.out.print("Введите вес в кг: ");
                a=scanner.nextInt();
            }while (a<0);

            return a;
        }
    double input_cm(){
        int a=0;
        do {
            System.out.print("Введите рочт в см: ");
            a=scanner.nextInt();
        }while (a<0);

        return a;
    }
    void show_result(Client client){
            System.out.println("Индекс массы тела: "+client.getIMT());
            System.out.println(client.getYour_profile());
            System.out.println(client.getRecomendation());

    }
    void find_result(Client client){
            System.out.println("Вес в кг: "+client.getM());
            System.out.println("Рост в см:"+client.getH()*100);
            show_result(client);

    }


}

