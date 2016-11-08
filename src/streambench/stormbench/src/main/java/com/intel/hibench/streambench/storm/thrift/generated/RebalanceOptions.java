/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.intel.hibench.streambench.storm.thrift.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RebalanceOptions implements org.apache.thrift.TBase<RebalanceOptions, RebalanceOptions._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RebalanceOptions");

  private static final org.apache.thrift.protocol.TField WAIT_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("wait_secs", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_WORKERS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_workers", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_executors", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RebalanceOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RebalanceOptionsTupleSchemeFactory());
  }

  public int wait_secs; // optional
  public int num_workers; // optional
  public Map<String,Integer> num_executors; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WAIT_SECS((short)1, "wait_secs"),
    NUM_WORKERS((short)2, "num_workers"),
    NUM_EXECUTORS((short)3, "num_executors");

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
        case 1: // WAIT_SECS
          return WAIT_SECS;
        case 2: // NUM_WORKERS
          return NUM_WORKERS;
        case 3: // NUM_EXECUTORS
          return NUM_EXECUTORS;
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
  private static final int __WAIT_SECS_ISSET_ID = 0;
  private static final int __NUM_WORKERS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.WAIT_SECS,_Fields.NUM_WORKERS,_Fields.NUM_EXECUTORS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WAIT_SECS, new org.apache.thrift.meta_data.FieldMetaData("wait_secs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_WORKERS, new org.apache.thrift.meta_data.FieldMetaData("num_workers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("num_executors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RebalanceOptions.class, metaDataMap);
  }

  public RebalanceOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RebalanceOptions(RebalanceOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.wait_secs = other.wait_secs;
    this.num_workers = other.num_workers;
    if (other.isSetNum_executors()) {
      Map<String,Integer> __this__num_executors = new HashMap<String,Integer>();
      for (Map.Entry<String, Integer> other_element : other.num_executors.entrySet()) {

        String other_element_key = other_element.getKey();
        Integer other_element_value = other_element.getValue();

        String __this__num_executors_copy_key = other_element_key;

        Integer __this__num_executors_copy_value = other_element_value;

        __this__num_executors.put(__this__num_executors_copy_key, __this__num_executors_copy_value);
      }
      this.num_executors = __this__num_executors;
    }
  }

  public RebalanceOptions deepCopy() {
    return new RebalanceOptions(this);
  }

  @Override
  public void clear() {
    setWait_secsIsSet(false);
    this.wait_secs = 0;
    setNum_workersIsSet(false);
    this.num_workers = 0;
    this.num_executors = null;
  }

  public int getWait_secs() {
    return this.wait_secs;
  }

  public RebalanceOptions setWait_secs(int wait_secs) {
    this.wait_secs = wait_secs;
    setWait_secsIsSet(true);
    return this;
  }

  public void unsetWait_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WAIT_SECS_ISSET_ID);
  }

  /** Returns true if field wait_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetWait_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __WAIT_SECS_ISSET_ID);
  }

  public void setWait_secsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WAIT_SECS_ISSET_ID, value);
  }

  public int getNum_workers() {
    return this.num_workers;
  }

  public RebalanceOptions setNum_workers(int num_workers) {
    this.num_workers = num_workers;
    setNum_workersIsSet(true);
    return this;
  }

  public void unsetNum_workers() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_WORKERS_ISSET_ID);
  }

  /** Returns true if field num_workers is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_workers() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_WORKERS_ISSET_ID);
  }

  public void setNum_workersIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_WORKERS_ISSET_ID, value);
  }

  public int getNum_executorsSize() {
    return (this.num_executors == null) ? 0 : this.num_executors.size();
  }

  public void putToNum_executors(String key, int val) {
    if (this.num_executors == null) {
      this.num_executors = new HashMap<String,Integer>();
    }
    this.num_executors.put(key, val);
  }

  public Map<String,Integer> getNum_executors() {
    return this.num_executors;
  }

  public RebalanceOptions setNum_executors(Map<String,Integer> num_executors) {
    this.num_executors = num_executors;
    return this;
  }

  public void unsetNum_executors() {
    this.num_executors = null;
  }

  /** Returns true if field num_executors is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_executors() {
    return this.num_executors != null;
  }

  public void setNum_executorsIsSet(boolean value) {
    if (!value) {
      this.num_executors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WAIT_SECS:
      if (value == null) {
        unsetWait_secs();
      } else {
        setWait_secs((Integer)value);
      }
      break;

    case NUM_WORKERS:
      if (value == null) {
        unsetNum_workers();
      } else {
        setNum_workers((Integer)value);
      }
      break;

    case NUM_EXECUTORS:
      if (value == null) {
        unsetNum_executors();
      } else {
        setNum_executors((Map<String,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WAIT_SECS:
      return Integer.valueOf(getWait_secs());

    case NUM_WORKERS:
      return Integer.valueOf(getNum_workers());

    case NUM_EXECUTORS:
      return getNum_executors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WAIT_SECS:
      return isSetWait_secs();
    case NUM_WORKERS:
      return isSetNum_workers();
    case NUM_EXECUTORS:
      return isSetNum_executors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RebalanceOptions)
      return this.equals((RebalanceOptions)that);
    return false;
  }

  public boolean equals(RebalanceOptions that) {
    if (that == null)
      return false;

    boolean this_present_wait_secs = true && this.isSetWait_secs();
    boolean that_present_wait_secs = true && that.isSetWait_secs();
    if (this_present_wait_secs || that_present_wait_secs) {
      if (!(this_present_wait_secs && that_present_wait_secs))
        return false;
      if (this.wait_secs != that.wait_secs)
        return false;
    }

    boolean this_present_num_workers = true && this.isSetNum_workers();
    boolean that_present_num_workers = true && that.isSetNum_workers();
    if (this_present_num_workers || that_present_num_workers) {
      if (!(this_present_num_workers && that_present_num_workers))
        return false;
      if (this.num_workers != that.num_workers)
        return false;
    }

    boolean this_present_num_executors = true && this.isSetNum_executors();
    boolean that_present_num_executors = true && that.isSetNum_executors();
    if (this_present_num_executors || that_present_num_executors) {
      if (!(this_present_num_executors && that_present_num_executors))
        return false;
      if (!this.num_executors.equals(that.num_executors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_wait_secs = true && (isSetWait_secs());
    builder.append(present_wait_secs);
    if (present_wait_secs)
      builder.append(wait_secs);

    boolean present_num_workers = true && (isSetNum_workers());
    builder.append(present_num_workers);
    if (present_num_workers)
      builder.append(num_workers);

    boolean present_num_executors = true && (isSetNum_executors());
    builder.append(present_num_executors);
    if (present_num_executors)
      builder.append(num_executors);

    return builder.toHashCode();
  }

  public int compareTo(RebalanceOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RebalanceOptions typedOther = (RebalanceOptions)other;

    lastComparison = Boolean.valueOf(isSetWait_secs()).compareTo(typedOther.isSetWait_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWait_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wait_secs, typedOther.wait_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_workers()).compareTo(typedOther.isSetNum_workers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_workers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_workers, typedOther.num_workers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_executors()).compareTo(typedOther.isSetNum_executors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_executors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_executors, typedOther.num_executors);
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
    StringBuilder sb = new StringBuilder("RebalanceOptions(");
    boolean first = true;

    if (isSetWait_secs()) {
      sb.append("wait_secs:");
      sb.append(this.wait_secs);
      first = false;
    }
    if (isSetNum_workers()) {
      if (!first) sb.append(", ");
      sb.append("num_workers:");
      sb.append(this.num_workers);
      first = false;
    }
    if (isSetNum_executors()) {
      if (!first) sb.append(", ");
      sb.append("num_executors:");
      if (this.num_executors == null) {
        sb.append("null");
      } else {
        sb.append(this.num_executors);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class RebalanceOptionsStandardSchemeFactory implements SchemeFactory {
    public RebalanceOptionsStandardScheme getScheme() {
      return new RebalanceOptionsStandardScheme();
    }
  }

  private static class RebalanceOptionsStandardScheme extends StandardScheme<RebalanceOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RebalanceOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WAIT_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wait_secs = iprot.readI32();
              struct.setWait_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_WORKERS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_workers = iprot.readI32();
              struct.setNum_workersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map316 = iprot.readMapBegin();
                struct.num_executors = new HashMap<String,Integer>(2*_map316.size);
                for (int _i317 = 0; _i317 < _map316.size; ++_i317)
                {
                  String _key318; // required
                  int _val319; // required
                  _key318 = iprot.readString();
                  _val319 = iprot.readI32();
                  struct.num_executors.put(_key318, _val319);
                }
                iprot.readMapEnd();
              }
              struct.setNum_executorsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RebalanceOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetWait_secs()) {
        oprot.writeFieldBegin(WAIT_SECS_FIELD_DESC);
        oprot.writeI32(struct.wait_secs);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum_workers()) {
        oprot.writeFieldBegin(NUM_WORKERS_FIELD_DESC);
        oprot.writeI32(struct.num_workers);
        oprot.writeFieldEnd();
      }
      if (struct.num_executors != null) {
        if (struct.isSetNum_executors()) {
          oprot.writeFieldBegin(NUM_EXECUTORS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.num_executors.size()));
            for (Map.Entry<String, Integer> _iter320 : struct.num_executors.entrySet())
            {
              oprot.writeString(_iter320.getKey());
              oprot.writeI32(_iter320.getValue());
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

  private static class RebalanceOptionsTupleSchemeFactory implements SchemeFactory {
    public RebalanceOptionsTupleScheme getScheme() {
      return new RebalanceOptionsTupleScheme();
    }
  }

  private static class RebalanceOptionsTupleScheme extends TupleScheme<RebalanceOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RebalanceOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWait_secs()) {
        optionals.set(0);
      }
      if (struct.isSetNum_workers()) {
        optionals.set(1);
      }
      if (struct.isSetNum_executors()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetWait_secs()) {
        oprot.writeI32(struct.wait_secs);
      }
      if (struct.isSetNum_workers()) {
        oprot.writeI32(struct.num_workers);
      }
      if (struct.isSetNum_executors()) {
        {
          oprot.writeI32(struct.num_executors.size());
          for (Map.Entry<String, Integer> _iter321 : struct.num_executors.entrySet())
          {
            oprot.writeString(_iter321.getKey());
            oprot.writeI32(_iter321.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RebalanceOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.wait_secs = iprot.readI32();
        struct.setWait_secsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.num_workers = iprot.readI32();
        struct.setNum_workersIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map322 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.num_executors = new HashMap<String,Integer>(2*_map322.size);
          for (int _i323 = 0; _i323 < _map322.size; ++_i323)
          {
            String _key324; // required
            int _val325; // required
            _key324 = iprot.readString();
            _val325 = iprot.readI32();
            struct.num_executors.put(_key324, _val325);
          }
        }
        struct.setNum_executorsIsSet(true);
      }
    }
  }

}

