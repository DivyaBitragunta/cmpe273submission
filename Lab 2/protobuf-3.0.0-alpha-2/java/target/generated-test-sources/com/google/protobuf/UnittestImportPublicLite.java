// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_import_public_lite.proto

package com.google.protobuf;

public final class UnittestImportPublicLite {
  private UnittestImportPublicLite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PublicImportMessageLiteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest_import.PublicImportMessageLite)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 e = 1;</code>
     */
    boolean hasE();
    /**
     * <code>optional int32 e = 1;</code>
     */
    int getE();
  }
  /**
   * Protobuf type {@code protobuf_unittest_import.PublicImportMessageLite}
   */
  public  static final class PublicImportMessageLite extends
      com.google.protobuf.GeneratedMessageLite implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest_import.PublicImportMessageLite)
      PublicImportMessageLiteOrBuilder {
    private PublicImportMessageLite(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      e_ = 0;
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSetLite.Builder unknownFields =
          com.google.protobuf.UnknownFieldSetLite.newBuilder();
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
            case 8: {
              bitField0_ |= 0x00000001;
              e_ = input.readInt32();
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
      }
    }
    public static final com.google.protobuf.Parser<PublicImportMessageLite> PARSER =
        new com.google.protobuf.AbstractParser<PublicImportMessageLite>() {
      public PublicImportMessageLite parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PublicImportMessageLite(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PublicImportMessageLite> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int E_FIELD_NUMBER = 1;
    private int e_;
    /**
     * <code>optional int32 e = 1;</code>
     */
    public boolean hasE() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 e = 1;</code>
     */
    public int getE() {
      return e_;
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
        output.writeInt32(1, e_);
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
          .computeInt32Size(1, e_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    /**
     * Protobuf type {@code protobuf_unittest_import.PublicImportMessageLite}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest_import.PublicImportMessageLite)
        com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLiteOrBuilder {
      // Construct using com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite.newBuilder()
      private Builder() {
        super(defaultInstance);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
      }
      public Builder clear() {
        super.clear();
        e_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite buildPartial() {
        com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite result = null;
        try {
          result = new com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite(
              com.google.protobuf.Internal
                  .EMPTY_CODED_INPUT_STREAM,
              com.google.protobuf.ExtensionRegistryLite
                  .getEmptyRegistry());
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e);
        }
        result.unknownFields = this.unknownFields;
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.e_ = e_;
        result.bitField0_ = to_bitField0_;
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite other) {
        if (other == com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite.getDefaultInstance()) return this;
        if (other.hasE()) {
          setE(other.getE());
        }
        this.mergeUnknownFields(other.unknownFields);
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      private int bitField0_;

      private int e_ ;
      /**
       * <code>optional int32 e = 1;</code>
       */
      public boolean hasE() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public int getE() {
        return e_;
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public Builder setE(int value) {
        bitField0_ |= 0x00000001;
        e_ = value;
        
        return this;
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public Builder clearE() {
        bitField0_ = (bitField0_ & ~0x00000001);
        e_ = 0;
        
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf_unittest_import.PublicImportMessageLite)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest_import.PublicImportMessageLite)
    private static final com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite defaultInstance;static {
      try {
        defaultInstance = new PublicImportMessageLite(
            com.google.protobuf.Internal
                .EMPTY_CODED_INPUT_STREAM,
            com.google.protobuf.ExtensionRegistryLite
                .getEmptyRegistry());
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new ExceptionInInitializerError(e);
      }
    }

    public static com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite getDefaultInstance() {
      return defaultInstance;
    }

    public com.google.protobuf.UnittestImportPublicLite.PublicImportMessageLite getDefaultInstanceForType() {
      return defaultInstance;
    }

  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
