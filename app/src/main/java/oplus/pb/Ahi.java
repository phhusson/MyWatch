// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ahi.proto
// Protobuf Java Version: 4.28.2

package oplus.pb;

public final class Ahi {
  private Ahi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface AhiDetailResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Ahi.AhiDetailResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>uint32 index = 1;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint32 start_time = 2;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>repeated uint32 state = 3;</code>
     * @return A list containing the state.
     */
    java.util.List<java.lang.Integer> getStateList();
    /**
     * <code>repeated uint32 state = 3;</code>
     * @return The count of state.
     */
    int getStateCount();
    /**
     * <code>repeated uint32 state = 3;</code>
     * @param index The index of the element to return.
     * @return The state at the given index.
     */
    int getState(int index);
  }
  /**
   * Protobuf type {@code Ahi.AhiDetailResponse}
   */
  public  static final class AhiDetailResponse extends
      com.google.protobuf.GeneratedMessageLite<
          AhiDetailResponse, AhiDetailResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:Ahi.AhiDetailResponse)
      AhiDetailResponseOrBuilder {
    private AhiDetailResponse() {
      state_ = emptyIntList();
    }
    public static final int INDEX_FIELD_NUMBER = 1;
    private int index_;
    /**
     * <code>uint32 index = 1;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     * <code>uint32 index = 1;</code>
     * @param value The index to set.
     */
    private void setIndex(int value) {
      
      index_ = value;
    }
    /**
     * <code>uint32 index = 1;</code>
     */
    private void clearIndex() {

      index_ = 0;
    }

    public static final int START_TIME_FIELD_NUMBER = 2;
    private int startTime_;
    /**
     * <code>uint32 start_time = 2;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }
    /**
     * <code>uint32 start_time = 2;</code>
     * @param value The startTime to set.
     */
    private void setStartTime(int value) {
      
      startTime_ = value;
    }
    /**
     * <code>uint32 start_time = 2;</code>
     */
    private void clearStartTime() {

      startTime_ = 0;
    }

    public static final int STATE_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList state_;
    /**
     * <code>repeated uint32 state = 3;</code>
     * @return A list containing the state.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getStateList() {
      return state_;
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     * @return The count of state.
     */
    @java.lang.Override
    public int getStateCount() {
      return state_.size();
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     * @param index The index of the element to return.
     * @return The state at the given index.
     */
    @java.lang.Override
    public int getState(int index) {
      return state_.getInt(index);
    }
    private int stateMemoizedSerializedSize = -1;
    private void ensureStateIsMutable() {
      com.google.protobuf.Internal.IntList tmp = state_;
      if (!tmp.isModifiable()) {
        state_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     * @param index The index to set the value at.
     * @param value The state to set.
     */
    private void setState(
        int index, int value) {
      ensureStateIsMutable();
      state_.setInt(index, value);
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     * @param value The state to add.
     */
    private void addState(int value) {
      ensureStateIsMutable();
      state_.addInt(value);
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     * @param values The state to add.
     */
    private void addAllState(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureStateIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, state_);
    }
    /**
     * <code>repeated uint32 state = 3;</code>
     */
    private void clearState() {
      state_ = emptyIntList();
    }

    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static oplus.pb.Ahi.AhiDetailResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static oplus.pb.Ahi.AhiDetailResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static oplus.pb.Ahi.AhiDetailResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(oplus.pb.Ahi.AhiDetailResponse prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code Ahi.AhiDetailResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          oplus.pb.Ahi.AhiDetailResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:Ahi.AhiDetailResponse)
        oplus.pb.Ahi.AhiDetailResponseOrBuilder {
      // Construct using oplus.pb.Ahi.AhiDetailResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>uint32 index = 1;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return instance.getIndex();
      }
      /**
       * <code>uint32 index = 1;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        copyOnWrite();
        instance.setIndex(value);
        return this;
      }
      /**
       * <code>uint32 index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        copyOnWrite();
        instance.clearIndex();
        return this;
      }

      /**
       * <code>uint32 start_time = 2;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return instance.getStartTime();
      }
      /**
       * <code>uint32 start_time = 2;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {
        copyOnWrite();
        instance.setStartTime(value);
        return this;
      }
      /**
       * <code>uint32 start_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        copyOnWrite();
        instance.clearStartTime();
        return this;
      }

      /**
       * <code>repeated uint32 state = 3;</code>
       * @return A list containing the state.
       */
      @java.lang.Override
      public java.util.List<java.lang.Integer>
          getStateList() {
        return java.util.Collections.unmodifiableList(
            instance.getStateList());
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @return The count of state.
       */
      @java.lang.Override
      public int getStateCount() {
        return instance.getStateCount();
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @param index The index of the element to return.
       * @return The state at the given index.
       */
      @java.lang.Override
      public int getState(int index) {
        return instance.getState(index);
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(
          int index, int value) {
        copyOnWrite();
        instance.setState(index, value);
        return this;
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @param value The state to add.
       * @return This builder for chaining.
       */
      public Builder addState(int value) {
        copyOnWrite();
        instance.addState(value);
        return this;
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @param values The state to add.
       * @return This builder for chaining.
       */
      public Builder addAllState(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        copyOnWrite();
        instance.addAllState(values);
        return this;
      }
      /**
       * <code>repeated uint32 state = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        copyOnWrite();
        instance.clearState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Ahi.AhiDetailResponse)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new oplus.pb.Ahi.AhiDetailResponse();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "index_",
              "startTime_",
              "state_",
            };
            java.lang.String info =
                "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u000b" +
                "\u0003+";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<oplus.pb.Ahi.AhiDetailResponse> parser = PARSER;
          if (parser == null) {
            synchronized (oplus.pb.Ahi.AhiDetailResponse.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<oplus.pb.Ahi.AhiDetailResponse>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Ahi.AhiDetailResponse)
    private static final oplus.pb.Ahi.AhiDetailResponse DEFAULT_INSTANCE;
    static {
      AhiDetailResponse defaultInstance = new AhiDetailResponse();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        AhiDetailResponse.class, defaultInstance);
    }

    public static oplus.pb.Ahi.AhiDetailResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<AhiDetailResponse> PARSER;

    public static com.google.protobuf.Parser<AhiDetailResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
