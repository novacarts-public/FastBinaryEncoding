// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding com.chronoxor.protoex client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Client : com.chronoxor.fbe.Client, ReceiverListener
{
    // Imported senders
    val protoSender: com.chronoxor.proto.fbe.Client

    // Imported receivers
    var protoReceiver: com.chronoxor.proto.fbe.Client? = null

    // Client sender models accessors
    val OrderSenderModel: OrderModel
    val BalanceSenderModel: BalanceModel
    val AccountSenderModel: AccountModel
    val OrderMessageSenderModel: OrderMessageModel
    val BalanceMessageSenderModel: BalanceMessageModel
    val AccountMessageSenderModel: AccountMessageModel

    // Client receiver values accessors
    private val OrderReceiverValue: com.chronoxor.protoex.Order
    private val BalanceReceiverValue: com.chronoxor.protoex.Balance
    private val AccountReceiverValue: com.chronoxor.protoex.Account
    private val OrderMessageReceiverValue: com.chronoxor.protoex.OrderMessage
    private val BalanceMessageReceiverValue: com.chronoxor.protoex.BalanceMessage
    private val AccountMessageReceiverValue: com.chronoxor.protoex.AccountMessage

    // Client receiver models accessors
    private val OrderReceiverModel: OrderModel
    private val BalanceReceiverModel: BalanceModel
    private val AccountReceiverModel: AccountModel
    private val OrderMessageReceiverModel: OrderMessageModel
    private val BalanceMessageReceiverModel: BalanceMessageModel
    private val AccountMessageReceiverModel: AccountMessageModel

    constructor() : super(false)
    {
        protoSender = com.chronoxor.proto.fbe.Client(sendBuffer, receiveBuffer)
        protoReceiver = com.chronoxor.proto.fbe.Client(sendBuffer, receiveBuffer)
        OrderSenderModel = OrderModel(sendBuffer)
        OrderReceiverValue = com.chronoxor.protoex.Order()
        OrderReceiverModel = OrderModel()
        BalanceSenderModel = BalanceModel(sendBuffer)
        BalanceReceiverValue = com.chronoxor.protoex.Balance()
        BalanceReceiverModel = BalanceModel()
        AccountSenderModel = AccountModel(sendBuffer)
        AccountReceiverValue = com.chronoxor.protoex.Account()
        AccountReceiverModel = AccountModel()
        OrderMessageSenderModel = OrderMessageModel(sendBuffer)
        OrderMessageReceiverValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageReceiverModel = OrderMessageModel()
        BalanceMessageSenderModel = BalanceMessageModel(sendBuffer)
        BalanceMessageReceiverValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageModel()
        AccountMessageSenderModel = AccountMessageModel(sendBuffer)
        AccountMessageReceiverValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageReceiverModel = AccountMessageModel()
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, false)
    {
        protoSender = com.chronoxor.proto.fbe.Client(sendBuffer, receiveBuffer)
        protoReceiver = com.chronoxor.proto.fbe.Client(sendBuffer, receiveBuffer)
        OrderSenderModel = OrderModel(sendBuffer)
        OrderReceiverValue = com.chronoxor.protoex.Order()
        OrderReceiverModel = OrderModel()
        BalanceSenderModel = BalanceModel(sendBuffer)
        BalanceReceiverValue = com.chronoxor.protoex.Balance()
        BalanceReceiverModel = BalanceModel()
        AccountSenderModel = AccountModel(sendBuffer)
        AccountReceiverValue = com.chronoxor.protoex.Account()
        AccountReceiverModel = AccountModel()
        OrderMessageSenderModel = OrderMessageModel(sendBuffer)
        OrderMessageReceiverValue = com.chronoxor.protoex.OrderMessage()
        OrderMessageReceiverModel = OrderMessageModel()
        BalanceMessageSenderModel = BalanceMessageModel(sendBuffer)
        BalanceMessageReceiverValue = com.chronoxor.protoex.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageModel()
        AccountMessageSenderModel = AccountMessageModel(sendBuffer)
        AccountMessageReceiverValue = com.chronoxor.protoex.AccountMessage()
        AccountMessageReceiverModel = AccountMessageModel()
    }

    @Suppress("JoinDeclarationAndAssignment")
    fun send(obj: Any): Long
    {
        when (obj)
        {
            is com.chronoxor.protoex.Order -> if (obj.fbeType == OrderSenderModel.fbeType) return send(obj)
            is com.chronoxor.protoex.Balance -> if (obj.fbeType == BalanceSenderModel.fbeType) return send(obj)
            is com.chronoxor.protoex.Account -> if (obj.fbeType == AccountSenderModel.fbeType) return send(obj)
            is com.chronoxor.protoex.OrderMessage -> if (obj.fbeType == OrderMessageSenderModel.fbeType) return send(obj)
            is com.chronoxor.protoex.BalanceMessage -> if (obj.fbeType == BalanceMessageSenderModel.fbeType) return send(obj)
            is com.chronoxor.protoex.AccountMessage -> if (obj.fbeType == AccountMessageSenderModel.fbeType) return send(obj)
        }

        // Try to send using imported clients
        @Suppress("CanBeVal")
        var result: Long
        result = protoSender.send(obj)
        if (result > 0)
            return result

        return 0
    }

    fun send(value: com.chronoxor.protoex.Order): Long
    {
        // Serialize the value into the FBE stream
        val serialized = OrderSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.Order serialization failed!" }
        assert(OrderSenderModel.verify()) { "com.chronoxor.protoex.Order validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.protoex.Balance): Long
    {
        // Serialize the value into the FBE stream
        val serialized = BalanceSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.Balance serialization failed!" }
        assert(BalanceSenderModel.verify()) { "com.chronoxor.protoex.Balance validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.protoex.Account): Long
    {
        // Serialize the value into the FBE stream
        val serialized = AccountSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.Account serialization failed!" }
        assert(AccountSenderModel.verify()) { "com.chronoxor.protoex.Account validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.protoex.OrderMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = OrderMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.OrderMessage serialization failed!" }
        assert(OrderMessageSenderModel.verify()) { "com.chronoxor.protoex.OrderMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.protoex.BalanceMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = BalanceMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.BalanceMessage serialization failed!" }
        assert(BalanceMessageSenderModel.verify()) { "com.chronoxor.protoex.BalanceMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.protoex.AccountMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = AccountMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.protoex.AccountMessage serialization failed!" }
        assert(AccountMessageSenderModel.verify()) { "com.chronoxor.protoex.AccountMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }

    // Send message handler
    override fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { throw UnsupportedOperationException("com.chronoxor.protoex.fbe.Client.onSend() not implemented!") }
    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: ReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.protoex.fbe.OrderModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderReceiverModel.attach(buffer, offset)
                assert(OrderReceiverModel.verify()) { "com.chronoxor.protoex.Order validation failed!" }
                val deserialized = OrderReceiverModel.deserialize(OrderReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Order deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderReceiverValue)
                return true
            }
            com.chronoxor.protoex.fbe.BalanceModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceReceiverModel.attach(buffer, offset)
                assert(BalanceReceiverModel.verify()) { "com.chronoxor.protoex.Balance validation failed!" }
                val deserialized = BalanceReceiverModel.deserialize(BalanceReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Balance deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceReceiverValue)
                return true
            }
            com.chronoxor.protoex.fbe.AccountModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountReceiverModel.attach(buffer, offset)
                assert(AccountReceiverModel.verify()) { "com.chronoxor.protoex.Account validation failed!" }
                val deserialized = AccountReceiverModel.deserialize(AccountReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.Account deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountReceiverValue)
                return true
            }
            com.chronoxor.protoex.fbe.OrderMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageReceiverModel.attach(buffer, offset)
                assert(OrderMessageReceiverModel.verify()) { "com.chronoxor.protoex.OrderMessage validation failed!" }
                val deserialized = OrderMessageReceiverModel.deserialize(OrderMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.OrderMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderMessageReceiverValue)
                return true
            }
            com.chronoxor.protoex.fbe.BalanceMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageReceiverModel.attach(buffer, offset)
                assert(BalanceMessageReceiverModel.verify()) { "com.chronoxor.protoex.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageReceiverModel.deserialize(BalanceMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.BalanceMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceMessageReceiverValue)
                return true
            }
            com.chronoxor.protoex.fbe.AccountMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageReceiverModel.attach(buffer, offset)
                assert(AccountMessageReceiverModel.verify()) { "com.chronoxor.protoex.AccountMessage validation failed!" }
                val deserialized = AccountMessageReceiverModel.deserialize(AccountMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.protoex.AccountMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountMessageReceiverValue)
                return true
            }
        }

        if ((protoReceiver != null) && protoReceiver!!.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
