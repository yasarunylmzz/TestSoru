import java.util.*;

public class Main {
    public static void main(String[] args) {
        int dogru = 0;
        Scanner scan = new Scanner(System.in);


        String[] soru = {
                "Bunlardan hangisi toksik bir sera gazıdır?",
                "Aşağıdakilerden hangisi küresel ısınmaya neden olabilir?",
                "Hangisi küresel ısınmanın bir etkisi olabilir?",
                "Kirlilik havaya yayıldıkça ne azalır?",
                "Aşağıdakilerden hangisi küresel ısınmanın olumsuz bir etkisi değildir?"


        };


        String[][] siklar ={
                {
                        "\nA:Nitrojen\nB:Oksijen\nC:Karbonmonoksit\nD:Metan\n",//D METAN
                        "\nA:Büyüyen Ağaçlar\nB:Balıkların Yüzmesi\nC:Volkanlar\nD:Heyelan\n", //C:Volkanlar
                        "\nA:Deniz Seviyesinin Yükselmesi\nB:Daha Fazla Ada Tarımı\nC:Daha Çok Volkanik Püskürme\nD:Daha Fazla Heyelan Gerçekleşmesi\n",//A
                        "\nA:Ozon Tabakası\nB:Okyanuslar\nC:Yağmur Ormanları\nD:Karbondioksit\n",//A:ozon tabakası
                        "\nA:Daha Büyük Balık Nüfusu\nB:Yeni Bulaşıcı hastalıkların ortaya çıkması\nC:Türlerin Yok Olması\nD:Kıyı alanlarının kaybı\n"//A
                },

                        {
                        "D",
                        "C",
                        "A",
                        "A",
                        "A"
                }



        };
        for(int i = 0 ; i < soru.length ; i++){
            System.out.printf("%s",soru[i]);
            System.out.printf("%s",siklar[0][i]);
            String cevap = scan.nextLine();
            if(siklar[1][i].equals(cevap))
                dogru++;
        }

        if(dogru == 5){
            System.out.println("Mükemmel");
        } else if (dogru==4) {
            System.out.println("çok iyi");
        } else if (dogru==3) {
            System.out.println("iyi");
        } else if (dogru == 2) {
            System.out.println("orta");
        }else {
            System.out.println("kötü");
        }


    }
}