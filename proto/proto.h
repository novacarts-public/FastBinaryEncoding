// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe.h"

namespace proto {
using namespace FBE;
} // namespace proto

namespace FBE {
using namespace ::proto;
} // namespace FBE

namespace proto {

enum class OrderSide : uint8_t
{
    buy,
    sell,
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, OrderSide value)
{
    if (value == OrderSide::buy) { stream << "buy"; return stream; }
    if (value == OrderSide::sell) { stream << "sell"; return stream; }
    stream << "<unknown>";
    return stream;
}

} // namespace proto

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderSide>
{
    static bool to_json(TWriter& writer, const ::proto::OrderSide& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderSide>
{
    static bool from_json(const TJson& json, ::proto::OrderSide& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::OrderSide)raw;
        return true;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

enum class OrderType : uint8_t
{
    market,
    limit,
    stop,
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, OrderType value)
{
    if (value == OrderType::market) { stream << "market"; return stream; }
    if (value == OrderType::limit) { stream << "limit"; return stream; }
    if (value == OrderType::stop) { stream << "stop"; return stream; }
    stream << "<unknown>";
    return stream;
}

} // namespace proto

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderType>
{
    static bool to_json(TWriter& writer, const ::proto::OrderType& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderType>
{
    static bool from_json(const TJson& json, ::proto::OrderType& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::OrderType)raw;
        return true;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

enum class State : uint8_t
{
    unknown = (uint8_t)0x00u,
    invalid = (uint8_t)0x01u,
    initialized = (uint8_t)0x02u,
    calculated = (uint8_t)0x04u,
    broken = (uint8_t)0x08u,
    good = initialized  |  calculated,
    bad = unknown  |  invalid  |  broken,
};
FBE_ENUM_FLAGS(State)

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, State value)
{
    bool first = true;
    if ((value & State::unknown) && ((value & State::unknown) == State::unknown))
    {
        stream << (first ? "" : "|") << "unknown";
        first = false;
    }
    if ((value & State::invalid) && ((value & State::invalid) == State::invalid))
    {
        stream << (first ? "" : "|") << "invalid";
        first = false;
    }
    if ((value & State::initialized) && ((value & State::initialized) == State::initialized))
    {
        stream << (first ? "" : "|") << "initialized";
        first = false;
    }
    if ((value & State::calculated) && ((value & State::calculated) == State::calculated))
    {
        stream << (first ? "" : "|") << "calculated";
        first = false;
    }
    if ((value & State::broken) && ((value & State::broken) == State::broken))
    {
        stream << (first ? "" : "|") << "broken";
        first = false;
    }
    if ((value & State::good) && ((value & State::good) == State::good))
    {
        stream << (first ? "" : "|") << "good";
        first = false;
    }
    if ((value & State::bad) && ((value & State::bad) == State::bad))
    {
        stream << (first ? "" : "|") << "bad";
        first = false;
    }
    return stream;
}

} // namespace proto

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::State>
{
    static bool to_json(TWriter& writer, const ::proto::State& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::State>
{
    static bool from_json(const TJson& json, ::proto::State& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::proto::State)raw;
        return true;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct Order
{
    int32_t id;
    std::string symbol;
    ::proto::OrderSide side;
    ::proto::OrderType type;
    double price;
    double volume;

    size_t fbe_type() const noexcept { return 1; }

    Order()
        : id((int32_t)0ll)
        , symbol()
        , side()
        , type()
        , price((double)0.0)
        , volume((double)0.0)
    {}
    Order(int32_t arg_id, const std::string& arg_symbol, const ::proto::OrderSide& arg_side, const ::proto::OrderType& arg_type, double arg_price, double arg_volume)
        : id(arg_id)
        , symbol(arg_symbol)
        , side(arg_side)
        , type(arg_type)
        , price(arg_price)
        , volume(arg_volume)
    {}
    Order(const Order& other) = default;
    Order(Order&& other) = default;
    ~Order() = default;

    Order& operator=(const Order& other) = default;
    Order& operator=(Order&& other) = default;

    bool operator==(const Order& other) const noexcept
    {
        return (
            (id == other.id)
            );
    }
    bool operator!=(const Order& other) const noexcept { return !operator==(other); }
    bool operator<(const Order& other) const noexcept
    {
        if (id < other.id)
            return true;
        if (other.id < id)
            return false;
        return false;
    }
    bool operator<=(const Order& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const Order& other) const noexcept { return !operator<=(other); }
    bool operator>=(const Order& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const Order& value);

    void swap(Order& other) noexcept
    {
        using std::swap;
        swap(id, other.id);
        swap(symbol, other.symbol);
        swap(side, other.side);
        swap(type, other.type);
        swap(price, other.price);
        swap(volume, other.volume);
    }

    friend void swap(Order& value1, Order& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Order& value)
{
    stream << "Order(";
    stream << "id="; stream << value.id;
    stream << ",symbol="; stream << "\"" << value.symbol << "\"";
    stream << ",side="; stream << value.side;
    stream << ",type="; stream << value.type;
    stream << ",price="; stream << value.price;
    stream << ",volume="; stream << value.volume;
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::Order>
{
    typedef proto::Order argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        result = result * 31 + std::hash<decltype(value.id)>()(value.id);
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Order>
{
    static bool to_json(TWriter& writer, const ::proto::Order& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "symbol") || !FBE::JSON::to_json(writer, value.symbol, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "side") || !FBE::JSON::to_json(writer, value.side, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "type") || !FBE::JSON::to_json(writer, value.type, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "price") || !FBE::JSON::to_json(writer, value.price, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "volume") || !FBE::JSON::to_json(writer, value.volume, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Order>
{
    static bool from_json(const TJson& json, ::proto::Order& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.symbol, "symbol");
        result &= FBE::JSON::from_json(json, value.side, "side");
        result &= FBE::JSON::from_json(json, value.type, "type");
        result &= FBE::JSON::from_json(json, value.price, "price");
        result &= FBE::JSON::from_json(json, value.volume, "volume");
        return result;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct Balance
{
    std::string currency;
    double amount;

    size_t fbe_type() const noexcept { return 2; }

    Balance()
        : currency()
        , amount((double)0.0)
    {}
    Balance(const std::string& arg_currency, double arg_amount)
        : currency(arg_currency)
        , amount(arg_amount)
    {}
    Balance(const Balance& other) = default;
    Balance(Balance&& other) = default;
    ~Balance() = default;

    Balance& operator=(const Balance& other) = default;
    Balance& operator=(Balance&& other) = default;

    bool operator==(const Balance& other) const noexcept
    {
        return (
            (currency == other.currency)
            );
    }
    bool operator!=(const Balance& other) const noexcept { return !operator==(other); }
    bool operator<(const Balance& other) const noexcept
    {
        if (currency < other.currency)
            return true;
        if (other.currency < currency)
            return false;
        return false;
    }
    bool operator<=(const Balance& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const Balance& other) const noexcept { return !operator<=(other); }
    bool operator>=(const Balance& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const Balance& value);

    void swap(Balance& other) noexcept
    {
        using std::swap;
        swap(currency, other.currency);
        swap(amount, other.amount);
    }

    friend void swap(Balance& value1, Balance& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Balance& value)
{
    stream << "Balance(";
    stream << "currency="; stream << "\"" << value.currency << "\"";
    stream << ",amount="; stream << value.amount;
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::Balance>
{
    typedef proto::Balance argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        result = result * 31 + std::hash<decltype(value.currency)>()(value.currency);
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Balance>
{
    static bool to_json(TWriter& writer, const ::proto::Balance& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "currency") || !FBE::JSON::to_json(writer, value.currency, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "amount") || !FBE::JSON::to_json(writer, value.amount, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Balance>
{
    static bool from_json(const TJson& json, ::proto::Balance& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.currency, "currency");
        result &= FBE::JSON::from_json(json, value.amount, "amount");
        return result;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct Account
{
    int32_t id;
    std::string name;
    ::proto::State state;
    ::proto::Balance wallet;
    std::optional<::proto::Balance> asset;
    std::vector<::proto::Order> orders;

    size_t fbe_type() const noexcept { return 3; }

    Account()
        : id((int32_t)0ll)
        , name()
        , state(State::initialized  |  State::bad)
        , wallet()
        , asset()
        , orders()
    {}
    Account(int32_t arg_id, const std::string& arg_name, const ::proto::State& arg_state, const ::proto::Balance& arg_wallet, const std::optional<::proto::Balance>& arg_asset, const std::vector<::proto::Order>& arg_orders)
        : id(arg_id)
        , name(arg_name)
        , state(arg_state)
        , wallet(arg_wallet)
        , asset(arg_asset)
        , orders(arg_orders)
    {}
    Account(const Account& other) = default;
    Account(Account&& other) = default;
    ~Account() = default;

    Account& operator=(const Account& other) = default;
    Account& operator=(Account&& other) = default;

    bool operator==(const Account& other) const noexcept
    {
        return (
            (id == other.id)
            );
    }
    bool operator!=(const Account& other) const noexcept { return !operator==(other); }
    bool operator<(const Account& other) const noexcept
    {
        if (id < other.id)
            return true;
        if (other.id < id)
            return false;
        return false;
    }
    bool operator<=(const Account& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const Account& other) const noexcept { return !operator<=(other); }
    bool operator>=(const Account& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const Account& value);

    void swap(Account& other) noexcept
    {
        using std::swap;
        swap(id, other.id);
        swap(name, other.name);
        swap(state, other.state);
        swap(wallet, other.wallet);
        swap(asset, other.asset);
        swap(orders, other.orders);
    }

    friend void swap(Account& value1, Account& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Account& value)
{
    stream << "Account(";
    stream << "id="; stream << value.id;
    stream << ",name="; stream << "\"" << value.name << "\"";
    stream << ",state="; stream << value.state;
    stream << ",wallet="; stream << value.wallet;
    stream << ",asset="; if (value.asset) stream << *value.asset; else stream << "null";
    {
        bool first = true;
        stream << ",orders=[" << value.orders.size() << "][";
        for (const auto& it : value.orders)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::Account>
{
    typedef proto::Account argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        result = result * 31 + std::hash<decltype(value.id)>()(value.id);
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::Account>
{
    static bool to_json(TWriter& writer, const ::proto::Account& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "id") || !FBE::JSON::to_json(writer, value.id, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "name") || !FBE::JSON::to_json(writer, value.name, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "state") || !FBE::JSON::to_json(writer, value.state, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wallet") || !FBE::JSON::to_json(writer, value.wallet, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "asset") || !FBE::JSON::to_json(writer, value.asset, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "orders") || !FBE::JSON::to_json(writer, value.orders, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::Account>
{
    static bool from_json(const TJson& json, ::proto::Account& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.id, "id");
        result &= FBE::JSON::from_json(json, value.name, "name");
        result &= FBE::JSON::from_json(json, value.state, "state");
        result &= FBE::JSON::from_json(json, value.wallet, "wallet");
        result &= FBE::JSON::from_json(json, value.asset, "asset");
        result &= FBE::JSON::from_json(json, value.orders, "orders");
        return result;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct OrderMessage
{
    ::proto::Order body;

    size_t fbe_type() const noexcept { return 1; }

    OrderMessage()
        : body()
    {}
    explicit OrderMessage(const ::proto::Order& arg_body)
        : body(arg_body)
    {}
    OrderMessage(const OrderMessage& other) = default;
    OrderMessage(OrderMessage&& other) = default;
    ~OrderMessage() = default;

    OrderMessage& operator=(const OrderMessage& other) = default;
    OrderMessage& operator=(OrderMessage&& other) = default;

    bool operator==(const OrderMessage& other) const noexcept
    {
        return (
            true
            );
    }
    bool operator!=(const OrderMessage& other) const noexcept { return !operator==(other); }
    bool operator<(const OrderMessage& other) const noexcept
    {
        return false;
    }
    bool operator<=(const OrderMessage& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const OrderMessage& other) const noexcept { return !operator<=(other); }
    bool operator>=(const OrderMessage& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const OrderMessage& value);

    void swap(OrderMessage& other) noexcept
    {
        using std::swap;
        swap(body, other.body);
    }

    friend void swap(OrderMessage& value1, OrderMessage& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const OrderMessage& value)
{
    stream << "OrderMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::OrderMessage>
{
    typedef proto::OrderMessage argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::OrderMessage>
{
    static bool to_json(TWriter& writer, const ::proto::OrderMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::OrderMessage>
{
    static bool from_json(const TJson& json, ::proto::OrderMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct BalanceMessage
{
    ::proto::Balance body;

    size_t fbe_type() const noexcept { return 2; }

    BalanceMessage()
        : body()
    {}
    explicit BalanceMessage(const ::proto::Balance& arg_body)
        : body(arg_body)
    {}
    BalanceMessage(const BalanceMessage& other) = default;
    BalanceMessage(BalanceMessage&& other) = default;
    ~BalanceMessage() = default;

    BalanceMessage& operator=(const BalanceMessage& other) = default;
    BalanceMessage& operator=(BalanceMessage&& other) = default;

    bool operator==(const BalanceMessage& other) const noexcept
    {
        return (
            true
            );
    }
    bool operator!=(const BalanceMessage& other) const noexcept { return !operator==(other); }
    bool operator<(const BalanceMessage& other) const noexcept
    {
        return false;
    }
    bool operator<=(const BalanceMessage& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const BalanceMessage& other) const noexcept { return !operator<=(other); }
    bool operator>=(const BalanceMessage& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const BalanceMessage& value);

    void swap(BalanceMessage& other) noexcept
    {
        using std::swap;
        swap(body, other.body);
    }

    friend void swap(BalanceMessage& value1, BalanceMessage& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const BalanceMessage& value)
{
    stream << "BalanceMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::BalanceMessage>
{
    typedef proto::BalanceMessage argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::BalanceMessage>
{
    static bool to_json(TWriter& writer, const ::proto::BalanceMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::BalanceMessage>
{
    static bool from_json(const TJson& json, ::proto::BalanceMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

} // namespace JSON

} // namespace FBE

namespace proto {

struct AccountMessage
{
    ::proto::Account body;

    size_t fbe_type() const noexcept { return 3; }

    AccountMessage()
        : body()
    {}
    explicit AccountMessage(const ::proto::Account& arg_body)
        : body(arg_body)
    {}
    AccountMessage(const AccountMessage& other) = default;
    AccountMessage(AccountMessage&& other) = default;
    ~AccountMessage() = default;

    AccountMessage& operator=(const AccountMessage& other) = default;
    AccountMessage& operator=(AccountMessage&& other) = default;

    bool operator==(const AccountMessage& other) const noexcept
    {
        return (
            true
            );
    }
    bool operator!=(const AccountMessage& other) const noexcept { return !operator==(other); }
    bool operator<(const AccountMessage& other) const noexcept
    {
        return false;
    }
    bool operator<=(const AccountMessage& other) const noexcept { return operator<(other) || operator==(other); }
    bool operator>(const AccountMessage& other) const noexcept { return !operator<=(other); }
    bool operator>=(const AccountMessage& other) const noexcept { return !operator<(other); }

    std::string string() const
    {
        std::stringstream ss;
        ss << *this;
        return ss.str();
    }

    template <class TOutputStream>
    friend TOutputStream& operator<<(TOutputStream& stream, const AccountMessage& value);

    void swap(AccountMessage& other) noexcept
    {
        using std::swap;
        swap(body, other.body);
    }

    friend void swap(AccountMessage& value1, AccountMessage& value2) noexcept
    {
        value1.swap(value2);
    }
};

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const AccountMessage& value)
{
    stream << "AccountMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

} // namespace proto

namespace std {

template<>
struct hash<proto::AccountMessage>
{
    typedef proto::AccountMessage argument_type;
    typedef size_t result_type;

    result_type operator () (const argument_type& value) const
    {
        result_type result = 17;
        return result;
    }
};

} // namespace std

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::proto::AccountMessage>
{
    static bool to_json(TWriter& writer, const ::proto::AccountMessage& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "body") || !FBE::JSON::to_json(writer, value.body, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::proto::AccountMessage>
{
    static bool from_json(const TJson& json, ::proto::AccountMessage& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.body, "body");
        return result;
    }
};

} // namespace JSON

} // namespace FBE
