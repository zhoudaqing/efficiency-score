package com.samourai.efficiencyscore.aggregator;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TxosAggregatesMatches {

    private Set<Integer> allMatchInAgg = new HashSet<>();
    private Map<Integer, Integer> matchInAggToVal = new LinkedHashMap<>();
    private Map<Integer, int[]> valToMatchOutAgg = new LinkedHashMap<>();

    public TxosAggregatesMatches(Set<Integer> allMatchInAgg, Map<Integer, Integer> matchInAggToVal, Map<Integer, int[]> valToMatchOutAgg) {
        this.allMatchInAgg = allMatchInAgg;
        this.matchInAggToVal = matchInAggToVal;
        this.valToMatchOutAgg = valToMatchOutAgg;
    }

    public Set<Integer> getAllMatchInAgg() {
        return allMatchInAgg;
    }

    public Map<Integer, Integer> getMatchInAggToVal() {
        return matchInAggToVal;
    }

    public Map<Integer, int[]> getValToMatchOutAgg() {
        return valToMatchOutAgg;
    }
}