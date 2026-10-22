package com.cryptotracker.cryptotracker;

import java.util.ArrayList;

/**
 * This file will take a list of the Heikin Ashi candles and will sort them by date.
 * It will format them for my chart by having the oldest be on the left and the newest on the right.
 */
public class CandleRepository {
    public ArrayList<Candle> formatCandlesForChart(ArrayList<Candle> unsortedCandles){
        ArrayList<Candle> candle = new ArrayList<>(unsortedCandles);
        //Define the sorting rule using the candle's timestamp getter.
        
        //Sort the list in ascending order(oldest to newest).

        //Return the sorted list to my chart.
        return null;
    }
}
