package com.learn;

public class PrototypeTest {

    public static void main(String[] args) {

        MarioElements<Wall> wall4By4NonStrong = new Wall(4, 4, false)
                .setPos(Position.MID);
        MarioElements<Wall> wall4By4Strong = wall4By4NonStrong.copy()
                .setStrong(true)
                .setPos(Position.DOWN);

        System.out.println(wall4By4NonStrong);
        System.out.println(wall4By4Strong);

        MarioElements<Tortoise> tortoiseNormal = new Tortoise("Green", false);
        MarioElements<Tortoise> tortoiseThorn = tortoiseNormal.copy().setHasThorn(true);

        System.out.println(tortoiseNormal);
        System.out.println(tortoiseThorn);
    }
}
