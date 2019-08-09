// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

package protoex

import "fmt"
import "strconv"
import "strings"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// AccountMessage key
type AccountMessageKey struct {
}

// Convert AccountMessage flags key to string
func (k *AccountMessageKey) String() string {
    var sb strings.Builder
    sb.WriteString("AccountMessageKey(")
    sb.WriteString(")")
    return sb.String()
}

// AccountMessage struct
type AccountMessage struct {
    Body Account `json:"body"`
}

// Create a new AccountMessage struct
func NewAccountMessage() *AccountMessage {
    return &AccountMessage{
        Body: *NewAccount(),
    }
}

// Create a new AccountMessage struct from the given field values
func NewAccountMessageFromFieldValues(Body Account) *AccountMessage {
    return &AccountMessage{Body}
}

// Create a new AccountMessage struct from JSON
func NewAccountMessageFromJSON(buffer []byte) (*AccountMessage, error) {
    result := *NewAccountMessage()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *AccountMessage) Copy() *AccountMessage {
    var result = *s
    return &result
}

// Struct deep clone
func (s *AccountMessage) Clone() *AccountMessage {
    // Serialize the struct to the FBE stream
    writer := NewAccountMessageModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewAccountMessageModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *AccountMessage) Key() AccountMessageKey {
    return AccountMessageKey{
    }
}

// Convert struct to optional
func (s *AccountMessage) Optional() *AccountMessage {
    return s
}

// Get the FBE type
func (s *AccountMessage) FBEType() int { return 13 }

// Convert struct to string
func (s *AccountMessage) String() string {
    var sb strings.Builder
    sb.WriteString("AccountMessage(")
    sb.WriteString("body=")
    sb.WriteString(s.Body.String())
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *AccountMessage) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
