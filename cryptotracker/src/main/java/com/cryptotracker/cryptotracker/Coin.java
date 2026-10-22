package com.cryptotracker.cryptotracker;
/*
*This file essentially builds the attributes for the Coin Object. 
*/
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Coin{
    private String coinName;
    private String coinSymbol;
    private String coinId;
    private double marketPrice;
    private double priceChange24h;
    private double percentChange24h;
    private double marketCap;
    private double marketCapRank;
    private double volume24h;

    public Coin(String coinName, String coinSymbol, String coinId, double marketPrice,
                double priceChange24h, double percentChange24h, double marketCap,
                double marketCapRank, double volume24h){
                    this.coinName = coinName;
                    this.coinSymbol = coinSymbol;
                    this.coinId = coinId;
                    this.marketPrice = marketPrice;
                    this.priceChange24h = priceChange24h;
                    this.percentChange24h = percentChange24h;
                    this.marketCap = marketCap;
                    this.marketCapRank = marketCapRank;
                    this.volume24h= volume24h;
    }
}
