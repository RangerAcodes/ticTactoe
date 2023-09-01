package Strategy;
import Models.*;
public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
