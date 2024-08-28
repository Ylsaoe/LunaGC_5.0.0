// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarTalkRsp.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarTalkRspOuterClass {
  private HomeAvatarTalkRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarTalkRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarTalkRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     * @return Whether the avatarTalkInfo field is set.
     */
    boolean hasAvatarTalkInfo();
    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     * @return The avatarTalkInfo.
     */
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfo();
    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     */
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoOrBuilder();
  }
  /**
   * Protobuf type {@code HomeAvatarTalkRsp}
   */
  public static final class HomeAvatarTalkRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarTalkRsp)
      HomeAvatarTalkRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarTalkRsp.newBuilder() to construct.
    private HomeAvatarTalkRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarTalkRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarTalkRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAvatarTalkRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 66: {
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder subBuilder = null;
              if (avatarTalkInfo_ != null) {
                subBuilder = avatarTalkInfo_.toBuilder();
              }
              avatarTalkInfo_ = input.readMessage(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatarTalkInfo_);
                avatarTalkInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.internal_static_HomeAvatarTalkRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.internal_static_HomeAvatarTalkRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.class, emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AVATAR_TALK_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo avatarTalkInfo_;
    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     * @return Whether the avatarTalkInfo field is set.
     */
    @java.lang.Override
    public boolean hasAvatarTalkInfo() {
      return avatarTalkInfo_ != null;
    }
    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     * @return The avatarTalkInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfo() {
      return avatarTalkInfo_ == null ? emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.getDefaultInstance() : avatarTalkInfo_;
    }
    /**
     * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoOrBuilder() {
      return getAvatarTalkInfo();
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (avatarTalkInfo_ != null) {
        output.writeMessage(8, getAvatarTalkInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (avatarTalkInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getAvatarTalkInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp other = (emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasAvatarTalkInfo() != other.hasAvatarTalkInfo()) return false;
      if (hasAvatarTalkInfo()) {
        if (!getAvatarTalkInfo()
            .equals(other.getAvatarTalkInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasAvatarTalkInfo()) {
        hash = (37 * hash) + AVATAR_TALK_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarTalkInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp prototype) {
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
     * Protobuf type {@code HomeAvatarTalkRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarTalkRsp)
        emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.internal_static_HomeAvatarTalkRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.internal_static_HomeAvatarTalkRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.class, emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.newBuilder()
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
        retcode_ = 0;

        if (avatarTalkInfoBuilder_ == null) {
          avatarTalkInfo_ = null;
        } else {
          avatarTalkInfo_ = null;
          avatarTalkInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.internal_static_HomeAvatarTalkRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp build() {
        emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp buildPartial() {
        emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp result = new emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp(this);
        result.retcode_ = retcode_;
        if (avatarTalkInfoBuilder_ == null) {
          result.avatarTalkInfo_ = avatarTalkInfo_;
        } else {
          result.avatarTalkInfo_ = avatarTalkInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp other) {
        if (other == emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasAvatarTalkInfo()) {
          mergeAvatarTalkInfo(other.getAvatarTalkInfo());
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
        emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo avatarTalkInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> avatarTalkInfoBuilder_;
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       * @return Whether the avatarTalkInfo field is set.
       */
      public boolean hasAvatarTalkInfo() {
        return avatarTalkInfoBuilder_ != null || avatarTalkInfo_ != null;
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       * @return The avatarTalkInfo.
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo getAvatarTalkInfo() {
        if (avatarTalkInfoBuilder_ == null) {
          return avatarTalkInfo_ == null ? emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.getDefaultInstance() : avatarTalkInfo_;
        } else {
          return avatarTalkInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public Builder setAvatarTalkInfo(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo value) {
        if (avatarTalkInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatarTalkInfo_ = value;
          onChanged();
        } else {
          avatarTalkInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public Builder setAvatarTalkInfo(
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder builderForValue) {
        if (avatarTalkInfoBuilder_ == null) {
          avatarTalkInfo_ = builderForValue.build();
          onChanged();
        } else {
          avatarTalkInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public Builder mergeAvatarTalkInfo(emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo value) {
        if (avatarTalkInfoBuilder_ == null) {
          if (avatarTalkInfo_ != null) {
            avatarTalkInfo_ =
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.newBuilder(avatarTalkInfo_).mergeFrom(value).buildPartial();
          } else {
            avatarTalkInfo_ = value;
          }
          onChanged();
        } else {
          avatarTalkInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public Builder clearAvatarTalkInfo() {
        if (avatarTalkInfoBuilder_ == null) {
          avatarTalkInfo_ = null;
          onChanged();
        } else {
          avatarTalkInfo_ = null;
          avatarTalkInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder getAvatarTalkInfoBuilder() {
        
        onChanged();
        return getAvatarTalkInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder getAvatarTalkInfoOrBuilder() {
        if (avatarTalkInfoBuilder_ != null) {
          return avatarTalkInfoBuilder_.getMessageOrBuilder();
        } else {
          return avatarTalkInfo_ == null ?
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.getDefaultInstance() : avatarTalkInfo_;
        }
      }
      /**
       * <code>.HomeAvatarTalkFinishInfo avatar_talk_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder> 
          getAvatarTalkInfoFieldBuilder() {
        if (avatarTalkInfoBuilder_ == null) {
          avatarTalkInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.Builder, emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfoOrBuilder>(
                  getAvatarTalkInfo(),
                  getParentForChildren(),
                  isClean());
          avatarTalkInfo_ = null;
        }
        return avatarTalkInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeAvatarTalkRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarTalkRsp)
    private static final emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp();
    }

    public static emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarTalkRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarTalkRsp>() {
      @java.lang.Override
      public HomeAvatarTalkRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAvatarTalkRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAvatarTalkRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarTalkRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeAvatarTalkRspOuterClass.HomeAvatarTalkRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarTalkRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarTalkRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeAvatarTalkRsp.proto\032\036HomeAvatarTal" +
      "kFinishInfo.proto\"Y\n\021HomeAvatarTalkRsp\022\017" +
      "\n\007retcode\030\003 \001(\005\0223\n\020avatar_talk_info\030\010 \001(" +
      "\0132\031.HomeAvatarTalkFinishInfoB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeAvatarTalkRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarTalkRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarTalkRsp_descriptor,
        new java.lang.String[] { "Retcode", "AvatarTalkInfo", });
    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
