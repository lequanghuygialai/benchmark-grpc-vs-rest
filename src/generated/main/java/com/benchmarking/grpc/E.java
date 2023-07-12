// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SampleService.proto

package com.benchmarking.grpc;

/**
 * Protobuf enum {@code com.benchmarking.grpc.E}
 */
public enum E
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>E1 = 0;</code>
   */
  E1(0),
  /**
   * <code>E2 = 2;</code>
   */
  E2(2),
  /**
   * <code>E3 = 3;</code>
   */
  E3(3),
  /**
   * <code>E4 = 4;</code>
   */
  E4(4),
  /**
   * <code>E5 = 5;</code>
   */
  E5(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>E1 = 0;</code>
   */
  public static final int E1_VALUE = 0;
  /**
   * <code>E2 = 2;</code>
   */
  public static final int E2_VALUE = 2;
  /**
   * <code>E3 = 3;</code>
   */
  public static final int E3_VALUE = 3;
  /**
   * <code>E4 = 4;</code>
   */
  public static final int E4_VALUE = 4;
  /**
   * <code>E5 = 5;</code>
   */
  public static final int E5_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static E valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static E forNumber(int value) {
    switch (value) {
      case 0: return E1;
      case 2: return E2;
      case 3: return E3;
      case 4: return E4;
      case 5: return E5;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<E>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      E> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<E>() {
          public E findValueByNumber(int number) {
            return E.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.benchmarking.grpc.SampleServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final E[] VALUES = values();

  public static E valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private E(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.benchmarking.grpc.E)
}
