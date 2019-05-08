/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.pivotal.workshops.pkskafka.order.domain.events;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Avro Schema for Order Records */
@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -322777586726935942L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"io.pivotal.workshops.pkskafka.order.domain.events\",\"doc\":\"Avro Schema for Order Records\",\"fields\":[{\"name\":\"orderID\",\"type\":\"string\",\"doc\":\"Order Identifier\",\"default\":\"\"},{\"name\":\"customer\",\"type\":{\"type\":\"record\",\"name\":\"Customer\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"Customer's first name\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"Customer's last name\"},{\"name\":\"automatedEmail\",\"type\":\"boolean\",\"doc\":\"True if customer signed up for receiving promotional emails\",\"default\":true},{\"name\":\"customerEmails\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Customer Email Addresses\",\"default\":[]},{\"name\":\"customerAddress\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CustomerAddress\",\"fields\":[{\"name\":\"address\",\"type\":\"string\",\"doc\":\"Address Line 1\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zipcode\",\"type\":[\"string\",\"int\"]}]}},\"doc\":\"Complex Type - Refer Customer Address\"}]},\"doc\":\"Customer Details\"},{\"name\":\"timePlaced\",\"type\":\"string\",\"doc\":\" Time Order Was Placed\",\"default\":\"\"},{\"name\":\"lastUpdated\",\"type\":\"string\",\"doc\":\"Last Updated Time\",\"default\":\"\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"State\",\"symbols\":[\"placed\",\"in_review\",\"canceled\",\"in_fulfillment\"]},\"doc\":\"Order State Enum\",\"default\":\"\"},{\"name\":\"lineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LineItem\",\"fields\":[{\"name\":\"sku\",\"type\":\"string\"},{\"name\":\"lineNumber\",\"type\":\"int\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"LineItemState\",\"symbols\":[\"in_process\",\"canceled\"]}},{\"name\":\"originalPrice\",\"type\":\"float\"},{\"name\":\"discount\",\"type\":\"float\"},{\"name\":\"purchasePrice\",\"type\":\"float\"},{\"name\":\"estimatedUnitTax\",\"type\":\"float\"},{\"name\":\"upc\",\"type\":\"string\"},{\"name\":\"estimatedDeliveryDate\",\"type\":\"string\",\"default\":\"\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Order to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Order from a ByteBuffer. */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Order Identifier */
  @Deprecated public java.lang.CharSequence orderID;
  /** Customer Details */
  @Deprecated public io.pivotal.workshops.pkskafka.order.domain.events.Customer customer;
  /**  Time Order Was Placed */
  @Deprecated public java.lang.CharSequence timePlaced;
  /** Last Updated Time */
  @Deprecated public java.lang.CharSequence lastUpdated;
  /** Order State Enum */
  @Deprecated public io.pivotal.workshops.pkskafka.order.domain.events.State state;
  @Deprecated public java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> lineItems;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param orderID Order Identifier
   * @param customer Customer Details
   * @param timePlaced  Time Order Was Placed
   * @param lastUpdated Last Updated Time
   * @param state Order State Enum
   * @param lineItems The new value for lineItems
   */
  public Order(java.lang.CharSequence orderID, io.pivotal.workshops.pkskafka.order.domain.events.Customer customer, java.lang.CharSequence timePlaced, java.lang.CharSequence lastUpdated, io.pivotal.workshops.pkskafka.order.domain.events.State state, java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> lineItems) {
    this.orderID = orderID;
    this.customer = customer;
    this.timePlaced = timePlaced;
    this.lastUpdated = lastUpdated;
    this.state = state;
    this.lineItems = lineItems;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderID;
    case 1: return customer;
    case 2: return timePlaced;
    case 3: return lastUpdated;
    case 4: return state;
    case 5: return lineItems;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderID = (java.lang.CharSequence)value$; break;
    case 1: customer = (io.pivotal.workshops.pkskafka.order.domain.events.Customer)value$; break;
    case 2: timePlaced = (java.lang.CharSequence)value$; break;
    case 3: lastUpdated = (java.lang.CharSequence)value$; break;
    case 4: state = (io.pivotal.workshops.pkskafka.order.domain.events.State)value$; break;
    case 5: lineItems = (java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'orderID' field.
   * @return Order Identifier
   */
  public java.lang.CharSequence getOrderID() {
    return orderID;
  }

  /**
   * Sets the value of the 'orderID' field.
   * Order Identifier
   * @param value the value to set.
   */
  public void setOrderID(java.lang.CharSequence value) {
    this.orderID = value;
  }

  /**
   * Gets the value of the 'customer' field.
   * @return Customer Details
   */
  public io.pivotal.workshops.pkskafka.order.domain.events.Customer getCustomer() {
    return customer;
  }

  /**
   * Sets the value of the 'customer' field.
   * Customer Details
   * @param value the value to set.
   */
  public void setCustomer(io.pivotal.workshops.pkskafka.order.domain.events.Customer value) {
    this.customer = value;
  }

  /**
   * Gets the value of the 'timePlaced' field.
   * @return  Time Order Was Placed
   */
  public java.lang.CharSequence getTimePlaced() {
    return timePlaced;
  }

  /**
   * Sets the value of the 'timePlaced' field.
   *  Time Order Was Placed
   * @param value the value to set.
   */
  public void setTimePlaced(java.lang.CharSequence value) {
    this.timePlaced = value;
  }

  /**
   * Gets the value of the 'lastUpdated' field.
   * @return Last Updated Time
   */
  public java.lang.CharSequence getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the value of the 'lastUpdated' field.
   * Last Updated Time
   * @param value the value to set.
   */
  public void setLastUpdated(java.lang.CharSequence value) {
    this.lastUpdated = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return Order State Enum
   */
  public io.pivotal.workshops.pkskafka.order.domain.events.State getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * Order State Enum
   * @param value the value to set.
   */
  public void setState(io.pivotal.workshops.pkskafka.order.domain.events.State value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'lineItems' field.
   * @return The value of the 'lineItems' field.
   */
  public java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Sets the value of the 'lineItems' field.
   * @param value the value to set.
   */
  public void setLineItems(java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> value) {
    this.lineItems = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder newBuilder() {
    return new io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder newBuilder(io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder other) {
    return new io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder(other);
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder newBuilder(io.pivotal.workshops.pkskafka.order.domain.events.Order other) {
    return new io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder(other);
  }

  /**
   * RecordBuilder for Order instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    /** Order Identifier */
    private java.lang.CharSequence orderID;
    /** Customer Details */
    private io.pivotal.workshops.pkskafka.order.domain.events.Customer customer;
    private io.pivotal.workshops.pkskafka.order.domain.events.Customer.Builder customerBuilder;
    /**  Time Order Was Placed */
    private java.lang.CharSequence timePlaced;
    /** Last Updated Time */
    private java.lang.CharSequence lastUpdated;
    /** Order State Enum */
    private io.pivotal.workshops.pkskafka.order.domain.events.State state;
    private java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> lineItems;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customer)) {
        this.customer = data().deepCopy(fields()[1].schema(), other.customer);
        fieldSetFlags()[1] = true;
      }
      if (other.hasCustomerBuilder()) {
        this.customerBuilder = io.pivotal.workshops.pkskafka.order.domain.events.Customer.newBuilder(other.getCustomerBuilder());
      }
      if (isValidValue(fields()[2], other.timePlaced)) {
        this.timePlaced = data().deepCopy(fields()[2].schema(), other.timePlaced);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastUpdated)) {
        this.lastUpdated = data().deepCopy(fields()[3].schema(), other.lastUpdated);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.lineItems)) {
        this.lineItems = data().deepCopy(fields()[5].schema(), other.lineItems);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(io.pivotal.workshops.pkskafka.order.domain.events.Order other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.orderID)) {
        this.orderID = data().deepCopy(fields()[0].schema(), other.orderID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customer)) {
        this.customer = data().deepCopy(fields()[1].schema(), other.customer);
        fieldSetFlags()[1] = true;
      }
      this.customerBuilder = null;
      if (isValidValue(fields()[2], other.timePlaced)) {
        this.timePlaced = data().deepCopy(fields()[2].schema(), other.timePlaced);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastUpdated)) {
        this.lastUpdated = data().deepCopy(fields()[3].schema(), other.lastUpdated);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.lineItems)) {
        this.lineItems = data().deepCopy(fields()[5].schema(), other.lineItems);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'orderID' field.
      * Order Identifier
      * @return The value.
      */
    public java.lang.CharSequence getOrderID() {
      return orderID;
    }

    /**
      * Sets the value of the 'orderID' field.
      * Order Identifier
      * @param value The value of 'orderID'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setOrderID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.orderID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderID' field has been set.
      * Order Identifier
      * @return True if the 'orderID' field has been set, false otherwise.
      */
    public boolean hasOrderID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderID' field.
      * Order Identifier
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearOrderID() {
      orderID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customer' field.
      * Customer Details
      * @return The value.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Customer getCustomer() {
      return customer;
    }

    /**
      * Sets the value of the 'customer' field.
      * Customer Details
      * @param value The value of 'customer'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setCustomer(io.pivotal.workshops.pkskafka.order.domain.events.Customer value) {
      validate(fields()[1], value);
      this.customerBuilder = null;
      this.customer = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customer' field has been set.
      * Customer Details
      * @return True if the 'customer' field has been set, false otherwise.
      */
    public boolean hasCustomer() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'customer' field and creates one if it doesn't exist yet.
     * Customer Details
     * @return This builder.
     */
    public io.pivotal.workshops.pkskafka.order.domain.events.Customer.Builder getCustomerBuilder() {
      if (customerBuilder == null) {
        if (hasCustomer()) {
          setCustomerBuilder(io.pivotal.workshops.pkskafka.order.domain.events.Customer.newBuilder(customer));
        } else {
          setCustomerBuilder(io.pivotal.workshops.pkskafka.order.domain.events.Customer.newBuilder());
        }
      }
      return customerBuilder;
    }

    /**
     * Sets the Builder instance for the 'customer' field
     * Customer Details
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setCustomerBuilder(io.pivotal.workshops.pkskafka.order.domain.events.Customer.Builder value) {
      clearCustomer();
      customerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'customer' field has an active Builder instance
     * Customer Details
     * @return True if the 'customer' field has an active Builder instance
     */
    public boolean hasCustomerBuilder() {
      return customerBuilder != null;
    }

    /**
      * Clears the value of the 'customer' field.
      * Customer Details
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearCustomer() {
      customer = null;
      customerBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timePlaced' field.
      *  Time Order Was Placed
      * @return The value.
      */
    public java.lang.CharSequence getTimePlaced() {
      return timePlaced;
    }

    /**
      * Sets the value of the 'timePlaced' field.
      *  Time Order Was Placed
      * @param value The value of 'timePlaced'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setTimePlaced(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.timePlaced = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timePlaced' field has been set.
      *  Time Order Was Placed
      * @return True if the 'timePlaced' field has been set, false otherwise.
      */
    public boolean hasTimePlaced() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timePlaced' field.
      *  Time Order Was Placed
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearTimePlaced() {
      timePlaced = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdated' field.
      * Last Updated Time
      * @return The value.
      */
    public java.lang.CharSequence getLastUpdated() {
      return lastUpdated;
    }

    /**
      * Sets the value of the 'lastUpdated' field.
      * Last Updated Time
      * @param value The value of 'lastUpdated'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setLastUpdated(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.lastUpdated = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdated' field has been set.
      * Last Updated Time
      * @return True if the 'lastUpdated' field has been set, false otherwise.
      */
    public boolean hasLastUpdated() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lastUpdated' field.
      * Last Updated Time
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearLastUpdated() {
      lastUpdated = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * Order State Enum
      * @return The value.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.State getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * Order State Enum
      * @param value The value of 'state'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setState(io.pivotal.workshops.pkskafka.order.domain.events.State value) {
      validate(fields()[4], value);
      this.state = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * Order State Enum
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'state' field.
      * Order State Enum
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearState() {
      state = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineItems' field.
      * @return The value.
      */
    public java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> getLineItems() {
      return lineItems;
    }

    /**
      * Sets the value of the 'lineItems' field.
      * @param value The value of 'lineItems'.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder setLineItems(java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem> value) {
      validate(fields()[5], value);
      this.lineItems = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'lineItems' field has been set.
      * @return True if the 'lineItems' field has been set, false otherwise.
      */
    public boolean hasLineItems() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'lineItems' field.
      * @return This builder.
      */
    public io.pivotal.workshops.pkskafka.order.domain.events.Order.Builder clearLineItems() {
      lineItems = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.orderID = fieldSetFlags()[0] ? this.orderID : (java.lang.CharSequence) defaultValue(fields()[0]);
        if (customerBuilder != null) {
          record.customer = this.customerBuilder.build();
        } else {
          record.customer = fieldSetFlags()[1] ? this.customer : (io.pivotal.workshops.pkskafka.order.domain.events.Customer) defaultValue(fields()[1]);
        }
        record.timePlaced = fieldSetFlags()[2] ? this.timePlaced : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.lastUpdated = fieldSetFlags()[3] ? this.lastUpdated : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.state = fieldSetFlags()[4] ? this.state : (io.pivotal.workshops.pkskafka.order.domain.events.State) defaultValue(fields()[4]);
        record.lineItems = fieldSetFlags()[5] ? this.lineItems : (java.util.List<io.pivotal.workshops.pkskafka.order.domain.events.LineItem>) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
