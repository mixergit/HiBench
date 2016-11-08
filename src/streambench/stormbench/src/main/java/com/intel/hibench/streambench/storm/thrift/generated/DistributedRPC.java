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

public class DistributedRPC {

  public interface Iface {

    public String execute(String functionName, String funcArgs) throws DRPCExecutionException, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void execute(String functionName, String funcArgs, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.execute_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public String execute(String functionName, String funcArgs) throws DRPCExecutionException, org.apache.thrift.TException
    {
      send_execute(functionName, funcArgs);
      return recv_execute();
    }

    public void send_execute(String functionName, String funcArgs) throws org.apache.thrift.TException
    {
      execute_args args = new execute_args();
      args.setFunctionName(functionName);
      args.setFuncArgs(funcArgs);
      sendBase("execute", args);
    }

    public String recv_execute() throws DRPCExecutionException, org.apache.thrift.TException
    {
      execute_result result = new execute_result();
      receiveBase(result, "execute");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "execute failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void execute(String functionName, String funcArgs, org.apache.thrift.async.AsyncMethodCallback<execute_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      execute_call method_call = new execute_call(functionName, funcArgs, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class execute_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String functionName;
      private String funcArgs;
      public execute_call(String functionName, String funcArgs, org.apache.thrift.async.AsyncMethodCallback<execute_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.functionName = functionName;
        this.funcArgs = funcArgs;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("execute", org.apache.thrift.protocol.TMessageType.CALL, 0));
        execute_args args = new execute_args();
        args.setFunctionName(functionName);
        args.setFuncArgs(funcArgs);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public String getResult() throws DRPCExecutionException, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_execute();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("execute", new execute());
      return processMap;
    }

    public static class execute<I extends Iface> extends org.apache.thrift.ProcessFunction<I, execute_args> {
      public execute() {
        super("execute");
      }

      public execute_args getEmptyArgsInstance() {
        return new execute_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public execute_result getResult(I iface, execute_args args) throws org.apache.thrift.TException {
        execute_result result = new execute_result();
        try {
          result.success = iface.execute(args.functionName, args.funcArgs);
        } catch (DRPCExecutionException e) {
          result.e = e;
        }
        return result;
      }
    }

  }

  public static class execute_args implements org.apache.thrift.TBase<execute_args, execute_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("execute_args");

    private static final org.apache.thrift.protocol.TField FUNCTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("functionName", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField FUNC_ARGS_FIELD_DESC = new org.apache.thrift.protocol.TField("funcArgs", org.apache.thrift.protocol.TType.STRING, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new execute_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new execute_argsTupleSchemeFactory());
    }

    public String functionName; // required
    public String funcArgs; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      FUNCTION_NAME((short)1, "functionName"),
      FUNC_ARGS((short)2, "funcArgs");

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
          case 1: // FUNCTION_NAME
            return FUNCTION_NAME;
          case 2: // FUNC_ARGS
            return FUNC_ARGS;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.FUNCTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("functionName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.FUNC_ARGS, new org.apache.thrift.meta_data.FieldMetaData("funcArgs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(execute_args.class, metaDataMap);
    }

    public execute_args() {
    }

    public execute_args(
      String functionName,
      String funcArgs)
    {
      this();
      this.functionName = functionName;
      this.funcArgs = funcArgs;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public execute_args(execute_args other) {
      if (other.isSetFunctionName()) {
        this.functionName = other.functionName;
      }
      if (other.isSetFuncArgs()) {
        this.funcArgs = other.funcArgs;
      }
    }

    public execute_args deepCopy() {
      return new execute_args(this);
    }

    @Override
    public void clear() {
      this.functionName = null;
      this.funcArgs = null;
    }

    public String getFunctionName() {
      return this.functionName;
    }

    public execute_args setFunctionName(String functionName) {
      this.functionName = functionName;
      return this;
    }

    public void unsetFunctionName() {
      this.functionName = null;
    }

    /** Returns true if field functionName is set (has been assigned a value) and false otherwise */
    public boolean isSetFunctionName() {
      return this.functionName != null;
    }

    public void setFunctionNameIsSet(boolean value) {
      if (!value) {
        this.functionName = null;
      }
    }

    public String getFuncArgs() {
      return this.funcArgs;
    }

    public execute_args setFuncArgs(String funcArgs) {
      this.funcArgs = funcArgs;
      return this;
    }

    public void unsetFuncArgs() {
      this.funcArgs = null;
    }

    /** Returns true if field funcArgs is set (has been assigned a value) and false otherwise */
    public boolean isSetFuncArgs() {
      return this.funcArgs != null;
    }

    public void setFuncArgsIsSet(boolean value) {
      if (!value) {
        this.funcArgs = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case FUNCTION_NAME:
        if (value == null) {
          unsetFunctionName();
        } else {
          setFunctionName((String)value);
        }
        break;

      case FUNC_ARGS:
        if (value == null) {
          unsetFuncArgs();
        } else {
          setFuncArgs((String)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case FUNCTION_NAME:
        return getFunctionName();

      case FUNC_ARGS:
        return getFuncArgs();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case FUNCTION_NAME:
        return isSetFunctionName();
      case FUNC_ARGS:
        return isSetFuncArgs();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof execute_args)
        return this.equals((execute_args)that);
      return false;
    }

    public boolean equals(execute_args that) {
      if (that == null)
        return false;

      boolean this_present_functionName = true && this.isSetFunctionName();
      boolean that_present_functionName = true && that.isSetFunctionName();
      if (this_present_functionName || that_present_functionName) {
        if (!(this_present_functionName && that_present_functionName))
          return false;
        if (!this.functionName.equals(that.functionName))
          return false;
      }

      boolean this_present_funcArgs = true && this.isSetFuncArgs();
      boolean that_present_funcArgs = true && that.isSetFuncArgs();
      if (this_present_funcArgs || that_present_funcArgs) {
        if (!(this_present_funcArgs && that_present_funcArgs))
          return false;
        if (!this.funcArgs.equals(that.funcArgs))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      HashCodeBuilder builder = new HashCodeBuilder();

      boolean present_functionName = true && (isSetFunctionName());
      builder.append(present_functionName);
      if (present_functionName)
        builder.append(functionName);

      boolean present_funcArgs = true && (isSetFuncArgs());
      builder.append(present_funcArgs);
      if (present_funcArgs)
        builder.append(funcArgs);

      return builder.toHashCode();
    }

    public int compareTo(execute_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      execute_args typedOther = (execute_args)other;

      lastComparison = Boolean.valueOf(isSetFunctionName()).compareTo(typedOther.isSetFunctionName());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetFunctionName()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.functionName, typedOther.functionName);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetFuncArgs()).compareTo(typedOther.isSetFuncArgs());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetFuncArgs()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.funcArgs, typedOther.funcArgs);
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
      StringBuilder sb = new StringBuilder("execute_args(");
      boolean first = true;

      sb.append("functionName:");
      if (this.functionName == null) {
        sb.append("null");
      } else {
        sb.append(this.functionName);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("funcArgs:");
      if (this.funcArgs == null) {
        sb.append("null");
      } else {
        sb.append(this.funcArgs);
      }
      first = false;
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class execute_argsStandardSchemeFactory implements SchemeFactory {
      public execute_argsStandardScheme getScheme() {
        return new execute_argsStandardScheme();
      }
    }

    private static class execute_argsStandardScheme extends StandardScheme<execute_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, execute_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // FUNCTION_NAME
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.functionName = iprot.readString();
                struct.setFunctionNameIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // FUNC_ARGS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.funcArgs = iprot.readString();
                struct.setFuncArgsIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, execute_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.functionName != null) {
          oprot.writeFieldBegin(FUNCTION_NAME_FIELD_DESC);
          oprot.writeString(struct.functionName);
          oprot.writeFieldEnd();
        }
        if (struct.funcArgs != null) {
          oprot.writeFieldBegin(FUNC_ARGS_FIELD_DESC);
          oprot.writeString(struct.funcArgs);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class execute_argsTupleSchemeFactory implements SchemeFactory {
      public execute_argsTupleScheme getScheme() {
        return new execute_argsTupleScheme();
      }
    }

    private static class execute_argsTupleScheme extends TupleScheme<execute_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, execute_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetFunctionName()) {
          optionals.set(0);
        }
        if (struct.isSetFuncArgs()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetFunctionName()) {
          oprot.writeString(struct.functionName);
        }
        if (struct.isSetFuncArgs()) {
          oprot.writeString(struct.funcArgs);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, execute_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.functionName = iprot.readString();
          struct.setFunctionNameIsSet(true);
        }
        if (incoming.get(1)) {
          struct.funcArgs = iprot.readString();
          struct.setFuncArgsIsSet(true);
        }
      }
    }

  }

