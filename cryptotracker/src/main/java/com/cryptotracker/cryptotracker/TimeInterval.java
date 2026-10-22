package com.cryptotracker.cryptotracker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum TimeInterval {
    ONE_MINUTE("1M", "1 Minute",1),
    FIVE_MINUTES("5M", "5 Minutes", 5),
    FIFTEEN_MINUTES("15M", "15 Minutes",15),
    ONE_HOUR("1HR", "1 Hour", 60),
    DAILY("1D","Daily", 1440),
    WEEKLY("1W", "Weekly", 10080),
    MONTHLY("1MO","Monthly",43200),
    YEARLY("1Y", "Yearly", 525600);

    private final String dbCode;
    private final String displayName;
    private final int timeDuration;
}
