import java.util.Scanner;
public class Data{
    private int day, month, year;

    public Data() {
        int dia, mes, ano;
        dia = setDay();
        mes = setMonth();
        ano = setYear();
        verifica(dia,mes,ano);



    }

    /** verifica se a data é valida ou nao, e inicializa o dia, mes e ano*/
    public void verifica(int dia, int mes, int ano){
        if (mes > 0 && mes <= 12) {
            this.month = mes;
        } else {
            System.out.println("ERRO,mês tem que ser entre 1 e 12 ");
            this.month = checkMonth(mes);
        }
        if (ano > 0) {
            this.year = ano;
        }
        if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
            this.day = dia;
        else if ((dia >= 1 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
            this.day = dia;
        else if ((dia >= 1 && dia <= 28) && (mes == 2))
            this.day = dia;
        else if (dia == 29 && mes == 2 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
            this.day = dia;
        else
            System.out.print("ERRO, data inválida!!\n");
        this.day = checkDay(dia);
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear(){

        return year;
    }

    private int setDay(){
        System.out.print("Dia: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            day = sc.nextInt();
        }else{
            System.out.print("Digito Inválido!!");
            System.exit(0);
        }
        return day;
    }
    private int setMonth(){
        System.out.print("Mês: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            month = sc.nextInt();
        }else{
            System.out.print("Digito Inválido!!");
            System.exit(0);
        }
        return month;
    }
    private int setYear(){
        System.out.print("Ano: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            year = sc.nextInt();
        }else{
            System.out.print("Digito Inválido!!");
            System.exit(0);
        }
        return year;
    }
    public int checkMonth(int month){
        while( month < 1 || month > 12) {
            System.out.print("Mês: ");
            Scanner sc = new Scanner(System.in);
            month = sc.nextInt();
        }
        return month;
    }
    /** verifica se as datas são validas, se nao forem volta a pedir*/
    public int checkDay(int day){
        if( month == 2 && year % 4 != 0){
            while(day < 1 || day > 28) {
                System.out.print("Dia: ");
                Scanner sc = new Scanner(System.in);
                day = sc.nextInt();

            }
        }else if ( month == 2 ) {
            while( day < 1 || day > 29){
                System.out.print("Dia: ");
                Scanner sc = new Scanner(System.in);
                day = sc.nextInt();
            }

        }else{
            if(month < 7 && month % 2 == 0){
                while( day < 1 || day > 30){
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();
                }
            }else if( month > 7 && month % 2 != 0){
                while ( day < 1 || day > 30) {
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();

                }
            }else{
                while( day < 1 || day > 31){
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();
                }
            }
        }
        return day;
    }

    @Override
    public String toString() {
        return "Data: "  + day + "-"  + month + "-" + year ;
    }

}