  public static class execute_result implements org.apache.thrift.TBase<execute_result, execute_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("execute_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRING, (short)0);
    private static final org.apache.thrift.protocol.TField E_FIELD_DESC = new org.apache.thrift.protocol.TField("e", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new execute_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new execute_resultTupleSchemeFactory());
    }

    public String success; // required
    public DRPCExecutionException e; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      E((short)1, "e");

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
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // E
            return E;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.E, new org.apache.thrift.meta_data.FieldMetaData("e", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(execute_result.class, metaDataMap);
    }

    public execute_result() {
    }

    public execute_result(
      String success,
      DRPCExecutionException e)
    {
      this();
      this.success = success;
      this.e = e;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public execute_result(execute_result other) {
      if (other.isSetSuccess()) {
        this.success = other.success;
      }
      if (other.isSetE()) {
        this.e = new DRPCExecutionException(other.e);
      }
    }

    public execute_result deepCopy() {
      return new execute_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.e = null;
    }

    public String getSuccess() {
      return this.success;
    }

    public execute_result setSuccess(String success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public DRPCExecutionException getE() {
      return this.e;
    }

    public execute_result setE(DRPCExecutionException e) {
      this.e = e;
      return this;
    }

    public void unsetE() {
      this.e = null;
    }

    /** Returns true if field e is set (has been assigned a value) and false otherwise */
    public boolean isSetE() {
      return this.e != null;
    }

    public void setEIsSet(boolean value) {
      if (!value) {
        this.e = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((String)value);
        }
        break;

      case E:
        if (value == null) {
          unsetE();
        } else {
          setE((DRPCExecutionException)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      case E:
        return getE();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case E:
        return isSetE();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof execute_result)
        return this.equals((execute_result)that);
      return false;
    }

    public boolean equals(execute_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_e = true && this.isSetE();
      boolean that_present_e = true && that.isSetE();
      if (this_present_e || that_present_e) {
        if (!(this_present_e && that_present_e))
          return false;
        if (!this.e.equals(that.e))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      HashCodeBuilder builder = new HashCodeBuilder();

      boolean present_success = true && (isSetSuccess());
      builder.append(present_success);
      if (present_success)
        builder.append(success);

      boolean present_e = true && (isSetE());
      builder.append(present_e);
      if (present_e)
        builder.append(e);

      return builder.toHashCode();
    }

    public int compareTo(execute_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      execute_result typedOther = (execute_result)other;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetE()).compareTo(typedOther.isSetE());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetE()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.e, typedOther.e);
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
      StringBuilder sb = new StringBuilder("execute_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("e:");
      if (this.e == null) {
        sb.append("null");
      } else {
        sb.append(this.e);
      }
      first = false;
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class execute_resultStandardSchemeFactory implements SchemeFactory {
      public execute_resultStandardScheme getScheme() {
        return new execute_resultStandardScheme();
      }
    }

    private static class execute_resultStandardScheme extends StandardScheme<execute_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, execute_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.success = iprot.readString();
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // E
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.e = new DRPCExecutionException();
                struct.e.read(iprot);
                struct.setEIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, execute_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeString(struct.success);
          oprot.writeFieldEnd();
        }
        if (struct.e != null) {
          oprot.writeFieldBegin(E_FIELD_DESC);
          struct.e.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class execute_resultTupleSchemeFactory implements SchemeFactory {
      public execute_resultTupleScheme getScheme() {
        return new execute_resultTupleScheme();
      }
    }

    private static class execute_resultTupleScheme extends TupleScheme<execute_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, execute_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetE()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetSuccess()) {
          oprot.writeString(struct.success);
        }
        if (struct.isSetE()) {
          struct.e.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, execute_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.success = iprot.readString();
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.e = new DRPCExecutionException();
          struct.e.read(iprot);
          struct.setEIsSet(true);
        }
      }
    }

  }

}
