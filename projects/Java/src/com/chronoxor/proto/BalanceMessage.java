// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

package com.chronoxor.proto;

public class BalanceMessage implements Comparable<Object>
{
    public Balance body = new Balance();

    public static final long fbeTypeConst = 2;
    public long fbeType() { return fbeTypeConst; }

    public BalanceMessage() {}

    public BalanceMessage(Balance body)
    {
        this.body = body;
    }

    public BalanceMessage(BalanceMessage other)
    {
        this.body = other.body;
    }

    public BalanceMessage clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.proto.fbe.BalanceMessageModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.proto.fbe.BalanceMessageModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!BalanceMessage.class.isAssignableFrom(other.getClass()))
            return -1;

        final BalanceMessage obj = (BalanceMessage)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!BalanceMessage.class.isAssignableFrom(other.getClass()))
            return false;

        final BalanceMessage obj = (BalanceMessage)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("BalanceMessage(");
        sb.append("body="); sb.append(body);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.proto.fbe.Json.getEngine().toJson(this); }
    public static BalanceMessage fromJson(String json) { return com.chronoxor.proto.fbe.Json.getEngine().fromJson(json, BalanceMessage.class); }
}
