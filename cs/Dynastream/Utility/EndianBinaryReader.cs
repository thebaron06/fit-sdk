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

namespace Dynastream.Utility
{
    /// <summary>
    /// Extend framework BinaryReader to support BigEndian datasources.
    /// When reading multibyte values, the bytes are reordered appropriately.
    /// </summary>
    public class EndianBinaryReader : BinaryReader
    {
        #region Fields
        private bool isBigEndian = false;
        #endregion

        #region Properties
        public bool IsBigEndian
        {
            get { return isBigEndian; }
            set { isBigEndian = value; }
        }
        #endregion

        #region Constructors
        public EndianBinaryReader(Stream input, Encoding encoding, bool isBigEndian)
            : base(input, encoding)
        {
            this.isBigEndian = isBigEndian;
        }

        public EndianBinaryReader(Stream input, bool isBigEndian)
            : this(input, Encoding.UTF8, isBigEndian)
        {
        }
        #endregion

        #region Methods
        public override short ReadInt16()
        {
            if (!IsBigEndian)
            {
                return base.ReadInt16();
            }
            byte[] buffer = new byte[2];
            Read(buffer, 0, 2);
            Array.Reverse(buffer);

            return BitConverter.ToInt16(buffer, 0);
        }

        public override ushort ReadUInt16()
        {
            if (!IsBigEndian)
            {
                return base.ReadUInt16();
            }
            byte[] buffer = new byte[2];
            Read(buffer, 0, 2);
            Array.Reverse(buffer);

            return BitConverter.ToUInt16(buffer, 0);
        }

        public override int ReadInt32()
        {
            if (!IsBigEndian)
            {
                return base.ReadInt32();
            }
            byte[] buffer = new byte[4];
            Read(buffer, 0, 4);
            Array.Reverse(buffer);

            return BitConverter.ToInt32(buffer, 0);
        }

        public override uint ReadUInt32()
        {
            if (!IsBigEndian)
            {
                return base.ReadUInt32();
            }
            byte[] buffer = new byte[4];
            Read(buffer, 0, 4);
            Array.Reverse(buffer);

            return BitConverter.ToUInt32(buffer, 0);
        }

        public override long ReadInt64()
        {
            if (!IsBigEndian)
            {
                return base.ReadInt64();
            }
            byte[] buffer = new byte[8];
            Read(buffer, 0, 8);
            Array.Reverse(buffer);

            return BitConverter.ToInt64(buffer, 0);
        }

        public override ulong ReadUInt64()
        {
            if (!IsBigEndian)
            {
                return base.ReadUInt64();
            }
            byte[] buffer = new byte[8];
            Read(buffer, 0, 8);
            Array.Reverse(buffer);

            return BitConverter.ToUInt64(buffer, 0);
        }

        public override float ReadSingle()
        {
            if (!IsBigEndian)
            {
                return base.ReadSingle();
            }
            byte[] buffer = new byte[4];
            Read(buffer, 0, 4);
            Array.Reverse(buffer);

            return BitConverter.ToSingle(buffer, 0);
        }

        public override double ReadDouble()
        {
            if (!IsBigEndian)
            {
                return base.ReadDouble();
            }
            byte[] buffer = new byte[8];
            Read(buffer, 0, 8);
            Array.Reverse(buffer);

            return BitConverter.ToDouble(buffer, 0);
        }
        #endregion
    }
} // namespace
