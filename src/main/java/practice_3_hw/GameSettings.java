package practice_3_hw;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }

    void addPlayer(){
        if(currentPlayers < maxPlayers){
            currentPlayers++;
        }
    }

    void printGameStatus(){
        System.out.println("Название: " + this.gameName + ", текущее количество игроков: " + this.currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }
}
