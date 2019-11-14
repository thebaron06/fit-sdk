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

import java.util.ArrayList;

public class SubField {
    private class SubFieldMap {
        private int refFieldNum;
        private long refFieldValue;

        protected SubFieldMap(final int refFieldNum, final long refFieldValue) {
            this.refFieldNum = refFieldNum;
            this.refFieldValue = refFieldValue;
        }

        protected boolean canMesgSupport(Mesg mesg) {
            Field field = mesg.getField(refFieldNum);

            if (field != null) {
                Long value = field.getLongValue(0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
                if (value != null) {
                    if (value.longValue() == refFieldValue) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    protected String name;
    protected int type;
    protected double scale;
    protected double offset;
    protected String units;
    private ArrayList<SubFieldMap> maps;
    protected ArrayList<FieldComponent> components;

    protected SubField(final SubField subField) {
        if (subField == null) {
            this.name = "unknown";
            this.type = 0;
            this.scale = 1;
            this.offset = 0;
            this.units = "";
            this.maps = new ArrayList<SubFieldMap>();
            this.components = new ArrayList<FieldComponent>();
            return;
        }

        this.name = new String(subField.name);
        this.type = subField.type;
        this.scale = subField.scale;
        this.offset = subField.offset;
        this.units = new String(subField.units);
        this.maps = subField.maps;
        this.components = subField.components;
    }

    protected SubField(String name, int type, double scale, double offset, String units) {
        this.name = new String(name);
        this.type = type;
        this.scale = scale;
        this.offset = offset;
        this.units = new String(units);
        this.maps = new ArrayList<SubFieldMap>();
        this.components = new ArrayList<FieldComponent>();
    }

    protected String getName() {
        return name;
    }

    protected int getType() {
        return type;
    }

    protected String getUnits() {
        return units;
    }

    protected void addMap(int refFieldNum, long refFieldValue) {
        maps.add(new SubFieldMap(refFieldNum, refFieldValue));
    }

    protected void addComponent(FieldComponent component){
        components.add(component);
    }

    public boolean canMesgSupport(Mesg mesg) {
        for (SubFieldMap map : maps) {
            if (map.canMesgSupport(mesg)) {
                return true;
            }
        }
        return false;
    }
}
