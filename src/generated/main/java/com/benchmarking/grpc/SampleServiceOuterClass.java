// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SampleService.proto

package com.benchmarking.grpc;

public final class SampleServiceOuterClass {
  private SampleServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_benchmarking_grpc_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_benchmarking_grpc_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_benchmarking_grpc_FClass_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_benchmarking_grpc_FClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_benchmarking_grpc_BigObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_benchmarking_grpc_BigObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_benchmarking_grpc_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_benchmarking_grpc_GetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SampleService.proto\022\025com.benchmarking." +
      "grpc\"\014\n\nGetRequest\"\263\001\n\006FClass\022\017\n\007FClass1" +
      "\030\001 \001(\003\022\017\n\007FClass2\030\002 \001(\003\022\017\n\007FClass3\030\003 \001(\003" +
      "\022\017\n\007FClass4\030\004 \001(\003\022\017\n\007FClass5\030\005 \001(\003\022\017\n\007FC" +
      "lass6\030\006 \001(\003\022\017\n\007FClass7\030\007 \001(\003\022\017\n\007FClass8\030" +
      "\010 \001(\003\022\017\n\007FClass9\030\t \001(\003\022\020\n\010FClass10\030\n \001(\003" +
      "\"\312\013\n\tBigObject\022\n\n\002f1\030\001 \001(\003\022\n\n\002f2\030\002 \001(\003\022\n" +
      "\n\002f3\030\003 \001(\003\022\n\n\002f4\030\004 \001(\003\022\n\n\002f5\030\005 \001(\003\022\n\n\002f6" +
      "\030\006 \001(\003\022\n\n\002f7\030\007 \001(\003\022\n\n\002f8\030\010 \001(\003\022\n\n\002f9\030\t \001" +
      "(\003\022\013\n\003f10\030\n \001(\003\022\013\n\003f11\030\013 \001(\t\022\013\n\003f12\030\014 \001(" +
      "\t\022\013\n\003f13\030\r \001(\t\022\013\n\003f14\030\016 \001(\t\022\013\n\003f15\030\017 \001(\t" +
      "\022\013\n\003f16\030\020 \001(\t\022\013\n\003f17\030\021 \001(\t\022\013\n\003f18\030\022 \001(\t\022" +
      "\013\n\003f19\030\023 \001(\t\022\013\n\003f20\030\024 \001(\t\022\013\n\003f21\030\025 \001(\010\022\013" +
      "\n\003f22\030\026 \001(\010\022\013\n\003f23\030\027 \001(\010\022\013\n\003f24\030\030 \001(\010\022\013\n" +
      "\003f25\030\031 \001(\010\022\013\n\003f26\030\032 \001(\010\022\013\n\003f27\030\033 \001(\010\022\013\n\003" +
      "f28\030\034 \001(\010\022\013\n\003f29\030\035 \001(\010\022\013\n\003f30\030\036 \001(\010\022\013\n\003f" +
      "31\030\037 \001(\005\022\013\n\003f32\030  \001(\005\022\013\n\003f33\030! \001(\005\022\013\n\003f3" +
      "4\030\" \001(\005\022\013\n\003f35\030# \001(\005\022\013\n\003f36\030$ \001(\005\022\013\n\003f37" +
      "\030% \001(\005\022\013\n\003f38\030& \001(\005\022\013\n\003f39\030\' \001(\005\022\013\n\003f40\030" +
      "( \001(\005\022\013\n\003f41\030) \001(\001\022\013\n\003f42\030* \001(\001\022\013\n\003f43\030+" +
      " \001(\001\022\013\n\003f44\030, \001(\001\022\013\n\003f45\030- \001(\001\022\013\n\003f46\030. " +
      "\001(\001\022\013\n\003f47\030/ \001(\001\022\013\n\003f48\0300 \001(\001\022\013\n\003f49\0301 \001" +
      "(\001\022\013\n\003f50\0302 \001(\001\022%\n\003f51\0303 \001(\0162\030.com.bench" +
      "marking.grpc.E\022%\n\003f52\0304 \001(\0162\030.com.benchm" +
      "arking.grpc.E\022%\n\003f53\0305 \001(\0162\030.com.benchma" +
      "rking.grpc.E\022%\n\003f54\0306 \001(\0162\030.com.benchmar" +
      "king.grpc.E\022%\n\003f55\0307 \001(\0162\030.com.benchmark" +
      "ing.grpc.E\022%\n\003f56\0308 \001(\0162\030.com.benchmarki" +
      "ng.grpc.E\022%\n\003f57\0309 \001(\0162\030.com.benchmarkin" +
      "g.grpc.E\022%\n\003f58\030: \001(\0162\030.com.benchmarking" +
      ".grpc.E\022%\n\003f59\030; \001(\0162\030.com.benchmarking." +
      "grpc.E\022%\n\003f60\030< \001(\0162\030.com.benchmarking.g" +
      "rpc.E\022*\n\003f61\030= \001(\0132\035.com.benchmarking.gr" +
      "pc.FClass\022*\n\003f62\030> \001(\0132\035.com.benchmarkin" +
      "g.grpc.FClass\022*\n\003f63\030? \001(\0132\035.com.benchma" +
      "rking.grpc.FClass\022*\n\003f64\030@ \001(\0132\035.com.ben" +
      "chmarking.grpc.FClass\022*\n\003f65\030A \001(\0132\035.com" +
      ".benchmarking.grpc.FClass\022*\n\003f66\030B \001(\0132\035" +
      ".com.benchmarking.grpc.FClass\022*\n\003f67\030C \001" +
      "(\0132\035.com.benchmarking.grpc.FClass\022*\n\003f68" +
      "\030D \001(\0132\035.com.benchmarking.grpc.FClass\022*\n" +
      "\003f69\030E \001(\0132\035.com.benchmarking.grpc.FClas" +
      "s\022*\n\003f70\030F \001(\0132\035.com.benchmarking.grpc.F" +
      "Class\"C\n\013GetResponse\0224\n\nbigObjects\030\001 \003(\013" +
      "2 .com.benchmarking.grpc.BigObject*+\n\001E\022" +
      "\006\n\002E1\020\000\022\006\n\002E2\020\002\022\006\n\002E3\020\003\022\006\n\002E4\020\004\022\006\n\002E5\020\0052" +
      "]\n\rSampleService\022L\n\003Get\022!.com.benchmarki" +
      "ng.grpc.GetRequest\032\".com.benchmarking.gr" +
      "pc.GetResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_benchmarking_grpc_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_benchmarking_grpc_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_benchmarking_grpc_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_benchmarking_grpc_FClass_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_benchmarking_grpc_FClass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_benchmarking_grpc_FClass_descriptor,
        new java.lang.String[] { "FClass1", "FClass2", "FClass3", "FClass4", "FClass5", "FClass6", "FClass7", "FClass8", "FClass9", "FClass10", });
    internal_static_com_benchmarking_grpc_BigObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_benchmarking_grpc_BigObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_benchmarking_grpc_BigObject_descriptor,
        new java.lang.String[] { "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20", "F21", "F22", "F23", "F24", "F25", "F26", "F27", "F28", "F29", "F30", "F31", "F32", "F33", "F34", "F35", "F36", "F37", "F38", "F39", "F40", "F41", "F42", "F43", "F44", "F45", "F46", "F47", "F48", "F49", "F50", "F51", "F52", "F53", "F54", "F55", "F56", "F57", "F58", "F59", "F60", "F61", "F62", "F63", "F64", "F65", "F66", "F67", "F68", "F69", "F70", });
    internal_static_com_benchmarking_grpc_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_benchmarking_grpc_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_benchmarking_grpc_GetResponse_descriptor,
        new java.lang.String[] { "BigObjects", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}