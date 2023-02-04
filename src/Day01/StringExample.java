package Day01;

public class StringExample {
    String ad = "mehmet can";
    String soyad = " seyhan";

    String isimSoyisim = "merhaba \tbenim \badim \"mehmet can\"  \nya senin?";
    String isimSoyisim1 = "merhaba benim \radim \"mehmet can\" ya senin?";


    public void runString(){
        System.out.println("length "+ ad.length());
        System.out.println("toUpperCase "+ ad.toUpperCase());
        System.out.println("toLowerCase "+ ad.toLowerCase());
        System.out.println("indexOf "+ ad.indexOf('m'));
        System.out.println("lastIndexOf "+ ad.lastIndexOf('m'));
        System.out.println("replace "+ ad.replace("can", "canan"));
        System.out.println("substring "+ ad.substring(3));
        System.out.println("substring "+ ad.substring(3, 10));
        System.out.println("substring "+ ad.charAt('5'));
        System.out.println("trim "+ ad.trim());
        System.out.println("isEmpty "+ ad.isEmpty());



        System.out.println("+ " + ad +  " ben ikinci");
        System.out.println("concat "+ ad.concat(soyad));
        System.out.println("isimSoyisim "+ isimSoyisim);
        System.out.println("isimSoyisim1 "+ isimSoyisim1);


    }
}
