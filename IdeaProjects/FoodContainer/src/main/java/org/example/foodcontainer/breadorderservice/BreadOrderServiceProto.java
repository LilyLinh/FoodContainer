// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreadOrderService.proto

package org.example.foodcontainer.breadorderservice;

public final class BreadOrderServiceProto {
  private BreadOrderServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_FoodContainer_StreamBreadOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_FoodContainer_StreamBreadOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_FoodContainer_StreamBreadOrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BreadOrderService.proto\022\031org.example.F" +
      "oodContainer\"B\n\027StreamBreadOrderRequest\022" +
      "\024\n\014OrderRequest\030\001 \001(\t\022\021\n\torderTime\030\002 \001(\t" +
      "\"1\n\030StreamBreadOrderResponse\022\025\n\rOrderRes" +
      "ponse\030\001 \001(\t2\223\001\n\021BreadOrderService\022~\n\021bre" +
      "adOrderRequest\0222.org.example.FoodContain" +
      "er.StreamBreadOrderRequest\0323.org.example" +
      ".FoodContainer.StreamBreadOrderResponse(" +
      "\001BG\n+org.example.foodcontainer.breadorde" +
      "rserviceB\026BreadOrderServiceProtoP\001b\006prot" +
      "o3"
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
    internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_FoodContainer_StreamBreadOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor,
        new java.lang.String[] { "OrderRequest", "OrderTime", });
    internal_static_org_example_FoodContainer_StreamBreadOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_FoodContainer_StreamBreadOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_FoodContainer_StreamBreadOrderResponse_descriptor,
        new java.lang.String[] { "OrderResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}