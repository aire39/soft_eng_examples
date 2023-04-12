#pragma once

#include <string>

class MessageType
{
  public:
    MessageType() = default;
    virtual ~MessageType() = default;

    virtual void SendMessage() const = 0;
};
