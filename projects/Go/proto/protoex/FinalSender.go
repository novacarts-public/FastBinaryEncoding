// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

package protoex

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding protoex final sender
type FinalSender struct {
    *fbe.Sender
    protoSender *proto.FinalSender
    orderMessageModel *OrderMessageFinalModel
    balanceMessageModel *BalanceMessageFinalModel
    accountMessageModel *AccountMessageFinalModel
}

// Create a new protoex final sender with an empty buffer
func NewFinalSender() *FinalSender {
    return NewFinalSenderWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new protoex final sender with the given buffer
func NewFinalSenderWithBuffer(buffer *fbe.Buffer) *FinalSender {
    return &FinalSender{
        fbe.NewSender(buffer, true),
        proto.NewFinalSenderWithBuffer(buffer),
        NewOrderMessageFinalModel(buffer),
        NewBalanceMessageFinalModel(buffer),
        NewAccountMessageFinalModel(buffer),
    }
}

// Imported senders

func (s *FinalSender) ProtoSender() *proto.FinalSender { return s.protoSender }

// Sender models accessors

func (s *FinalSender) OrderMessageModel() *OrderMessageFinalModel { return s.orderMessageModel }
func (s *FinalSender) BalanceMessageModel() *BalanceMessageFinalModel { return s.balanceMessageModel }
func (s *FinalSender) AccountMessageModel() *AccountMessageFinalModel { return s.accountMessageModel }

// Send methods

func (s *FinalSender) Send(value interface{}) (int, error) {
    switch value := value.(type) {
    case *OrderMessage:
        if value.FBEType() == s.orderMessageModel.FBEType() {
            return s.SendOrderMessage(value)
        }
    case *BalanceMessage:
        if value.FBEType() == s.balanceMessageModel.FBEType() {
            return s.SendBalanceMessage(value)
        }
    case *AccountMessage:
        if value.FBEType() == s.accountMessageModel.FBEType() {
            return s.SendAccountMessage(value)
        }
    }
    if result, err := s.protoSender.Send(value); (result > 0) || (err != nil) {
        return result, err
    }
    return 0, nil
}

func (s *FinalSender) SendOrderMessage(value *OrderMessage) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.orderMessageModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("protoex.OrderMessage serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.orderMessageModel.Verify() {
        return 0, errors.New("protoex.OrderMessage validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        s.HandlerOnSendLog.OnSendLog(message)
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}

func (s *FinalSender) SendBalanceMessage(value *BalanceMessage) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.balanceMessageModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("protoex.BalanceMessage serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.balanceMessageModel.Verify() {
        return 0, errors.New("protoex.BalanceMessage validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        s.HandlerOnSendLog.OnSendLog(message)
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}

func (s *FinalSender) SendAccountMessage(value *AccountMessage) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.accountMessageModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("protoex.AccountMessage serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.accountMessageModel.Verify() {
        return 0, errors.New("protoex.AccountMessage validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        s.HandlerOnSendLog.OnSendLog(message)
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}
