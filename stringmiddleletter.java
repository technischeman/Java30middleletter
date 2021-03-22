public class stringmiddleletter {
    public static void main(String[] args) {
        stringmiddleletter("kastamonu");
        stringmiddleletter("istanbul");
        stringmiddleletter("almanya");


    }

    public static void stringmiddleletter(String str
    ) {
        char[] strarr = str.toCharArray();
        if (str.length() % 2 == 0) {
            System.out.println(String.valueOf(strarr[strarr.length / 2 - 1]) + " and " + String.valueOf(strarr[(strarr.length / 2)]) + " are middle letters of " + str);


        } else System.out.println(String.valueOf("middle letter is of " + str + " : " + strarr[strarr.length / 2]));

    }


}



