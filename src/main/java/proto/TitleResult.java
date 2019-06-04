// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.TitleResult}
 */
public  final class TitleResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.TitleResult)
    TitleResultOrBuilder {
  // Use TitleResult.newBuilder() to construct.
  private TitleResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitleResult() {
    titles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_TitleResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_TitleResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.TitleResult.class, proto.TitleResult.Builder.class);
  }

  public static final int TITLES_FIELD_NUMBER = 1;
  private java.util.List<proto.Title> titles_;
  /**
   * <code>repeated .proto.Title titles = 1;</code>
   */
  public java.util.List<proto.Title> getTitlesList() {
    return titles_;
  }
  /**
   * <code>repeated .proto.Title titles = 1;</code>
   */
  public java.util.List<? extends proto.TitleOrBuilder> 
      getTitlesOrBuilderList() {
    return titles_;
  }
  /**
   * <code>repeated .proto.Title titles = 1;</code>
   */
  public int getTitlesCount() {
    return titles_.size();
  }
  /**
   * <code>repeated .proto.Title titles = 1;</code>
   */
  public proto.Title getTitles(int index) {
    return titles_.get(index);
  }
  /**
   * <code>repeated .proto.Title titles = 1;</code>
   */
  public proto.TitleOrBuilder getTitlesOrBuilder(
      int index) {
    return titles_.get(index);
  }

  public static proto.TitleResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TitleResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TitleResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TitleResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TitleResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TitleResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.TitleResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.TitleResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.TitleResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TitleResult parseFrom(
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
  public static Builder newBuilder(proto.TitleResult prototype) {
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
   * Protobuf type {@code proto.TitleResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.TitleResult)
      proto.TitleResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_TitleResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_TitleResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.TitleResult.class, proto.TitleResult.Builder.class);
    }

    // Construct using proto.TitleResult.newBuilder()
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
        getTitlesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (titlesBuilder_ == null) {
        titles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        titlesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_TitleResult_descriptor;
    }

    public proto.TitleResult getDefaultInstanceForType() {
      return proto.TitleResult.getDefaultInstance();
    }

    public proto.TitleResult build() {
      proto.TitleResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.TitleResult buildPartial() {
      proto.TitleResult result = new proto.TitleResult(this);
      int from_bitField0_ = bitField0_;
      if (titlesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          titles_ = java.util.Collections.unmodifiableList(titles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.titles_ = titles_;
      } else {
        result.titles_ = titlesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.Title> titles_ =
      java.util.Collections.emptyList();
    private void ensureTitlesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        titles_ = new java.util.ArrayList<proto.Title>(titles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Title, proto.Title.Builder, proto.TitleOrBuilder> titlesBuilder_;

    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public java.util.List<proto.Title> getTitlesList() {
      if (titlesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(titles_);
      } else {
        return titlesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public int getTitlesCount() {
      if (titlesBuilder_ == null) {
        return titles_.size();
      } else {
        return titlesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public proto.Title getTitles(int index) {
      if (titlesBuilder_ == null) {
        return titles_.get(index);
      } else {
        return titlesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder setTitles(
        int index, proto.Title value) {
      if (titlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTitlesIsMutable();
        titles_.set(index, value);
        onChanged();
      } else {
        titlesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder setTitles(
        int index, proto.Title.Builder builderForValue) {
      if (titlesBuilder_ == null) {
        ensureTitlesIsMutable();
        titles_.set(index, builderForValue.build());
        onChanged();
      } else {
        titlesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder addTitles(proto.Title value) {
      if (titlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTitlesIsMutable();
        titles_.add(value);
        onChanged();
      } else {
        titlesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder addTitles(
        int index, proto.Title value) {
      if (titlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTitlesIsMutable();
        titles_.add(index, value);
        onChanged();
      } else {
        titlesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder addTitles(
        proto.Title.Builder builderForValue) {
      if (titlesBuilder_ == null) {
        ensureTitlesIsMutable();
        titles_.add(builderForValue.build());
        onChanged();
      } else {
        titlesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder addTitles(
        int index, proto.Title.Builder builderForValue) {
      if (titlesBuilder_ == null) {
        ensureTitlesIsMutable();
        titles_.add(index, builderForValue.build());
        onChanged();
      } else {
        titlesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder addAllTitles(
        java.lang.Iterable<? extends proto.Title> values) {
      if (titlesBuilder_ == null) {
        ensureTitlesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, titles_);
        onChanged();
      } else {
        titlesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder clearTitles() {
      if (titlesBuilder_ == null) {
        titles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        titlesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public Builder removeTitles(int index) {
      if (titlesBuilder_ == null) {
        ensureTitlesIsMutable();
        titles_.remove(index);
        onChanged();
      } else {
        titlesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public proto.Title.Builder getTitlesBuilder(
        int index) {
      return getTitlesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public proto.TitleOrBuilder getTitlesOrBuilder(
        int index) {
      if (titlesBuilder_ == null) {
        return titles_.get(index);  } else {
        return titlesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public java.util.List<? extends proto.TitleOrBuilder> 
         getTitlesOrBuilderList() {
      if (titlesBuilder_ != null) {
        return titlesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(titles_);
      }
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public proto.Title.Builder addTitlesBuilder() {
      return getTitlesFieldBuilder().addBuilder(
          proto.Title.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public proto.Title.Builder addTitlesBuilder(
        int index) {
      return getTitlesFieldBuilder().addBuilder(
          index, proto.Title.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Title titles = 1;</code>
     */
    public java.util.List<proto.Title.Builder> 
         getTitlesBuilderList() {
      return getTitlesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Title, proto.Title.Builder, proto.TitleOrBuilder> 
        getTitlesFieldBuilder() {
      if (titlesBuilder_ == null) {
        titlesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Title, proto.Title.Builder, proto.TitleOrBuilder>(
                titles_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        titles_ = null;
      }
      return titlesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.TitleResult)
  }

  // @@protoc_insertion_point(class_scope:proto.TitleResult)
  private static final proto.TitleResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.TitleResult();
  }

  public static proto.TitleResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitleResult>
      PARSER = new com.google.protobuf.AbstractParser<TitleResult>() {
    public TitleResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TitleResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitleResult> getParserForType() {
    return PARSER;
  }

  public proto.TitleResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
