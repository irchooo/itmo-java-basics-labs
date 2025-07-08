package itmo.java.basics.lab9.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class UserGameService {
    private final Map<User, Integer> userScores;

    public UserGameService() {
        this.userScores = generateRandomUserScores();
    }

    //метод для рандом-генерации мапы пользователей с очками
    private Map<User, Integer> generateRandomUserScores() {
        String[] names = {"Рафаил", "Люцифер", "Лилит", "Адам", "Ева"};
        Map<User, Integer> scores = new HashMap<>();

        Random random = new Random();
        for(String name : names) {
            User user = new User(name);
            Integer randomScore = random.nextInt(100);
            scores.put(user, randomScore);
        }
        return scores;
    }

    //метод для получения очков запрошенного пользователя
    public void printUserScore(String userName) {
        User searchUser = new User(userName);
        Integer score = userScores.get(searchUser);

        if(score != null) {
            System.out.println("--> Очки пользователя " + userName + " : " + score);
        } else {
            System.out.println("Пользователь " + userName + " не найден");
        }
    }
}
