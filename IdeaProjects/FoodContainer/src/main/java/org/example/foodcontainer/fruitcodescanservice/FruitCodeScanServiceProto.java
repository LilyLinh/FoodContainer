// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FruitCodeScanService.proto

package org.example.foodcontainer.fruitcodescanservice;

public final class FruitCodeScanServiceProto {
  private FruitCodeScanServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_FoodContainer_StreamFruitCodeScanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_FoodContainer_StreamFruitCodeScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_FoodContainer_FruitCodeScanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_FoodContainer_FruitCodeScanResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FruitCodeScanService.proto\022\031org.exampl" +
      "e.FoodContainer\"C\n\032StreamFruitCodeScanRe" +
      "quest\022\023\n\013scanRequest\030\001 \001(\t\022\020\n\010scanTime\030\002" +
      " \001(\t\"-\n\025FruitCodeScanResponse\022\024\n\014scanRes" +
      "ponse\030\001 \001(\t2\227\001\n\024FruitCodeScanService\022\177\n\024" +
      "fruitCodeScanRequest\0225.org.example.FoodC" +
      "ontainer.StreamFruitCodeScanRequest\0320.or" +
      "g.example.FoodContainer.FruitCodeScanRes" +
      "ponseBM\n.org.example.foodcontainer.fruit" +
      "codescanserviceB\031FruitCodeScanServicePro" +
      "toP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_example_FoodContainer_StreamFruitCodeScanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_FoodContainer_StreamFruitCodeScanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_FoodContainer_StreamFruitCodeScanRequest_descriptor,
        new java.lang.String[] { "ScanRequest", "ScanTime", });
    internal_static_org_example_FoodContainer_FruitCodeScanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_FoodContainer_FruitCodeScanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_FoodContainer_FruitCodeScanResponse_descriptor,
        new java.lang.String[] { "ScanResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
