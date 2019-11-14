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


public enum ExdDisplayType {
    NUMERICAL((short)0),
    SIMPLE((short)1),
    GRAPH((short)2),
    BAR((short)3),
    CIRCLE_GRAPH((short)4),
    VIRTUAL_PARTNER((short)5),
    BALANCE((short)6),
    STRING_LIST((short)7),
    STRING((short)8),
    SIMPLE_DYNAMIC_ICON((short)9),
    GAUGE((short)10),
    INVALID((short)255);

    protected short value;

    private ExdDisplayType(short value) {
        this.value = value;
    }

    public static ExdDisplayType getByValue(final Short value) {
        for (final ExdDisplayType type : ExdDisplayType.values()) {
            if (value == type.value)
                return type;
        }

        return ExdDisplayType.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( ExdDisplayType value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
