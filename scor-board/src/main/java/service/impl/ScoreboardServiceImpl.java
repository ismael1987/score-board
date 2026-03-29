package service.impl;

import model.Match;
import model.Team;
import service.IScoreboardService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreboardServiceImpl implements IScoreboardService {

    private final List<Match> matches = new ArrayList<>();

    @Override
    public Match startMatch(Team home, Team away) {

        return null;
    }

    @Override
    public List<Match> getSummary() {
        return null;
    }
}
