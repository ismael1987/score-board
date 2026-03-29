import model.Match;
import model.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.IScoreboardService;
import service.impl.ScoreboardServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreboardServiceTest {
    private IScoreboardService scoreboard;

    @BeforeEach
    void setUp() {
        scoreboard = new ScoreboardServiceImpl();
    }

    @Test
    void testStartMatch() {
        Match match = scoreboard.startMatch(Team.MEXICO, Team.CANADA);
        assertNotNull(match);
        assertEquals(Team.MEXICO, match.getHomeTeam());
        assertEquals(Team.CANADA, match.getAwayTeam());

        List<Match> summary = scoreboard.getSummary();
        assertFalse(summary.isEmpty()); // Match should be in summary after starting
    }

    @Test
    void testUpdateScore() {
        Match match = scoreboard.startMatch(Team.SPAIN, Team.BRAZIL);
        scoreboard.updateScore(match, 3, 2);

        assertEquals(3, match.getHomeScore());
        assertEquals(2, match.getAwayScore());

        // Test negative score exception
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                scoreboard.updateScore(match, -1, 2));
        assertEquals("Scores cannot be negative", exception.getMessage());
    }

    @Test
    void testUpdateNonExistentMatch() {
        Match match = new Match(Team.MEXICO, Team.CANADA);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                scoreboard.updateScore(match, 1, 1)
        );

        assertEquals("Match not found on scoreboard", exception.getMessage());
    }
}
