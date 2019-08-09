// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding com.chronoxor.protoex final receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class FinalReceiver : com.chronoxor.fbe.Receiver, FinalReceiverListener
{
    // Imported receivers
    var protoReceiver: com.chronoxor.proto.fbe.FinalReceiver? = null

    // Receiver values accessors
    private val OrderValue: com.chronoxor.protoex.Order
    private val BalanceValue: com.chronoxor.protoex.Balance
    private val AccountValue: com.chronoxor.protoex.Account
    private val OrderMessageValue: com.chronoxor.protoex.OrderMessage
    private val BalanceMessageValue: com.chronoxor.protoex.BalanceMessage
    private val AccountMessageValue: com.chronoxor.protoex.AccountMessage

    // Receiver models accessors
    private val OrderModel: OrderFinalModel
    private val BalanceModel: BalanceFinalModel
    private val AccountModel: AccountFinalModel
    private val OrderMessageModel: OrderMessageFinalModel
    private val BalanceMessageModel: BalanceMessageFinalModel
    private val AccountMessageModel: AccountMessageFinalModel

    constructor() : super(true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
        OrderValue = com.chronoxor.protoex.Order()
        OrderModel = OrderFinalModel()
        BalanceValue = com.chronoxor.protoex.Balance()
        BalanceModel = BalanceFinalModel()
        AccountValue = com.chronoxor.protoex.Account()
        AccountModel = AccountFinalModel()
        OrderMessageValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageModel = AccountMessageFinalModel()
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
        OrderValue = com.chronoxor.protoex.Order()
        OrderModel = OrderFinalModel()
        BalanceValue = com.chronoxor.protoex.Balance()
        BalanceModel = BalanceFinalModel()
        AccountValue = com.chronoxor.protoex.Account()
        AccountModel = AccountFinalModel()
        OrderMessageValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageModel = OrderMessageFinalModel()
        BalanceMessageValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageModel = BalanceMessageFinalModel()
        AccountMessageValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageModel = AccountMessageFinalModel()
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: FinalReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.protoex.fbe.OrderFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderModel.attach(buffer, offset)
                assert(OrderModel.verify()) { "com.chronoxor.protoex.Order validation failed!" }
                val deserialized = OrderModel.deserialize(OrderValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Order deserialization failed!" }

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
            com.chronoxor.protoex.fbe.BalanceFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceModel.attach(buffer, offset)
                assert(BalanceModel.verify()) { "com.chronoxor.protoex.Balance validation failed!" }
                val deserialized = BalanceModel.deserialize(BalanceValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Balance deserialization failed!" }

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
            com.chronoxor.protoex.fbe.AccountFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountModel.attach(buffer, offset)
                assert(AccountModel.verify()) { "com.chronoxor.protoex.Account validation failed!" }
                val deserialized = AccountModel.deserialize(AccountValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Account deserialization failed!" }

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
            com.chronoxor.protoex.fbe.OrderMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset)
                assert(OrderMessageModel.verify()) { "com.chronoxor.protoex.OrderMessage validation failed!" }
                val deserialized = OrderMessageModel.deserialize(OrderMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.OrderMessage deserialization failed!" }

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
            com.chronoxor.protoex.fbe.BalanceMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset)
                assert(BalanceMessageModel.verify()) { "com.chronoxor.protoex.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageModel.deserialize(BalanceMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.BalanceMessage deserialization failed!" }

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
            com.chronoxor.protoex.fbe.AccountMessageFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset)
                assert(AccountMessageModel.verify()) { "com.chronoxor.protoex.AccountMessage validation failed!" }
                val deserialized = AccountMessageModel.deserialize(AccountMessageValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.AccountMessage deserialization failed!" }

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

        if ((protoReceiver != null) && protoReceiver!!.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
