// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodStorageService.proto

package org.example.foodcontainer.foodstorageservice;

public final class FoodStorageServiceProto {
  private FoodStorageServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_FoodContainer_Fruit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_FoodContainer_Fruit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_FoodContainer_FoodStorageServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_FoodContainer_FoodStorageServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_FoodContainer_FoodStorageServiceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponseMultiple_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sample_FoodContainer_FoodStorageServiceResponseMultiple_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FoodStorageService.proto\022\030org.sample.F" +
      "oodContainer\"<\n\005Fruit\022\021\n\tfruitCode\030\001 \001(\t" +
      "\022\021\n\tfruitType\030\002 \001(\t\022\r\n\005fruit\030\003 \001(\t\"P\n\031Fo" +
      "odStorageServiceRequest\022\r\n\005fruit\030\001 \001(\t\022\021" +
      "\n\tfruitCode\030\002 \001(\t\022\021\n\tfruitType\030\003 \001(\t\",\n\032" +
      "FoodStorageServiceResponse\022\016\n\006result\030\001 \001" +
      "(\t\"4\n\"FoodStorageServiceResponseMultiple" +
      "\022\016\n\006result\030\001 \001(\t2\217\001\n\022FoodStorageService\022" +
      "y\n\014fruitStorage\0223.org.sample.FoodContain" +
      "er.FoodStorageServiceRequest\0324.org.sampl" +
      "e.FoodContainer.FoodStorageServiceRespon" +
      "seBI\n,org.example.foodcontainer.foodstor" +
      "ageserviceB\027FoodStorageServiceProtoP\001b\006p" +
      "roto3"
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
    internal_static_org_sample_FoodContainer_Fruit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_sample_FoodContainer_Fruit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_FoodContainer_Fruit_descriptor,
        new java.lang.String[] { "FruitCode", "FruitType", "Fruit", });
    internal_static_org_sample_FoodContainer_FoodStorageServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_sample_FoodContainer_FoodStorageServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_FoodContainer_FoodStorageServiceRequest_descriptor,
        new java.lang.String[] { "Fruit", "FruitCode", "FruitType", });
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_FoodContainer_FoodStorageServiceResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponseMultiple_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_sample_FoodContainer_FoodStorageServiceResponseMultiple_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sample_FoodContainer_FoodStorageServiceResponseMultiple_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
