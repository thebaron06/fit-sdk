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
import java.math.BigInteger;


public class GpsMetadataMesg extends Mesg {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int TimestampMsFieldNum = 0;
    
    public static final int PositionLatFieldNum = 1;
    
    public static final int PositionLongFieldNum = 2;
    
    public static final int EnhancedAltitudeFieldNum = 3;
    
    public static final int EnhancedSpeedFieldNum = 4;
    
    public static final int HeadingFieldNum = 5;
    
    public static final int UtcTimestampFieldNum = 6;
    
    public static final int VelocityFieldNum = 7;
    

    protected static final  Mesg gpsMetadataMesg;
    static {
        // gps_metadata
        gpsMetadataMesg = new Mesg("gps_metadata", MesgNum.GPS_METADATA);
        gpsMetadataMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        gpsMetadataMesg.addField(new Field("timestamp_ms", TimestampMsFieldNum, 132, 1, 0, "ms", false, Profile.Type.UINT16));
        
        gpsMetadataMesg.addField(new Field("position_lat", PositionLatFieldNum, 133, 1, 0, "semicircles", false, Profile.Type.SINT32));
        
        gpsMetadataMesg.addField(new Field("position_long", PositionLongFieldNum, 133, 1, 0, "semicircles", false, Profile.Type.SINT32));
        
        gpsMetadataMesg.addField(new Field("enhanced_altitude", EnhancedAltitudeFieldNum, 134, 5, 500, "m", false, Profile.Type.UINT32));
        
        gpsMetadataMesg.addField(new Field("enhanced_speed", EnhancedSpeedFieldNum, 134, 1000, 0, "m/s", false, Profile.Type.UINT32));
        
        gpsMetadataMesg.addField(new Field("heading", HeadingFieldNum, 132, 100, 0, "degrees", false, Profile.Type.UINT16));
        
        gpsMetadataMesg.addField(new Field("utc_timestamp", UtcTimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        gpsMetadataMesg.addField(new Field("velocity", VelocityFieldNum, 131, 100, 0, "m/s", false, Profile.Type.SINT16));
        
    }

    public GpsMetadataMesg() {
        super(Factory.createMesg(MesgNum.GPS_METADATA));
    }

    public GpsMetadataMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp.
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp.
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get timestamp_ms field
     * Units: ms
     * Comment: Millisecond part of the timestamp.
     *
     * @return timestamp_ms
     */
    public Integer getTimestampMs() {
        return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set timestamp_ms field
     * Units: ms
     * Comment: Millisecond part of the timestamp.
     *
     * @param timestampMs
     */
    public void setTimestampMs(Integer timestampMs) {
        setFieldValue(0, 0, timestampMs, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get position_lat field
     * Units: semicircles
     *
     * @return position_lat
     */
    public Integer getPositionLat() {
        return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set position_lat field
     * Units: semicircles
     *
     * @param positionLat
     */
    public void setPositionLat(Integer positionLat) {
        setFieldValue(1, 0, positionLat, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get position_long field
     * Units: semicircles
     *
     * @return position_long
     */
    public Integer getPositionLong() {
        return getFieldIntegerValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set position_long field
     * Units: semicircles
     *
     * @param positionLong
     */
    public void setPositionLong(Integer positionLong) {
        setFieldValue(2, 0, positionLong, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get enhanced_altitude field
     * Units: m
     *
     * @return enhanced_altitude
     */
    public Float getEnhancedAltitude() {
        return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set enhanced_altitude field
     * Units: m
     *
     * @param enhancedAltitude
     */
    public void setEnhancedAltitude(Float enhancedAltitude) {
        setFieldValue(3, 0, enhancedAltitude, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get enhanced_speed field
     * Units: m/s
     *
     * @return enhanced_speed
     */
    public Float getEnhancedSpeed() {
        return getFieldFloatValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set enhanced_speed field
     * Units: m/s
     *
     * @param enhancedSpeed
     */
    public void setEnhancedSpeed(Float enhancedSpeed) {
        setFieldValue(4, 0, enhancedSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get heading field
     * Units: degrees
     *
     * @return heading
     */
    public Float getHeading() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set heading field
     * Units: degrees
     *
     * @param heading
     */
    public void setHeading(Float heading) {
        setFieldValue(5, 0, heading, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get utc_timestamp field
     * Units: s
     * Comment: Used to correlate UTC to system time if the timestamp of the message is in system time.  This UTC time is derived from the GPS data.
     *
     * @return utc_timestamp
     */
    public DateTime getUtcTimestamp() {
        return timestampToDateTime(getFieldLongValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set utc_timestamp field
     * Units: s
     * Comment: Used to correlate UTC to system time if the timestamp of the message is in system time.  This UTC time is derived from the GPS data.
     *
     * @param utcTimestamp
     */
    public void setUtcTimestamp(DateTime utcTimestamp) {
        setFieldValue(6, 0, utcTimestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Float[] getVelocity() {
        
        return getFieldFloatValues(7, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of velocity
     */
    public int getNumVelocity() {
        return getNumFieldValues(7, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get velocity field
     * Units: m/s
     * Comment: velocity[0] is lon velocity.  Velocity[1] is lat velocity.  Velocity[2] is altitude velocity.
     *
     * @param index of velocity
     * @return velocity
     */
    public Float getVelocity(int index) {
        return getFieldFloatValue(7, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set velocity field
     * Units: m/s
     * Comment: velocity[0] is lon velocity.  Velocity[1] is lat velocity.  Velocity[2] is altitude velocity.
     *
     * @param index of velocity
     * @param velocity
     */
    public void setVelocity(int index, Float velocity) {
        setFieldValue(7, index, velocity, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
