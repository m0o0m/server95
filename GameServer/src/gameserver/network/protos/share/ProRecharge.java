// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game/java-share/ProRecharge.proto

package gameserver.network.protos.share;

public final class ProRecharge {
  private ProRecharge() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Msg_S2G_RechargeCallBackOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 player_id = 1;
    /**
     * <code>required int64 player_id = 1;</code>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 player_id = 1;</code>
     */
    long getPlayerId();
  }
  /**
   * Protobuf type {@code gameserver.network.protos.share.Msg_S2G_RechargeCallBack}
   */
  public static final class Msg_S2G_RechargeCallBack extends
      com.google.protobuf.GeneratedMessage
      implements Msg_S2G_RechargeCallBackOrBuilder {
    // Use Msg_S2G_RechargeCallBack.newBuilder() to construct.
    private Msg_S2G_RechargeCallBack(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Msg_S2G_RechargeCallBack(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Msg_S2G_RechargeCallBack defaultInstance;
    public static Msg_S2G_RechargeCallBack getDefaultInstance() {
      return defaultInstance;
    }

    public Msg_S2G_RechargeCallBack getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Msg_S2G_RechargeCallBack(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            case 8: {
              bitField0_ |= 0x00000001;
              playerId_ = input.readInt64();
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
      return gameserver.network.protos.share.ProRecharge.internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gameserver.network.protos.share.ProRecharge.internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.class, gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.Builder.class);
    }

    public static com.google.protobuf.Parser<Msg_S2G_RechargeCallBack> PARSER =
        new com.google.protobuf.AbstractParser<Msg_S2G_RechargeCallBack>() {
      public Msg_S2G_RechargeCallBack parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Msg_S2G_RechargeCallBack(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Msg_S2G_RechargeCallBack> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 player_id = 1;
    public static final int PLAYER_ID_FIELD_NUMBER = 1;
    private long playerId_;
    /**
     * <code>required int64 player_id = 1;</code>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 player_id = 1;</code>
     */
    public long getPlayerId() {
      return playerId_;
    }

    private void initFields() {
      playerId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, playerId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, playerId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack prototype) {
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
     * Protobuf type {@code gameserver.network.protos.share.Msg_S2G_RechargeCallBack}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gameserver.network.protos.share.ProRecharge.internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gameserver.network.protos.share.ProRecharge.internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.class, gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.Builder.class);
      }

      // Construct using gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.newBuilder()
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
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gameserver.network.protos.share.ProRecharge.internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor;
      }

      public gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack getDefaultInstanceForType() {
        return gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.getDefaultInstance();
      }

      public gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack build() {
        gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack buildPartial() {
        gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack result = new gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack) {
          return mergeFrom((gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack other) {
        if (other == gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gameserver.network.protos.share.ProRecharge.Msg_S2G_RechargeCallBack) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 player_id = 1;
      private long playerId_ ;
      /**
       * <code>required int64 player_id = 1;</code>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 player_id = 1;</code>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 player_id = 1;</code>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 player_id = 1;</code>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gameserver.network.protos.share.Msg_S2G_RechargeCallBack)
    }

    static {
      defaultInstance = new Msg_S2G_RechargeCallBack(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gameserver.network.protos.share.Msg_S2G_RechargeCallBack)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!game/java-share/ProRecharge.proto\022\037gam" +
      "eserver.network.protos.share\"-\n\030Msg_S2G_" +
      "RechargeCallBack\022\021\n\tplayer_id\030\001 \002(\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gameserver_network_protos_share_Msg_S2G_RechargeCallBack_descriptor,
              new java.lang.String[] { "PlayerId", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
