////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2019 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.16Release
// Tag = production/akw/21.16.00-0-g151e4f2
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.HashMap;
import java.util.Map;

public class CardioExerciseName {
    public static final int BOB_AND_WEAVE_CIRCLE = 0;
    public static final int WEIGHTED_BOB_AND_WEAVE_CIRCLE = 1;
    public static final int CARDIO_CORE_CRAWL = 2;
    public static final int WEIGHTED_CARDIO_CORE_CRAWL = 3;
    public static final int DOUBLE_UNDER = 4;
    public static final int WEIGHTED_DOUBLE_UNDER = 5;
    public static final int JUMP_ROPE = 6;
    public static final int WEIGHTED_JUMP_ROPE = 7;
    public static final int JUMP_ROPE_CROSSOVER = 8;
    public static final int WEIGHTED_JUMP_ROPE_CROSSOVER = 9;
    public static final int JUMP_ROPE_JOG = 10;
    public static final int WEIGHTED_JUMP_ROPE_JOG = 11;
    public static final int JUMPING_JACKS = 12;
    public static final int WEIGHTED_JUMPING_JACKS = 13;
    public static final int SKI_MOGULS = 14;
    public static final int WEIGHTED_SKI_MOGULS = 15;
    public static final int SPLIT_JACKS = 16;
    public static final int WEIGHTED_SPLIT_JACKS = 17;
    public static final int SQUAT_JACKS = 18;
    public static final int WEIGHTED_SQUAT_JACKS = 19;
    public static final int TRIPLE_UNDER = 20;
    public static final int WEIGHTED_TRIPLE_UNDER = 21;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(BOB_AND_WEAVE_CIRCLE, "BOB_AND_WEAVE_CIRCLE");
        stringMap.put(WEIGHTED_BOB_AND_WEAVE_CIRCLE, "WEIGHTED_BOB_AND_WEAVE_CIRCLE");
        stringMap.put(CARDIO_CORE_CRAWL, "CARDIO_CORE_CRAWL");
        stringMap.put(WEIGHTED_CARDIO_CORE_CRAWL, "WEIGHTED_CARDIO_CORE_CRAWL");
        stringMap.put(DOUBLE_UNDER, "DOUBLE_UNDER");
        stringMap.put(WEIGHTED_DOUBLE_UNDER, "WEIGHTED_DOUBLE_UNDER");
        stringMap.put(JUMP_ROPE, "JUMP_ROPE");
        stringMap.put(WEIGHTED_JUMP_ROPE, "WEIGHTED_JUMP_ROPE");
        stringMap.put(JUMP_ROPE_CROSSOVER, "JUMP_ROPE_CROSSOVER");
        stringMap.put(WEIGHTED_JUMP_ROPE_CROSSOVER, "WEIGHTED_JUMP_ROPE_CROSSOVER");
        stringMap.put(JUMP_ROPE_JOG, "JUMP_ROPE_JOG");
        stringMap.put(WEIGHTED_JUMP_ROPE_JOG, "WEIGHTED_JUMP_ROPE_JOG");
        stringMap.put(JUMPING_JACKS, "JUMPING_JACKS");
        stringMap.put(WEIGHTED_JUMPING_JACKS, "WEIGHTED_JUMPING_JACKS");
        stringMap.put(SKI_MOGULS, "SKI_MOGULS");
        stringMap.put(WEIGHTED_SKI_MOGULS, "WEIGHTED_SKI_MOGULS");
        stringMap.put(SPLIT_JACKS, "SPLIT_JACKS");
        stringMap.put(WEIGHTED_SPLIT_JACKS, "WEIGHTED_SPLIT_JACKS");
        stringMap.put(SQUAT_JACKS, "SQUAT_JACKS");
        stringMap.put(WEIGHTED_SQUAT_JACKS, "WEIGHTED_SQUAT_JACKS");
        stringMap.put(TRIPLE_UNDER, "TRIPLE_UNDER");
        stringMap.put(WEIGHTED_TRIPLE_UNDER, "WEIGHTED_TRIPLE_UNDER");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
