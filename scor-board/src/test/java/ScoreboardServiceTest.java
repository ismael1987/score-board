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
}
