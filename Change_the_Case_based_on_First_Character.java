import j


class Change_the_Case_based_on_First_Character {
    String modify(String s) {
        int c = (int)s.charAt(0);
        if(c>=65 && c<=90)return s.toUpperCase();
        return s.toLowerCase();
    }
}