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


#if !defined(FIT_DEVELOPER_DATA_ID_MESG_HPP)
#define FIT_DEVELOPER_DATA_ID_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class DeveloperDataIdMesg : public Mesg
{
public:
    class FieldDefNum final
    {
    public:
       static const FIT_UINT8 DeveloperId = 0;
       static const FIT_UINT8 ApplicationId = 1;
       static const FIT_UINT8 ManufacturerId = 2;
       static const FIT_UINT8 DeveloperDataIndex = 3;
       static const FIT_UINT8 ApplicationVersion = 4;
       static const FIT_UINT8 Invalid = FIT_FIELD_NUM_INVALID;
    };

    DeveloperDataIdMesg(void) : Mesg(Profile::MESG_DEVELOPER_DATA_ID)
    {
    }

    DeveloperDataIdMesg(const Mesg &mesg) : Mesg(mesg)
    {
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns number of developer_id
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT8 GetNumDeveloperId(void) const
    {
        return GetFieldNumValues(0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of developer_id field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsDeveloperIdValid(FIT_UINT8 index) const
    {
        const Field* field = GetField(0);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid(index);
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns developer_id field
    ///////////////////////////////////////////////////////////////////////
    FIT_BYTE GetDeveloperId(FIT_UINT8 index) const
    {
        return GetFieldBYTEValue(0, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set developer_id field
    ///////////////////////////////////////////////////////////////////////
    void SetDeveloperId(FIT_UINT8 index, FIT_BYTE developerId)
    {
        SetFieldBYTEValue(0, developerId, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns number of application_id
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT8 GetNumApplicationId(void) const
    {
        return GetFieldNumValues(1, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of application_id field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsApplicationIdValid(FIT_UINT8 index) const
    {
        const Field* field = GetField(1);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid(index);
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns application_id field
    ///////////////////////////////////////////////////////////////////////
    FIT_BYTE GetApplicationId(FIT_UINT8 index) const
    {
        return GetFieldBYTEValue(1, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set application_id field
    ///////////////////////////////////////////////////////////////////////
    void SetApplicationId(FIT_UINT8 index, FIT_BYTE applicationId)
    {
        SetFieldBYTEValue(1, applicationId, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of manufacturer_id field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsManufacturerIdValid() const
    {
        const Field* field = GetField(2);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns manufacturer_id field
    ///////////////////////////////////////////////////////////////////////
    FIT_MANUFACTURER GetManufacturerId(void) const
    {
        return GetFieldUINT16Value(2, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set manufacturer_id field
    ///////////////////////////////////////////////////////////////////////
    void SetManufacturerId(FIT_MANUFACTURER manufacturerId)
    {
        SetFieldUINT16Value(2, manufacturerId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of developer_data_index field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsDeveloperDataIndexValid() const
    {
        const Field* field = GetField(3);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns developer_data_index field
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT8 GetDeveloperDataIndex(void) const
    {
        return GetFieldUINT8Value(3, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set developer_data_index field
    ///////////////////////////////////////////////////////////////////////
    void SetDeveloperDataIndex(FIT_UINT8 developerDataIndex)
    {
        SetFieldUINT8Value(3, developerDataIndex, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of application_version field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsApplicationVersionValid() const
    {
        const Field* field = GetField(4);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns application_version field
    ///////////////////////////////////////////////////////////////////////
    FIT_UINT32 GetApplicationVersion(void) const
    {
        return GetFieldUINT32Value(4, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set application_version field
    ///////////////////////////////////////////////////////////////////////
    void SetApplicationVersion(FIT_UINT32 applicationVersion)
    {
        SetFieldUINT32Value(4, applicationVersion, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

};

} // namespace fit

#endif // !defined(FIT_DEVELOPER_DATA_ID_MESG_HPP)
