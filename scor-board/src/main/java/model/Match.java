package model;

import java.time.LocalDateTime;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private long homeScore;
    private long awayScore;
    private LocalDateTime startTime;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.startTime = LocalDateTime.now();
    }

    // Getters and Setters
    public Team getHomeTeam() { return homeTeam; }
    public void setHomeTeam(Team homeTeam) { this.homeTeam = homeTeam; }

    public Team getAwayTeam() { return awayTeam; }
    public void setAwayTeam(Team awayTeam) { this.awayTeam = awayTeam; }

    public long getHomeScore() { return homeScore; }
    public void setHomeScore(long homeScore) { this.homeScore = homeScore; }

    public long getAwayScore() { return awayScore; }
    public void setAwayScore(long awayScore) { this.awayScore = awayScore; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public long getTotalScore() { return homeScore + awayScore; }

    @Override
    public String toString() {
        return homeTeam.name() + " " + homeScore + " - " + awayScore + " " + awayTeam.name();
    }
}