// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodStorageService.proto

package org.example.foodcontainer.foodstorageservice;

/**
 * Protobuf type {@code org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse}
 */
public  final class StreamFoodEmptySpaceUpdateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse)
    StreamFoodEmptySpaceUpdateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamFoodEmptySpaceUpdateResponse.newBuilder() to construct.
  private StreamFoodEmptySpaceUpdateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamFoodEmptySpaceUpdateResponse() {
    spaceUpdate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamFoodEmptySpaceUpdateResponse(
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

            spaceUpdate_ = s;
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
    return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.class, org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.Builder.class);
  }

  public static final int SPACEUPDATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceUpdate_;
  /**
   * <code>string spaceUpdate = 1;</code>
   */
  public java.lang.String getSpaceUpdate() {
    java.lang.Object ref = spaceUpdate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceUpdate_ = s;
      return s;
    }
  }
  /**
   * <code>string spaceUpdate = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSpaceUpdateBytes() {
    java.lang.Object ref = spaceUpdate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceUpdate_ = b;
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
    if (!getSpaceUpdateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceUpdate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpaceUpdateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceUpdate_);
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
    if (!(obj instanceof org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse)) {
      return super.equals(obj);
    }
    org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse other = (org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse) obj;

    boolean result = true;
    result = result && getSpaceUpdate()
        .equals(other.getSpaceUpdate());
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
    hash = (37 * hash) + SPACEUPDATE_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceUpdate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parseFrom(
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
  public static Builder newBuilder(org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse prototype) {
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
   * Protobuf type {@code org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse)
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.class, org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.Builder.class);
    }

    // Construct using org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.newBuilder()
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
      spaceUpdate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.internal_static_org_sample_FoodContainer_StreamFoodEmptySpaceUpdateResponse_descriptor;
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse getDefaultInstanceForType() {
      return org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse build() {
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse buildPartial() {
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse result = new org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse(this);
      result.spaceUpdate_ = spaceUpdate_;
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
      if (other instanceof org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse) {
        return mergeFrom((org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse other) {
      if (other == org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse.getDefaultInstance()) return this;
      if (!other.getSpaceUpdate().isEmpty()) {
        spaceUpdate_ = other.spaceUpdate_;
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
      org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceUpdate_ = "";
    /**
     * <code>string spaceUpdate = 1;</code>
     */
    public java.lang.String getSpaceUpdate() {
      java.lang.Object ref = spaceUpdate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceUpdate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string spaceUpdate = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSpaceUpdateBytes() {
      java.lang.Object ref = spaceUpdate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceUpdate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string spaceUpdate = 1;</code>
     */
    public Builder setSpaceUpdate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceUpdate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string spaceUpdate = 1;</code>
     */
    public Builder clearSpaceUpdate() {
      
      spaceUpdate_ = getDefaultInstance().getSpaceUpdate();
      onChanged();
      return this;
    }
    /**
     * <code>string spaceUpdate = 1;</code>
     */
    public Builder setSpaceUpdateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceUpdate_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse)
  }

  // @@protoc_insertion_point(class_scope:org.sample.FoodContainer.StreamFoodEmptySpaceUpdateResponse)
  private static final org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse();
  }

  public static org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamFoodEmptySpaceUpdateResponse>() {
    @java.lang.Override
    public StreamFoodEmptySpaceUpdateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamFoodEmptySpaceUpdateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamFoodEmptySpaceUpdateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.foodcontainer.foodstorageservice.StreamFoodEmptySpaceUpdateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
