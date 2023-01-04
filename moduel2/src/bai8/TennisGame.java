package bai8;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int ScoreOfPlayer1, int ScoreOfPlayer2) {
        boolean isEqual = ScoreOfPlayer1 == ScoreOfPlayer2;
        if (isEqual) {
            return getGameEqualCalledScore(ScoreOfPlayer1);
        } else {
            boolean isCompare = ScoreOfPlayer1 >= 4 || ScoreOfPlayer2 >= 4;
            if (isCompare) {
                getGameCompareCalledScore(ScoreOfPlayer1, ScoreOfPlayer2);
            }
            String calledScore = getPlayerCalledScore(ScoreOfPlayer1)
                    + "-" +
                    getPlayerCalledScore(ScoreOfPlayer2);
            return calledScore;
        }
    }


    private static String getGameEqualCalledScore(int player1Score) {
        String score;
        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String getGameCompareCalledScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }

    }
}
