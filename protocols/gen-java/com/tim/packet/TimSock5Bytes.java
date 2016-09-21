/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tim.packet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-21")
public class TimSock5Bytes implements org.apache.thrift.TBase<TimSock5Bytes, TimSock5Bytes._Fields>, java.io.Serializable, Cloneable, Comparable<TimSock5Bytes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimSock5Bytes");

  private static final org.apache.thrift.protocol.TField PUB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("pubId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("bytes", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimSock5BytesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimSock5BytesTupleSchemeFactory());
  }

  /**
   * 发布id
   */
  public String pubId; // required
  /**
   * 序号数据块
   */
  public int index; // required
  /**
   * 数据块
   */
  public List<ByteBuffer> bytes; // required
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 发布id
     */
    PUB_ID((short)1, "pubId"),
    /**
     * 序号数据块
     */
    INDEX((short)2, "index"),
    /**
     * 数据块
     */
    BYTES((short)3, "bytes"),
    EXTRA_MAP((short)4, "extraMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PUB_ID
          return PUB_ID;
        case 2: // INDEX
          return INDEX;
        case 3: // BYTES
          return BYTES;
        case 4: // EXTRA_MAP
          return EXTRA_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PUB_ID, new org.apache.thrift.meta_data.FieldMetaData("pubId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BYTES, new org.apache.thrift.meta_data.FieldMetaData("bytes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimSock5Bytes.class, metaDataMap);
  }

  public TimSock5Bytes() {
  }

  public TimSock5Bytes(
    String pubId,
    int index,
    List<ByteBuffer> bytes)
  {
    this();
    this.pubId = pubId;
    this.index = index;
    setIndexIsSet(true);
    this.bytes = bytes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimSock5Bytes(TimSock5Bytes other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPubId()) {
      this.pubId = other.pubId;
    }
    this.index = other.index;
    if (other.isSetBytes()) {
      List<ByteBuffer> __this__bytes = new ArrayList<ByteBuffer>(other.bytes);
      this.bytes = __this__bytes;
    }
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>(other.extraMap);
      this.extraMap = __this__extraMap;
    }
  }

  public TimSock5Bytes deepCopy() {
    return new TimSock5Bytes(this);
  }

  @Override
  public void clear() {
    this.pubId = null;
    setIndexIsSet(false);
    this.index = 0;
    this.bytes = null;
    this.extraMap = null;
  }

  /**
   * 发布id
   */
  public String getPubId() {
    return this.pubId;
  }

  /**
   * 发布id
   */
  public TimSock5Bytes setPubId(String pubId) {
    this.pubId = pubId;
    return this;
  }

  public void unsetPubId() {
    this.pubId = null;
  }

  /** Returns true if field pubId is set (has been assigned a value) and false otherwise */
  public boolean isSetPubId() {
    return this.pubId != null;
  }

  public void setPubIdIsSet(boolean value) {
    if (!value) {
      this.pubId = null;
    }
  }

  /**
   * 序号数据块
   */
  public int getIndex() {
    return this.index;
  }

  /**
   * 序号数据块
   */
  public TimSock5Bytes setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  public int getBytesSize() {
    return (this.bytes == null) ? 0 : this.bytes.size();
  }

  public java.util.Iterator<ByteBuffer> getBytesIterator() {
    return (this.bytes == null) ? null : this.bytes.iterator();
  }

  public void addToBytes(ByteBuffer elem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<ByteBuffer>();
    }
    this.bytes.add(elem);
  }

  /**
   * 数据块
   */
  public List<ByteBuffer> getBytes() {
    return this.bytes;
  }

  /**
   * 数据块
   */
  public TimSock5Bytes setBytes(List<ByteBuffer> bytes) {
    this.bytes = bytes;
    return this;
  }

  public void unsetBytes() {
    this.bytes = null;
  }

  /** Returns true if field bytes is set (has been assigned a value) and false otherwise */
  public boolean isSetBytes() {
    return this.bytes != null;
  }

  public void setBytesIsSet(boolean value) {
    if (!value) {
      this.bytes = null;
    }
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public TimSock5Bytes setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PUB_ID:
      if (value == null) {
        unsetPubId();
      } else {
        setPubId((String)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Integer)value);
      }
      break;

    case BYTES:
      if (value == null) {
        unsetBytes();
      } else {
        setBytes((List<ByteBuffer>)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PUB_ID:
      return getPubId();

    case INDEX:
      return getIndex();

    case BYTES:
      return getBytes();

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PUB_ID:
      return isSetPubId();
    case INDEX:
      return isSetIndex();
    case BYTES:
      return isSetBytes();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimSock5Bytes)
      return this.equals((TimSock5Bytes)that);
    return false;
  }

  public boolean equals(TimSock5Bytes that) {
    if (that == null)
      return false;

    boolean this_present_pubId = true && this.isSetPubId();
    boolean that_present_pubId = true && that.isSetPubId();
    if (this_present_pubId || that_present_pubId) {
      if (!(this_present_pubId && that_present_pubId))
        return false;
      if (!this.pubId.equals(that.pubId))
        return false;
    }

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_bytes = true && this.isSetBytes();
    boolean that_present_bytes = true && that.isSetBytes();
    if (this_present_bytes || that_present_bytes) {
      if (!(this_present_bytes && that_present_bytes))
        return false;
      if (!this.bytes.equals(that.bytes))
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pubId = true && (isSetPubId());
    list.add(present_pubId);
    if (present_pubId)
      list.add(pubId);

    boolean present_index = true;
    list.add(present_index);
    if (present_index)
      list.add(index);

    boolean present_bytes = true && (isSetBytes());
    list.add(present_bytes);
    if (present_bytes)
      list.add(bytes);

    boolean present_extraMap = true && (isSetExtraMap());
    list.add(present_extraMap);
    if (present_extraMap)
      list.add(extraMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimSock5Bytes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPubId()).compareTo(other.isSetPubId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPubId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pubId, other.pubId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(other.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, other.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBytes()).compareTo(other.isSetBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bytes, other.bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(other.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, other.extraMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimSock5Bytes(");
    boolean first = true;

    sb.append("pubId:");
    if (this.pubId == null) {
      sb.append("null");
    } else {
      sb.append(this.pubId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bytes:");
    if (this.bytes == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.bytes, sb);
    }
    first = false;
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (pubId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pubId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'index' because it's a primitive and you chose the non-beans generator.
    if (bytes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'bytes' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimSock5BytesStandardSchemeFactory implements SchemeFactory {
    public TimSock5BytesStandardScheme getScheme() {
      return new TimSock5BytesStandardScheme();
    }
  }

  private static class TimSock5BytesStandardScheme extends StandardScheme<TimSock5Bytes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimSock5Bytes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PUB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pubId = iprot.readString();
              struct.setPubIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index = iprot.readI32();
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list244 = iprot.readListBegin();
                struct.bytes = new ArrayList<ByteBuffer>(_list244.size);
                ByteBuffer _elem245;
                for (int _i246 = 0; _i246 < _list244.size; ++_i246)
                {
                  _elem245 = iprot.readBinary();
                  struct.bytes.add(_elem245);
                }
                iprot.readListEnd();
              }
              struct.setBytesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map247 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map247.size);
                String _key248;
                String _val249;
                for (int _i250 = 0; _i250 < _map247.size; ++_i250)
                {
                  _key248 = iprot.readString();
                  _val249 = iprot.readString();
                  struct.extraMap.put(_key248, _val249);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIndex()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'index' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimSock5Bytes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pubId != null) {
        oprot.writeFieldBegin(PUB_ID_FIELD_DESC);
        oprot.writeString(struct.pubId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeI32(struct.index);
      oprot.writeFieldEnd();
      if (struct.bytes != null) {
        oprot.writeFieldBegin(BYTES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.bytes.size()));
          for (ByteBuffer _iter251 : struct.bytes)
          {
            oprot.writeBinary(_iter251);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter252 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter252.getKey());
              oprot.writeString(_iter252.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimSock5BytesTupleSchemeFactory implements SchemeFactory {
    public TimSock5BytesTupleScheme getScheme() {
      return new TimSock5BytesTupleScheme();
    }
  }

  private static class TimSock5BytesTupleScheme extends TupleScheme<TimSock5Bytes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimSock5Bytes struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.pubId);
      oprot.writeI32(struct.index);
      {
        oprot.writeI32(struct.bytes.size());
        for (ByteBuffer _iter253 : struct.bytes)
        {
          oprot.writeBinary(_iter253);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetExtraMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter254 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter254.getKey());
            oprot.writeString(_iter254.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimSock5Bytes struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.pubId = iprot.readString();
      struct.setPubIdIsSet(true);
      struct.index = iprot.readI32();
      struct.setIndexIsSet(true);
      {
        org.apache.thrift.protocol.TList _list255 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.bytes = new ArrayList<ByteBuffer>(_list255.size);
        ByteBuffer _elem256;
        for (int _i257 = 0; _i257 < _list255.size; ++_i257)
        {
          _elem256 = iprot.readBinary();
          struct.bytes.add(_elem256);
        }
      }
      struct.setBytesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map258 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map258.size);
          String _key259;
          String _val260;
          for (int _i261 = 0; _i261 < _map258.size; ++_i261)
          {
            _key259 = iprot.readString();
            _val260 = iprot.readString();
            struct.extraMap.put(_key259, _val260);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

