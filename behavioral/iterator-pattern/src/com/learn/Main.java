package com.learn;

public class Main {

    public static void main(String[] args) {

        NameRepo nameRepo = new NameRepo(new String[]{"One","Two","Three"});
        Iterator itr = nameRepo.getNameIterator();
        while(itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
        }
    }
}
