// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodStorageService.proto

package org.example.foodcontainer.foodstorageservice;

/**
 * Protobuf type {@code org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest}
 */
public  final class StreamFoodEmptySpaceUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest)
    StreamFoodEmptySpaceUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamFoodEmptySpaceUpdateRequest.newBuilder() to construct.
  private StreamFoodEmptySpaceUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamFoodEmptySpaceUpdateRequest() {
    spaceQuery_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamFoodEmptySpaceUpdateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            spaceQuery_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.class, org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.Builder.class);
  }

  public static final int SPACEQUERY_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceQuery_;
  /**
   * <code>string spaceQuery = 1;</code>
   */
  public java.lang.String getSpaceQuery() {
    java.lang.Object ref = spaceQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceQuery_ = s;
      return s;
    }
  }
  /**
   * <code>string spaceQuery = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSpaceQueryBytes() {
    java.lang.Object ref = spaceQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceQuery_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSpaceQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceQuery_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpaceQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceQuery_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest)) {
      return super.equals(obj);
    }
    org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest other = (org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest) obj;

    boolean result = true;
    result = result && getSpaceQuery()
        .equals(other.getSpaceQuery());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SPACEQUERY_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceQuery().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parseFrom(
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
  public static Builder newBuilder(org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest prototype) {
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
   * Protobuf type {@code org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest)
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.class, org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.Builder.class);
    }

    // Construct using org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      spaceQuery_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateRequest_descriptor;
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest getDefaultInstanceForType() {
      return org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest build() {
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest buildPartial() {
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest result = new org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest(this);
      result.spaceQuery_ = spaceQuery_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest) {
        return mergeFrom((org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest other) {
      if (other == org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest.getDefaultInstance()) return this;
      if (!other.getSpaceQuery().isEmpty()) {
        spaceQuery_ = other.spaceQuery_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceQuery_ = "";
    /**
     * <code>string spaceQuery = 1;</code>
     */
    public java.lang.String getSpaceQuery() {
      java.lang.Object ref = spaceQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spaceQuery = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSpaceQueryBytes() {
      java.lang.Object ref = spaceQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spaceQuery = 1;</code>
     */
    public Builder setSpaceQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceQuery_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spaceQuery = 1;</code>
     */
    public Builder clearSpaceQuery() {
      
      spaceQuery_ = getDefaultInstance().getSpaceQuery();
      onChanged();
      return this;
    }
    /**
     * <code>string spaceQuery = 1;</code>
     */
    public Builder setSpaceQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceQuery_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateRequest)
  private static final org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest();
  }

  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamFoodEmptySpaceUpdateRequest>() {
    @java.lang.Override
    public StreamFoodEmptySpaceUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamFoodEmptySpaceUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

