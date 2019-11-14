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

package com.garmin.fit.csv;

import com.garmin.fit.Field;
import com.garmin.fit.FieldBase;
import com.garmin.fit.Fit;
import com.garmin.fit.Profile;

public class MesgCSVWriterBase {
    protected CSVWriter csv;
    protected boolean hideUnknownData = false;
    protected boolean removeExpandedFields = false;
    private boolean showInvalidsAsEmptyCells = false;
    private boolean printByteAsHex = false;
    private boolean enumsAsStrings = false;

    public MesgCSVWriterBase(String fileName) {
        this.csv = new CSVWriter(fileName);
    }

    public void close() {
        csv.close();
    }

    public void showInvalidsAsEmptyCells() {
        showInvalidsAsEmptyCells = true;
    }

    public void hideUnknownData() {
        hideUnknownData = true;
    }

    public void setPrintByteAsHex(boolean value){
        printByteAsHex = value;
    }

    public void enumsAsStrings() {
        enumsAsStrings = true;
    }

    public void removeExpandedFields() {
        removeExpandedFields = true;
    }

    protected String getValueString(FieldBase fieldBase, int subFieldIndex) {
        Object value = fieldBase.getValue(0, subFieldIndex);
        String out;
        Profile.Type profileType;

        try {
            // This might fail as the fieldBase could be a developer field
            Field field = (Field)fieldBase;
            profileType = field.getProfileType();
        } catch (ClassCastException e) {
            // Default to dummy ENUM type
            profileType = Profile.Type.ENUM;
        }

        if (value == null || (showInvalidsAsEmptyCells && value.equals(Fit.baseTypeInvalidMap.get(fieldBase.getType(subFieldIndex))))) {
            out = "";
        } else{
            if (printByteAsHex && fieldBase.getType(subFieldIndex) == Fit.BASE_TYPE_BYTE) {
                out = String.format("%02x", value);
            } else if (enumsAsStrings && profileType.ordinal() > Profile.Type.BOOL.ordinal()) {
                out = Profile.enumValueName(profileType, ((Number)value).longValue());
            } else {
                out = value.toString();
            }
        }

        for (int fieldElement = 1; fieldElement < fieldBase.getNumValues(); fieldElement++) {
            out += "|";

            value = fieldBase.getValue(fieldElement, subFieldIndex);

            if (value != null) {
                if (printByteAsHex && fieldBase.getType(subFieldIndex) == Fit.BASE_TYPE_BYTE) {
                    out += String.format("%02x", value);
                } else if (enumsAsStrings && profileType.ordinal() > Profile.Type.BOOL.ordinal()) {
                    out += Profile.enumValueName(profileType, ((Number)value).longValue());
                } else {
                    out += value.toString();
                }
            }
        }

        // Escapes embedded commas, double quotes, and newline characters
        out = out.replaceAll("\"", "\"\"");
        out = "\"" + out + "\"";
        return out;
    }
}
