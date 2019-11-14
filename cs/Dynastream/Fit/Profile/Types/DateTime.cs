#region Copyright
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

#endregion

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;
using System.IO;

namespace Dynastream.Fit
{
    /// <summary>
    /// The DateTime class implements the Fit date_time type which references
    /// UTC 00:00 Dec 31 1989 in second resolution
    /// </summary>
    public class DateTime
    {
        #region Fields
        private double fractionalTimeStamp;
        private uint timeStamp;
        // if date_time is < 0x10000000 then it is system time (seconds from device power on)
        // 0x10000000 => uptime of 8years => earliest date you can express ~1997
        private uint min = 0x10000000;
        // .NET datetime uses 100ns ticks starting 12:00:00 midnight, January 1, 0001
        public System.DateTime offset = new System.DateTime(1989, 12, 31, 0, 0, 0, System.DateTimeKind.Utc);
        #endregion // Fields

        #region Properties

        #endregion // Properties

        #region Constructors
        public DateTime(uint timeStamp)
        {
            this.timeStamp = timeStamp;
            this.fractionalTimeStamp = 0.0;
        }

        public DateTime(System.DateTime dateTime)
        {
            timeStamp = (uint)((dateTime.Ticks - offset.Ticks) / 10000000);
            fractionalTimeStamp = (((dateTime.Ticks - offset.Ticks) % 10000000) / 10000000.0);
        }

        public DateTime(Dynastream.Fit.DateTime dateTime)
            : this(dateTime.GetTimeStamp(), dateTime.GetFractionalTimeStamp())
        {

        }

        public DateTime(uint timeStamp, double fractionalTimeStamp)
        {
            this.timeStamp = timeStamp + (uint)Math.Floor(fractionalTimeStamp);
            this.fractionalTimeStamp = fractionalTimeStamp - (double)Math.Floor(fractionalTimeStamp);
        }
        #endregion // Constructors

        #region Methods
        public bool Equals(DateTime dateTime)
        {
            return (this.GetTimeStamp().Equals(dateTime.GetTimeStamp()) && (this.GetFractionalTimeStamp().Equals(dateTime.GetFractionalTimeStamp())));
        }

        public uint GetTimeStamp()
        {
            return timeStamp;
        }

        public double GetFractionalTimeStamp()
        {
            return fractionalTimeStamp;
        }

        public void ConvertSystemTimeToUTC(uint systemTimeOffset)
        {
            if (timeStamp < min)
            {
                timeStamp += systemTimeOffset;
            }
        }

        public System.DateTime GetDateTime()
        {
            return System.DateTime.SpecifyKind(new System.DateTime(timeStamp * 10000000L + offset.Ticks + (long)(fractionalTimeStamp * 10000000L)), DateTimeKind.Utc);
        }

        new public string ToString()
        {
            return GetDateTime().ToString();
        }

        public void Add(DateTime dateTime)
        {
            this.timeStamp += dateTime.GetTimeStamp();
            this.fractionalTimeStamp += dateTime.GetFractionalTimeStamp();

            // Adjust fractional part to be less that 1
            this.timeStamp += (uint)Math.Floor(this.fractionalTimeStamp);
            this.fractionalTimeStamp -= (float)Math.Floor(this.fractionalTimeStamp);
        }

        public void Add(uint timeStamp)
        {
            this.Add(new DateTime(timeStamp));
        }

        public void Add(double fractionalTimeStamp)
        {
            this.Add(new DateTime(0, fractionalTimeStamp));
        }

        //Returns 0 if DateTimes are equal
        //Returns -1 if t1 > target object (this)
        //Returns 1 if target object (this) > t1
        //If timeStamps are equal, fractional timestamps are compared
        public int CompareTo(DateTime t1)
        {
            // fractional_timestamp is guaranteed to be less that 1 which allows simplified comparison below
            if (this.timeStamp == t1.GetTimeStamp())
            {
                // Timestamps are equal; must compare fractional part.
                return this.fractionalTimeStamp.CompareTo(t1.GetFractionalTimeStamp());
            }
            else if (this.timeStamp > t1.GetTimeStamp())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        #endregion // Methods
    } // class
} // namespace
