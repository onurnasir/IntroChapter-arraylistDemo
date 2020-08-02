import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	    int[] sayilar=new int[]{1,2,3};
//	    sayilar=new int[4]; // Yeni referans ile bellekte yeni bir alan oluşturdu;bu olduğundan dolayı üsteki satırı soluklaştırdı ve işlevsizleştirdi.
//	    System.out.println(sayilar[0]);

        // Şimdi aşağıda koleksiyonlara geçiş yapıyoruz.

        ArrayList sayilar=new ArrayList(); //Bu yapıyı kullanabilmemiz için Cdeki include gibi yukarda otomatik gelen "import java.util.ArrayList;" import fonsiyonu kullanılmalıdır. Biz manuel yazmasakta kendi otomatik gelmektedir.
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println("Dizi sayı adedi:"+sayilar.size());
//        System.out.println(sayilar.get(2));
//        sayilar.set(0,100); // Set ile index'i değiştiriyoruz.
//        System.out.println(sayilar.get(0)); // Get ile index'i çağırıyoruz.
//        sayilar.remove(1); //Bellekteki 1.yerdeki index'i uçur demek.Bu yeni durumda 1.index yerine "Ankara" yerleşmektedir.
//        System.out.println(sayilar.get(1));
//        sayilar.clear();  //Tüm index'leri siler.

        for (Object i:sayilar){
            System.out.println(i);
        }

    }
}
