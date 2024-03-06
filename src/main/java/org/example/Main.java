package org.example;

import javax.xml.transform.Result;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("my name is jenggo");
        System.out.println("i am autobot");

        //variable
        boolean flag;
        float run;
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + 1);
        }
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Deni";
        char q = 'y';
        boolean flag2 = false;

        float result;
        //int result; //sebelumnya int diubah jadi float
        //result = (a/c);
        result = (int) (a/b);
        System.out.println(result);

        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 7;
        int waktuPulang =12;
        //karyawan tepat waktu datang dan pulang dapat selamat
        if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("selamat kamu tepat waktu");
            System.out.println("Anda datang "+(timeStart - waktuSaya) + " lebih cepat");
            System.out.println("Anda pulang"+(waktuPulang-timeFinish)+" jam lebih lama");
            //karyawan datang duluan, pulang cepat di cengin
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("datang awal pulang cepat nih ye");
            //karyawan telat, pulang lama, dimaafkan
        } else if (waktuSaya >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaafkan datang telatnya");
            //karyawan telat , pulang di soraki
        } else {
            System.out.println("Kamu Telat");
            System.out.println("Kamu telat" + (waktuSaya - timeStart) + " jam");
            System.out.println("anda pulang duluan" + (timeFinish - waktuPulang) + " jam lebih cepat");
        }

        int day=3;
        switch (day){
            case 1:
                System.out.println("saya wfo");
                break;
            case 2 :
                System.out.println("saya libur/cuti");
                break;
            case 3:
                System.out.println("saya wfh");
                break;
            default:
                System.out.println("liburan alias weekend");
                break;
        }
        System.out.println("hehehe");
    }
}