// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SampleService.proto

package com.benchmarking.grpc;

/**
 * Protobuf type {@code com.benchmarking.grpc.FClass}
 */
public final class FClass extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.benchmarking.grpc.FClass)
    FClassOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FClass.newBuilder() to construct.
  private FClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FClass() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FClass();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.benchmarking.grpc.SampleServiceOuterClass.internal_static_com_benchmarking_grpc_FClass_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.benchmarking.grpc.SampleServiceOuterClass.internal_static_com_benchmarking_grpc_FClass_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.benchmarking.grpc.FClass.class, com.benchmarking.grpc.FClass.Builder.class);
  }

  public static final int FCLASS1_FIELD_NUMBER = 1;
  private long fClass1_ = 0L;
  /**
   * <code>int64 FClass1 = 1;</code>
   * @return The fClass1.
   */
  @java.lang.Override
  public long getFClass1() {
    return fClass1_;
  }

  public static final int FCLASS2_FIELD_NUMBER = 2;
  private long fClass2_ = 0L;
  /**
   * <code>int64 FClass2 = 2;</code>
   * @return The fClass2.
   */
  @java.lang.Override
  public long getFClass2() {
    return fClass2_;
  }

  public static final int FCLASS3_FIELD_NUMBER = 3;
  private long fClass3_ = 0L;
  /**
   * <code>int64 FClass3 = 3;</code>
   * @return The fClass3.
   */
  @java.lang.Override
  public long getFClass3() {
    return fClass3_;
  }

  public static final int FCLASS4_FIELD_NUMBER = 4;
  private long fClass4_ = 0L;
  /**
   * <code>int64 FClass4 = 4;</code>
   * @return The fClass4.
   */
  @java.lang.Override
  public long getFClass4() {
    return fClass4_;
  }

  public static final int FCLASS5_FIELD_NUMBER = 5;
  private long fClass5_ = 0L;
  /**
   * <code>int64 FClass5 = 5;</code>
   * @return The fClass5.
   */
  @java.lang.Override
  public long getFClass5() {
    return fClass5_;
  }

  public static final int FCLASS6_FIELD_NUMBER = 6;
  private long fClass6_ = 0L;
  /**
   * <code>int64 FClass6 = 6;</code>
   * @return The fClass6.
   */
  @java.lang.Override
  public long getFClass6() {
    return fClass6_;
  }

  public static final int FCLASS7_FIELD_NUMBER = 7;
  private long fClass7_ = 0L;
  /**
   * <code>int64 FClass7 = 7;</code>
   * @return The fClass7.
   */
  @java.lang.Override
  public long getFClass7() {
    return fClass7_;
  }

  public static final int FCLASS8_FIELD_NUMBER = 8;
  private long fClass8_ = 0L;
  /**
   * <code>int64 FClass8 = 8;</code>
   * @return The fClass8.
   */
  @java.lang.Override
  public long getFClass8() {
    return fClass8_;
  }

  public static final int FCLASS9_FIELD_NUMBER = 9;
  private long fClass9_ = 0L;
  /**
   * <code>int64 FClass9 = 9;</code>
   * @return The fClass9.
   */
  @java.lang.Override
  public long getFClass9() {
    return fClass9_;
  }

  public static final int FCLASS10_FIELD_NUMBER = 10;
  private long fClass10_ = 0L;
  /**
   * <code>int64 FClass10 = 10;</code>
   * @return The fClass10.
   */
  @java.lang.Override
  public long getFClass10() {
    return fClass10_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fClass1_ != 0L) {
      output.writeInt64(1, fClass1_);
    }
    if (fClass2_ != 0L) {
      output.writeInt64(2, fClass2_);
    }
    if (fClass3_ != 0L) {
      output.writeInt64(3, fClass3_);
    }
    if (fClass4_ != 0L) {
      output.writeInt64(4, fClass4_);
    }
    if (fClass5_ != 0L) {
      output.writeInt64(5, fClass5_);
    }
    if (fClass6_ != 0L) {
      output.writeInt64(6, fClass6_);
    }
    if (fClass7_ != 0L) {
      output.writeInt64(7, fClass7_);
    }
    if (fClass8_ != 0L) {
      output.writeInt64(8, fClass8_);
    }
    if (fClass9_ != 0L) {
      output.writeInt64(9, fClass9_);
    }
    if (fClass10_ != 0L) {
      output.writeInt64(10, fClass10_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fClass1_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, fClass1_);
    }
    if (fClass2_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fClass2_);
    }
    if (fClass3_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, fClass3_);
    }
    if (fClass4_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, fClass4_);
    }
    if (fClass5_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, fClass5_);
    }
    if (fClass6_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, fClass6_);
    }
    if (fClass7_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, fClass7_);
    }
    if (fClass8_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, fClass8_);
    }
    if (fClass9_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, fClass9_);
    }
    if (fClass10_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, fClass10_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.benchmarking.grpc.FClass)) {
      return super.equals(obj);
    }
    com.benchmarking.grpc.FClass other = (com.benchmarking.grpc.FClass) obj;

    if (getFClass1()
        != other.getFClass1()) return false;
    if (getFClass2()
        != other.getFClass2()) return false;
    if (getFClass3()
        != other.getFClass3()) return false;
    if (getFClass4()
        != other.getFClass4()) return false;
    if (getFClass5()
        != other.getFClass5()) return false;
    if (getFClass6()
        != other.getFClass6()) return false;
    if (getFClass7()
        != other.getFClass7()) return false;
    if (getFClass8()
        != other.getFClass8()) return false;
    if (getFClass9()
        != other.getFClass9()) return false;
    if (getFClass10()
        != other.getFClass10()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FCLASS1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass1());
    hash = (37 * hash) + FCLASS2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass2());
    hash = (37 * hash) + FCLASS3_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass3());
    hash = (37 * hash) + FCLASS4_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass4());
    hash = (37 * hash) + FCLASS5_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass5());
    hash = (37 * hash) + FCLASS6_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass6());
    hash = (37 * hash) + FCLASS7_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass7());
    hash = (37 * hash) + FCLASS8_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass8());
    hash = (37 * hash) + FCLASS9_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass9());
    hash = (37 * hash) + FCLASS10_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFClass10());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.benchmarking.grpc.FClass parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.benchmarking.grpc.FClass parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.benchmarking.grpc.FClass parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.benchmarking.grpc.FClass parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.benchmarking.grpc.FClass parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.benchmarking.grpc.FClass parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.benchmarking.grpc.FClass prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.benchmarking.grpc.FClass}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.benchmarking.grpc.FClass)
      com.benchmarking.grpc.FClassOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.benchmarking.grpc.SampleServiceOuterClass.internal_static_com_benchmarking_grpc_FClass_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.benchmarking.grpc.SampleServiceOuterClass.internal_static_com_benchmarking_grpc_FClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.benchmarking.grpc.FClass.class, com.benchmarking.grpc.FClass.Builder.class);
    }

    // Construct using com.benchmarking.grpc.FClass.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fClass1_ = 0L;
      fClass2_ = 0L;
      fClass3_ = 0L;
      fClass4_ = 0L;
      fClass5_ = 0L;
      fClass6_ = 0L;
      fClass7_ = 0L;
      fClass8_ = 0L;
      fClass9_ = 0L;
      fClass10_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.benchmarking.grpc.SampleServiceOuterClass.internal_static_com_benchmarking_grpc_FClass_descriptor;
    }

    @java.lang.Override
    public com.benchmarking.grpc.FClass getDefaultInstanceForType() {
      return com.benchmarking.grpc.FClass.getDefaultInstance();
    }

    @java.lang.Override
    public com.benchmarking.grpc.FClass build() {
      com.benchmarking.grpc.FClass result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.benchmarking.grpc.FClass buildPartial() {
      com.benchmarking.grpc.FClass result = new com.benchmarking.grpc.FClass(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.benchmarking.grpc.FClass result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fClass1_ = fClass1_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fClass2_ = fClass2_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fClass3_ = fClass3_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fClass4_ = fClass4_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fClass5_ = fClass5_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.fClass6_ = fClass6_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.fClass7_ = fClass7_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.fClass8_ = fClass8_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.fClass9_ = fClass9_;
      }
      if (((from_bitField0_ & 0x00000200) != 0)) {
        result.fClass10_ = fClass10_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.benchmarking.grpc.FClass) {
        return mergeFrom((com.benchmarking.grpc.FClass)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.benchmarking.grpc.FClass other) {
      if (other == com.benchmarking.grpc.FClass.getDefaultInstance()) return this;
      if (other.getFClass1() != 0L) {
        setFClass1(other.getFClass1());
      }
      if (other.getFClass2() != 0L) {
        setFClass2(other.getFClass2());
      }
      if (other.getFClass3() != 0L) {
        setFClass3(other.getFClass3());
      }
      if (other.getFClass4() != 0L) {
        setFClass4(other.getFClass4());
      }
      if (other.getFClass5() != 0L) {
        setFClass5(other.getFClass5());
      }
      if (other.getFClass6() != 0L) {
        setFClass6(other.getFClass6());
      }
      if (other.getFClass7() != 0L) {
        setFClass7(other.getFClass7());
      }
      if (other.getFClass8() != 0L) {
        setFClass8(other.getFClass8());
      }
      if (other.getFClass9() != 0L) {
        setFClass9(other.getFClass9());
      }
      if (other.getFClass10() != 0L) {
        setFClass10(other.getFClass10());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              fClass1_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              fClass2_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              fClass3_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              fClass4_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              fClass5_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              fClass6_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              fClass7_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              fClass8_ = input.readInt64();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
            case 72: {
              fClass9_ = input.readInt64();
              bitField0_ |= 0x00000100;
              break;
            } // case 72
            case 80: {
              fClass10_ = input.readInt64();
              bitField0_ |= 0x00000200;
              break;
            } // case 80
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long fClass1_ ;
    /**
     * <code>int64 FClass1 = 1;</code>
     * @return The fClass1.
     */
    @java.lang.Override
    public long getFClass1() {
      return fClass1_;
    }
    /**
     * <code>int64 FClass1 = 1;</code>
     * @param value The fClass1 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass1(long value) {

      fClass1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fClass1_ = 0L;
      onChanged();
      return this;
    }

    private long fClass2_ ;
    /**
     * <code>int64 FClass2 = 2;</code>
     * @return The fClass2.
     */
    @java.lang.Override
    public long getFClass2() {
      return fClass2_;
    }
    /**
     * <code>int64 FClass2 = 2;</code>
     * @param value The fClass2 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass2(long value) {

      fClass2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fClass2_ = 0L;
      onChanged();
      return this;
    }

    private long fClass3_ ;
    /**
     * <code>int64 FClass3 = 3;</code>
     * @return The fClass3.
     */
    @java.lang.Override
    public long getFClass3() {
      return fClass3_;
    }
    /**
     * <code>int64 FClass3 = 3;</code>
     * @param value The fClass3 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass3(long value) {

      fClass3_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass3 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass3() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fClass3_ = 0L;
      onChanged();
      return this;
    }

    private long fClass4_ ;
    /**
     * <code>int64 FClass4 = 4;</code>
     * @return The fClass4.
     */
    @java.lang.Override
    public long getFClass4() {
      return fClass4_;
    }
    /**
     * <code>int64 FClass4 = 4;</code>
     * @param value The fClass4 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass4(long value) {

      fClass4_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass4 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass4() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fClass4_ = 0L;
      onChanged();
      return this;
    }

    private long fClass5_ ;
    /**
     * <code>int64 FClass5 = 5;</code>
     * @return The fClass5.
     */
    @java.lang.Override
    public long getFClass5() {
      return fClass5_;
    }
    /**
     * <code>int64 FClass5 = 5;</code>
     * @param value The fClass5 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass5(long value) {

      fClass5_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass5 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass5() {
      bitField0_ = (bitField0_ & ~0x00000010);
      fClass5_ = 0L;
      onChanged();
      return this;
    }

    private long fClass6_ ;
    /**
     * <code>int64 FClass6 = 6;</code>
     * @return The fClass6.
     */
    @java.lang.Override
    public long getFClass6() {
      return fClass6_;
    }
    /**
     * <code>int64 FClass6 = 6;</code>
     * @param value The fClass6 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass6(long value) {

      fClass6_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass6 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass6() {
      bitField0_ = (bitField0_ & ~0x00000020);
      fClass6_ = 0L;
      onChanged();
      return this;
    }

    private long fClass7_ ;
    /**
     * <code>int64 FClass7 = 7;</code>
     * @return The fClass7.
     */
    @java.lang.Override
    public long getFClass7() {
      return fClass7_;
    }
    /**
     * <code>int64 FClass7 = 7;</code>
     * @param value The fClass7 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass7(long value) {

      fClass7_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass7 = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass7() {
      bitField0_ = (bitField0_ & ~0x00000040);
      fClass7_ = 0L;
      onChanged();
      return this;
    }

    private long fClass8_ ;
    /**
     * <code>int64 FClass8 = 8;</code>
     * @return The fClass8.
     */
    @java.lang.Override
    public long getFClass8() {
      return fClass8_;
    }
    /**
     * <code>int64 FClass8 = 8;</code>
     * @param value The fClass8 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass8(long value) {

      fClass8_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass8 = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass8() {
      bitField0_ = (bitField0_ & ~0x00000080);
      fClass8_ = 0L;
      onChanged();
      return this;
    }

    private long fClass9_ ;
    /**
     * <code>int64 FClass9 = 9;</code>
     * @return The fClass9.
     */
    @java.lang.Override
    public long getFClass9() {
      return fClass9_;
    }
    /**
     * <code>int64 FClass9 = 9;</code>
     * @param value The fClass9 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass9(long value) {

      fClass9_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass9 = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass9() {
      bitField0_ = (bitField0_ & ~0x00000100);
      fClass9_ = 0L;
      onChanged();
      return this;
    }

    private long fClass10_ ;
    /**
     * <code>int64 FClass10 = 10;</code>
     * @return The fClass10.
     */
    @java.lang.Override
    public long getFClass10() {
      return fClass10_;
    }
    /**
     * <code>int64 FClass10 = 10;</code>
     * @param value The fClass10 to set.
     * @return This builder for chaining.
     */
    public Builder setFClass10(long value) {

      fClass10_ = value;
      bitField0_ |= 0x00000200;
      onChanged();
      return this;
    }
    /**
     * <code>int64 FClass10 = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearFClass10() {
      bitField0_ = (bitField0_ & ~0x00000200);
      fClass10_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.benchmarking.grpc.FClass)
  }

  // @@protoc_insertion_point(class_scope:com.benchmarking.grpc.FClass)
  private static final com.benchmarking.grpc.FClass DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.benchmarking.grpc.FClass();
  }

  public static com.benchmarking.grpc.FClass getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FClass>
      PARSER = new com.google.protobuf.AbstractParser<FClass>() {
    @java.lang.Override
    public FClass parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FClass> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FClass> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.benchmarking.grpc.FClass getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
