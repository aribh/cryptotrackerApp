package com.cryptotracker.cryptotracker;

import lombok.Builder;
import lombok.Value;

/**This file will build a single Heikin Ashi candles*/
@Value
@Builder
public class Candle {
    //These are the values that will be the inputs for the Heikin Ashi Candles.
    private double open;
    private double low;
    private double high;
    private double close;
    
    //Initializing the Heikin Ashi Candles before building.
    public static Candle create(double open, double high, double low, double close, Candle prevCandle){
        double newClose = 0.25 * (open + high + low + close);
        //Open the Heikin Ashi Candles.
        double newOpen;
        if(prevCandle == null){
            newOpen = 0.5 * (open + close);
        }
        else{
            newOpen =  0.5 * (prevCandle.getOpen()+ prevCandle.getClose());
        }
        double newHigh = Math.max(high,Math.max(newOpen, newClose));
        double newLow = Math.min (high,Math.min(newOpen, newClose));
        //Builds the Heikin Ashi Candles here.
        return Candle.builder()
            .open(newOpen)
            .high(newHigh)
            .low(newLow)
            .close(newClose)
            .build();
        
    }
}
