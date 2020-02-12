package com.company;

public class PasswordGenerator {
    private int numDigits;
    private String prefix;
    private static int numPasswords = 0;

    public PasswordGenerator(int a, String newPrefix) {
        numDigits = a;
        prefix = newPrefix;
    }

    public PasswordGenerator(int a) {
        numDigits = a;
        prefix = "A";
    }

    public static int pwCount() {
        return numPasswords;
    }

    public String pwGen() {
        numPasswords++;
        String l = prefix + ".";
        for (int i = 0; i<numDigits; i++) {
            int x = (int)(Math.random()*10);
            l+=x;
        }
        return l;
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
    }
}
/*
output for main:
0
chs.4408
1
A.614721
2
chs.3940
3
 */