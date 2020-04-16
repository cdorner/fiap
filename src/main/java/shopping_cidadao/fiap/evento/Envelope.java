/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package shopping_cidadao.fiap.evento;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class Envelope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -661525062650316376L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Envelope\",\"namespace\":\"shopping_cidadao.fiap.evento\",\"fields\":[{\"name\":\"before\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Value\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"horario\",\"type\":{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"io.debezium.time.Timestamp\"}},{\"name\":\"evento\",\"type\":\"string\"},{\"name\":\"senha\",\"type\":\"string\"},{\"name\":\"id_unidade\",\"type\":\"long\"},{\"name\":\"id_secao\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_guiche\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_categoria\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_prioridade\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_servico\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_atividade\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_atendente\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_motivo_cancelamento\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_motivo_pausa\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_motivo_congelamento\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_avaliacao\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"id_resposta\",\"type\":[\"null\",\"long\"],\"default\":null}],\"connect.name\":\"shopping_cidadao.fiap.evento.Value\"}],\"default\":null},{\"name\":\"after\",\"type\":[\"null\",\"Value\"],\"default\":null},{\"name\":\"source\",\"type\":{\"type\":\"record\",\"name\":\"Source\",\"namespace\":\"io.debezium.connector.mysql\",\"fields\":[{\"name\":\"version\",\"type\":\"string\"},{\"name\":\"connector\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"ts_ms\",\"type\":\"long\"},{\"name\":\"snapshot\",\"type\":[{\"type\":\"string\",\"connect.version\":1,\"connect.parameters\":{\"allowed\":\"true,last,false\"},\"connect.default\":\"false\",\"connect.name\":\"io.debezium.data.Enum\"},\"null\"],\"default\":\"false\"},{\"name\":\"db\",\"type\":\"string\"},{\"name\":\"table\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"server_id\",\"type\":\"long\"},{\"name\":\"gtid\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"file\",\"type\":\"string\"},{\"name\":\"pos\",\"type\":\"long\"},{\"name\":\"row\",\"type\":\"int\"},{\"name\":\"thread\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"query\",\"type\":[\"null\",\"string\"],\"default\":null}],\"connect.name\":\"io.debezium.connector.mysql.Source\"}},{\"name\":\"op\",\"type\":\"string\"},{\"name\":\"ts_ms\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"transaction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ConnectDefault\",\"namespace\":\"io.confluent.connect.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"total_order\",\"type\":\"long\"},{\"name\":\"data_collection_order\",\"type\":\"long\"}]}],\"default\":null}],\"connect.name\":\"shopping_cidadao.fiap.evento.Envelope\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Envelope> ENCODER =
      new BinaryMessageEncoder<Envelope>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Envelope> DECODER =
      new BinaryMessageDecoder<Envelope>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Envelope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Envelope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Envelope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Envelope>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Envelope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Envelope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Envelope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Envelope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private shopping_cidadao.fiap.evento.Value before;
   private shopping_cidadao.fiap.evento.Value after;
   private io.debezium.connector.mysql.Source source;
   private org.apache.avro.util.Utf8 op;
   private java.lang.Long ts_ms;
   private io.confluent.connect.avro.ConnectDefault transaction;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Envelope() {}

  /**
   * All-args constructor.
   * @param before The new value for before
   * @param after The new value for after
   * @param source The new value for source
   * @param op The new value for op
   * @param ts_ms The new value for ts_ms
   * @param transaction The new value for transaction
   */
  public Envelope(shopping_cidadao.fiap.evento.Value before, shopping_cidadao.fiap.evento.Value after, io.debezium.connector.mysql.Source source, org.apache.avro.util.Utf8 op, java.lang.Long ts_ms, io.confluent.connect.avro.ConnectDefault transaction) {
    this.before = before;
    this.after = after;
    this.source = source;
    this.op = op;
    this.ts_ms = ts_ms;
    this.transaction = transaction;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return before;
    case 1: return after;
    case 2: return source;
    case 3: return op;
    case 4: return ts_ms;
    case 5: return transaction;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: before = (shopping_cidadao.fiap.evento.Value)value$; break;
    case 1: after = (shopping_cidadao.fiap.evento.Value)value$; break;
    case 2: source = (io.debezium.connector.mysql.Source)value$; break;
    case 3: op = (org.apache.avro.util.Utf8)value$; break;
    case 4: ts_ms = (java.lang.Long)value$; break;
    case 5: transaction = (io.confluent.connect.avro.ConnectDefault)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'before' field.
   * @return The value of the 'before' field.
   */
  public shopping_cidadao.fiap.evento.Value getBefore() {
    return before;
  }

  /**
   * Gets the value of the 'before' field as an Optional<shopping_cidadao.fiap.evento.Value>.
   * @return The value wrapped in an Optional&lt;shopping_cidadao.fiap.evento.Value&gt;.
   */
  public Optional<shopping_cidadao.fiap.evento.Value> getOptionalBefore() {
    return Optional.<shopping_cidadao.fiap.evento.Value>ofNullable(before);
  }

  /**
   * Sets the value of the 'before' field.
   * @param value the value to set.
   */
  public void setBefore(shopping_cidadao.fiap.evento.Value value) {
    this.before = value;
  }

  /**
   * Gets the value of the 'after' field.
   * @return The value of the 'after' field.
   */
  public shopping_cidadao.fiap.evento.Value getAfter() {
    return after;
  }

  /**
   * Gets the value of the 'after' field as an Optional<shopping_cidadao.fiap.evento.Value>.
   * @return The value wrapped in an Optional&lt;shopping_cidadao.fiap.evento.Value&gt;.
   */
  public Optional<shopping_cidadao.fiap.evento.Value> getOptionalAfter() {
    return Optional.<shopping_cidadao.fiap.evento.Value>ofNullable(after);
  }

  /**
   * Sets the value of the 'after' field.
   * @param value the value to set.
   */
  public void setAfter(shopping_cidadao.fiap.evento.Value value) {
    this.after = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public io.debezium.connector.mysql.Source getSource() {
    return source;
  }

  /**
   * Gets the value of the 'source' field as an Optional<io.debezium.connector.mysql.Source>.
   * @return The value wrapped in an Optional&lt;io.debezium.connector.mysql.Source&gt;.
   */
  public Optional<io.debezium.connector.mysql.Source> getOptionalSource() {
    return Optional.<io.debezium.connector.mysql.Source>ofNullable(source);
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(io.debezium.connector.mysql.Source value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'op' field.
   * @return The value of the 'op' field.
   */
  public org.apache.avro.util.Utf8 getOp() {
    return op;
  }

  /**
   * Gets the value of the 'op' field as an Optional<org.apache.avro.util.Utf8>.
   * @return The value wrapped in an Optional&lt;org.apache.avro.util.Utf8&gt;.
   */
  public Optional<org.apache.avro.util.Utf8> getOptionalOp() {
    return Optional.<org.apache.avro.util.Utf8>ofNullable(op);
  }

  /**
   * Sets the value of the 'op' field.
   * @param value the value to set.
   */
  public void setOp(org.apache.avro.util.Utf8 value) {
    this.op = value;
  }

  /**
   * Gets the value of the 'ts_ms' field.
   * @return The value of the 'ts_ms' field.
   */
  public java.lang.Long getTsMs() {
    return ts_ms;
  }

  /**
   * Gets the value of the 'ts_ms' field as an Optional<java.lang.Long>.
   * @return The value wrapped in an Optional&lt;java.lang.Long&gt;.
   */
  public Optional<java.lang.Long> getOptionalTsMs() {
    return Optional.<java.lang.Long>ofNullable(ts_ms);
  }

  /**
   * Sets the value of the 'ts_ms' field.
   * @param value the value to set.
   */
  public void setTsMs(java.lang.Long value) {
    this.ts_ms = value;
  }

  /**
   * Gets the value of the 'transaction' field.
   * @return The value of the 'transaction' field.
   */
  public io.confluent.connect.avro.ConnectDefault getTransaction() {
    return transaction;
  }

  /**
   * Gets the value of the 'transaction' field as an Optional<io.confluent.connect.avro.ConnectDefault>.
   * @return The value wrapped in an Optional&lt;io.confluent.connect.avro.ConnectDefault&gt;.
   */
  public Optional<io.confluent.connect.avro.ConnectDefault> getOptionalTransaction() {
    return Optional.<io.confluent.connect.avro.ConnectDefault>ofNullable(transaction);
  }

  /**
   * Sets the value of the 'transaction' field.
   * @param value the value to set.
   */
  public void setTransaction(io.confluent.connect.avro.ConnectDefault value) {
    this.transaction = value;
  }

  /**
   * Creates a new Envelope RecordBuilder.
   * @return A new Envelope RecordBuilder
   */
  public static shopping_cidadao.fiap.evento.Envelope.Builder newBuilder() {
    return new shopping_cidadao.fiap.evento.Envelope.Builder();
  }

  /**
   * Creates a new Envelope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Envelope RecordBuilder
   */
  public static shopping_cidadao.fiap.evento.Envelope.Builder newBuilder(shopping_cidadao.fiap.evento.Envelope.Builder other) {
    if (other == null) {
      return new shopping_cidadao.fiap.evento.Envelope.Builder();
    } else {
      return new shopping_cidadao.fiap.evento.Envelope.Builder(other);
    }
  }

  /**
   * Creates a new Envelope RecordBuilder by copying an existing Envelope instance.
   * @param other The existing instance to copy.
   * @return A new Envelope RecordBuilder
   */
  public static shopping_cidadao.fiap.evento.Envelope.Builder newBuilder(shopping_cidadao.fiap.evento.Envelope other) {
    if (other == null) {
      return new shopping_cidadao.fiap.evento.Envelope.Builder();
    } else {
      return new shopping_cidadao.fiap.evento.Envelope.Builder(other);
    }
  }

  /**
   * RecordBuilder for Envelope instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Envelope>
    implements org.apache.avro.data.RecordBuilder<Envelope> {

    private shopping_cidadao.fiap.evento.Value before;
    private shopping_cidadao.fiap.evento.Value.Builder beforeBuilder;
    private shopping_cidadao.fiap.evento.Value after;
    private shopping_cidadao.fiap.evento.Value.Builder afterBuilder;
    private io.debezium.connector.mysql.Source source;
    private io.debezium.connector.mysql.Source.Builder sourceBuilder;
    private org.apache.avro.util.Utf8 op;
    private java.lang.Long ts_ms;
    private io.confluent.connect.avro.ConnectDefault transaction;
    private io.confluent.connect.avro.ConnectDefault.Builder transactionBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(shopping_cidadao.fiap.evento.Envelope.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.before)) {
        this.before = data().deepCopy(fields()[0].schema(), other.before);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasBeforeBuilder()) {
        this.beforeBuilder = shopping_cidadao.fiap.evento.Value.newBuilder(other.getBeforeBuilder());
      }
      if (isValidValue(fields()[1], other.after)) {
        this.after = data().deepCopy(fields()[1].schema(), other.after);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasAfterBuilder()) {
        this.afterBuilder = shopping_cidadao.fiap.evento.Value.newBuilder(other.getAfterBuilder());
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasSourceBuilder()) {
        this.sourceBuilder = io.debezium.connector.mysql.Source.newBuilder(other.getSourceBuilder());
      }
      if (isValidValue(fields()[3], other.op)) {
        this.op = data().deepCopy(fields()[3].schema(), other.op);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[4].schema(), other.ts_ms);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.transaction)) {
        this.transaction = data().deepCopy(fields()[5].schema(), other.transaction);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasTransactionBuilder()) {
        this.transactionBuilder = io.confluent.connect.avro.ConnectDefault.newBuilder(other.getTransactionBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Envelope instance
     * @param other The existing instance to copy.
     */
    private Builder(shopping_cidadao.fiap.evento.Envelope other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.before)) {
        this.before = data().deepCopy(fields()[0].schema(), other.before);
        fieldSetFlags()[0] = true;
      }
      this.beforeBuilder = null;
      if (isValidValue(fields()[1], other.after)) {
        this.after = data().deepCopy(fields()[1].schema(), other.after);
        fieldSetFlags()[1] = true;
      }
      this.afterBuilder = null;
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      this.sourceBuilder = null;
      if (isValidValue(fields()[3], other.op)) {
        this.op = data().deepCopy(fields()[3].schema(), other.op);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[4].schema(), other.ts_ms);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.transaction)) {
        this.transaction = data().deepCopy(fields()[5].schema(), other.transaction);
        fieldSetFlags()[5] = true;
      }
      this.transactionBuilder = null;
    }

    /**
      * Gets the value of the 'before' field.
      * @return The value.
      */
    public shopping_cidadao.fiap.evento.Value getBefore() {
      return before;
    }

    /**
      * Gets the value of the 'before' field as an Optional<shopping_cidadao.fiap.evento.Value>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<shopping_cidadao.fiap.evento.Value> getOptionalBefore() {
      return Optional.<shopping_cidadao.fiap.evento.Value>ofNullable(before);
    }

    /**
      * Sets the value of the 'before' field.
      * @param value The value of 'before'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setBefore(shopping_cidadao.fiap.evento.Value value) {
      validate(fields()[0], value);
      this.beforeBuilder = null;
      this.before = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'before' field has been set.
      * @return True if the 'before' field has been set, false otherwise.
      */
    public boolean hasBefore() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'before' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Value.Builder getBeforeBuilder() {
      if (beforeBuilder == null) {
        if (hasBefore()) {
          setBeforeBuilder(shopping_cidadao.fiap.evento.Value.newBuilder(before));
        } else {
          setBeforeBuilder(shopping_cidadao.fiap.evento.Value.newBuilder());
        }
      }
      return beforeBuilder;
    }

    /**
     * Sets the Builder instance for the 'before' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Envelope.Builder setBeforeBuilder(shopping_cidadao.fiap.evento.Value.Builder value) {
      clearBefore();
      beforeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'before' field has an active Builder instance
     * @return True if the 'before' field has an active Builder instance
     */
    public boolean hasBeforeBuilder() {
      return beforeBuilder != null;
    }

    /**
      * Clears the value of the 'before' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearBefore() {
      before = null;
      beforeBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'after' field.
      * @return The value.
      */
    public shopping_cidadao.fiap.evento.Value getAfter() {
      return after;
    }

    /**
      * Gets the value of the 'after' field as an Optional<shopping_cidadao.fiap.evento.Value>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<shopping_cidadao.fiap.evento.Value> getOptionalAfter() {
      return Optional.<shopping_cidadao.fiap.evento.Value>ofNullable(after);
    }

    /**
      * Sets the value of the 'after' field.
      * @param value The value of 'after'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setAfter(shopping_cidadao.fiap.evento.Value value) {
      validate(fields()[1], value);
      this.afterBuilder = null;
      this.after = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'after' field has been set.
      * @return True if the 'after' field has been set, false otherwise.
      */
    public boolean hasAfter() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'after' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Value.Builder getAfterBuilder() {
      if (afterBuilder == null) {
        if (hasAfter()) {
          setAfterBuilder(shopping_cidadao.fiap.evento.Value.newBuilder(after));
        } else {
          setAfterBuilder(shopping_cidadao.fiap.evento.Value.newBuilder());
        }
      }
      return afterBuilder;
    }

    /**
     * Sets the Builder instance for the 'after' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Envelope.Builder setAfterBuilder(shopping_cidadao.fiap.evento.Value.Builder value) {
      clearAfter();
      afterBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'after' field has an active Builder instance
     * @return True if the 'after' field has an active Builder instance
     */
    public boolean hasAfterBuilder() {
      return afterBuilder != null;
    }

    /**
      * Clears the value of the 'after' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearAfter() {
      after = null;
      afterBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public io.debezium.connector.mysql.Source getSource() {
      return source;
    }

    /**
      * Gets the value of the 'source' field as an Optional<io.debezium.connector.mysql.Source>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<io.debezium.connector.mysql.Source> getOptionalSource() {
      return Optional.<io.debezium.connector.mysql.Source>ofNullable(source);
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setSource(io.debezium.connector.mysql.Source value) {
      validate(fields()[2], value);
      this.sourceBuilder = null;
      this.source = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'source' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.debezium.connector.mysql.Source.Builder getSourceBuilder() {
      if (sourceBuilder == null) {
        if (hasSource()) {
          setSourceBuilder(io.debezium.connector.mysql.Source.newBuilder(source));
        } else {
          setSourceBuilder(io.debezium.connector.mysql.Source.newBuilder());
        }
      }
      return sourceBuilder;
    }

    /**
     * Sets the Builder instance for the 'source' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Envelope.Builder setSourceBuilder(io.debezium.connector.mysql.Source.Builder value) {
      clearSource();
      sourceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'source' field has an active Builder instance
     * @return True if the 'source' field has an active Builder instance
     */
    public boolean hasSourceBuilder() {
      return sourceBuilder != null;
    }

    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearSource() {
      source = null;
      sourceBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'op' field.
      * @return The value.
      */
    public org.apache.avro.util.Utf8 getOp() {
      return op;
    }

    /**
      * Gets the value of the 'op' field as an Optional<org.apache.avro.util.Utf8>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<org.apache.avro.util.Utf8> getOptionalOp() {
      return Optional.<org.apache.avro.util.Utf8>ofNullable(op);
    }

    /**
      * Sets the value of the 'op' field.
      * @param value The value of 'op'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setOp(org.apache.avro.util.Utf8 value) {
      validate(fields()[3], value);
      this.op = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'op' field has been set.
      * @return True if the 'op' field has been set, false otherwise.
      */
    public boolean hasOp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'op' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearOp() {
      op = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_ms' field.
      * @return The value.
      */
    public java.lang.Long getTsMs() {
      return ts_ms;
    }

    /**
      * Gets the value of the 'ts_ms' field as an Optional<java.lang.Long>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<java.lang.Long> getOptionalTsMs() {
      return Optional.<java.lang.Long>ofNullable(ts_ms);
    }

    /**
      * Sets the value of the 'ts_ms' field.
      * @param value The value of 'ts_ms'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setTsMs(java.lang.Long value) {
      validate(fields()[4], value);
      this.ts_ms = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_ms' field has been set.
      * @return True if the 'ts_ms' field has been set, false otherwise.
      */
    public boolean hasTsMs() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'ts_ms' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearTsMs() {
      ts_ms = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'transaction' field.
      * @return The value.
      */
    public io.confluent.connect.avro.ConnectDefault getTransaction() {
      return transaction;
    }

    /**
      * Gets the value of the 'transaction' field as an Optional<io.confluent.connect.avro.ConnectDefault>.
      * @return The Optional&lt;value&gt;.
      */
    public Optional<io.confluent.connect.avro.ConnectDefault> getOptionalTransaction() {
      return Optional.<io.confluent.connect.avro.ConnectDefault>ofNullable(transaction);
    }

    /**
      * Sets the value of the 'transaction' field.
      * @param value The value of 'transaction'.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder setTransaction(io.confluent.connect.avro.ConnectDefault value) {
      validate(fields()[5], value);
      this.transactionBuilder = null;
      this.transaction = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'transaction' field has been set.
      * @return True if the 'transaction' field has been set, false otherwise.
      */
    public boolean hasTransaction() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'transaction' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.confluent.connect.avro.ConnectDefault.Builder getTransactionBuilder() {
      if (transactionBuilder == null) {
        if (hasTransaction()) {
          setTransactionBuilder(io.confluent.connect.avro.ConnectDefault.newBuilder(transaction));
        } else {
          setTransactionBuilder(io.confluent.connect.avro.ConnectDefault.newBuilder());
        }
      }
      return transactionBuilder;
    }

    /**
     * Sets the Builder instance for the 'transaction' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public shopping_cidadao.fiap.evento.Envelope.Builder setTransactionBuilder(io.confluent.connect.avro.ConnectDefault.Builder value) {
      clearTransaction();
      transactionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'transaction' field has an active Builder instance
     * @return True if the 'transaction' field has an active Builder instance
     */
    public boolean hasTransactionBuilder() {
      return transactionBuilder != null;
    }

    /**
      * Clears the value of the 'transaction' field.
      * @return This builder.
      */
    public shopping_cidadao.fiap.evento.Envelope.Builder clearTransaction() {
      transaction = null;
      transactionBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Envelope build() {
      try {
        Envelope record = new Envelope();
        if (beforeBuilder != null) {
          try {
            record.before = this.beforeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("before"));
            throw e;
          }
        } else {
          record.before = fieldSetFlags()[0] ? this.before : (shopping_cidadao.fiap.evento.Value) defaultValue(fields()[0]);
        }
        if (afterBuilder != null) {
          try {
            record.after = this.afterBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("after"));
            throw e;
          }
        } else {
          record.after = fieldSetFlags()[1] ? this.after : (shopping_cidadao.fiap.evento.Value) defaultValue(fields()[1]);
        }
        if (sourceBuilder != null) {
          try {
            record.source = this.sourceBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("source"));
            throw e;
          }
        } else {
          record.source = fieldSetFlags()[2] ? this.source : (io.debezium.connector.mysql.Source) defaultValue(fields()[2]);
        }
        record.op = fieldSetFlags()[3] ? this.op : (org.apache.avro.util.Utf8) defaultValue(fields()[3]);
        record.ts_ms = fieldSetFlags()[4] ? this.ts_ms : (java.lang.Long) defaultValue(fields()[4]);
        if (transactionBuilder != null) {
          try {
            record.transaction = this.transactionBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("transaction"));
            throw e;
          }
        } else {
          record.transaction = fieldSetFlags()[5] ? this.transaction : (io.confluent.connect.avro.ConnectDefault) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Envelope>
    WRITER$ = (org.apache.avro.io.DatumWriter<Envelope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Envelope>
    READER$ = (org.apache.avro.io.DatumReader<Envelope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.before == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.before.customEncode(out);
    }

    if (this.after == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.after.customEncode(out);
    }

    this.source.customEncode(out);

    out.writeString(this.op);

    if (this.ts_ms == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.ts_ms);
    }

    if (this.transaction == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.transaction.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.before = null;
      } else {
        if (this.before == null) {
          this.before = new shopping_cidadao.fiap.evento.Value();
        }
        this.before.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.after = null;
      } else {
        if (this.after == null) {
          this.after = new shopping_cidadao.fiap.evento.Value();
        }
        this.after.customDecode(in);
      }

      if (this.source == null) {
        this.source = new io.debezium.connector.mysql.Source();
      }
      this.source.customDecode(in);

      this.op = in.readString(this.op);

      if (in.readIndex() != 1) {
        in.readNull();
        this.ts_ms = null;
      } else {
        this.ts_ms = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.transaction = null;
      } else {
        if (this.transaction == null) {
          this.transaction = new io.confluent.connect.avro.ConnectDefault();
        }
        this.transaction.customDecode(in);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.before = null;
          } else {
            if (this.before == null) {
              this.before = new shopping_cidadao.fiap.evento.Value();
            }
            this.before.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.after = null;
          } else {
            if (this.after == null) {
              this.after = new shopping_cidadao.fiap.evento.Value();
            }
            this.after.customDecode(in);
          }
          break;

        case 2:
          if (this.source == null) {
            this.source = new io.debezium.connector.mysql.Source();
          }
          this.source.customDecode(in);
          break;

        case 3:
          this.op = in.readString(this.op);
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ts_ms = null;
          } else {
            this.ts_ms = in.readLong();
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.transaction = null;
          } else {
            if (this.transaction == null) {
              this.transaction = new io.confluent.connect.avro.ConnectDefault();
            }
            this.transaction.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










