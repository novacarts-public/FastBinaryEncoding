// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding com.chronoxor.proto receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class Receiver : com.chronoxor.fbe.Receiver, ReceiverListener
{
    // Receiver values accessors
    private val OrderValue: com.chronoxor.proto.Order
    private val BalanceValue: com.chronoxor.proto.Balance
    private val AccountValue: com.chronoxor.proto.Account
    private val OrderMessageValue: com.chronoxor.proto.OrderMessage
    private val BalanceMessageValue: com.chronoxor.proto.BalanceMessage
    private val AccountMessageValue: com.chronoxor.proto.AccountMessage

    // Receiver models accessors
    private val OrderModel: OrderModel
    private val BalanceModel: BalanceModel
    private val AccountModel: AccountModel
    private val OrderMessageModel: OrderMessageModel
    private val BalanceMessageModel: BalanceMessageModel
    private val AccountMessageModel: AccountMessageModel

    constructor() : super(false)
    {
        OrderValue = com.chronoxor.proto.Order()
        OrderModel = OrderModel()
        BalanceValue = com.chronoxor.proto.Balance()
        BalanceModel = BalanceModel()
        AccountValue = com.chronoxor.proto.Account()
        AccountModel = AccountModel()
        OrderMessageValue = com.chronoxor.proto.OrderMessage()
        OrderMessageModel = OrderMessageModel()
        BalanceMessageValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageModel = BalanceMessageModel()
        AccountMessageValue = com.chronoxor.proto.AccountMessage()
        AccountMessageModel = AccountMessageModel()
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
        OrderValue = com.chronoxor.proto.Order()
        OrderModel = OrderModel()
        BalanceValue = com.chronoxor.proto.Balance()
        BalanceModel = BalanceModel()
        AccountValue = com.chronoxor.proto.Account()
        AccountModel = AccountModel()
        OrderMessageValue = com.chronoxor.proto.OrderMessage()
        OrderMessageModel = OrderMessageModel()
        BalanceMessageValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageModel = BalanceMessageModel()
        AccountMessageValue = com.chronoxor.proto.AccountMessage()
        AccountMessageModel = AccountMessageModel()
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: ReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.proto.fbe.OrderModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderModel.attach(buffer, offset)
                assert(OrderModel.verify()) { "com.chronoxor.proto.Order validation failed!" }
                val deserialized = OrderModel.deserialize(OrderValue)
                assert(deserialized > 0) { "com.chronoxor.proto.Order deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderValue)
                return true
            }
            com.chronoxor.proto.fbe.BalanceModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceModel.attach(buffer, offset)
                assert(BalanceModel.verify()) { "com.chronoxor.proto.Balance validation failed!" }
                val deserialized = BalanceModel.deserialize(BalanceValue)
                assert(deserialized > 0) { "com.chronoxor.proto.Balance deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceValue)
                return true
            }
            com.chronoxor.proto.fbe.AccountModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountModel.attach(buffer, offset)
                assert(AccountModel.verify()) { "com.chronoxor.proto.Account validation failed!" }
                val deserialized = AccountModel.deserialize(AccountValue)
                assert(deserialized > 0) { "com.chronoxor.proto.Account deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountValue)
                return true
            }
            com.chronoxor.proto.fbe.OrderMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset)
                assert(OrderMessageModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }
                val deserialized = OrderMessageModel.deserialize(OrderMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.OrderMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderMessageValue)
                return true
            }
            com.chronoxor.proto.fbe.BalanceMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset)
                assert(BalanceMessageModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageModel.deserialize(BalanceMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.BalanceMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceMessageValue)
                return true
            }
            com.chronoxor.proto.fbe.AccountMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset)
                assert(AccountMessageModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }
                val deserialized = AccountMessageModel.deserialize(AccountMessageValue)
                assert(deserialized > 0) { "com.chronoxor.proto.AccountMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountMessageValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountMessageValue)
                return true
            }
        }

        return false
    }
}
