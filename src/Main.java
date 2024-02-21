
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan alacağımız değişkenlerimizi tanımladık
        int number1, number2, select;

        //Kullanıcıdan değerlerimizi aldık
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        //Kullanıdan hangi işlemi yapmak istediğinin bilgisini aldık
        System.out.println("Toplama işlemi için 1 \n Çıkarma işlemi için 2 \n Çıkarma işlemi için 3\n Bölme için 4");
        select = input.nextInt();

        //Seçilen işleme göre sonuç yazdırdık.
        switch (select) {
            case 1:
                System.out.println("Toplama : " + (number1 + number2));
                break;

            case 2:
                System.out.println("Çıkarma : " + (number1 - number2));
                break;

            case 3:
                System.out.println("Çarpma : " + (number1 * number2));
                break;

            case 4:
                //ikinci sayının sıfır girilmesine göre hata vermemesini sağladık
                if (number2 != 0) {
                    System.out.println("Bölme :" + (number1 / number2));
                } else {
                    System.out.println("bir sayı sıfıra bölünemez");
                }
                break;

            default:
        }

    }
}