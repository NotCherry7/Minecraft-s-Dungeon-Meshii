package net.notcherry.dungeonmod.client;

public class ClientManaData {
    private static int playerMana;

    public static void set(int mana) {
        ClientManaData.playerMana = mana;
    }

    public static int getPlayerMana() {
        return playerMana;
    }
}
