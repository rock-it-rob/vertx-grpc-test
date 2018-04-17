// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echo.proto

package rob.proto.vertx.grpc.api;

public final class Echo {
  private Echo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EchoRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EchoRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code EchoRequest}
   */
  public  static final class EchoRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EchoRequest)
      EchoRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EchoRequest.newBuilder() to construct.
    private EchoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EchoRequest() {
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EchoRequest(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
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
      return rob.proto.vertx.grpc.api.Echo.internal_static_EchoRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rob.proto.vertx.grpc.api.Echo.internal_static_EchoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rob.proto.vertx.grpc.api.Echo.EchoRequest.class, rob.proto.vertx.grpc.api.Echo.EchoRequest.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
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
      if (!(obj instanceof rob.proto.vertx.grpc.api.Echo.EchoRequest)) {
        return super.equals(obj);
      }
      rob.proto.vertx.grpc.api.Echo.EchoRequest other = (rob.proto.vertx.grpc.api.Echo.EchoRequest) obj;

      boolean result = true;
      result = result && getMessage()
          .equals(other.getMessage());
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
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(rob.proto.vertx.grpc.api.Echo.EchoRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code EchoRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EchoRequest)
        rob.proto.vertx.grpc.api.Echo.EchoRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                rob.proto.vertx.grpc.api.Echo.EchoRequest.class, rob.proto.vertx.grpc.api.Echo.EchoRequest.Builder.class);
      }

      // Construct using rob.proto.vertx.grpc.api.Echo.EchoRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        message_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoRequest_descriptor;
      }

      public rob.proto.vertx.grpc.api.Echo.EchoRequest getDefaultInstanceForType() {
        return rob.proto.vertx.grpc.api.Echo.EchoRequest.getDefaultInstance();
      }

      public rob.proto.vertx.grpc.api.Echo.EchoRequest build() {
        rob.proto.vertx.grpc.api.Echo.EchoRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public rob.proto.vertx.grpc.api.Echo.EchoRequest buildPartial() {
        rob.proto.vertx.grpc.api.Echo.EchoRequest result = new rob.proto.vertx.grpc.api.Echo.EchoRequest(this);
        result.message_ = message_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rob.proto.vertx.grpc.api.Echo.EchoRequest) {
          return mergeFrom((rob.proto.vertx.grpc.api.Echo.EchoRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(rob.proto.vertx.grpc.api.Echo.EchoRequest other) {
        if (other == rob.proto.vertx.grpc.api.Echo.EchoRequest.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        rob.proto.vertx.grpc.api.Echo.EchoRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (rob.proto.vertx.grpc.api.Echo.EchoRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EchoRequest)
    }

    // @@protoc_insertion_point(class_scope:EchoRequest)
    private static final rob.proto.vertx.grpc.api.Echo.EchoRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new rob.proto.vertx.grpc.api.Echo.EchoRequest();
    }

    public static rob.proto.vertx.grpc.api.Echo.EchoRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EchoRequest>
        PARSER = new com.google.protobuf.AbstractParser<EchoRequest>() {
      public EchoRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EchoRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EchoRequest> getParserForType() {
      return PARSER;
    }

    public rob.proto.vertx.grpc.api.Echo.EchoRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EchoResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EchoResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code EchoResponse}
   */
  public  static final class EchoResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EchoResponse)
      EchoResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EchoResponse.newBuilder() to construct.
    private EchoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EchoResponse() {
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EchoResponse(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
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
      return rob.proto.vertx.grpc.api.Echo.internal_static_EchoResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rob.proto.vertx.grpc.api.Echo.internal_static_EchoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rob.proto.vertx.grpc.api.Echo.EchoResponse.class, rob.proto.vertx.grpc.api.Echo.EchoResponse.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
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
      if (!(obj instanceof rob.proto.vertx.grpc.api.Echo.EchoResponse)) {
        return super.equals(obj);
      }
      rob.proto.vertx.grpc.api.Echo.EchoResponse other = (rob.proto.vertx.grpc.api.Echo.EchoResponse) obj;

      boolean result = true;
      result = result && getMessage()
          .equals(other.getMessage());
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
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rob.proto.vertx.grpc.api.Echo.EchoResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(rob.proto.vertx.grpc.api.Echo.EchoResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code EchoResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EchoResponse)
        rob.proto.vertx.grpc.api.Echo.EchoResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                rob.proto.vertx.grpc.api.Echo.EchoResponse.class, rob.proto.vertx.grpc.api.Echo.EchoResponse.Builder.class);
      }

      // Construct using rob.proto.vertx.grpc.api.Echo.EchoResponse.newBuilder()
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
      public Builder clear() {
        super.clear();
        message_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rob.proto.vertx.grpc.api.Echo.internal_static_EchoResponse_descriptor;
      }

      public rob.proto.vertx.grpc.api.Echo.EchoResponse getDefaultInstanceForType() {
        return rob.proto.vertx.grpc.api.Echo.EchoResponse.getDefaultInstance();
      }

      public rob.proto.vertx.grpc.api.Echo.EchoResponse build() {
        rob.proto.vertx.grpc.api.Echo.EchoResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public rob.proto.vertx.grpc.api.Echo.EchoResponse buildPartial() {
        rob.proto.vertx.grpc.api.Echo.EchoResponse result = new rob.proto.vertx.grpc.api.Echo.EchoResponse(this);
        result.message_ = message_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rob.proto.vertx.grpc.api.Echo.EchoResponse) {
          return mergeFrom((rob.proto.vertx.grpc.api.Echo.EchoResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(rob.proto.vertx.grpc.api.Echo.EchoResponse other) {
        if (other == rob.proto.vertx.grpc.api.Echo.EchoResponse.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        rob.proto.vertx.grpc.api.Echo.EchoResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (rob.proto.vertx.grpc.api.Echo.EchoResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EchoResponse)
    }

    // @@protoc_insertion_point(class_scope:EchoResponse)
    private static final rob.proto.vertx.grpc.api.Echo.EchoResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new rob.proto.vertx.grpc.api.Echo.EchoResponse();
    }

    public static rob.proto.vertx.grpc.api.Echo.EchoResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EchoResponse>
        PARSER = new com.google.protobuf.AbstractParser<EchoResponse>() {
      public EchoResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EchoResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EchoResponse> getParserForType() {
      return PARSER;
    }

    public rob.proto.vertx.grpc.api.Echo.EchoResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EchoRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EchoRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EchoResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EchoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necho.proto\"\036\n\013EchoRequest\022\017\n\007message\030\001" +
      " \001(\t\"\037\n\014EchoResponse\022\017\n\007message\030\001 \001(\t22\n" +
      "\013EchoService\022#\n\004echo\022\014.EchoRequest\032\r.Ech" +
      "oResponseB\032\n\030rob.proto.vertx.grpc.apib\006p" +
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
    internal_static_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EchoRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_EchoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EchoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EchoResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
