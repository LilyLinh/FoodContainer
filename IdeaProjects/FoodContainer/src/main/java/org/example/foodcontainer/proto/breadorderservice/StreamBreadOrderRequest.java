// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreadOrderService.proto

package org.example.foodcontainer.proto.breadorderservice;

/**
 * Protobuf type {@code org.example.FoodContainer.StreamBreadOrderRequest}
 */
public  final class StreamBreadOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.FoodContainer.StreamBreadOrderRequest)
    StreamBreadOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamBreadOrderRequest.newBuilder() to construct.
  private StreamBreadOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamBreadOrderRequest() {
    orderRequest_ = "";
    orderTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamBreadOrderRequest(
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

            orderRequest_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            orderTime_ = s;
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
    return org.example.foodcontainer.proto.breadorderservice.BreadOrderServiceProto.internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.foodcontainer.proto.breadorderservice.BreadOrderServiceProto.internal_static_org_example_FoodContainer_StreamBreadOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.class, org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.Builder.class);
  }

  public static final int ORDERREQUEST_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderRequest_;
  /**
   * <code>string OrderRequest = 1;</code>
   */
  public java.lang.String getOrderRequest() {
    java.lang.Object ref = orderRequest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderRequest_ = s;
      return s;
    }
  }
  /**
   * <code>string OrderRequest = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderRequestBytes() {
    java.lang.Object ref = orderRequest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderRequest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERTIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object orderTime_;
  /**
   * <code>string orderTime = 2;</code>
   */
  public java.lang.String getOrderTime() {
    java.lang.Object ref = orderTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderTime_ = s;
      return s;
    }
  }
  /**
   * <code>string orderTime = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOrderTimeBytes() {
    java.lang.Object ref = orderTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderTime_ = b;
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
    if (!getOrderRequestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderRequest_);
    }
    if (!getOrderTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderRequestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderRequest_);
    }
    if (!getOrderTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderTime_);
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
    if (!(obj instanceof org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest)) {
      return super.equals(obj);
    }
    org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest other = (org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest) obj;

    boolean result = true;
    result = result && getOrderRequest()
        .equals(other.getOrderRequest());
    result = result && getOrderTime()
        .equals(other.getOrderTime());
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
    hash = (37 * hash) + ORDERREQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getOrderRequest().hashCode();
    hash = (37 * hash) + ORDERTIME_FIELD_NUMBER;
    hash = (53 * hash) + getOrderTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parseFrom(
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
  public static Builder newBuilder(org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest prototype) {
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
   * Protobuf type {@code org.example.FoodContainer.StreamBreadOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.FoodContainer.StreamBreadOrderRequest)
      org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.foodcontainer.proto.breadorderservice.BreadOrderServiceProto.internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.foodcontainer.proto.breadorderservice.BreadOrderServiceProto.internal_static_org_example_FoodContainer_StreamBreadOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.class, org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.Builder.class);
    }

    // Construct using org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.newBuilder()
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
      orderRequest_ = "";

      orderTime_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.foodcontainer.proto.breadorderservice.BreadOrderServiceProto.internal_static_org_example_FoodContainer_StreamBreadOrderRequest_descriptor;
    }

    @java.lang.Override
    public org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest getDefaultInstanceForType() {
      return org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest build() {
      org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest buildPartial() {
      org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest result = new org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest(this);
      result.orderRequest_ = orderRequest_;
      result.orderTime_ = orderTime_;
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
      if (other instanceof org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest) {
        return mergeFrom((org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest other) {
      if (other == org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest.getDefaultInstance()) return this;
      if (!other.getOrderRequest().isEmpty()) {
        orderRequest_ = other.orderRequest_;
        onChanged();
      }
      if (!other.getOrderTime().isEmpty()) {
        orderTime_ = other.orderTime_;
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
      org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderRequest_ = "";
    /**
     * <code>string OrderRequest = 1;</code>
     */
    public java.lang.String getOrderRequest() {
      java.lang.Object ref = orderRequest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderRequest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string OrderRequest = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderRequestBytes() {
      java.lang.Object ref = orderRequest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderRequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string OrderRequest = 1;</code>
     */
    public Builder setOrderRequest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string OrderRequest = 1;</code>
     */
    public Builder clearOrderRequest() {
      
      orderRequest_ = getDefaultInstance().getOrderRequest();
      onChanged();
      return this;
    }
    /**
     * <code>string OrderRequest = 1;</code>
     */
    public Builder setOrderRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderRequest_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderTime_ = "";
    /**
     * <code>string orderTime = 2;</code>
     */
    public java.lang.String getOrderTime() {
      java.lang.Object ref = orderTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderTime = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOrderTimeBytes() {
      java.lang.Object ref = orderTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderTime = 2;</code>
     */
    public Builder setOrderTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderTime = 2;</code>
     */
    public Builder clearOrderTime() {
      
      orderTime_ = getDefaultInstance().getOrderTime();
      onChanged();
      return this;
    }
    /**
     * <code>string orderTime = 2;</code>
     */
    public Builder setOrderTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.example.FoodContainer.StreamBreadOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:org.example.FoodContainer.StreamBreadOrderRequest)
  private static final org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest();
  }

  public static org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamBreadOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamBreadOrderRequest>() {
    @java.lang.Override
    public StreamBreadOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamBreadOrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamBreadOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamBreadOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.foodcontainer.proto.breadorderservice.StreamBreadOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

