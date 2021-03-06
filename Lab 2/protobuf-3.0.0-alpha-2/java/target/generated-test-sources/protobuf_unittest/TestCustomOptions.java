// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/test_custom_options.proto

package protobuf_unittest;

public final class TestCustomOptions {
  private TestCustomOptions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TestMessageWithCustomOptionsContainerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.TestMessageWithCustomOptionsContainer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    boolean hasField();
    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions getField();
    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder getFieldOrBuilder();
  }
  /**
   * Protobuf type {@code protobuf_unittest.TestMessageWithCustomOptionsContainer}
   */
  public  static final class TestMessageWithCustomOptionsContainer extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.TestMessageWithCustomOptionsContainer)
      TestMessageWithCustomOptionsContainerOrBuilder {
    // Use TestMessageWithCustomOptionsContainer.newBuilder() to construct.
    private TestMessageWithCustomOptionsContainer(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private TestMessageWithCustomOptionsContainer() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestMessageWithCustomOptionsContainer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = field_.toBuilder();
              }
              field_ = input.readMessage(protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(field_);
                field_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.TestCustomOptions.internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.TestCustomOptions.internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.class, protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.Builder.class);
    }

    public static final com.google.protobuf.Parser<TestMessageWithCustomOptionsContainer> PARSER =
        new com.google.protobuf.AbstractParser<TestMessageWithCustomOptionsContainer>() {
      public TestMessageWithCustomOptionsContainer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestMessageWithCustomOptionsContainer(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TestMessageWithCustomOptionsContainer> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FIELD_FIELD_NUMBER = 1;
    private protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions field_;
    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    public boolean hasField() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    public protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions getField() {
      return field_ == null ? protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.getDefaultInstance() : field_;
    }
    /**
     * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
     */
    public protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder getFieldOrBuilder() {
      return field_ == null ? protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.getDefaultInstance() : field_;
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
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getField());
      }
      unknownFields.writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getField());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobuf_unittest.TestMessageWithCustomOptionsContainer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.TestMessageWithCustomOptionsContainer)
        protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf_unittest.TestCustomOptions.internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf_unittest.TestCustomOptions.internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.class, protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.Builder.class);
      }

      // Construct using protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFieldFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (fieldBuilder_ == null) {
          field_ = null;
        } else {
          fieldBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.TestCustomOptions.internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor;
      }

      public protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer getDefaultInstanceForType() {
        return protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.getDefaultInstance();
      }

      public protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer build() {
        protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer buildPartial() {
        protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer result = new protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (fieldBuilder_ == null) {
          result.field_ = field_;
        } else {
          result.field_ = fieldBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer) {
          return mergeFrom((protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer other) {
        if (other == protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer.getDefaultInstance()) return this;
        if (other.hasField()) {
          mergeField(other.getField());
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
        protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions field_ = null;
      private com.google.protobuf.SingleFieldBuilder<
          protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder> fieldBuilder_;
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public boolean hasField() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions getField() {
        if (fieldBuilder_ == null) {
          return field_ == null ? protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.getDefaultInstance() : field_;
        } else {
          return fieldBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public Builder setField(protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions value) {
        if (fieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          field_ = value;
          onChanged();
        } else {
          fieldBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public Builder setField(
          protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder builderForValue) {
        if (fieldBuilder_ == null) {
          field_ = builderForValue.build();
          onChanged();
        } else {
          fieldBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public Builder mergeField(protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions value) {
        if (fieldBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              field_ != null &&
              field_ != protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.getDefaultInstance()) {
            field_ =
              protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.newBuilder(field_).mergeFrom(value).buildPartial();
          } else {
            field_ = value;
          }
          onChanged();
        } else {
          fieldBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public Builder clearField() {
        if (fieldBuilder_ == null) {
          field_ = null;
          onChanged();
        } else {
          fieldBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder getFieldBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFieldFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      public protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder getFieldOrBuilder() {
        if (fieldBuilder_ != null) {
          return fieldBuilder_.getMessageOrBuilder();
        } else {
          return field_ == null ?
              protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.getDefaultInstance() : field_;
        }
      }
      /**
       * <code>optional .protobuf_unittest.TestMessageWithCustomOptions field = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder> 
          getFieldFieldBuilder() {
        if (fieldBuilder_ == null) {
          fieldBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptions.Builder, protobuf_unittest.UnittestCustomOptions.TestMessageWithCustomOptionsOrBuilder>(
                  getField(),
                  getParentForChildren(),
                  isClean());
          field_ = null;
        }
        return fieldBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:protobuf_unittest.TestMessageWithCustomOptionsContainer)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest.TestMessageWithCustomOptionsContainer)
    private static final protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer defaultInstance;static {
      defaultInstance = new protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer();
    }

    public static protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer getDefaultInstance() {
      return defaultInstance;
    }

    public protobuf_unittest.TestCustomOptions.TestMessageWithCustomOptionsContainer getDefaultInstanceForType() {
      return defaultInstance;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-com/google/protobuf/test_custom_option" +
      "s.proto\022\021protobuf_unittest\032-google/proto" +
      "buf/unittest_custom_options.proto\"g\n%Tes" +
      "tMessageWithCustomOptionsContainer\022>\n\005fi" +
      "eld\030\001 \001(\0132/.protobuf_unittest.TestMessag" +
      "eWithCustomOptions"
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
          protobuf_unittest.UnittestCustomOptions.getDescriptor(),
        }, assigner);
    internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protobuf_unittest_TestMessageWithCustomOptionsContainer_descriptor,
        new java.lang.String[] { "Field", });
    protobuf_unittest.UnittestCustomOptions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
