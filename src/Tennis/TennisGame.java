package Tennis;

public class TennisGame {
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String BLANK = " ";
    public static final String advantagePlayer1 = "Advantage player1";
    public static final String advantagePlayer2 = "Advantage player2";
    public static final String player1Win = "Win for player1";
    public static final String player2Win = "Win for player2";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = BLANK;
        int tempScore = 0;
        boolean equal = scorePlayer1 == scorePlayer2;
        boolean scoreBigger_equal4 = scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if (equal) {
            switch (scorePlayer1) {
                case 0:
                    score = LOVE_ALL;
                    break;
                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        } else {
            if (scoreBigger_equal4) {
                int minusResult = scorePlayer1 - scorePlayer2;
                boolean minusResult_is1 = minusResult == 1;
                if (minusResult_is1) {
                    score = advantagePlayer1;
                } else if (minusResult == -1) {
                    score = advantagePlayer2;
                } else if (minusResult >= 2) {
                    score = player1Win;
                } else {
                    score = player2Win;
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    boolean iEqual1 = i == 1;
                    if (iEqual1) tempScore = scorePlayer1;
                    else {
                        score += "-";
                        tempScore = scorePlayer2;
                    }
                    switch (tempScore) {
                        case 0:
                            score += "Love";
                            break;
                        case 1:
                            score += "Fifteen";
                            break;
                        case 2:
                            score += "Thirty";
                            break;
                        case 3:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
