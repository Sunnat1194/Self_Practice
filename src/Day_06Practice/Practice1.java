package Day_06Practice;

public class Practice1 {
    public static void main(String[] args) {
        String[] names = {"Sunnat", "Ayse", "Inna", "Agalar" , "Jamshid" };

        System.out.println(     names[1]  );
        String str1 = names[0];
        System.out.println(str1);

        int[] score = {80, 90, 60, 85, 65};
        System.out.println(names[3]+" : "+ score[3]);
        System.out.println("==================================================================");

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]+" : "+score[i]);
        }
          

    }
}
